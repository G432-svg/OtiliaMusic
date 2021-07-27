package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Music {
    public static void main(String[] args) {
        int count = 0;
        {
            count++;
        }
        Song song = new Song("My heart will go on","Celine Dion","Titanic",364152);
        PlayList songs = new PlayList("Alfa");


        PlayList[] musicCollection;
        musicCollection = new PlayList[0];

        musicCollection = new PlayList[2];

        Object playList = null;

        PlayList playList1 = new PlayList("Alfa");
        PlayList playList2 = new PlayList("Omega");
        PlayList playList3 = new PlayList("Delta");


//        musicCollection.addPlayList("Omega");
//        musicCollection.removePlayList("Alfa");
//        musicCollection.countsOfPlayListsInCollection(playListsInCollection);


        Song playlist[] = songs.getPlaylist();
        Song song1 = new Song("Hotline Bling", "Drake", "Hotline Bing - Single", 267000);
        Song song2 = new Song("What Do You Mean?", "Justin Bieber", "What Do You Mean? - Single", 207000);
        Song song3 = new Song("Watch Me", "Silento", "Watch Me (Whip / Nae Nae) - Single", 185000);
        Song song4 = new Song("679", "Fetty Wap ft. Remy Boyz", "Fetty Wap", 185000);
        Song song5 = new Song("Can't Feel My Face", "The Weeknd", "Beauty Behind the Madness", 213000);
        Song song6 = new Song("Good for You", "Selena Gomez ft. A$AP Rocky", "Good for You - Single", 221000);
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


//        Song[] playlist;
        System.out.println(playList1);


        songs.removeSong(song4);
        songs.removeSong(song7);

        System.out.println(playList2);

        songs.addSong(song8);
        songs.addSong(song9);

        System.out.println(playList3);



    }

    private static void print(Song[] playlist) {
        printHeader();



        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                System.out.println(playlist[i]);
                playlist[i].getAlbum();
                fancyLines(55);
            }
        }
    }

    private static void printHeader() {
        fancyLines(45);
        System.out.println("\t\t\t\tPlaylist\n");
        fancyLines(45);
    }

    private static void fancyLines(int numbOfLines) {
        for (int i = 0; i < numbOfLines; i++) {
            System.out.print("-");
            if (i == (numbOfLines - 1)) {
                System.out.println("|\n");
            }
        }
    }
}

