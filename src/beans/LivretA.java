package beans;

import java.util.ArrayList;

public class LivretA extends CompteBancaire{


    public LivretA(Client leClient, boolean decouvertAutorise, float solde, String numCompte, String codeAgence) {
        super(leClient, decouvertAutorise, solde, numCompte, codeAgence);
    }



    public void afficherLivretA() {

        System.out.println("Votre numéro est : " +super.getNumCompte()+ "\n" +
                "Votre solde est : "+super.solde+ "\n" +"");
    }

}


