import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static int compteur;
    private int id;
    private String nom,prenom,email,adress,telephone;
    private ArrayList<Client> clients = new ArrayList<>();


    public Client(String nom , String prenom , String email , String adress,String telephone){
        this.id=compteur;
        this.nom= nom;
        this.prenom=prenom;
        this.email= email;
        this.adress= adress;
        this.telephone=telephone;
        compteur++;
    }

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
    public void ajouterClient(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("votre nom : ");
        String firstName = scanner.next();
        System.out.print("\n votre prenom : ");
        String lastName = scanner.next();
        System.out.print("\n votre email : ");
        String email = scanner.next();
        System.out.print("\n votre adress : ");
        String adress = scanner.nextLine();
        scanner.nextLine();
        System.out.print("\n votre telephone : ");
        String telephone = scanner.next();

        clients.add(new Client(firstName,lastName,email,adress,telephone));
    }
}
