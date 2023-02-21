package HashTable;

import java.util.Random;

import DoubleLinkedList.*;

public class Part3 {
    private DoubleLinkedList<Ingredients> sauces = new DoubleLinkedList<>();
    private DoubleLinkedList<Ingredients> viandes = new DoubleLinkedList<>();
    private DoubleLinkedList<Ingredients> fruitLegumes = new DoubleLinkedList<>();
    private DoubleLinkedList<Ingredients> pates = new DoubleLinkedList<>();

    private HashMap hash = new HashMap();

    public HashMap getHash() {
        return hash;
    }

    public Part3() {
        init();
    }

    public DoubleLinkedList<DoubleLinkedList<Ingredients>> generatePizzas() {
        DoubleLinkedList<DoubleLinkedList<Ingredients>> pizzas = new DoubleLinkedList<>();
        int nbPizzas = 30000000;

        for (int i = 0; i < nbPizzas; i++) {
            DoubleLinkedList<Ingredients> pizza = new DoubleLinkedList<>();
            pizza.addToTail(pates.getByIndex(new Random().nextInt(pates.length() + 1)));
            pizza.addToTail(sauces.getByIndex(new Random().nextInt(sauces.length() + 1)));
            pizza.addToTail(viandes.getByIndex(new Random().nextInt(viandes.length() + 1)));
            pizza.addToTail(fruitLegumes.getByIndex(new Random().nextInt(fruitLegumes.length() + 1)));
            pizzas.addToTail(pizza);
        }

        return pizzas;
    }

    public void init(){
        pates.addToHead(new Ingredients(6, "Mince"));
        pates.addToHead(new Ingredients(8, "Deep dish"));

        sauces.addToHead(new Ingredients(1, "Sauce marinara"));
        sauces.addToHead(new Ingredients(1.5, "Sauce alfredo"));

        viandes.addToHead(new Ingredients(2, "Bacon"));
        viandes.addToHead(new Ingredients(3, "Merguez"));
        viandes.addToHead(new Ingredients(5, "Porc effiloche"));

        fruitLegumes.addToHead(new Ingredients(0.5, "oignons"));
        fruitLegumes.addToHead(new Ingredients(0.75, "Olives noires"));
        fruitLegumes.addToHead(new Ingredients(0.25, "poivrons"));
    }

    private class Ingredients {
        private double cost;
        private String name;

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }

        public Ingredients(double cost, String name) {
            this.cost = cost;
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name + " " + String.format("%.2f $", this.cost);
        }
    }

    private class HashMap {
        private double[] hashed = new double[144];

        public HashMap() {

        }

        public int h1(DoubleLinkedList<Ingredients> recettes) {
            String recette = "";
            for (Ingredients ingredient : recettes) {
                // ici le String format de toString pour Ingredients semblait ralentir l'execution.
                recette += ingredient.getName();
            }

            Integer lengthHash = recette.length();

            int index = lengthHash % this.hashed.length;

            return index;
        }

        public void placeValue(DoubleLinkedList<Ingredients> recettes) {
            int index = h1(recettes);
            double cost = 0;
            
            for (Ingredients ingredient : recettes) {
                    cost += ingredient.getCost();
            }

            this.hashed[index] = cost;
        }

        public double getValue(DoubleLinkedList<Ingredients> recettes) {
            int index = h1(recettes);
            return this.hashed[index];
        }

        @Override
        public String toString(){
            StringBuilder str = new StringBuilder();
            str.append("[");
            for (int i = 0; i < this.hashed.length; i++) {
                if (i != this.hashed.length - 1){
                    str.append(this.hashed[i] + ", ");
                    continue;
                }
                str.append(this.hashed[i]);
            }
            str.append("]");
            return str.toString();
        }
    }

    public void gettingPrices(DoubleLinkedList<DoubleLinkedList<Ingredients>> pizzas) {
        double cost = 0;
        for (DoubleLinkedList<Ingredients> pizza : pizzas) {
            cost += hash.getValue(pizza);
        }
        System.out.println("Prix total des pizzas: " + cost + "$");
    }

    /**
     * Source: https://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java
     * Utilisation: ici et dans part 2 pour tester le temps d'execution d'une methode.
     * @param pizzas
     */
    public void toTest(DoubleLinkedList<DoubleLinkedList<Ingredients>> pizzas) {
        long startTime = System.currentTimeMillis();

        double cost = 0;
        for (DoubleLinkedList<Ingredients> pizza : pizzas) {
            cost += hash.getValue(pizza);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Prix total des pizzas: " + cost + "$");
        
        
        System.out.println("Executer en " + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) {
        Part3 test = new Part3();
        HashMap hash = test.getHash();
        DoubleLinkedList<DoubleLinkedList<Ingredients>> pizzas = test.generatePizzas();
        // System.out.println(pizzas);
        for (DoubleLinkedList<Ingredients> pizza : pizzas) {
            hash.placeValue(pizza);
        }
        // System.out.println(hash);
        test.toTest(pizzas);
    }
}
