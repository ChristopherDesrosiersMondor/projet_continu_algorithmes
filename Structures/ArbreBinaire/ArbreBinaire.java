package ArbreBinaire;

public class ArbreBinaire {
    NodeArbre racine;

    public void insérer(int valeur) {
        if (racine == null) {
            racine = new NodeArbre(valeur);
        } else {
            racine.insérer(valeur);
        }
    }

    public NodeArbre get(int valeur) {
        if (racine != null) {
            return racine.get(valeur);
        }
        return null;
    }

    public void delete(int valeur) {
        racine = delete(racine, valeur);
    }

    public NodeArbre delete(NodeArbre racineDeSousArbre, int valeur) {
        if(racineDeSousArbre == null){
            return racineDeSousArbre;
        }
        if (valeur < racineDeSousArbre.getData()) {
            racineDeSousArbre.setEnfantGauche(delete(racineDeSousArbre.getEnfantGauche(), valeur));
        }else if(valeur > racineDeSousArbre.getData()){
            racineDeSousArbre.setEnfantDroite(delete(racineDeSousArbre.getEnfantDroite(), valeur));
        } else {
            // Dans le cas ou le node qui dois être deleter a Zero ou 1 enfant
            if (racineDeSousArbre.getEnfantGauche() == null) {
                return racineDeSousArbre.getEnfantDroite();
            } else if (racineDeSousArbre.getEnfantDroite() == null) {
                return racineDeSousArbre.getEnfantGauche();
            }
            // Dans le cas ou le node a 2 enfants
            racineDeSousArbre.setData(racineDeSousArbre.getEnfantDroite().min());
            racineDeSousArbre.setEnfantDroite(delete(racineDeSousArbre.getEnfantDroite(), racineDeSousArbre.getData()));
        }
        return racineDeSousArbre;
    }

    public int min() {
        if (racine == null) {
            return Integer.MIN_VALUE;
        } else {
            return racine.min();
        }
    }

    public int max() {
        if (racine == null) {
            return Integer.MAX_VALUE;
        } else {
            return racine.max();
        }
    }

    public void traverserEnOrdre() {
        if (racine != null) {
            racine.traverserEnOrdre();
        } else {
            System.out.println("Arbre est vide.");
        }
    }
    
}
