/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2ndyrGroupA
 */
public class Main {
    public static void main (String args[]){
        System.out.println("unshuffle Deck Of Cards");
        Deck deck = new Deck();
        deck.display();
        System.out.println("\n");
        System.out.println("Shuffled Deck Of Cards");
        deck.ShuffleCards();
    }
}
