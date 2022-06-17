package service;

import java.util.Scanner;

public class MethodeSaisie {


    public static String saisieUtilisateur(String mot) {
        System.out.println(mot);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public static int saisieUtilisateurNb(String nombre) {
        System.out.println(nombre);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static boolean saisieUtilisateurBoolean(Boolean True) {
        System.out.println(True);
        Scanner sca = new Scanner(System.in);
        return sca.nextBoolean();
    }

    public static float saisieUtilisateurFloat (float flottant) {
        System.out.println(flottant);
        Scanner sd = new Scanner(System.in);
        return sd.nextFloat();
    }

}
