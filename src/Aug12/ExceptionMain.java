package Aug12;

public class ExceptionMain {
    public static void main(String[] args) {
        int x=10;
        int y =0;


        try {
            getDiv(x,y);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("line 11");


    }
   public static void getDiv(int x,int y) throws RuntimeException  {
if(y==0){
    //int z= x/y;
    System.out.println("line 14");
    throw new RuntimeException("no throws");

}




   }
}
