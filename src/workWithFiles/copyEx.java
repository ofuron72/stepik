package workWithFiles;

import java.io.*;

public class copyEx {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("text2.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text3.txt"))){
//            int character;
//            while((character = bufferedReader.read())!=-1){
//                bufferedWriter.write(character);
//            }
            String line;
            while((line = bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
