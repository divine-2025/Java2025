package JavaSamplePrograms;

public class DateInfo {
    int day ,month,year;

    DateInfo()
    {
        day =1;
        month =1;
        year = 1990;
        System.out.println("def");
    }

    public DateInfo(int day, int year) {

        this.day = day;
        this.year = year;
    }

    public DateInfo(int day, int month, int year) {
        this();
        //this(19,1990);

        this.day = day;
        this.month = month;
        this.year = year;
        System.out.println(day+"/"+month+"/"+year);
    }

    public void PrintDate()
    {

        System.out.println(day+"/"+month+"/"+year);
    }

}
