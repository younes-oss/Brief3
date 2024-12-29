import java.util.ArrayList;
import java.util.Random;

public class CompteCourant extends Compte {

    private double fraisBancaire;

    public CompteCourant(int numero, double solde,double fraisBancaire) {
        super(numero, solde);
        this.fraisBancaire=fraisBancaire;
    }
    public CompteCourant(){}


    public double getFraisBancaire() {
        return fraisBancaire;
    }

    public void setFraisBancaire(double fraisBancaire) {
        this.fraisBancaire = fraisBancaire;
    }
    public static void créerCompteCourant() {
        System.out.println("Bienvenue dans notre agence !");
        System.out.print("Donnez-moi l'ID de la personne pour laquelle vous souhaitez créer un compte : ");
        int id = Main.scanner.nextInt();

        boolean clientTrouve = false;
        Random random = new Random();
        int nombreAleatoire = random.nextInt(900000);

        System.out.print("saisir votre solde : ");
        double solde = Main.scanner.nextDouble();

        System.out.print("saisir la valeur de fraisBancaires : ");
        int frais = Main.scanner.nextInt();
        // Parcourir la liste des clients
        for (int i = 0; i < Main.clients.size(); i++) {
            if (id == Main.clients.get(i).getId()) {
                clientTrouve = true;

                // Création d'un compte en fonction du choix
                Compte compte;

                    compte = new CompteCourant(nombreAleatoire,solde,frais);
                    System.out.println("Compte Courant créé avec succès !");

                // Liaison du compte au client
                compte.setProprietaire(Main.clients.get(i)); // Si `proprietaire` existe dans `Compte`
                Main.clients.get(i).setComptes(compte);   // Ajoutez le compte au client
                break;
            }
        }

        if (!clientTrouve) {
            System.out.println("Aucun client trouvé avec l'ID " + id + ". Veuillez réessayer.");
        }
    }
    @Override
    public String toString() {
        return String.format("Compte Courant [Numéro=%d, Solde=%.2f, Frais Bancaires=%.2f]",
                getNumero(), getSolde(), fraisBancaire);
    }



    // Méthode pour afficher les comptes associés aux clients
    // Méthode pour afficher les comptes associés aux clients
    public static void afficherComptesClients() {
        if (Main.clients.isEmpty()) {
            System.out.println("Aucun client enregistré.");
            return;
        }

        for (Client client : Main.clients) {
            System.out.println("========================================");
            System.out.println("Client ID: " + client.getId());
            System.out.println("Nom: " + client.getNom() + " " + client.getPrenom());
            System.out.println("Email: " + client.getEmail());
            System.out.println("Adresse: " + client.getAdress());
            System.out.println("Téléphone: " + client.getTelephone());

            ArrayList<Compte> comptes = client.getComptes();
            if (comptes.isEmpty()) {
                System.out.println("Aucun compte associé.");
            } else {
                System.out.println("Comptes associés:");
                for (Compte compte : comptes) {
                    if (compte instanceof CompteCourant) {
                        System.out.println("\t" + compte.toString());
                    } else if (compte instanceof CompteEpargne) {
                        System.out.println("\t" + compte.toString());
                    } else {
                        System.out.println("\tType de compte inconnu: " + compte.toString());
                    }
                }
            }
        }
        System.out.println("========================================");
    }

}