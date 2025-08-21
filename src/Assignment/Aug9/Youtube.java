package Assignment.Aug9;

public class Youtube extends MediaPlayer implements VideoPlayer{
    public String playerName = "Youtube";
    @Override
    public void casting(String playerName) {
        System.out.println(playerName+ " Casting to Tv");
    }

}
