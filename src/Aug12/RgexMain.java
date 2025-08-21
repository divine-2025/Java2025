package Aug12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RgexMain {
    public static void main(String[] args) {
        String text ="A  in programming does not inherently 999-234-1234 in show ggg0i@gmail.com an error to the caller because it is a mechanism for propagating exceptions to be handled by the calling code or the program's runtime environment. The throws keyword declares that a method might throw an exception, while the throw keyword actually raises or signals the exception";
        String regex = "^\\d{3}-\\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            System.out.println(matcher.group());
      }
    }
}
