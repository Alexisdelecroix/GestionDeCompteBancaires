package service;

import beans.Agence;
import beans.Client;
import beans.CompteBancaire;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static service.MethodeSaisie.saisieUtilisateurNb;

public class Menu {
                    Traitement unTraitement = new Traitement();


    public void MenuGestion(ArrayList<Agence> a, ArrayList<Client> cl, ArrayList<CompteBancaire> cpte) throws FileNotFoundException {

        int choix = 0;

        do {
            System.out.println("**********************************************************************************************");
            System.out.println("*                  Bonjour,                                                                  *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 1 : Créer une agence                                                                *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 2 : Créer un client                                                                 *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 3 : Créer un compte bancaire                                                        *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 4 : Recharche de compte ( numéro de compte)                                         *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 5 : Recherche de client ( nom, numéro de compte, identifiant de client              *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 6 : Afficher la liste des comptes d'un client ( identifiant client )                *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 7 : imprimer les infos client ( identifiant client )                                *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 8 : Quitter le programme                                                            *");
            System.out.println("*                                                                                            *");
            System.out.println("**********************************************************************************************");
            choix = MethodeSaisie.saisieUtilisateurNb("Entrez votre choix");

            switch (choix) {
                case 1 :
                    unTraitement.CreerAgence(a);
                    break;
                case 2 :
                    unTraitement.CréerClient(cl, a);
                    break;
                case 3 :
                   CreerUnCompteBancaireMenu(cpte, cl, a);
                   break;
                case 4 :
                    unTraitement.RechercheCompte(cpte);
                    break;
                case 5 :
                    unTraitement.rechercheDeClient(cpte);
                    break;
                case 6 :
                    unTraitement.afficherListeCompteClient(cpte,cl);
                    break;
                case 7 :
                    unTraitement.Imprimer(cpte,cl);
            }
        } while (choix != 8);
    }

    public void CreerUnCompteBancaireMenu(ArrayList<CompteBancaire> cpt,ArrayList<Client>cl, ArrayList<Agence> a) {

        int choix = 0;
        do {System.out.println("**********************************************************************************************");
            System.out.println("*                  Bonjour,                                                                  *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 1 : Pour crée un compte courant                                                     *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 2 : Créer un livret A                                                               *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 3 : créer un plan epargne logement                                                  *");
            System.out.println("*                                                                                            *");
            System.out.println("*  Tapez 4 : Pour quitter la création d'un compte bancaire                                   *");
            System.out.println("*                                                                                            *");
            System.out.println("**********************************************************************************************");
            choix = saisieUtilisateurNb("Entrez votre choix");

            switch (choix) {
                case 1 :
                    unTraitement.CreerUnCompte(cpt,cl,a, 1);
                    break;
                case 2 :
                    unTraitement.CreerUnCompte(cpt,cl,a, 2);
                    break;
                case 3:
                    unTraitement.CreerUnCompte(cpt,cl,a, 3);
                    break;
//                case 4 :

            }

        } while (choix != 4);
    }
}