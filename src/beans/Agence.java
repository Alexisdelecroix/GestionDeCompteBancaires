package beans;

public class Agence {

    private String codeAgence;

    private String nomAgence;

    private String adresse;

    public Agence(String codeAgence, String nomAgence, String adresse) {
        this.codeAgence = codeAgence;
        this.nomAgence = nomAgence;
        this.adresse = adresse;
    }


    public String getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(String codeAgence) {
        this.codeAgence = codeAgence;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public void afficherAgence() {

        System.out.println("***********************************************");
        System.out.println("*              Fiche Agence                   *");
        System.out.println("*                                             *");
        System.out.println("* Code Agence : "+codeAgence+"                *");
        System.out.println("* Nom Agence : "+nomAgence+"                  *");
        System.out.println("* Adresse de l'agence : "+adresse+"           *");
        System.out.println("*                                             *");
        System.out.println("***********************************************");
    }
}
