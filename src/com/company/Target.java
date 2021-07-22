package com.company;

public class Target {
    String row1 = "";
    String row2 = "";
    String row3 = "";
    String face1 = "⨌⨀_⨀⨌";
    String face2 = "⨀_⨀⨌";
    String face3 = "⨀_⨀";
    String face4 = "x_x";
    String currentFace = face1;
    String distance = "                                                ";
    String space = "                                                ";
    int targetNum = 0;
    public String[] TARGET_ONE = {
            "",
            "",
            "",
            ""
    };
    public Target(){

    }
    public void defend(){
        targetNum = (int) (Math.random() * 2) + 1;
    }

}
