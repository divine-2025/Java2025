package JavaSamplePrograms;

public class Employee {
    int id;
    String name;
    static String cName ="Pragra";

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public void PrintData(){
        System.out.println("id : "+id+ " Name : "+ name + " Company : "+cName);
    }
}
