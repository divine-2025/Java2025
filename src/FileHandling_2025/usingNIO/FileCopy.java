package FileHandling_2025.usingNIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class FileCopy {
    public static void main(String[] args) {

        try {
            System.out.println("Start Time : "+ new Date());
            Path source = Paths.get("C:\\Users\\aleen\\" +"OneDrive\\Documents\\FileJava\\sample.zip");
            Path destination = Paths.get("C:\\Users\\aleen\\" +"OneDrive\\Documents\\FileJava\\tempFolder\\copyFile.zip");
            Files.copy(source,destination);
            System.out.println("End Time : "+ new Date());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
