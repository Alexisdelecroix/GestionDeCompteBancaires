package beans;

import java.util.ArrayList;

public class CompteCourant extends CompteBancaire{


    public CompteCourant(Client leClient, boolean decouvertAutorise, float solde, String numCompte, String codeAgence) {
        super(leClient, decouvertAutorise, solde, numCompte, codeAgence);
    }



    @Override
    public float CalculerFraisDeCompte(CompteBancaire compte) {
        return 0;
    }


        public void afficherCompteCourant() {

            System.out.println("Votre numéro est : " +super.getNumCompte()+ "\n" +
                                 "Votre solde est : "+super.solde+ "\n" +"");
        }
        }