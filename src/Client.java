import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    private static int compteur =1;
    private int id;
    private String nom,prenom,email,adress,telephone;
    private ArrayList<Compte> comptes = new ArrayList<Compte>();



    public Client(String nom , String prenom , String email , String adress,String telephone){
        this.id=compteur;
        this.nom= nom;
        this.prenom=prenom;
        this.email= email;
        this.adress= adress;
        this.telephone=telephone;
        compteur++;
    }
    public Client(){}

    public static int getCompteur() {
        return compteur;
    }

    public static void setCompteur(int compteur) {
        Client.compteur = compteur;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public ArrayList<Compte> getComptes() {
        return comptes;
    }
    public void setComptes(Compte compte) {
        if (!this.comptes.contains(compte)) { // Évite les doublons
            this.comptes.add(compte);
        }
    }

    public void ajouterClient(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("votre nom : ");
        String firstName = scanner.next();
        System.out.print("votre prenom : ");
        String lastName = scanner.next();
        System.out.print("votre email : ");
        String email  = scanner.next();
        while (!RegexGmail(email)){
            System.out.println(" \"veillez ressayer de saisir l'email d'une maniére correcte\" ");
            System.out.print(" votre email : ");
            email = scanner.next();

        }
        scanner.nextLine();
        System.out.print("\n votre adress : ");
        String adress = scanner.nextLine();

        System.out.print("\n votre telephone : ");
        String telephone = scanner.next();
        while (!regexNumero(telephone)){
            System.out.print("\"veuillez saisir le uméro du telephone d'une maniére correcte\"");
            telephone = scanner.next();
        }

        Main.clients.add(new Client(firstName,lastName,email,adress,telephone));
    }

    public void afficherClient(){
        if(!Main.clients.isEmpty()){
        for(int i=0; i<Main.clients.size();i++) {
            int compteur = 1;
            compteur += i;
            System.out.print("\n---------------client" + compteur + "---------------\n");

            System.out.print("id : " + Main.clients.get(i).getId() +
                    "\nfull name : " + Main.clients.get(i).nom + " " + Main.clients.get(i).getPrenom() +
                    "\nemail : " + Main.clients.get(i).getEmail() + "\nadress : " + Main.clients.get(i).getAdress() +
                    "\ntelephone : " + Main.clients.get(i).getTelephone());
            System.out.print("\n----------------------------------------\n");
        }
        }
        else {
            System.out.print(" la liste est vide \n");
        }
    }

    public static boolean RegexGmail(String input){

        String regex = "^([a-zA-Z0-9_.-]+)@([a-z]+).([a-z]+)$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static boolean regexNumero(String input){

        String regex = "^((06)|(05)|(07))([0-9]{8})$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
