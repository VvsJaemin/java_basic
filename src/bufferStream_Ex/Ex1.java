package bufferStream_Ex;
// 데이터를 코드로(메모리) 불러올때 : InputStream(인터페이스)
// -> 구현체를 사용 -> FileInputStream, InputStreamReader(인코딩가능 스트림)

// 데이터를 내보낼때 : OutputStream(인터페이스) -> 구현체를 사용

import java.io.*;

// 스트림 -> byte단위 -> 임시저장소(버퍼)에 여러 byte를 저장 -> 한꺼번에 불러온다
public class Ex1 {
    public static void main(String[] args) {
        FileInputStream fs = null;
        InputStreamReader is = null;
        BufferedReader br = null;// FileReader 불러온 글자를 모아서(버퍼에) 한꺼번에 처리 -> 보조스트림(단독사용불가)
        try {
            fs= new FileInputStream("d:\\java64h\\greet.txt"); // 바이트 스트림 단위
            is = new InputStreamReader(fs, "UTF-8");
            br = new BufferedReader(is);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
