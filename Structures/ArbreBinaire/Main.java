package Structure.Arbres.ArbreBinaire;

public class Main {
    public static void main(String[] args) {
        ArbreBinaire arbreBinaire = new ArbreBinaire();
        arbreBinaire.insérer(25);
        arbreBinaire.insérer(20);
        arbreBinaire.insérer(15);
        arbreBinaire.insérer(27);
        arbreBinaire.insérer(30);
        arbreBinaire.insérer(29);
        arbreBinaire.insérer(26);
        arbreBinaire.insérer(22);
        arbreBinaire.insérer(32);

        System.out.println("Affichage de l'arbre binaire");
        System.out.println("--------------------------------");
        arbreBinaire.traverserEnOrdre();

        System.out.println();
        System.out.println(arbreBinaire.get(27));
        System.out.println(arbreBinaire.get(17));
        System.out.println(arbreBinaire.get(8888));

        System.out.println(arbreBinaire.min());
        System.out.println(arbreBinaire.max());
        arbreBinaire.delete(8888);
        
        System.out.println("Affichage de l'arbre binaire");
        System.out.println("--------------------------------");
        arbreBinaire.traverserEnOrdre();
        System.out.println();
    }
}
