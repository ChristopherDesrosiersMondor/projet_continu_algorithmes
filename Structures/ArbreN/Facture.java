package ArbreN;

public class Facture {

    public static double calculerPrixPizza(IngredientsDeLaPizza ingredientsDeLaPizza) {
        return ingredientsDeLaPizza.getPate().getPrixIngredient()
                + ingredientsDeLaPizza.getSauce().getPrixIngredient()
                + ingredientsDeLaPizza.getViande().getPrixIngredient()
                + ingredientsDeLaPizza.getLegume().getPrixIngredient();
    }
    
    public static void afficherFacture(IngredientsDeLaPizza ingredients, double prixTotalePizza) {
        System.out.println("\nVoici la liste d'ingrédients choisi: ");
        System.out.println("Pate:" + ingredients.getPate().getNomIngredient() + " prix:" + ingredients.getPate().getPrixIngredient() + "$");
        System.out.println("Sauce:" + ingredients.getSauce().getNomIngredient() + " prix:" + ingredients.getSauce().getPrixIngredient() + "$");
        System.out.println("Viande:" + ingredients.getViande().getNomIngredient() + " prix:" + ingredients.getViande().getPrixIngredient() + "$");
        System.out.println("Legume:" + ingredients.getLegume().getNomIngredient() + " prix:" + ingredients.getLegume().getPrixIngredient() + "$");
        System.out.println("Le prix Totale de la facture: " + prixTotalePizza + "$");
        System.out.println("Merci! Bonne journée!");
    }
}
