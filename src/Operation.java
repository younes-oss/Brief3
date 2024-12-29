import java.util.Date;

public class Operation {

    private String type; // "Dépôt" ou "Retrait"
    private double montant;
    private Date date;
    private Compte compteAssocie;

    public Operation(String type, double montant, Date date, Compte compteAssocie) {
        this.type = type;
        this.montant = montant;
        this.date = date;
        this.compteAssocie = compteAssocie;
    }

    // Méthode pour gérer les dépôts et retraits
    public static void gererOperations() {
        System.out.println("Bienvenue dans le système d'opérations !");
        System.out.println("1. Effectuer un dépôt");
        System.out.println("2. Effectuer un retrait");
        System.out.print("Choisissez une option : ");
        int choix = Main.scanner.nextInt();

        System.out.print("Entrez l'ID du compte : ");
        int idCompte = Main.scanner.nextInt();

        Compte compte = trouverCompteParId(idCompte);
        if (compte == null) {
            System.out.println("Compte non trouvé. Veuillez vérifier l'ID.");
            return;
        }

        if (choix == 1) {
            System.out.print("Entrez le montant à déposer : ");
            double montantDepot = Main.scanner.nextDouble();
            Depot(compte, montantDepot);
        } else if (choix == 2) {
            System.out.print("Entrez le montant à retirer : ");
            double montantRetrait = Main.scanner.nextDouble();
            Retrait(compte, montantRetrait);
        } else {
            System.out.println("Option invalide. Veuillez réessayer.");
        }
    }

    // Méthode pour effectuer un dépôt
    private static void Depot(Compte compte, double montant) {
        compte.setSolde(compte.getSolde() + montant);
        Operation operation = new Operation("Dépôt", montant, new Date(), compte);
        System.out.println("Dépôt effectué avec succès !");
        System.out.println(operation);
    }

    // Méthode pour effectuer un retrait
    private static void Retrait(Compte compte, double montant) {
        if (compte.getSolde() >= montant) {
            compte.setSolde(compte.getSolde() - montant);
            Operation operation = new Operation("Retrait", montant, new Date(), compte);
            System.out.println("Retrait effectué avec succès !");
            System.out.println(operation);
        } else {
            System.out.println("Solde insuffisant pour effectuer ce retrait.");
        }
    }

    // Méthode utilitaire pour trouver un compte par ID
    private static Compte trouverCompteParId(int idCompte) {
        for (Client client : Main.clients) {
            for (Compte compte : client.getComptes()) {
                if (compte.getNumero() == idCompte) {
                    return compte;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Opération [%s] - Montant: %.2f - Date: %s - Compte Numéro: %d",
                type, montant, date.toString(), compteAssocie.getNumero());
    }
}

