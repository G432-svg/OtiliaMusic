package be.intecbrussel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {


    private String playListName;
    private final Song[] playList = new Song[8];



    public PlayList(String playListName) {
        this.playListName = playListName;
    }

    public void addSong(Song songObject){
//        playList.addSong();
    }

    public void removeSong(Song songObject) {
//        playList.removeSong();
    }

    public void countOfPlaylist(){
        System.out.println("You have " + playList.length + " songs on your list!");
    }

    public void displayPlayList(){
        for (int i =0;i<playList.length;i++){
            System.out.printf("%d. %s%n", i + 1, playList.toString());
        }
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "playListName='" + playListName + '\'' +
                ", playList=" + playList +
                '}';
    }

    public void sortByName(){
        System.out.println("You can see your list as sorted by name.\n");
//        Collections.sort(playList);
        for (Song temp : playList){
            System.out.println(temp);
        }
    }

    public void addPlayList() {
    }

    public Song[] getPlaylist() {
        System.out.println();
        return null;
    }
}


