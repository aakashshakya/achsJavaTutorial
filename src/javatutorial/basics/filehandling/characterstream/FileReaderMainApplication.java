package javatutorial.basics.filehandling.characterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMainApplication {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s;
            while((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
        }catch(FileNotFoundException fe){
            System.out.println("sorry no file found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
