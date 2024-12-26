public abstract class Compte {
    private int numero;
    private double solde;
    Client proprietaire;

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = null;
    }
    public Compte(){}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }
}
