import beans.Agence;
import beans.Client;
import beans.CompteBancaire;
import beans.CompteCourant;

import java.util.ArrayList;

import static service.MethodeSaisie.saisieUtilisateur;
import static service.MethodeSaisie.saisieUtilisateurNb;

public class TestUnitaire {
    public static void main(String[] args) {


        ArrayList<CompteBancaire> unCompte = new ArrayList<>();
        ArrayList<Client> unClient = new ArrayList<>();
        ArrayList<Agence> uneAgence = new ArrayList<>();
    }
    public void CreerUnCompteCourant(ArrayList<CompteBancaire> lecompte, ArrayList<Client> cli, ArrayList<Agence> a) {
        System.out.println("Bienvenue");
        //        affichage de l'ensemble des agences pour choisir l'agence du client
        for (Agence uneAgence : a) {
            uneAgence.afficherAgence();
        }
        String codeAgence = saisieUtilisateur("Parmis les agences afficher, veuillez saisir le code agence");
//      Affichage de l'ensemble des clients
        for (Client unClient : cli) {
            unClient.afficherClient();
        }
        int choixClient = saisieUtilisateurNb("Pour quelle client voulait vous créer un compte, saissisez L'id");
        String numeroDeCompte = saisieUtilisateur("Entrez votre numéro de compte");
        float solde = Float.parseFloat(saisieUtilisateur("Entrez votre solde"));
        boolean decouvertAutorise = false;

        for (Client unClient : cli) {
            if (unClient.getId() == choixClient) {
                CompteBancaire unCompteCourant = new CompteCourant(unClient, decouvertAutorise, solde, numeroDeCompte, codeAgence);
            }
        }
    }
}
