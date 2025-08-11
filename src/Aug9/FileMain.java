package Aug9;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("Divine.txt");
            myWriter.write("Divines File");
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        File file =new File("Divine.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("File created: " + file.getName());
//            } else {
//                System.out.println("File already exists.");
//
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
