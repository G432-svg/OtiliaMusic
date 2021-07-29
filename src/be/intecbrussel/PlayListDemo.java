package be.intecbrussel;
import java.sql.SQLOutput;
import java.util.*;
import java.util.ArrayList;

public class PlayListDemo {
    public static void main(String[] args) {

        //Creae a musicCollection and add some playlist to the MusicCollection
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Alfa");
        list_Strings.add("Beta");
        list_Strings.add("Delta");

        //print the playlist
        System.out.println(list_Strings);

        //Update the third element with "Gama"
        list_Strings.set(2,"Gama");

        //Print the list again
        System.out.println(list_Strings);

        System.out.println("This are the playLists in musicCollection: REMIX");






    }
}
