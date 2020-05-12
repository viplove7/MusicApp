package com.example.viplove.music;

public class song {
    private String songname;
    private String artist;
    private int imageid;
    private int audioid;

    public song(String msongname, String martist, int mimageid) {
        songname = msongname;
        artist = martist;
        imageid = mimageid;
    }

    public song(String msongname, String martist, int mimageid, int audio) {
        songname = msongname;
        artist = martist;
        imageid = mimageid;
        audioid = audio;
    }


    public int getImageid() {
        return imageid;
    }

    public String getArtist() {
        return artist;
    }

    public String getSongname() {
        return songname;
    }

    public int getAudioid() {
        return audioid;
    }
}
