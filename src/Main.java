import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         int choix = 0;
        System.out.println("-------------Hello and welcome---------------");
        while (choix!=4){
            System.out.print("           1 .créer un client\n"+
                    "           2 .créer un compte \n"+
                    "           3 . gérer les opérations\n"+
                    "           4 . effectuer un filtrage\n"+
                    "           5 . quitter le programme\n");
            System.out.print(" * .choisir un nombre ");
            choix = scanner.nextInt();
            switch (choix){

                case 1: System.out.print("la création de client avec succées");
                    break;
                case 2 : System.out.print("la création du compte avec succées");
                    break;
                case 3 : System.out.print("voici les opérations ");
                    break;
                case 4 : System.out.print("voici le filtrage\n");
                    break;
                case 5 : System.exit(0);

            }

        }
    }
}