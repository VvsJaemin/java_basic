package io_Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        FileInputStream fi = null;

        try{
            fi = new FileInputStream("d:\\java64h\\korea.png"); // 바이터
            int data = 0;
            while ((data = fi.read()) != -1) {
                // 10진수 -> 2진수
                String str = Integer.toBinaryString(data);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
