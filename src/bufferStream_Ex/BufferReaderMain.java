package bufferStream_Ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderMain {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("d:\\java64h\\greet.txt");
            br = new BufferedReader(fr);
            String text = "";
            while ((text = br.readLine()) != null) {
                System.out.println(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
            br.close();
            fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
