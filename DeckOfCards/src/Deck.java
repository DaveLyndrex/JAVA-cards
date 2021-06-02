
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2ndyrGroupA
 */
public class Deck {
    final int size = 52;
    Cards[] deckOfCards = new Cards[size];
    
    
    public Deck(){
        int count = 0;
        
        String rank[] = {"a", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String suit[] = {"Club","Spade","Diamond","Heart"};
        
        
        for (String suits: suit){
            for (String ranks:rank){
                Cards card = new Cards (suits, ranks);
                this.deckOfCards[count] = card;
                count++;
            }
        }
    }
    
    public void display(){
        
        int count = 0;
        for (Cards card: deckOfCards){
            System.out.print(card.rank + card.suit + "\n");
            count++;
            if(count % 13 == 0){
                System.out.println(" ");
            }
        }
    }
    
    public void ShuffleCards(){
        Random ran = new Random();
        int x;
        int count = 0;
        for (int i = 0; i < size; i++){
            x = ran.nextInt(size);
            Cards temp = deckOfCards[i];
            deckOfCards[i] = deckOfCards[x];
            deckOfCards[x] = temp;
        }
        
        for (Cards card: deckOfCards){
            System.out.print(card.rank + card.suit + "\n");
            if (count % 13 == 0){
                System.out.println("\n");
            }
        }
    }
}
