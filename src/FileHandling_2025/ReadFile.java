package FileHandling_2025;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("C:\\Users\\aleen\\" +"OneDrive\\Documents\\FileJava\\file1.txt")) {
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }



        //provide buffered input, improving performance by reading larger chunks of data at once

//        String path = "C:\\Users\\aleen\\" +"OneDrive\\Documents\\FileJava\\FileSample.txt";
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }




    }
}
