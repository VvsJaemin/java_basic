package bufferStream_Ex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args) throws IOException {
        System.out.println("====inputStream 사용=====");
        FileInputStream fs = null;

        fs = new FileInputStream("d:\\java64h\\greet.txt");
        int data = 0;
        while ((data = fs.read()) != -1) {
            System.out.println((char) data);
        }
        fs.close();


        System.out.println("\n================ InputStreamReader 사용 ================");

        FileInputStream fs2 = null;
        fs2 = new FileInputStream("d:\\java64h\\greet.txt");
        InputStreamReader ir = null;
        ir = new InputStreamReader(fs2, "UTF-8");
        int data2 = 0;
        while ((data2 = ir.read()) != -1) {
            System.out.println((char)data2);
        }
        fs2.close();
        ir.close();

    }
}
