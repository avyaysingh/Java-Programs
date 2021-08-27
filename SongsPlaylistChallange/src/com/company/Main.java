package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer","Deep Purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("abc",5.6);
        album.addSong("aaa",6.6);
        album.addSong("bbb",7.6);
        album.addSong("ccc",8.6);
        album.addSong("ddd",9.6);
        album.addSong("eee",10.6);
        album.addSong("xyz",11.6);
        albums.add(album);

        album = new Album("sssssssssssssss","shubham");
        album.addSong("qq",12.6);
        album.addSong("rr",13.6);
        album.addSong("rre",14.6);
        album.addSong("cfgcc",15.6);
        album.addSong("d34dd",16.6);
        album.addSong("ee444e",17.6);
        album.addSong("xssdsyz",18.6);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("ccc",playList);
        albums.get(0).addToPlayList("ddd",playList);
        albums.get(0).addToPlayList("sxsxsxsxsxsxsxs",playList);  //does not exists
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(7,playList);
        albums.get(1).addToPlayList(6,playList);
        albums.get(1).addToPlayList(6,playList);
        albums.get(1).addToPlayList(24,playList);   // no track 2

        play(playList);

    }
    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }
        else {
            System.out.println("Now Playing "+ listIterator.next().toString());
        }
    }
}
