public class Counter {
    static int  i=1000;
    Counter()
    {

        System.out.println("default constructor");
    }
    static {
        System.out.println("ststic block");

    }
    {
        System.out.println("instance block");
    }
    public static void Print()
    {
        System.out.println("ststic method");
    }

    public static void main(String[] args) {
        Counter.Print();
        new Counter();

    }
}
