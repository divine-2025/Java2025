package jul29;

public class FileMain {
    public static void main(String[] args) {
        ReadOnlyFile readOnlyFile = new ReadOnlyFile();

        System.out.println(readOnlyFile.getReadOnlyFile());


        WriteOnlyFile writeOnlyFile =new WriteOnlyFile();
        writeOnlyFile.setWriteOnlyFile("I can rewrite file but i cant read it ");

        System.out.println();
        ReadAndWriteFile readAndWriteFile =new ReadAndWriteFile();
        System.out.println(readAndWriteFile.getReadAndWriteFIle());
        readAndWriteFile.setReadAndWriteFIle("I can rewrite file");
        System.out.println(readAndWriteFile.getReadAndWriteFIle());
    }
}
