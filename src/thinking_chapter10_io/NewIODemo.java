package thinking_chapter10_io;

import java.io.*;

/**
 * Created by v_zhangwei13 on 2017/6/10.
 */
public class NewIODemo {
    public static void main(String[] args) throws IOException {
        // 1
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:/test.txt"));
        String s, s2 = new String();
        while((s = bufferedReader.readLine()) != null) {
            s2 = s + "\n";
        }
        System.out.println(s2);
        bufferedReader.close();

        // 1.b
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name : ");
        String ss = stdin.readLine();
        System.out.println("your name : " + ss);


        // 2
        StringReader stringReader = new StringReader(s2);
        int i;
        while((i = stringReader.read()) != -1) {
            System.out.print((char)i);
        }

    }
}
