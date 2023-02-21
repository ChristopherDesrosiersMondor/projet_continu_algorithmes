package ArbreBinaire;

public class NodeArbre {
    int data;
    boolean droiteOuGauche;
    NodeArbre parent;
    NodeArbre enfantGauche;
    NodeArbre enfantDroite;

    public NodeArbre(int data) {
        this.data = data;
    }

    public NodeArbre(NodeArbre parent,int data) {
        this.data = data;
        this.parent = parent;
    }

    public void insérer(int valeur) {
        if (valeur == data) {
            return;
        }
        // sous-arbre gauche
        if (valeur < data) {
            if (this.enfantGauche == null) {
                this.enfantGauche = new NodeArbre(this, valeur);
                this.enfantGauche.setDroiteOuGauche(false);
            } else {
                this.enfantGauche.insérer(valeur);
            }
            // sous-arbre droite
        } else {
            if (this.enfantDroite == null) {
                this.enfantDroite = new NodeArbre(this, valeur);
                this.enfantDroite.setDroiteOuGauche(true);
            } else {
                enfantDroite.insérer(valeur);
            }
        }
    }

    public NodeArbre get(int valeur) {
        if (valeur == data) {
            return this;
        }
        if (valeur < this.data) {
            if (this.enfantGauche != null) {
                return this.enfantGauche.get(valeur);
            }
        } else {
            if (this.enfantDroite != null) {
                return this.enfantDroite.get(valeur);
            }
        }
        return null;
    }

    public int min() {
        if (this.enfantGauche == null) {
            return data;
        } else {
            return this.enfantGauche.min();
        }
    }
    
    public int max() {
        if (this.enfantDroite == null) {
            return data;
        } else {
            return this.enfantDroite.max();
        }
    }

    public void traverserEnOrdre() {
        if (this.enfantGauche != null) {
            this.enfantGauche.traverserEnOrdre();
        }
        if (parent == null) {
            System.out.println(data + ", racine");
        } else {
            System.out.println(parent != null && droiteOuGauche ? data +
                    ", enfant de droite du parent: " + parent : data + ", enfant de gauche du parent:" + parent);
        }
        if (this.enfantDroite != null) {
            this.enfantDroite.traverserEnOrdre();
        }
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeArbre getEnfantGauche() {
        return enfantGauche;
    }

    public void setEnfantGauche(NodeArbre enfantGauche) {
        this.enfantGauche = enfantGauche;
    }

    public NodeArbre getEnfantDroite() {
        return enfantDroite;
    }

    public void setEnfantDroite(NodeArbre enfantDroite) {
        this.enfantDroite = enfantDroite;
    }

    public NodeArbre getParent() {
        return parent;
    }

    public void setParent(NodeArbre parent) {
        this.parent = parent;
    }
    
    public boolean isDroiteOuGauche() {
        return droiteOuGauche;
    }

    public void setDroiteOuGauche(boolean droiteOuGauche) {
        this.droiteOuGauche = droiteOuGauche;
    }

    @Override
    public String toString() {
        return "Data= " + this.data;
    }
}