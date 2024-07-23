package workWithFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {

        try ( FileReader reader = new FileReader("text2.txt")) {
            int chaharcter;
            while ((chaharcter = reader.read())!=-1){
                System.out.print((char)chaharcter);
            }
            System.out.println("==================================");
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
