package com.example.formationplus;

public class Attestation {
    // Variables d'instance


    int idAttestation;
    String message;
    Etudiant etudiant;
    Convention convention;

    public int getIdAttestation() {
        return idAttestation;
    }

    public void setIdAttestation(int idAttestation) {
        this.idAttestation = idAttestation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
