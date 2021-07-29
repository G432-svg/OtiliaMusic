package be.intecbrussel;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("My heart will go on","Celine Dion","Titanic",364152);
        PlayList songs = new PlayList("Alfa");

        PlayList[] musicCollection;
        musicCollection = new PlayList[0];

        musicCollection = new PlayList[2];


//        (musicCollection = playLists) instanceof  (musicCollection = playLists) : null;
        PlayList playList1 = new PlayList("Alfa");
        PlayList playList2 = new PlayList("Omega");
        PlayList playList3 = new PlayList("Delta");

        Song playlist1[] = songs.getPlaylist();
        Song song1 = new Song("Hotline Bling", "Drake", "Hotline Bing - Single", 267000);
        Song song2 = new Song("What Do You Mean?", "Justin Bieber", "What Do You Mean? - Single", 207000);
        Song song3 = new Song("Watch Me", "Silento", "Watch Me (Whip / Nae Nae) - Single", 185000);

        Song playlist2[] = songs.getPlaylist();
        Song song4 = new Song("679", "Fetty Wap ft. Remy Boyz", "Fetty Wap", 185000);
        Song song5 = new Song("Can't Feel My Face", "The Weeknd", "Beauty Behind the Madness", 213000);
        Song song6 = new Song("Good for You", "Selena Gomez ft. A$AP Rocky", "Good for You - Single", 221000);

        Song playlist3[] = songs.getPlaylist();
        Song song7 = new Song("If You", "Big Bang", "MADE", 264000);
        Song song8 = new Song("My heart will go on","Celine Dion","Titanic", 364152);
        Song song9 =new Song( "Only You", "Kylie Minogue","Christmas",450000);

        songs.addSong(song1);
        songs.addSong(song2);
        songs.addSong(song3);
        songs.addSong(song4);
        songs.addSong(song5);
        songs.addSong(song6);
        songs.addSong(song7);

        //prints out the songs
        songs.displayPlayList();


        Song[] playlist;
        System.out.println(playList1);


        songs.removeSong(song4);
        songs.removeSong(song6);

        System.out.println(playList2);

        songs.addSong(song4);
        songs.addSong(song6);

        System.out.println(playList3);




    }


}



