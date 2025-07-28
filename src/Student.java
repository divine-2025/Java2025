public class Student {
   String name;
   int rollNo;
   int mark1,mark2,mark3;

   public double avg(int m1,int m2,int m3)
   {
       double average = (m1+m2+m3)/3;
       return average;
   }

   public String getGrade(double avg)
   {
       if(avg >=90) {
           return "A";

       } else if (avg>=70) {
           return "B";
       }
       else {
           return "C";
       }

   }
    public Student(String name,int rollNo,int m1,int m2,int m3)
    {
        this.name =   name;
        this.rollNo=  rollNo;
        this.mark1 = m1;
        this.mark2=m2;
        this.mark3=m3;

    }
    public Student()
    {

        System.out.println(" default  constructor ");

    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
   /*public void read(String name,int rollNo,int m1,int m2,int m3)
   {
       this.name =   name;
       this.rollNo=  rollNo;
       this.mark1 = m1;
       this.mark2=m2;
       this.mark3=m3;

   }*/




}
