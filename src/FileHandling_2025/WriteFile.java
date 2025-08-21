package FileHandling_2025;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        FileWriter fileWriter =null;
        try {
            fileWriter = new FileWriter("C:\\Users\\aleen\\" +"OneDrive\\Documents\\FileJava\\file1.txt");
            fileWriter.write("java is simple");
            System.out.println("Successfully Wrote to file ");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                    System.out.println("FileWriter closed successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
