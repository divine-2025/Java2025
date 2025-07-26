public class ArrayClass {
    public static void main(String[] args) {

        int[] number = {10, 32, 43, 21, 43, 1, 43, 42};
        int largNumber= number[0];
        for (int i=1;i<number.length;i++)
        {
            if(largNumber <=number[i])
            {
                largNumber = number[i];
            }


        }
        for (int num:number)
        {
            System.out.print(num +" ");
        }
        System.out.println("Largest Number In Array is  " + largNumber);
    }


}
