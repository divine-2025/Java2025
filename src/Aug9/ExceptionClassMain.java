package Aug9;

public class ExceptionClassMain {
    public static void main(String[] args) {
        int x=10;
        int y = 0;
        try {
            int z = x/y;
            String a =null;
            a.toUpperCase();
        } catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println("Exception");
        }
        System.out.println("hi");

    }
}
