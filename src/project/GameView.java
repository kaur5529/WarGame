/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author grewal
 */
public class GameView {
    public static void main(String[] args) {
        String player;
        CardController cd= new CardController();
        Scanner input = new Scanner(System.in);
        System.out.println("Start Game");
        System.out.println("Enter your name to start");
        player = input.next();
        cd.playCards();
    }
}
