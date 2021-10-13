package com.company;

public class Test {
    private String nom;
    private int nombre;
    private  String prenom;

    public Test(String nom, int nombre, String prenom) {
        if (nom !=null && nombre!=0 && prenom!=null){
            this.nom = nom;
            this.nombre = nombre;
            this.prenom = prenom;
            System.out.println(nombre);
        }else{

            System.out.println("les valeurs ne peuvent pas étre nulles ");
        }

    }
    public Test(){}

    public String getNom() {
        return nom;
    }

    public String setNom(String nom) {
        this.nom = nom;

        return nom;
    }

    public int getNombre() {
        return nombre;
    }

    public int setNombre(int nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public String getPrenom() {
        return prenom;
    }

    public String setPrenom(String prenom) {
        this.prenom = prenom;
        return prenom;
    }
}
