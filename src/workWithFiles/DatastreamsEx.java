package workWithFiles;

import java.io.*;

public class DatastreamsEx {
    public static void main(String[] args) {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("myTest.bin"));
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("myTest.bin"))){

            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeInt(1243);
            dataOutputStream.writeInt(9854);
            System.out.println(dataInputStream.readBoolean());

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readBoolean());



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
