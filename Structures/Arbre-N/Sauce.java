package Partie2;
import java.util.Scanner;

public class Sauce implements Ingredients {
    Ingredients parent;
    Ingredients[] enfants = new Ingredients[3];
    String nomSauce;
    double prix;

    public Sauce(String nomSauce, double prix) {
        this.nomSauce = nomSauce;
        this.prix = prix;
            enfants[0] = new Viande("Bacon", 3.22);
            enfants[1] = new Viande("Pepperoni", 1.65);
            enfants[2] = new Viande("Saucisses", 2.37);
    }

    @Override
    public IngredientsDeLaPizza choisirIngredient(Ingredients parent, Scanner scanner, IngredientsDeLaPizza ingredients) {
        this.parent = parent;
        boolean mauvaisInput = true;
        while (mauvaisInput) {
            try {
                System.out.print("\nQuel est votre choix de viande: "
                                + "\n1-Bacon 3.22$" + "\n2-Pepperoni 1.65$"
                                + "\n3-Saucisses 2.37$"
                                + "\nEntrez le chiffre qui correspond a votre choix de viande [1-"+ enfants.length + "]:");
                int sauceChoisi = scanner.nextInt();
                switch (sauceChoisi) {
                    case 1:
                        ingredients = this.enfants[0].choisirIngredient(this,scanner ,ingredients);
                        ingredients.ajouterSauce(this);
                        return ingredients;
                    case 2:
                        ingredients = this.enfants[1].choisirIngredient(this,scanner ,ingredients);
                        ingredients.ajouterSauce(this);
                        return ingredients;
                    case 3:
                        ingredients = this.enfants[2].choisirIngredient(this,scanner ,ingredients);
                        ingredients.ajouterSauce(this);
                        return ingredients;
                    default:
                        System.out.println("\nVous devenez entrez 1, 2 ou 3. Aucun autre chiffre seras accepté."
                         + "\nVeuilliez essayer à nouveau!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return ingredients;
    }

    public String getNomIngredient() {
        return nomSauce;
    }

    public double getPrixIngredient() {
        return prix;
    }

    public Ingredients getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return "Sauce= " + nomSauce + ", prix= " + prix + "$";
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
