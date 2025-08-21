package Assignment.Aug9;

public abstract class MediaPlayer {

    static boolean counter;

    public void play(String playerName) {
        System.out.println(playerName+ " Video playing ");
        counter = true;
    }
    public void pause(String playerName){
        if (counter) {
            System.out.println(playerName+ " Video Paused ");
            counter = false;
        }
        else {
            System.out.println(playerName+ " Video already Paused or Stopped ");
        }
    }
    public void stop(String playerName){
        if (counter) {
            System.out.println(playerName+ " Video Stopped ");
            counter = false;
        }
        else {
            System.out.println(playerName+ " Video already Paused or Stopped");
        }

    }
    public void fastForward(String playerName){
        System.out.println(playerName+ " Video FastForward");
    }
    public void playlist(String playerName) {
        System.out.println("*** Your "+ playerName+" Play list ***");
    }

}
