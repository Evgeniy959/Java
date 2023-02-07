package com.topacademy.springapp;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList;
    private String name;
    private int volume;

    /*private RockMusic rockMusic;

    public RockMusic getRockMusic() {
        return rockMusic;
    }

    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }*/

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }



    public void setMusic(Music music) {
        this.music = music;
    }




    public String playMusic(){
        //return " Music " + name + " , volume = "+ volume + " , play music : " +   music.getSong() ;
        return " Music " + name + " , volume = "+ this.volume + " , play music : " +   this.music.getSong() ;
    }



    public String playMusicList(){
        StringBuilder stringBuilder = new StringBuilder(500);

        stringBuilder.append("Music " + name + " , volume = "+ this.volume + " , play music : ");
        if (musicList!=null && musicList.size()>0) stringBuilder.append("\n");

        int count = 1;

        for (Music m:this.musicList) {
            stringBuilder.append(count++ + ") " + m.getSong()+"\n");
        }

        return  stringBuilder.toString() ;
    }
}
