package FileHandling_2025;
import java.io.File;

public class FIleMethods {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\aleen\\" + "OneDrive\\Documents\\FileJava\\file1.txt");
        File file1 = new File("C:\\Users\\aleen\\" + "OneDrive\\Documents\\FileJava\\");
        if (file.exists()) {

            System.out.println("\nFile Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size (bytes): " + file.length());
            System.out.println("Can Read: " + file.canRead());
            System.out.println("Can Write: " + file.canWrite());
            System.out.println();
            String[] files = file1.list();
            System.out.println("Files are:");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }

        } else {
            System.out.println("File does not exist.");
        }
    }
}

