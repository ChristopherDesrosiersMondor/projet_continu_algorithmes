package Structure.Files;

public class Main {
    public static void main(String[] args) {
        
        Employer janeJones = new Employer("Jane", "Jones", 123);
        Employer johnDoe = new Employer("John", "Doe", 4567);
        Employer marySmith = new Employer("Mary", "Smith", 22);
        Employer mikeWilson = new Employer("Mike", "Wilson", 3245);
        Employer billEnd = new Employer("Bill", "End", 78);

        FileArray file = new FileArray(10);
        
        file.add(janeJones);
        file.add(johnDoe);
        file.add(marySmith);
        file.add(mikeWilson);
        file.add(billEnd);

        // Employer employerRetirer = file.pop();
        // Employer employerRetirer2 = file.pop();

        file.add(mikeWilson);

        file.afficherFile();

    }
}
