package Thursday_7_19;

import java.io.*;
import java.nio.charset.Charset;

public class FileOperator {
    public static void main(String[] args) throws IOException {
        File f= new File("test.txt");
        FileOutputStream out = new FileOutputStream(f);
        String s = "hello world";
        out.write(s.getBytes());
        out.close();

        FileInputStream in = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(in,Charset.defaultCharset());
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        in.close();


    }
}

