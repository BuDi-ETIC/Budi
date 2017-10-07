package com.example.jack.budi;

/**
 * Created by jackhorsburgh on 07/10/2017.
 */

public class Player {
    private int pID;
    private String username;
    private String password;
    private int gameScore;
    private String nationality;

    public Player(int pID, String u, String p, int gScore, String nationality){
        this.pID=pID;
        this.username=u;
        this.password=p;
        this.gameScore=gScore;
        this.nationality=nationality;

    }


    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
