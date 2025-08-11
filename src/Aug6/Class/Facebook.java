package Aug6.Class;

import Aug6.Interfaces.EntertainmentSocialMedia;
import Aug6.Interfaces.PictureBased;
import Aug6.Interfaces.VideoBased;

public class Facebook extends HybridBase implements VideoBased, PictureBased, EntertainmentSocialMedia {
    private String facebookData = "Fuser-F123-15-30-11-200-1800-200";
    public String[]  parts = facebookData.split("-");

    @Override
    public int numberOfPost() {
        return Integer.parseInt(parts[3]) ;
    }

    @Override
    public int numberOfLikes() {
        return Integer.parseInt(parts[4]) ;
    }

    @Override
    public int NumberOfShare() {
        return Integer.parseInt(parts[5]) ;
    }

    @Override
    public boolean logIn(String userName, String password) {
        if(userName.equals(parts[0]) && password.equals(parts[1])){
            return true;
        }
        else
        {
            return false;
        }
    }


    @Override
    public int numberOfPhotos() {
        return Integer.parseInt(parts[6]) ;
    }

    @Override
    public int numberOfReels() {
        return Integer.parseInt(parts[7]) ;
    }

    @Override
    public int numberOfViews() {
        return Integer.parseInt(parts[8]) ;
    }
}
