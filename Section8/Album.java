package Section8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String argName, String argArtists) {
        this.name = argName;
        this.artist = argArtists;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songTime) {
        Song tempSong = findSong(songTitle);
        if (tempSong == null) {
            tempSong = new Song(songTitle, songTime);
            songs.add(tempSong);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String song) {
        for (Song s : songs) {
            if (s.getTitle().equalsIgnoreCase(song)) {
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(String argSong, LinkedList<Song> playlist) {
        Song tempSong = findSong(argSong);
        if (tempSong == null) {
            return false;
        } else {
            for (Song p : playlist) {
                if (p.getTitle().equalsIgnoreCase(argSong)) {
                    return false;
                }
            }
        }
        playlist.add(tempSong);
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song tempSong = null;
        if (trackNumber <= 0 || trackNumber > songs.size()) {
            return false;
        } else {
            tempSong = songs.get(trackNumber -1);
            String songName =   tempSong.getTitle();
           // ListIterator<Song> li = playlist.listIterator();
            ListIterator<Song> playListIterator = playlist.listIterator();
        while (playListIterator.hasNext()) {
            if  (playListIterator.next().getTitle().compareTo(songName) == 0) {
                // The song is already in the playlist
                return false;
        }
    }
}
        playlist.add(tempSong);
        return true;
     

        }
}
