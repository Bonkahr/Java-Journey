package com.bonkahr;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listIterator.remove()

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Come", "Chris");
        album.addSong("When you were here", 4.23);
        album.addSong("Where are you", 5.01);
        album.addSong("We were there too", 3.45);
        album.addSong("You are mine", 3.45);
        albums.add(album);

        album = new Album("Sweet sweet", "James D");
        album.addSong("you were here", 5.23);
        album.addSong("are you", 6.01);
        album.addSong("were there too", 2.45);
        album.addSong("You mine", 8.45);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("Where are you", playlist);
        albums.get(0).addToPlaylist("You mine", playlist);
        albums.get(0).addToPlaylist("Baby go", playlist); //no track
        albums.get(0).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(0).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(0).addToPlaylist(7, playlist); //no track

        play(playlist);


    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }
                    else {
                        System.out.println("We are at the end of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("We are at the start of the list");
                        }
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next().toString() );
                            forward = true;
                        }else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;

            }

        }
    }

    private static void printMenu(){
        System.out.println("Available options: \n");
        System.out.println("""
                0 - to quit\s
                1 - to play next song
                2 - to play previous song
                3 - to replay the current song
                4 - list songs in the playlist
                5 - to print available actions\s
                6 - to remove current song""");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============================");

    }

}
