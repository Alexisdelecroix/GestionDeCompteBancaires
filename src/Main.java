import beans.Agence;
import beans.Client;
import beans.CompteBancaire;
import service.Menu;
import service.Traitement;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        ArrayList<CompteBancaire> nosComptes=new ArrayList<>();
        ArrayList<Agence> nosAgences=new ArrayList<>();
        ArrayList<Client> nosClients=new ArrayList<>();

        Menu unMenu = new Menu();

//        Client leclient = new Client ("Alexis" ,"delecroix","22/11/1995","d-alexisahotmail.fr");

        unMenu.MenuGestion(nosAgences, nosClients, nosComptes);

    }
}
