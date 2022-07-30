package Projects;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class music_player {
    public static void main(String[] args) throws UnsupportedAudioFileException,IOException,LineUnavailableException{

        Scanner scanner=new Scanner(System.in);
        //It only supports .wav files

        File file=new File("C:\\Users\\Emre TANRIKULU\\Desktop\\Scarlet_fire.wav"); //when I wrote just level_Up.wav it gave error so I copied its address
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";//ın order to holding command that will come from user
        while(!response.equalsIgnoreCase("Q")){
            System.out.println("PLAY: P   STOP:S  RESET:R  QUIT:Q ");
            System.out.println("ENTER YOUR CHOICE:");
            response=scanner.next();
            response = response.toUpperCase();
        switch (response){
            case ("P"): clip.start();
            break;
            case ("S"): clip.stop();
            break;
            case ("R"): clip.setMicrosecondPosition(0);
            break;
            case ("Q"): clip.close();
            break;
            default:
                System.out.println("INVALID RESPONSE");

        }
        }
    }
}

/* OUTPUT:
PLAY: P   STOP:S  RESET:R  QUIT:Q 
ENTER YOUR CHOICE:
p
(Playing song...)
PLAY: P   STOP:S  RESET:R  QUIT:Q 
ENTER YOUR CHOICE:
s
(Song stopped...)
PLAY: P   STOP:S  RESET:R  QUIT:Q 
ENTER YOUR CHOICE:
(Asking for another command)
*/
