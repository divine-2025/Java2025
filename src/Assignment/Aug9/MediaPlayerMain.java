package Assignment.Aug9;

import Assignment.jul26.BankOfCanada;
import Assignment.jul26.InternalBank;
import Aug6.Class.Facebook;

import java.util.Scanner;

public class MediaPlayerMain {
    public static void main(String[] args) {

       int optionValue;
       String answer;
       Scanner scanner =new Scanner(System.in);
       Youtube youtube = new Youtube();


        do {
            System.out.println("*** Select any Youtube Option ***\n"+
                    " 0 for Play Video"+ "\n 1 for Pause video"+"\n " +
                    "2 for Stop Video"+"\n 3 for FastForward \n"+" 4 for Settings \n ");
            optionValue = scanner.nextInt();


            switch (optionValue){
                case 0:{
                    youtube.play(youtube.playerName);
                    break;
                }
                case 1:{
                    youtube.pause(youtube.playerName);
                    break;
                }

                case 2:{
                    youtube.stop(youtube.playerName);
                }

                case 3:{
                    youtube.fastForward(youtube.playerName);
                }

                case 4:{
                    do {
                    System.out.println("*** Select Settings ***\n"+" 0 Quality change"+ "\n 1 for Subtitle"+"\n 2 for FullScreen"+"\n 3 for Speed \n"+" 4 for Casting" + "\n 5 for Exit \n");
                    optionValue = scanner.nextInt();


                    switch (optionValue){
                        case 0:{
                            String quality;
                            System.out.println("Enter Quality : ");
                            quality = scanner.next();
                            youtube.quality(quality,youtube.playerName);
                            break;
                        }
                        case 1:{
                            int subtitle ;
                            System.out.println("Press 1 for turn on subtitle 0 for turn OFF ");
                            subtitle = scanner.nextInt();
                            youtube.subTitle(subtitle,youtube.playerName);
                            break;
                        }

                        case 2:{
                            int fullScreen ;
                            System.out.println("Press 1 for turn on subtitle 0 for turn OFF ");
                            fullScreen = scanner.nextInt();
                            youtube.subTitle(fullScreen,youtube.playerName);
                            break;
                        }

                        case 3:{
                            int speed;
                            System.out.println("Enter Speed 1 or 2 : ");
                            speed = scanner.nextInt();
                            youtube.speed(speed,youtube.playerName);
                            break;
                        }

                        case 4:{
                            youtube.casting(youtube.playerName);
                            break;
                        }
                        case 5:{

                        }


                        default:
                        {
                            System.out.println("Invalid Input !...");
                            break;
                        }
                    }

                    System.out.println("Do you Want to Continue....Y/N ?");
                    answer = scanner.next().toUpperCase();
                    while ( !answer.equals("Y") && !answer.equals("N")){
                        System.out.println("Please Enter Valid Input \nDo you Want to Continue....Y/N ?");
                        answer = scanner.next().toUpperCase();
                    }
                    if (answer.equals("N")){
                        break;
                    }

                }while (answer.equals("Y") );
                }
                case 5:{

                    break;
                }


                default:
                {
                    System.out.println("Invalid Input !...");
                    break;
                }
            }

            System.out.println("Do you Want to Continue....Y/N ?");
            answer = scanner.next().toUpperCase();
            while ( !answer.equals("Y") && !answer.equals("N")){
                System.out.println("Please Enter Valid Input \nDo you Want to Continue....Y/N ?");
                answer = scanner.next().toUpperCase();
            }
            if (answer.equals("N")){
                break;
            }

        }while (answer.equals("Y") );

    }
}
