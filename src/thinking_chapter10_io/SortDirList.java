package thinking_chapter10_io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Vector;

/**
 * Created by v_zhangwei13 on 2017/6/3.
 */
public class SortDirList {
    private File file;
    private String[] list;

    public SortDirList(final String afn) {
        file = new File("/");
        if (afn == null) {
            list = file.list();
        } else {
            list = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    String f = new File(name).getName();
                    return f.indexOf(afn) != -1;
                }
            });
        }
    }

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private void sort() {
        Vector vector = new Vector();
        for (int i = 0; i < list.length; i++) {
            vector.addElement(list[i]);
        }

        for (int i = 0; i < list.length; i++) {
            list[i] = (String) vector.elementAt(i);
        }
    }
        public static void main(String [] args) {
            SortDirList sd;
            if (args.length == 0) {
                sd = new SortDirList(null);
            } else {
                sd = new SortDirList(args[0]);
                sd.print();
            }
    }
}
