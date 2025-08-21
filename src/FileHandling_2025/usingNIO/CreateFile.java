package FileHandling_2025.usingNIO;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\aleen\\" +"OneDrive\\Documents\\FileJava\\fileNio.txt");
        try {
            if(Files.exists(path)) {
                System.out.println("File already exists: " + path.toAbsolutePath());
            }
            else {
            Files.createFile(path);
            System.out.println("File created successfully: " + path.toAbsolutePath());
            }
        } catch (FileAlreadyExistsException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
