package JavaSamplePrograms;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //JavaSamplePrograms.Student student =new JavaSamplePrograms.Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.next();
        System.out.println("Enter RollNo");
        int rollNo = scanner.nextInt();
        System.out.println("Enter Mark1");
        int sub1 = scanner.nextInt();
        System.out.println("Enter Mark2");
        int sub2 = scanner.nextInt();
        System.out.println("Enter Mark3");
        int sub3 = scanner.nextInt();
        Student student= new Student(name,rollNo,sub1,sub2,sub3);
       
       // student.read(name,rollNo,sub1,sub2,sub3);
        String grade = student.getGrade(student.avg(student.mark1, student.mark2, student.mark3));
        System.out.println("Name : " +student.name+"  Roll JavaSamplePrograms.Number :" +student.rollNo + "  Grade : "+grade);

    }
}
