package Partie2;
import java.util.Scanner;

public class Arbre{

    Ingredients racine;

    public Arbre() {
    }

    public Arbre(Ingredients ingredient) {
        racine = ingredient;
    }

    public void construireIngredient(Scanner scanner, IngredientsDeLaPizza ingredients) {
        bienvenue();
        choisirIngredient(scanner, ingredients);
    }
    // Big O (N) ou est est le plus grand nombre d'arret être la racine et la feuille la plus haute
    public void choisirIngredient(Scanner scanner, IngredientsDeLaPizza ingredients) {
        boolean mauvaisInput = true;
        while (mauvaisInput) {
            try {
                System.out.print(
                        "\nQuel est votre choix de pate: " + "\n1-La pâte napolitaine 3.33$" + "\n2-La pâte foccacia 2.51$"
                                + "\nEntrez le chiffre qui correspond a votre choix de pâte [1-2]:");
                int pate = scanner.nextInt();
                switch (pate) {
                    case 1:
                        this.racine = new Pate("La pâte napolitaine", 3.33);
                        mauvaisInput = false;
                        break;
                    case 2:
                        this.racine = new Pate("La pâte foccacia", 2.51);
                        mauvaisInput = false;
                        break;
                    default:
                        System.out.println("\nVous devenez entrez 1 ou 2. Aucun autre chiffre seras accepté." +
                                "\nVeuilliez essayer à nouveau!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.racine.choisirIngredient(racine, scanner, ingredients);
    }
        
    private void bienvenue() {
        System.out.println("Bienvenue chez pizza/pizza!");
    }

    public Ingredients getRacine() {
        return racine;
    }
}
