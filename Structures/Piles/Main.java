package Piles;

public class Main {

    public static void main(String[] args) {
        PileArray pile = new PileArray(10);
        pile.push(new Employer("Jane", "Jones", 123));
        pile.push(new Employer("John", "Doe", 4567));
        pile.push(new Employer("Mary", "Smith", 22));
        pile.push(new Employer("Mike", "Wilson", 3245));
        pile.push(new Employer("Bill", "End", 78));

        //stack.printStack();

        System.out.println(pile.peek());
        //stack.printStack();

        System.out.println("Popped: " + pile.pop());
        System.out.println(pile.peek());
    }
    
}
