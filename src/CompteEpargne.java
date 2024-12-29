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
    @Override
    public String toString() {
        return String.format("Compte Épargne [Numéro=%d, Solde=%.2f, Taux d'intérêt=%.2f%%]",
                getNumero(), getSolde(), tauxInteret);
    }


    public static void creerCompteEpargne() {
        System.out.println("Bienvenue dans notre agence !");
        System.out.print("Donnez-moi l'ID de la personne pour laquelle vous souhaitez créer un compte : ");
        int id = Main.scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(900000);

        System.out.print("Saisir votre solde : ");
        double solde = Main.scanner.nextDouble();

        System.out.print("Saisir la valeur de taux d'intérêt : ");
        double tauxInteret = Main.scanner.nextDouble();

        boolean clientTrouve = false;

        for (int i = 0; i < Main.clients.size(); i++) {
            if (id == Main.clients.get(i).getId()) {
                clientTrouve = true;

                // Vérification simple : parcours de la liste des comptes du client
                for (Compte compte : Main.clients.get(i).getComptes()) {
                    if (compte instanceof CompteEpargne) {
                        System.out.println("Ce client possède déjà un compte épargne. Impossible d'en créer un autre.");
                        return; // Quitte la méthode
                    }
                }

                // Création du compte épargne
                CompteEpargne compteEpargne = new CompteEpargne(randomNumber, solde, tauxInteret);
                System.out.println("Compte Épargne créé avec succès !");

                // Liaison du compte au client
                compteEpargne.setProprietaire(Main.clients.get(i));
                Main.clients.get(i).setComptes(compteEpargne); // Ajouter le compte au client
                break;
            }
        }

        if (!clientTrouve) {
            System.out.println("Aucun client trouvé avec l'ID " + id + ". Veuillez réessayer.");
        }
    }


}

