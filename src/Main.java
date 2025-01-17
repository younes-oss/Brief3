import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Client> clients = new ArrayList<>();
    static ArrayList <Compte> comptes = new ArrayList<>();
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         int choix = 0;
        System.out.println("-------------Hello and welcome---------------");
        while (choix!=5){
            System.out.print("\n           1 .créer un client\n"+
                    "           2 .créer un compte \n"+
                    "           3 . gérer les opérations\n"+
                    "           4 . effectuer un filtrage\n"+
                    "           5 . quitter le programme\n"+
                    "\n");
            System.out.print(" * .choisir un nombre : ");
            choix = scanner.nextInt();
            switch (choix){

                case 1: menuClient();
                    break;
                case 2 : menuCompte();
                    break;
                case 3 : Operation.gererOperations();
                    break;
                case 4 : System.out.print("voici le filtrage\n");
                    break;
                case 5 : System.exit(0);
            }
        }
    }

    public static void menuClient(){
        Client client = new Client();
        System.out.print("----------First choice-----------\n");
        int choix=0;
        while (choix!=3){
            System.out.print("1 .ajouter un client \n"+
                    "2 . afficher les clients \n" +
                    "3 . retour a la liste principale \n");
            choix = scanner.nextInt();

            switch (choix){
                case 1 : client.ajouterClient();
                break;
                case 2 :client.afficherClient();
                break;
                case 3 :
                    break;
            }
        }
    }
    public static void menuCompte(){
        CompteCourant compteCourant = new CompteCourant();
        CompteEpargne compteEpargne = new CompteEpargne();
        System.out.print("----------First choice-----------\n");
        int choix=0;
        while (choix!=4){
            System.out.print("1 .créer un compte courant  \n"+
                    "2 .créer un compte Epargne \n"+
                    "3 . afficher les comptes associées \n");
            choix = scanner.nextInt();
            switch (choix){
                case 1 : compteCourant.créerCompteCourant();
                    break;
                case 3 : compteEpargne.creerCompteEpargne();
                    break;
                case 2 :compteCourant.afficherComptesClients();
                    break;
                case 4 :System.out.print("retourne a la liste principale");
            }
        }
    }
}