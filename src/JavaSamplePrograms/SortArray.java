package JavaSamplePrograms;

public class SortArray {
    public static void main(String[] args) {
        int[] givenArray = {10, 32, 43, 21, 43, 1, 43, 42};
        System.out.print("Given Array  : ");
        for (int i = 0; i < givenArray.length; i++) {

            System.out.print(givenArray[i]+" ");
        }
        int sort;
        for (int i = 0; i < givenArray.length ; i++) {
            for (int j = i+1; j < givenArray.length; j++) {
                if (givenArray[i]>=givenArray[j])
                {
                 sort=givenArray[i];
                 givenArray[i] = givenArray[j];
                 givenArray[j] =sort;


                }

            }

        }

        System.out.print("\nSorted Array : ");
        for (int i = 0; i < givenArray.length; i++) {

            System.out.print(givenArray[i]+ " ");
        }

    }
}
