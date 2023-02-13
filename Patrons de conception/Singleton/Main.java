package PatronsDeConception.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(55);
        System.out.println("Première référence: " + s);
        System.out.println("Valeur de data dans le Singleton est: " + s.getData());

        s = null;
        s = Singleton.getInstance();

        System.out.println("\nDeuxième référence: " + s);
        System.out.println("Valeur de data dans le Singleton est: " + s.getData());
    
    }

}
