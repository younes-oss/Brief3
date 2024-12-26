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
    public void créerCompte() {
        System.out.println("Bienvenue dans notre agence !");
        System.out.print("Donnez-moi l'ID de la personne pour laquelle vous souhaitez créer un compte : ");
        int id = Main.scanner.nextInt();

        String choice = Main.scanner.next().toUpperCase();

        boolean clientTrouve = false;
        Random random = new Random();
        int nombreAleatoire = random.nextInt(900000);

        System.out.print("saisir votre solde");
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
                    System.out.println("Compte Épargne créé avec succès !");

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
}