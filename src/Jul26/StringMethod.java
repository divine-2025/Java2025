package Jul26;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {


//        String x = "abc";
//        String y    = "abc";
//
//        char[] char1 = x.toCharArray();
//        String z =x.concat("oop");
//        System.out.println(z);
        StringBuffer sb = new StringBuffer("abc");
        sb.append(90);
        StringBuilder sbt =new StringBuilder("abcdef");
        sbt.reverse();
        System.out.println(sb);
        System.out.println(sbt);

    }

}
