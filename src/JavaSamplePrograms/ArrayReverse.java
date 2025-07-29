package JavaSamplePrograms;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {10, 32, 43, 21, 43, 1, 43, 42};
        int[] rNumbers = new int[numbers.length];
        int j =0;
        for (int i =numbers.length-1;i>=0;i--)
        {
            rNumbers[j]= numbers[i];
            j++;
        }
        System.out.print("Given Array   : " );
        for (int i=0;i<rNumbers.length;i++)
        {
            System.out.print(numbers[i]+ "  ");

        }
        System.out.print("\nReverse Array : " );
        for (int i=0;i<rNumbers.length;i++)
        {

            System.out.print(rNumbers[i] +"  ");
        }
    }
}
