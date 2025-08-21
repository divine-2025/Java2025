package Aug6;

import Aug6.Class.*;

public class SocialMediaMain {
    public static void main(String[] args) {
        Facebook facebook =new Facebook();
//        Instagram instagram =new Instagram();
//        LinkedIn linkedIn = new LinkedIn();
//        LightRoom lightRoom =new LightRoom();
//        TikTok tikTok =new TikTok();
//        Twitter twitter =new Twitter();
//        Whatsapp whatsapp=new Whatsapp();

        System.out.println("*** Facebook ***");
        if(facebook.logIn("user","F123"))
        {
            System.out.println("Valid User : "+facebook.parts[0]);
            System.out.println("Number of Posts : " +facebook.numberOfPost());
        }
        else {
            System.out.println("Invalid User");
        }
        System.out.println("*** End of Facebook ***");


    }
}
