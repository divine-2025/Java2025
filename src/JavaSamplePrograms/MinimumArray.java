package JavaSamplePrograms;

public class MinimumArray {
    public static void main(String[] args) {
        int[] minArray = {10, 32, 43, 21, 43, 1, 43, 42};
        int minimum = minArray[0];
        for (int i = 1; i < minArray.length; i++) {

            if(minimum>minArray[i])
            {
                minimum = minArray[i];
            }
        }
        System.out.println("Minimum In Array : " + minimum);
    }
}
