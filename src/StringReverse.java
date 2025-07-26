public class StringReverse {
    public static void main(String[] args) {
        String charString= "Pragra";
        char s = charString.charAt(0);;
        int j=1;
        for (int i = 0; i < charString.length(); i++) {
            System.out.print(charString.charAt(charString.length()-j));
            j++;
           //charString.charAt(i) =   charString.charAt(charString.length()-i);

        }


    }
}
