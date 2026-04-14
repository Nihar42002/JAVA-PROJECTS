package practice_set9;
import java.util.*;

public class playlist {
    public static void main(String[] args){

        LinkedList<String> songs = new LinkedList<>();
        songs.add("Jeena Jeena");
        songs.add("Bairan");
        songs.add("Rabta");
        songs.add("Tera Ban Jaunga");
        songs.add("Arz Kiya Hai");

        System.out.println("Songs in the playlist:");
        display(songs);

        if(!songs.isEmpty()){
            String playedSong  = songs.removeFirst();
            System.out.println("\nPlayed song: " + playedSong);
        }
        System.out.println("\nSongs in the playlist after removal:");
        display(songs);

        if(!songs.isEmpty()){
            String skippedSong  = songs.removeLast();
            System.out.println("\nSkipped song: " + skippedSong);
        }
        System.out.println("\nSongs in the playlist after skipping:");
            display(songs);
            


    }

    public static void display(LinkedList<String> songs){
        for(String song : songs){
            System.out.println(song);
        }
    }
    
}
