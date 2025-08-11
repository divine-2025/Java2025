package Aug6.Class;

import Aug6.Interfaces.ProfessionalSocialMedia;
import Aug6.Interfaces.TwitterBase;

public class Twitter implements ProfessionalSocialMedia, TwitterBase {


    @Override
    public void makeConnection() {
        System.out.println("Make Connection in Twitter ");
    }

    @Override
    public void makeProfile() {
        System.out.println("Create Profile in Twitter ");
    }

    @Override
    public void postThoughts() {
        System.out.println("Post Information in Twitter ");
    }
}
