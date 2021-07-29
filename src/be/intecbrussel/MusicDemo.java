package be.intecbrussel;

import java.util.*;

public class MusicDemo {

    public static void main(String[] args) {

        System.out.println("This is my MusicCollection:REMIX");

        //Creae a playlist1 and add some songs to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Wonderful Tonight");
        list_Strings.add("She's like the wind");
        list_Strings.add("Wind of change");

        //print the list
        System.out.println(list_Strings);

        //Update the third element with "Send me an angel"
        list_Strings.set(2, "Send me an angel");

        //Print the list again
        System.out.println(list_Strings);
        System.out.println("This is the Playlist1:Alfa");




        //Creae a playlist2 and add some songs to the list
        List<String> list2_Strings = new ArrayList<String>();
        list_Strings.add("679");
        list_Strings.add("Can't Feel My Face");
        list_Strings.add("Good for You");

        //print the list
        System.out.println(list_Strings);

        //Update the third element with "Send me an angel"
        list_Strings.set(2, "My heart will go on");

        //Print the list again
        System.out.println(list_Strings);
        System.out.println("This is the Playlist2:Omega");

        //Creae a playlist2 and add some songs to the list
        List<String> list3_Strings = new ArrayList<String>();
        list_Strings.add("If You");
        list_Strings.add("My heart will go on");
        list_Strings.add("Only You");

        //print the list
        System.out.println(list_Strings);

        //Update the third element with "Send me an angel"
        list_Strings.set(2, "Wind of change");

        //Print the list again
        System.out.println(list_Strings);
        System.out.println("This is the Playlist3:Delta");
    }


}



