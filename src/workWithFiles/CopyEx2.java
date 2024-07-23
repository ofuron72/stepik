package workWithFiles;

import java.io.*;

public class CopyEx2 {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("D:\\java\\756533742439601.jpg");
        FileOutputStream outputStream = new FileOutputStream("javaIcon.jpg")) {
            int i;
            while ((i = inputStream.read())!=-1){
                outputStream.write(i);
            }
            System.out.println("Done!");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;




    }
}
