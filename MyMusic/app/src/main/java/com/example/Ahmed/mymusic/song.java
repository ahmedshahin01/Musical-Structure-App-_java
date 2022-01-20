package com.example.Ahmed.mymusic;

public class song {
    private String SongName;
    private String Artest;
    public song(String defaultName, String defaultArtest) {
        SongName = defaultName;
        Artest = defaultArtest;
    }
    public String getSongName() {

        return SongName;
    }
    public String getArtest() {

        return Artest;
    }

}
