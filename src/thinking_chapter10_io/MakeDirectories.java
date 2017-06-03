package thinking_chapter10_io;

import java.io.File;

/**
 * Created by v_zhangwei13 on 2017/6/3.
 */
public class MakeDirectories {
    private final static String usage =
            "Usage:MakeDirectories path1 ...\n" +
            "Creates each path\n" +
            "Usage:MakeDirectories -d path1 ...\n" +
            "Deletes each path\n" +
            "Usage:MakeDirectories -r path1 path2\n" +
            "Renames from path1 to path2\n";

    public static void usage() {
        System.err.println(usage);
        System.exit(1);
    }

    private static void fileData(File file) {
        System.out.println("absolute path: " + file.getAbsolutePath());
        System.out.println("file name : " + file.getName());
        System.out.println("file path : " + file.getPath());
        System.out.println("file parent : " + file.getParent());
        if (file.isFile()) {
            System.out.println("file is a file ");
        } else {
            System.out.println("file is a directory");
        }
        System.out.println("file can execute ?: " + file.canExecute());
        System.out.println("file can read ? " + file.canRead());
        System.out.println("file can write ?" + file.canWrite());
        System.out.println("file length : " + file.length());
        System.out.println("file last modified " + file.lastModified());
    }

    public static void main(String[] args) {
            fileData(new File("d:/ustc.jpg"));
            if (args.length < 1) {
                usage();
            }
            if (args[0].equals("-r")) {
                if (args.length != 3) {
                    usage();
                }
                File old = new File(args[1]),rname = new File(args[2]);
                old.renameTo(rname);
                fileData(old);
                fileData(rname);
                return;
            }
            int count = 0;
            boolean del = false;
            if (args[0].equals("-d")) {
                count++;
                del = true;
            }

            for (; count < args.length; count++) {
                File f = new File(args[count]);
                if (f.exists()) {
                    System.out.println(f + " exists");
                }
                if (del) {
                    System.out.println("deleting..." + f.getName());
                    f.delete();
                } else {
                    if(!del) {
                        f.mkdirs();
                        System.out.println("create a dir..." + f.getName());
                    }
                }
                fileData(f);
            }

    }
}
