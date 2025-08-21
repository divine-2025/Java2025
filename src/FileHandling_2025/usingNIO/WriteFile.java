package FileHandling_2025.usingNIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\aleen\\OneDrive\\Documents\\FileJava\\file1.txt");

        String content = "This is a line of text.\nAnother line with characters.";

        try {
            Files.write(path, content.getBytes());

            System.out.println("Characters successfully written to " + path.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error writing characters to file: " + e.getMessage());
            e.printStackTrace();
        }
}
}
