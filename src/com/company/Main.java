package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player();
        Target target = new Target();
        System.out.println("Welcome to Lucky Shooter!!!");
        System.out.println("Press Enter to Shoot/Start the Game");
        for(int k = 0; k < 4; k++){
            System.out.println(player1.PLAYER_ONE[k]);
        }
        for (int i = 0; i < 60; i++) {
            if (player1.hitCount == 5 || player1.ammo == 0)
                break;
            player1.bullet = "- - *";
            player1.space = "";
            target.space = "                                                ";
            target.row1 = "";
            String input = scan.nextLine();
            if (input == "") {
                player1.ammo--;
                for (int j = 0; j < 50; j++) {
                    System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                    player1.space += " ";
                    target.space += "\b";
                    target.row2 = target.currentFace;
                    System.out.println(player1.PLAYER_ONE[0]);
                    System.out.println(player1.PLAYER_ONE[1] + target.distance + target.row1);
                    System.out.println(player1.PLAYER_ONE[2] + player1.space + player1.bullet + target.space + target.row2);
                    System.out.println(player1.PLAYER_ONE[3] + target.distance + target.row3);
                    System.out.println("Ammo: " + player1.ammo);
                    System.out.println("Kills: " + player1.hitCount);
                    if (target.currentFace == " 0 "){
                        target.currentFace = target.face1;
                        player1.ammo += (player1.attackNum + target.targetNum);
                        continue;
                    }
                    if (j == 45)
                        player1.bullet = "- -";
                    if (j == 47)
                        player1.bullet = "- ";
                    if (j == 48){
                        player1.bullet = "";
                        player1.attack();
                        target.defend();
                        if (target.currentFace == target.face1 && player1.attackNum == target.targetNum){
                            target.currentFace = target.face2;
                        }
                        else if (target.currentFace == target.face2 && player1.attackNum == target.targetNum){
                            target.currentFace = target.face3;
                        }
                        else if (target.currentFace == target.face3 && player1.attackNum == target.targetNum){
                            target.currentFace = target.face4;
                        }
                        else if (target.currentFace == target.face4 && player1.attackNum == target.targetNum){
                            target.row1 = "Shoot for Extra Ammo:";
                            target.currentFace = " 0 ";
                            player1.hitCount++;
                        }
                        else {
                            target.row1 = "Miss!";
                            continue;
                        }
                    }
                    Thread.sleep(16);
                }
            }
        }
        if (player1.hitCount < 5){
            System.out.println("YOU LOSE :(");
        } else {
            System.out.println("YOU WIN!!!");
        }
    }
}
