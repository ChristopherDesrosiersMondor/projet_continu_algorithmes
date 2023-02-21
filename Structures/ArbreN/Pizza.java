package ArbreN;

import java.util.List;
import java.util.Scanner;

public class Pizza {

    public IngredientsDeLaPizza ingredientsDeLaPizza = new IngredientsDeLaPizza();
    private double prixTotalePizza;
    private int key;
    Arbre arbre;

    public Pizza(List<Ingredients> ingredients) {
        for (int index = 0; index < 4; index++) {
            switch (index) {
                case 0:
                    ingredientsDeLaPizza.ajouterPate(ingredients.get(index));
                    break;
                case 1:
                    ingredientsDeLaPizza.ajouterSauce(ingredients.get(index));
                    break;
                case 2:
                    ingredientsDeLaPizza.ajouterViande(ingredients.get(index));
                    break;
                case 3:
                    ingredientsDeLaPizza.ajouterLegume(ingredients.get(index));
                    break;
            }
        }
        key = myHashCode();
        prixTotalePizza = Facture.calculerPrixPizza(ingredientsDeLaPizza);
        
    }

    public Pizza() {
        arbre = new Arbre();
        Scanner scanner = new Scanner(System.in);
        arbre.construireIngredient(scanner, ingredientsDeLaPizza);
        key = myHashCode();
        prixTotalePizza = Facture.calculerPrixPizza(ingredientsDeLaPizza);
    }

    // string
    private int myHashCode() {
        String tempKey = ingredientsDeLaPizza.getPate() != null ? ingredientsDeLaPizza.getPate().getNomIngredient()
                : "null" + ingredientsDeLaPizza.getSauce() != null
                        ? ingredientsDeLaPizza.getSauce().getNomIngredient()
                        : "null" + ingredientsDeLaPizza.getViande() != null
                                ? ingredientsDeLaPizza.getViande().getNomIngredient()
                                : "null" + ingredientsDeLaPizza.getLegume() != null
                                        ? ingredientsDeLaPizza.getLegume().getNomIngredient()
                                        : "null";
        char[] stringKey = tempKey.toCharArray();
        int hashcode = 0;
        for (char input : stringKey) {
            if (Character.isAlphabetic(input)) {
                hashcode += (int) input;
            }
        }

        return hashcode;
    }
    
    @Override
    public String toString() {
        return "Pizza " + ingredientsDeLaPizza;
    }

    public int getKey() {
        return this.key;
    }

    public double getPrixTotale() {
        return this.prixTotalePizza;
    }

    public Arbre getArbre() {
        return arbre;
    }
    
    public void afficherFacture() {
        Facture.afficherFacture(ingredientsDeLaPizza, prixTotalePizza);
    }
}

