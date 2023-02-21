package UsineDeFabrication;

public class Main {
    
    public static void main(String[] args) {
        
        UsineAbstraiteForme UsineFormes = new UsineForme();

        Forme shape1 = UsineFormes.getForme("Cercle");
        shape1.dessiner();

        Forme shape2 = UsineFormes.getForme("Rectangle");
        shape2.dessiner();

        Forme shape3 = UsineFormes.getForme("Carré");
        shape3.dessiner();
    }
}
