package Piles;

public class Employer {
    String prenom;
    String nomFamille;
    int id;

    public Employer(String prenom, String nomFamille, int id) {
        this.prenom = prenom;
        this.nomFamille = nomFamille;
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employer employer = (Employer) o;
        if (id != employer.id)
            return false;
        if (!prenom.equalsIgnoreCase(employer.prenom))
            return false;
        return nomFamille.equalsIgnoreCase(employer.nomFamille);

    }

    @Override
    public int hashCode() {
        int resultat = prenom.hashCode();
        resultat = 31 * resultat + nomFamille.hashCode();
        resultat = 31 * resultat + id;
        return resultat;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "Prenom='" + prenom + '\'' +
                ", Nom de Famille='" + nomFamille + '\'' +
                ", id=" + id +
                '}';
    } 
}