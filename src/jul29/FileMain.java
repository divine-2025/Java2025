package jul29;

public class FileMain {
    public static void main(String[] args) {
        File file =new File("Read only file ","Write only file","Read and Write File");
        System.out.println(file.getFile1());
        file.setFile2("update file");
        System.out.println(file.getFile3());
        file.setFile3("read and write file updated");
        System.out.println(file.getFile3());

    }

}
