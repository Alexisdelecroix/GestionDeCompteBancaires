package service;

import beans.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

import static service.MethodeSaisie.*;

public class Traitement {

    // ArrayList<Agence> listAgence = new ArrayList<>();
    // ArrayList<Client> listClient = new ArrayList<>();
    // ArrayList<CompteBancaire> listCompteBancaire = new ArrayList<>();


    public void CreerAgence(ArrayList<Agence> liste) {
        System.out.println("Bienvenue dans notre programme d'enregistrement d'agence ");
        String codeAgence = saisieUtilisateur("Entrez le code de l'agence");
        String nomAgence = saisieUtilisateur("Entrez le nom de l'agence");
        String adresse = saisieUtilisateur("Entrez l'adresse de l'agence");

        Agence maBanque = new Agence(codeAgence, nomAgence, adresse);
        liste.add(maBanque);
    }

    public void CréerClient(ArrayList<Client> cli, ArrayList<Agence> a) {
        System.out.println("Bienvenue dans notre programme d'enregistrement de nos client préférés ");
        String nom = saisieUtilisateur("Entrez votre nom de famille");
        String prenom = saisieUtilisateur("Entrez votre prénom");
        String dateDeNaissance = saisieUtilisateur("Entrez votre date de naissance");
        String email = saisieUtilisateur("Entrez votre E-Mail, merci");
        Client unClient = new Client(nom, prenom, dateDeNaissance, email);
        if (!cli.contains(unClient)) {
            cli.add(unClient);
            a.forEach(UneAgence -> UneAgence.afficherAgence());
            String numCompte = saisieUtilisateur("Veuillez entrez un numéro de compte");
            String codeAgence = saisieUtilisateur("Veuillez entrez un code d'agence parmis les agences ci dessus");
            CompteBancaire unCompteCourant = new CompteCourant(unClient, false, 0, numCompte, codeAgence);
        }


    }

//    public void RechercheClient(ArrayList<Client> cl) {
//        int id = saisieUtilisateurNb("Enter l'identifiant de votre client ");
//        int i = 0;
//        boolean Flag = false;
//        while (i < cl.size()) {
//            if (cl.get(i).getId() == id) {
//                CreerUnCompte(ArrayList < >)
//                Flag = true;
//            }
//            i++;
//        }
//    }

    public void CreerUnCompte(ArrayList<CompteBancaire> lecompte, ArrayList<Client> cli, ArrayList<Agence> a, int choix) {
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
                if (choix == 1) {
                    lecompte.add(new CompteCourant(unClient, decouvertAutorise, solde, numeroDeCompte, codeAgence));
                } else {
                    if (choix == 2) {
                        lecompte.add(new LivretA(unClient, decouvertAutorise, solde, numeroDeCompte, codeAgence));
                    } else {
                        if (choix == 3) {
                            lecompte.add(new PlanEpargneLogement(unClient, decouvertAutorise, solde, numeroDeCompte, codeAgence));
                        }
                    }
                }
            }
        }
    }

    public void RechercheCompte(ArrayList<CompteBancaire> lecompte) {
        String numeroDeCompte = saisieUtilisateur("Veuillez entrez un numéro de compte");

        for (CompteBancaire unCompte : lecompte) {
            if (numeroDeCompte.equals(unCompte.getNumCompte()) ) {
            unCompte.afficherCompte(unCompte);
            } else {
                System.out.println("Veuillez saisir une compte existant");
            }
        }
    }

    public void rechercheDeClient( ArrayList<CompteBancaire> cpte) {
        int saisieId = saisieUtilisateurNb("Veuillez saisir l'id du Client");

        for ( CompteBancaire unCompte : cpte) {
            if ( saisieId == unCompte.getLeClient().getId()) {
                unCompte.afficherUnClient(unCompte.getLeClient());
            }
        }
    }

    public void afficherListeCompteClient(ArrayList<CompteBancaire> compte, ArrayList<Client> cli) {
        int saisieId = saisieUtilisateurNb("Veuillez saisir l'id du client");
        for (Client unClient : cli) {
            if (saisieId == unClient.getId()) {
                unClient.afficherClient();
                for (CompteBancaire leCompte : compte) {
                    if (leCompte.getLeClient() == unClient) {
                        leCompte.afficherCompte(leCompte);
                    }
                }








                //    public void CreerUnLivretA(ArrayList<CompteBancaire> lecompte, ArrayList<Client> cli, ArrayList<Agence> a) {
//        System.out.println("Bienvenue");
//               affichage de l'ensemble des agences pour choisir l'agence du client
//        for (Agence uneAgence : a) {
//            uneAgence.afficherAgence();
//        }
//        String codeAgence = saisieUtilisateur("Parmis les agences afficher, veuillez saisir le code agence");
//  Affichage de l'ensemble des clients
//        for (Client unClient : cli) {
//            unClient.afficherClient();
//        }
//        int choixClient = saisieUtilisateurNb("Pour quelle client voulait vous créer un compte, saissisez L'id");
//        String numeroDeCompte = saisieUtilisateur("Entrez votre numéro de compte");
//        float solde = Float.parseFloat(saisieUtilisateur("Entrez votre solde"));
//        boolean decouvertAutorise = false;
//
//        for (Client unClient : cli) {
//            if (unClient.getId() == choixClient) {
//
//                lecompte.add(new LivretA(unClient, decouvertAutorise, solde, numeroDeCompte, codeAgence));
//            }
//        }
//    }
//
//    public void CreerUnPlanEpargneLogement(ArrayList<CompteBancaire> lecompte, ArrayList<Client> cli, ArrayList<Agence> a) {
//        System.out.println("Bienvenue");
//        //        affichage de l'ensemble des agences pour choisir l'agence du client
//        for (Agence uneAgence : a) {
//            uneAgence.afficherAgence();
//        }
//        String codeAgence = saisieUtilisateur("Parmis les agences afficher, veuillez saisir le code agence");
////      Affichage de l'ensemble des clients
//        for (Client unClient : cli) {
//            unClient.afficherClient();
//        }
//        int choixClient = saisieUtilisateurNb("Pour quelle client voulait vous créer un compte, saissisez L'id");
//        String numeroDeCompte = saisieUtilisateur("Entrez votre numéro de compte");
//        float solde = Float.parseFloat(saisieUtilisateur("Entrez votre solde"));
//        boolean decouvertAutorise = false;
//
//        for (Client unClient : cli) {
//            if (unClient.getId() == choixClient) {
//                lecompte.add(new PlanEpargneLogement(unClient, decouvertAutorise, solde, numeroDeCompte, codeAgence));
//            }
//        }
//    }






            //Methode pour afficher les comptes client
//                for (CompteBancaire unCompte : compte) {
//                    unCompte.getLeClient().afficherClient();
//                    if (unCompte instanceof CompteCourant) {
//                        ((CompteCourant) unCompte).afficherCompteCourant();
//                    }
//                    if (unCompte instanceof LivretA) {
//                        ((LivretA) unCompte).afficherLivretA();
//                    }
//                    if (unCompte instanceof PlanEpargneLogement) {
//                        ((PlanEpargneLogement) unCompte).afficherPlanEpargneLogement();


            }
        }
    }
}