package Partie2;

// Director
public class IngredientsDeLaPizza implements BuilderInterface {
    
    private Ingredients pate;
    private Ingredients sauce;
    private Ingredients viande;
    private Ingredients legume;

    @Override
    public void ajouterPate(Ingredients pate) {
        this.pate = pate;
    }
    @Override
    public void ajouterSauce(Ingredients sauce) {
        this.sauce = sauce;
    }
    @Override
    public void ajouterViande(Ingredients viande) {
        this.viande = viande;
    }
    @Override
    public void ajouterLegume(Ingredients legume) {
        this.legume = legume;
    }

    public Ingredients getPate() {
        return pate;
    }
    public Ingredients getSauce() {
        return sauce;
    }
    public Ingredients getViande() {
        return viande;
    }
    public Ingredients getLegume() {
        return legume;
    }
    @Override
    public String toString() {
        return "Ingredients [pate=" + pate + ", sauce=" + sauce + ", viande=" + viande + ", legume=" + legume + "]";
    }
}
