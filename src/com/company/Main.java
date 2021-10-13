package com.company;

public class Main {

    public static void main(String[] args) {
	Test testeur = new Test("alex",2,"Debs");

    String mon_nom=testeur.setNom("Alexandre");
    int mon_nombre=testeur.setNombre(5);
    String mon_prenom=testeur.setPrenom("Debus");
    System.out.println(mon_nom +" "+mon_nombre+" "+ mon_prenom);
    }
}
