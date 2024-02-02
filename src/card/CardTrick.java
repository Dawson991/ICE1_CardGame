/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 * Modified by: Dawson Melin
 * Date modified: February 1, 2024
 */
public class CardTrick {
    
    public static void main(String[] args)
    {   
        Random random = new Random();

    
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            int randomValue = random.nextInt(13) + 1;
            int randomSuit = random.nextInt(4);
            Card c = new Card();
            c.setValue(randomValue);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] =c;
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(9);
        luckyCard.setSuit("Clubs");
        
        // and search magicHand here
        boolean match = false;
        for(int i=0; i<magicHand.length; i++){
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())) {
                match =true;
                break;
            }   
        }
    
        //Then report the result here
        if(match){
            System.out.println("Your card is in the magic hand!!!");
        }else{
            System.out.println("Sorry, your card is not in the magic hand");
        }

    }
}
        


