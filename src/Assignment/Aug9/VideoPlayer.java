package Assignment.Aug9;

public interface VideoPlayer {

    default void quality(String quality,String playerName){
        System.out.println(playerName+ " Video Quality change to "+ quality +"p");
    }

    default void subTitle(int subtitle,String playerName){
        if (subtitle == 1) {
            System.out.println(playerName+ " Subtitle turn On");
        }
        else {
            System.out.println(playerName+ " Subtitle turn OFF");
        }

    }

    default void FullScreen(int fullscreen, String playerName){
        if (fullscreen == 1) {
            System.out.println(playerName+ " video in FullScreen");
        }
        else {
            System.out.println(playerName+ " video in NormalView");
        }

    }

    default void speed(int speed,String playerName){
        System.out.println(playerName+ " Play speed is "+speed+"X");
    }

    void casting(String playerName);
}