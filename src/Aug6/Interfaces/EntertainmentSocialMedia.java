package Aug6.Interfaces;

public interface EntertainmentSocialMedia {

     int numberOfPost();

     default int numberOfLikes(){
        return 0;
     }
     default int NumberOfShare(){
        return 0;
     }
     default boolean logIn(String userName,String password){

        return false;
     }

}
