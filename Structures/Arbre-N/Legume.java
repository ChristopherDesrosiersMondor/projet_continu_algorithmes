package Partie2;

import java.util.Scanner;

public class Legume implements Ingredients  {
    Ingredients parent;
    String nomLegume;
    Ingredients[] enfants;
    double prix;

    public Legume(String nomLegume, double prix) {
        this.nomLegume = nomLegume;
        this.prix = prix;
    }

    @Override
    public IngredientsDeLaPizza choisirIngredient(Ingredients parent, Scanner scanner,
            IngredientsDeLaPizza ingredients) {
        this.parent = parent;
        ingredients.ajouterLegume(this);
        return ingredients;
    }

    @Override
    public String toString() {
        return "Legume= " + nomLegume + ", prix= " + prix + "$";
    }

    public String getNomIngredient() {
        return nomLegume;
    }

    public double getPrixIngredient() {
        return prix;
    }

    public Ingredients getParent() {
        return parent;
    }

    @Override
    public Ingredients[] getChildren() {
        return enfants;
    }

    @Override
    public int getSize() {
        if (enfants != null) {
            return enfants.length - 1;
        } else {
            return 0;
        }
        
    }

}
