package beans;

public  class CompteBancaire {
    static int numbreCompte = 0 ;
    protected Client leClient;

    protected boolean decouvertAutorise = false;
    protected float solde;

    protected String numCompte;

    protected String codeAgence;



    public CompteBancaire(Client leClient, boolean decouvertAutorise, float solde, String numCompte, String codeAgence) {
        this.leClient = leClient;
        this.decouvertAutorise = decouvertAutorise;
        this.solde = solde;
        this.numCompte = numCompte;
        this.codeAgence = codeAgence;
        this.numbreCompte = numbreCompte+1;
    }


    public Client getLeClient() {
        return leClient;
    }

    public void setLeClient(Client leClient) {
        this.leClient = leClient;
    }

    public boolean isDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(boolean decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public String getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(String codeAgence) {
        this.codeAgence = codeAgence;
    }

    public static int getNumbreCompte() {
        return numbreCompte;
    }

    public static void setNumbreCompte(int numbreCompte) {
        CompteBancaire.numbreCompte = numbreCompte;
    }

    //    Methode Calculer Le frais de tenue de compte

    public float CalculerFraisDeCompte(CompteBancaire compte) {
        float frais = 0;
        if (compte instanceof CompteCourant) {
            frais = 25;
        } else {
            if (compte instanceof LivretA) {
                frais = 25 + this.solde * 0.1F;
            } else {
                if (compte instanceof PlanEpargneLogement) {
                    frais = 25 + this.solde * 0.025F;
                }
            }
        }
        return frais;
    }

    public void afficherCompte() {
        System.out.println("CompteBancaire{" + "\n"+
                "leClient=" + leClient.getNom() +
                ", decouvertAutorise=" + decouvertAutorise +
                ", solde=" + solde +
                ", numCompte='" + numCompte + "\n" +
                ", codeAgence='" + codeAgence + "\n" +
                '}');
    }



    }




