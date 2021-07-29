package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasterPlayList {
    public static void main(String[] args) {
        Song song = new Song("My heart will go on","Celine Dion","Titanic",364152);
        PlayList songs = new PlayList("Alfa");

        PlayList[] musicCollection;
        musicCollection = new PlayList[0];

        musicCollection = new PlayList[2];


        Song song1 = new Song("Wonderful Tonight", "Eric Clapton", "After Midnight - Single", 267000);
        Song song2 = new Song("She's like the wind", "Patrick Swayze ft. Wendy Frazer", "Wind - Single", 207000);
        Song song3 = new Song("Wind of Change", "Scorpions", "The Millennium", 185000);
        Song song4 = new Song("Send me an Angel", "Scorpions", "Best", 185000);
        Song song5 = new Song("Mooi", "Marco Borsato", "Evenwicht", 213000);
        Song song6 = new Song("Zwevend Naar't Geluk", "Jannes", "De nieuwe van...", 221000);
        Song song7 = new Song("If You", "Big Bang", "MADE", 264000);
        Song song8 = new Song("Celine Dion", "My heart will go on", "Titanic", 364152);
        Song song9 = new Song("Only You", "Kylie Minogue", "Christmas", 450000);

        PlayList playList1 = new PlayList("Alfa");
        PlayList playList2 = new PlayList("Omega");
        PlayList playList3 = new PlayList("Delta");








    }
}
