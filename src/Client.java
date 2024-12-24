public class Client {
    private static int compteur;
    private int id;
    private String nom,prenom,email,adress,telephone;


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
        return id;
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
}
