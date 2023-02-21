package Files;
import java.util.NoSuchElementException;

public class FileArray {
    Employer[] file;
    int tete;
    int fin;

    public FileArray(int capaciter) {
        file = new Employer[capaciter];
    }
    // ajouter
    public void add(Employer employer) {
        if (fin == file.length) {
            Employer[] nouvelFile = new Employer[2 * file.length];
            for (int i = 0; i < this.file.length; i++) {
                nouvelFile[i] = this.file[i];
            }
            this.file = nouvelFile;
        }
        file[fin] = employer;
        fin++;
    }
    // delete
    public Employer pop() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employer employer = file[tete];
        file[tete] = null;
        tete++;
        if (size() == 0) {
            tete = 0;
            fin = 0;
        }
        return employer;
    }

    public Employer peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return file[tete];
    }

    public int size() {
        return fin - tete;
    }
    // affichage
    public void afficherFile() {
        for (int i = tete; i < fin; i++) {
            System.out.println(this.file[i]);
        }
    }
    
}
