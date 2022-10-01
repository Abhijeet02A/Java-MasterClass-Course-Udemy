package Section9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String argName, String argArtists) {
        this.name = argName;
        this.artist = argArtists;
        this.songs = new SongList();
    }

    public boolean addSong(String songTitle, double songTime) {
        Song tempSong = this.songs.findSong(songTitle);
        if (tempSong == null) {
            tempSong = new Song(songTitle, songTime);
            this.songs.add(tempSong); ///adding song to inner class arraylist 
            return true;
        } else {
            return false;
        }
    }

    

    public boolean addToPlayList(String argSong, LinkedList<Song> playlist) {
        Song tempSong = this.songs.findSong(argSong);
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
        Song tempSong = this.songs.findSong(trackNumber);
        if (tempSong == null) {
            return false;
        } else {
            
            String songName = tempSong.getTitle();
            // ListIterator<Song> li = playlist.listIterator();
            ListIterator<Song> playListIterator = playlist.listIterator();
            while (playListIterator.hasNext()) {
                if (playListIterator.next().getTitle().compareTo(songName) == 0) {
                    // The song is already in the playlist
                    return false;
                }
            }
        }
        playlist.add(tempSong);
        return true;

    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private Song findSong(String song) {
            for (Song s : songs) {
                if (s.getTitle().equalsIgnoreCase(song)) {
                    return s;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if((index > 0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }

        private boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }
    }

}
