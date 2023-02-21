package ArbreN;
import java.util.Scanner;

public interface Ingredients {

    IngredientsDeLaPizza choisirIngredient(Ingredients parent, Scanner scanner, IngredientsDeLaPizza ingredients);

    String getNomIngredient();

    double getPrixIngredient();

    public Ingredients[] getChildren();

    int getSize();
}
