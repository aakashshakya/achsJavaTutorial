package javatutorial.filehandling.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCharacterStreamMainApplication {
    public static void main(String args[]) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("demo.txt");
            String s = "Welcome to file handling.";
            byte b[] = s.getBytes();//converting string into byte array
            fileOutputStream.write(b);
            fileOutputStream.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileInputStream fin = new FileInputStream("demo.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Some problem occurred while reading " +
                    "the file.");
        }
    }
}



