package com.company;

public class Player {
    int ammo = 30;
    int hitCount = 0;
    int attackNum = 0;
    int score = 0;
    public String bullet = "- - *";
    public String space = "";
    public String[] PLAYER_ONE = {
                    "/﹋\\",
                    "(҂`_´)",
                    "<,︻╦╤─ ҉ - -",
                    "/﹋\\"
    };
    public Player(){

    }
    public void attack(){
        attackNum = (int) (Math.random() * 2) + 1;
    }


}
