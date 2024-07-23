package workWithFiles;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(java.io.RandomAccessFile file = new java.io.RandomAccessFile("test10.txt","rw")){
            int a = file.read();
            System.out.println((char)a);
            a = file.read();
            System.out.println((char)a);


            file.seek(101);
            String s1 = file.readLine();
            System.out.println(s1);
            System.out.println(file.getFilePointer());
            file.seek(file.length()-1);
            file.writeBytes(" -William Buttler");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
