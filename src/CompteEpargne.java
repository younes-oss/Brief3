import java.util.Random;

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

    public static void creerCompteEpargne(){
        System.out.println("Bienvenue dans notre agence !");
        System.out.print("Donnez-moi l'ID de la personne pour laquelle vous souhaitez créer un compte : ");
        int id = Main.scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(900000);

        System.out.print("saisir votre solde");
        double solde = Main.scanner.nextDouble();

        System.out.print("saisir la valeur de tauxInteret : ");
        int frais = Main.scanner.nextInt();

    }
}
