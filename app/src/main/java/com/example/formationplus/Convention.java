package com.example.formationplus;

public class Convention {
    int idConvention;
    String nom;

    public int getIdConvention() {
        return idConvention;
    }

    public void setIdConvention(int idConvention) {
        this.idConvention = idConvention;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHeur() {
        return nbHeur;
    }

    public void setNbHeur(int nbHeur) {
        this.nbHeur = nbHeur;
    }

    int nbHeur;
}
