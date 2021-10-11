package bufferStream_Ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterMain {
    public static void main(String[] args) {
        FileWriter fw = null; // 글자 한자 단위로 출력
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("d:\\java32\\test3.txt");
            bw = new BufferedWriter(fw);
            bw.write('x');
            bw.write('\n');
            char[] buf = {'a', 'b', 'c', 'd'};
            bw.write(buf);
            bw.write("hello");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
