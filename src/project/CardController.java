/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author grewal
 */
public class CardController{
    List<Card> cards = new ArrayList<Card>(); 
    public void playCards()
    {
        for(int i=0; i<4; i++){         
            for(int j=2; j<15; j++){    
                cards.add(new Card(i,j)); 
            }
        }
        shuffle();
     LinkedList<Card> playerDeck = new LinkedList<Card>();
     LinkedList<Card> computerDeck = new LinkedList<Card>();
     playerDeck.addAll(cards.subList(0, 25));            
     computerDeck.addAll(cards.subList(26, cards.size()));
     while(true){
            Card p1ayerCard = playerDeck.pop();  
            Card computerCard= computerDeck.pop();
 
     System.out.println("Your Card : " + p1ayerCard.toString());
     System.out.println("Computer's Card : " + computerCard.toString());
     System.out.println();
   
            if(p1ayerCard.getCard() > computerCard.getCard()){
                playerDeck.addLast(p1ayerCard); 
                playerDeck.addLast(computerCard);
                System.out.println("You won this round");
                 System.out.println();
            }
    else if(p1ayerCard.getCard() < computerCard.getCard()){
                computerDeck.addLast(p1ayerCard);
                computerDeck.addLast(computerCard);
                System.out.println("Computer won this round");
                 System.out.println();
            }
    else { 
                System.out.println("War");
                List<Card> playerWar = new ArrayList<Card>();
                List<Card> computerWar = new ArrayList<Card>();
                
                for(int x=0; x<3; x++){
                    
                    if(playerDeck.size() == 0 || computerDeck.size() == 0 ){
                        break;
                    }
                System.out.println("Your war card : xx");
                System.out.println("Computer's war card : xx");
                    playerWar.add(playerDeck.pop()); 
                    computerWar.add(computerDeck.pop());
                }
              
                if(playerWar.size() == 3 && computerWar.size() == 3 ){
                    System.out.println("Your war card : " + playerWar.get(0).toString());
                    System.out.println("Computer's war card : " + computerWar.get(0).toString());
                   
                    if(playerWar.get(2).getCard() > computerWar.get(2).getCard()){
                        playerDeck.addAll(playerWar);
                        playerDeck.addAll(computerWar);
                        System.out.println("You win the war round");
                         System.out.println();
                    }
                    else{
                        computerDeck.addAll(playerWar); 
                        computerDeck.addAll(computerWar);
                        System.out.println("Computer wins the war round");
                         System.out.println();
                    }
                }
            }

            if(playerDeck.size() == 0 ){
                System.out.println("***** GAME OVER *****");
                System.out.println("You won the game");
                break;
            }
            else if(computerDeck.size() == 0){
                System.out.println("***** GAME OVER *****");
                System.out.println("Computer won the game");
                break;
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cards,new Random());
    }

}
