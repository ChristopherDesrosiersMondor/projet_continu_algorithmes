package Piles;

import java.util.EmptyStackException;

public class PileArray {

    private Employer[] pile;
    private int tete;

    public PileArray(int capaciter) {
        this.pile = new Employer[capaciter];
    }
    // ajouter
    public void push(Employer employer) {
        if (tete == pile.length) {
            Employer[] nouvelPile = new Employer[2 * pile.length];
            for (int i = 0; i < pile.length; i++) {
                nouvelPile[i] = this.pile[i];
            }
            this.pile = nouvelPile;
        }

        pile[tete++] = employer;
    }
    // delete
    public Employer pop() {
        if (esVide()) {
            throw new EmptyStackException();
        }
        Employer employer = pile[--tete];
        pile[tete] = null;
        return employer;
    }

    public Employer peek() {
        if (esVide()) {
            throw new EmptyStackException();
        }
        return pile[tete];
    }

    public boolean esVide() {
        return tete == 0;
    }
    
    //Lecture
    public void afficherPile() {
        for (int i = tete; i >= 0; i--) {
            System.out.println(pile[i]);
        }
    }
    
}
