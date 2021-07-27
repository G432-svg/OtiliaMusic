package be.intecbrussel;

import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MusicCollection {

    private String musicCollectionName;


    private PlayList[] collection = new PlayList[2];

    public MusicCollection(String musicCollectionName) {
        this.musicCollectionName = musicCollectionName;
    }

//    public void addSongToPlayList(String playListName,Song songObject){
//        playListName.addSongToPlayList(songObject);
//
//    }
//
//    public void removeSongFromPlaylist (String playListName, Song songObject){
//        playListName.removeSongFromPlayList(songObject);
//    }

    public void addPlayList (PlayList  playlistObject){
        playlistObject.addPlayList();

    }

    public void removePlayList (PlayList  playlistObject){
        Object songObject = null;
        playlistObject.removeSong((Song) songObject);
    }

    public int countOfPlayListsInCollection(){
        System.out.println("you have" + countOfPlayListsInCollection() + "playLists in your collection");
        return 0;
    }

    public int countsOfSongsInPlayList (String playlistName){

        return 0;
    }

//    public void displayPlayListInCollection( playListInCollection){
//        for(int i=0;i<playListInCollection.length;i++){
//            System.out.println((i+1) +"." + playListInCollection.toString());
//        }
//
//    }
//
//    public void displaySongsFromPlaylist(String playlistName,  songsFromPlaylist){
//        for(int i=0;i<songsFromPlaylist.length;i++){
//            System.out.println((i+1) + "." + songsFromPlaylist.toString());
//        }
//
//    }


}
