/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author grewal
 */
public class Card {
    private int rank; 
    private int suit;
    
    public Card(int suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }
   
    public int getCard(){
        return rank;
    }
    
    public void setCard(int rank){
        this.rank = rank;
    }
    @Override
    public String toString(){
        //combine rank and suit together into a single string(ex: Ace of Diamonds)
        //suing StringBuilder for modifiability later on
        StringBuilder displayCard = new StringBuilder();
        
        if(rank==11)
        {
            displayCard.append("Jack");
        }
        else if(rank==12)
        {
            displayCard.append("Queen");
        }
        else if(rank == 13)
        {
            displayCard.append("King");
        }
        else if(rank==14)
        {
            displayCard.append("Ace");
        }
        else
        {
            displayCard.append(rank);
        }
        displayCard.append(" of "); //setting the format of the output
        
        if(suit==0)
        {
            displayCard.append("Spades");
        }
        else if(suit==1)
        {
            displayCard.append("Hearts");
        }
        else if(suit==2)
        {
            displayCard.append("Clubs");
        }
        else if(suit==3)
        {
            displayCard.append("Diamonds");
        }
        //return the result of an entire cmombined string
        return displayCard.toString();
    }//end toString
   
}
