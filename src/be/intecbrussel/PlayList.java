package be.intecbrussel;
import java.util.Arrays;

public class PlayList {


    private String playListName;

    public Song[] getPlayList2() {
        return playList2;
    }

    public void setPlayList3(Song[] playList3) {
        this.playList3 = playList3;
    }

    public void setPlayList2(Song[] playList2) {
        this.playList2 = playList2;
    }

    private Song[] playList1 = new Song[3];
    private Song[] playList2 = new Song[3];

    public PlayList(String playListName, Song[] playList1, Song[] playList2, Song[] playList3) {
        this.playListName = playListName;
        this.playList1 = playList1;
        this.playList2 = playList2;
        this.playList3 = playList3;
    }

    private Song[] playList3 = new Song[3];




    public PlayList(String playListName) {
        this.playListName = playListName;
    }

    public void addSong(Song songObject){
//        playList.addSong();
        for(int i = 0; i < playList1.length; i++){
            //check if song in array of songs on position i == 1
            if(playList1[i]==null){
                //if song on position i == 1 then place songObject on position i of playlist
                playList1[i]= songObject;
                return;
            }
        }
    }

    public void removeSong(Song songObject) {
//        playList.removeSong();
        for(int i = 0; i < playList1.length; i++){
            //check if song in array of songs on position i == null
            if(playList1[i]==null){
                //if song on position i == 1 then place songObject on position i of playlist
                playList1[i]= songObject;
                return;
            }
        }
    }

    public void countOfPlaylist(){
        System.out.println("You have " + playList1.length + " songs on your list!");
    }

    public void displayPlayList(){
        for (int i = 0; i< playList1.length; i++){
            System.out.printf("%d. %s%n", i + 1, playList1.toString());
        }
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "playListName='" + playListName + '\'' +
                ", playList1=" + Arrays.toString(playList1) +
                ", playList2=" + Arrays.toString(playList2) +
                ", playList3=" + Arrays.toString(playList3) +
                '}';
    }

    public void sortByName(){
        System.out.println("You can see your list as sorted by name.\n");
//        Collections.sort(playList1);
        for (Song song : playList1){
            System.out.println(song);
        }
    }

    public void addPlayList() {
    }

    public Song[] getPlaylist() {

        return playList1;

    }
}


