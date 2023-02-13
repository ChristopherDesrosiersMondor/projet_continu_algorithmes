package Partie2;
import java.util.Scanner;

public class Viande implements Ingredients {
    Ingredients parent;
    Ingredients[] enfants = new Ingredients[3];
    String nomViande;
    double prix;

    public Viande(String nomViande, double prix) {
        this.nomViande = nomViande;
        this.prix = prix;
        enfants[0] = new Legume("Poivron", 1.75);
        enfants[1] = new Legume("Champignon", 1.99);
        enfants[2] = new Legume("Piment fort", 2.54);
    }

    @Override
    public IngredientsDeLaPizza choisirIngredient(Ingredients parent,Scanner scanner,IngredientsDeLaPizza ingredients) {
        this.parent = parent;
        boolean mauvaisInput = true;

        while (mauvaisInput) {

            try {
                
                System.out.print(
                          "\nQuel est votre choix de legume: " + "\n1-Poivron 1.75$" + "\n2-Champignon 1.99$"
                             + "\n3-Piment fort 2.54$" +
                            "\nEntrez le chiffre qui correspond a votre choix de legume [1-" + enfants.length +"]:" );
                int legumeChoisi = scanner.nextInt();
                switch (legumeChoisi) {
                    case 1:
                        ingredients = this.enfants[0].choisirIngredient(this,scanner, ingredients);
                        ingredients.ajouterViande(this);
                        return ingredients;
                    case 2:
                        ingredients = this.enfants[1].choisirIngredient(this,scanner, ingredients);
                        ingredients.ajouterViande(this);
                        return ingredients;
                    case 3:
                        ingredients = this.enfants[2].choisirIngredient(this,scanner, ingredients);
                        ingredients.ajouterViande(this);
                        return ingredients;
                    default:
                        System.out.println("\nVous devenez entrez 1, 2 ou 3. " +
                                "Aucun autre chiffre seras accepté." + "\nVeuilliez essayer à nouveau!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return ingredients;
    }
    
    public String getNomIngredient() {
        return nomViande;
    }

    public double getPrixIngredient() {
        return prix;
    }

    @Override
    public String toString() {
        return "Viande= " + nomViande + ", prix= " + prix + "$";
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
