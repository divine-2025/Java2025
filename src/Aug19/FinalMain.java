package Aug19;

public class FinalMain {
    public static void main(String[] args) {
        Student student = new Student("ddi",19);
        System.out.println(student);
        //student.setMark(900);
        System.out.println(student);

    }



}

final class Student{
    private String name ;
    private int mark;



    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
//    public void setMark(int mark){
//        this.mark=mark;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}

