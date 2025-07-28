package Assignment;

public class StringReverse {
    public static void main(String[] args) {
        String charString= "Pragra";
        String tempVariable = "";


        char s = charString.charAt(0);;
        int j=1;
        for (int i = charString.length()-1; i >=0; i--) {
                tempVariable =tempVariable+ charString.charAt(i);


        }
        charString=tempVariable;
        System.out.println(charString);



    }
}
