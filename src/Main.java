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
                case 2 : System.out.print("la création du compte avec succées\n");
                    break;
                case 3 : System.out.print("voici les opérations \n");
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
                    "2 . afficher les clients \n");
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
}