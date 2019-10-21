package email;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class FileWriter {

    public static void writeToFile(String emailData) {

        try (PrintWriter writer = new PrintWriter("emailData.txt")) {
            writer.println(emailData);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File emailData.txt does not exists");
        }
    }
}
