public class CompteEpargne extends Compte {

    private double tauxInteret;

    public CompteEpargne(int numero, double solde,double tauxInteret) {
        super(numero, solde);
        this.tauxInteret = tauxInteret;
    }
    public CompteEpargne() {

    }


    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
