package Partie2;

import java.util.Scanner;

public class Pate implements Ingredients {
    Ingredients[] enfants = new Ingredients[2];
    String nomPate;
    double prixPate;

    public Pate(String nomPate, double prix) {
        this.nomPate = nomPate;
        this.prixPate = prix;
        enfants[0] = new Sauce("Sauce Marinara", 1.50);
        enfants[1] = new Sauce("Sauce à l'ail", 2.00);
    }

    @Override
    public IngredientsDeLaPizza choisirIngredient(Ingredients parent, Scanner scanner, IngredientsDeLaPizza ingredients) {

        boolean mauvaisInput = true;
        while (mauvaisInput) {
            try {
                System.out
                        .print("\nQuel est votre choix de sauce: " + "\n1-Sauce Marinara 1.50$" + "\n2-Sauce à l'ail 2$"
                                + "\nEntrez le chiffre qui correspond a votre choix de sauce [1-2]:");
                int sauceChoisi = scanner.nextInt();
                switch (sauceChoisi) {
                    case 1:
                        ingredients = this.enfants[0].choisirIngredient(this, scanner, ingredients);
                        ingredients.ajouterPate(this);
                        return ingredients;
                    case 2:
                        ingredients = this.enfants[1].choisirIngredient(this, scanner, ingredients);
                        ingredients.ajouterPate(this);
                        return ingredients;
                    default:
                        System.out.println("\nVous devenez entrez 1 ou 2. Aucun autre chiffre seras accepté." +
                                "\nVeuilliez essayer à nouveau!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return ingredients;
    }

    public Ingredients getSauce1() {
        return enfants[0];
    }

    public Ingredients getSauce2() {
        return enfants[1];
    }

    public String getNomIngredient() {
        return nomPate;
    }

    public double getPrixIngredient() {
        return prixPate;
    } 

    @Override
    public String toString() {
        return "Pate= " + this.nomPate + ", prix= " + this.prixPate + "$";
    }
    @Override
    public Ingredients[] getChildren() {
        return enfants;
    }

    @Override
    public int getSize(){
        return enfants.length - 1;
    }
}
