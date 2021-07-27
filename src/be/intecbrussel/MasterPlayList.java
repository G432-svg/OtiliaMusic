package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasterPlayList {
    public static void main(String[] args) {


        Song song1 = new Song("Hotline Bling", "Drake", "Hotline Bing - Single", 267000);
        Song song2 = new Song("What Do You Mean?", "Justin Bieber", "What Do You Mean? - Single", 207000);
        Song song3 = new Song("Watch Me", "Silento", "Watch Me (Whip / Nae Nae) - Single", 185000);
        Song song4 = new Song("679", "Fetty Wap ft. Remy Boyz", "Fetty Wap", 185000);
        Song song5 = new Song("Can't Feel My Face", "The Weeknd", "Beauty Behind the Madness", 213000);
        Song song6 = new Song("Good for You", "Selena Gomez ft. A$AP Rocky", "Good for You - Single", 221000);
        Song song7 = new Song("If You", "Big Bang", "MADE", 264000);

        Song song8 = new Song("Celine Dion", "My heart will go on", "Titanic", 364152);
        Song song9 = new Song("Only You", "Kylie Minogue", "Christmas", 450000);

        PlayList playList1 = new PlayList("Alfa");
        PlayList playList2 = new PlayList("Omega");
        PlayList playList3 = new PlayList("Delta");

        MusicCollection musicCollection = new MusicCollection("Remix");
    }
}
