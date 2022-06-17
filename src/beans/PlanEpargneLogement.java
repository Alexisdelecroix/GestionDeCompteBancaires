package beans;

import java.util.ArrayList;

public class PlanEpargneLogement extends CompteBancaire{


    public PlanEpargneLogement(Client leClient, boolean decouvertAutorise, float solde, String numCompte, String codeAgence) {
        super(leClient, decouvertAutorise, solde, numCompte, codeAgence);
    }


    public void afficherPlanEpargneLogement() {

        System.out.println("Votre numéro est : " +super.getNumCompte()+ "\n" +
                "Votre solde est : "+super.solde+ "\n" +"");
    }
}




