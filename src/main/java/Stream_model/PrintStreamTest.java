package Stream_model;

import java.io.*;

public class PrintStreamTest {
    public static void main(String[] args) {
        try{
            var fos = new FileOutputStream("test.txt");
            var ps = new ObjectOutputStream(fos);
            ps.writeObject(new Ser_model());

            var fis = new FileInputStream("test.txt");
            var os = new ObjectInputStream(fis);
            var ob = (Ser_model)os.readObject();
            System.out.println(ob);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
