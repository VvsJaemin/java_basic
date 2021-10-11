package bufferStream_Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {
        // 코드단으로 데이터를 불러올때 InputStream
        // 코드단에서 데이터가 나갈때 OutPutStream
        // 스트림 자원은 꼭 해지

        FileInputStream fs = null;

        try{
            fs = new FileInputStream("d:\\java64h\\greet.txt");

            System.out.println(fs);
            int num = fs.read();
            System.out.println(num);
            System.out.println((char)num);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
