package be.intecbrussel;

import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MusicCollection {

    private String musicCollectionName="Remix";


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
        //incorrect, you try to add a playlist to a playlist, this is wrong
        playlistObject.addPlayList();
        // iterate over all playlists in collection
        for (int i = 0; i< collection.length; i++){
            //check if playlist in array of playlists on position i == null
            if(collection[i]==null){
                //if playlist on position i == null then place playlistObject on position i of collection
                collection[i]= playlistObject;
                return;
            }
        }
    }
    public void removePlayList (PlayList  playlistObject){
//        Object songObject = null;
//        playlistObject.removeSong((Song) songObject);
        for (int i = 0; i< collection.length; i++){
            //check if playlist in array of playlists on position i == null
            if(collection[i]==null){
                //if playlist on position i == null then place playlistObject on position i of collection
                collection[i]= playlistObject;
                return;
            }
        }
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
