public class DuplicatArray {
    public static void main(String[] args) {
        int[] array = {10, 32, 43, 10, 43, 42, 43, 42};

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {


                    System.out.println(array[i]);
                    break;

                }
            }
        }
    }




}
