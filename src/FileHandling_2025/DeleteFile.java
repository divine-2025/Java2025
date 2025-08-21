package FileHandling_2025;


import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\aleen\\" + "OneDrive\\Documents\\FileJava\\file1.txt");
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }

}
