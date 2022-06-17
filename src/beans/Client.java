package beans;

public class Client {

static int numbreClient;
    private int id;

    private String nom;

    private String prenom;

    private String dateDeNaissance;

    private String email;



    public Client( String nom, String prenom, String dateDeNaissance, String email) {
        this.id =++numbreClient;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
    }

    public static int getNumbreClient() {
        return numbreClient;
    }

    public static void setNumbreClient(int numbreClient) {
        Client.numbreClient = numbreClient;
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

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void  afficherClient() {

        System.out.println("***********************************************");
        System.out.println("*                                             *");
        System.out.println("*               Fiche Client                  *");
        System.out.println("* Id du client : "+id+"                       *");
        System.out.println("* Nom : "+nom+"                               *");
        System.out.println("* Prenom : "+prenom+"                         *");
        System.out.println("* Date de Naissance : "+dateDeNaissance+"     *");
        System.out.println("*                                             *");
        System.out.println("***********************************************");

    }


}
