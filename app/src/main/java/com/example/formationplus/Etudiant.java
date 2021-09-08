package com.example.formationplus;

public class Etudiant  {
    int idEtudiant;
    String nom;
    String Prenom;
    String mail;
    Convention convention;
    public Etudiant(){}

    public Convention getConvention() {
        return convention;
    }

    public void setConvention(Convention convention) {
        this.convention = convention;
    }

    public Etudiant(int idEtudiant, String nom, String Prenom, Convention convention){
        this.idEtudiant=idEtudiant;
        this.nom=nom;
        this.Prenom=Prenom;
        this.convention=convention;
    }
    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }
    @Override
    public String toString() {
        return  nom +" " + Prenom ;
    }
}
