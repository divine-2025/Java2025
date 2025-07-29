package JavaSamplePrograms;

public class Student1 {
    int id;
    String name;
    static String subject = "java";

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println(id + " " + name + " "+ subject);
    }

}
