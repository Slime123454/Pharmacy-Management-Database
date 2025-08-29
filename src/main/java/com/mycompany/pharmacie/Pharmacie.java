package com.mycompany.pharmacie;
public class Pharmacie {
    private medicament[] lesMedicaments;
    
    private int nbMedicaments;
    
    public Pharmacie(int taille) {
        lesMedicaments = new medicament[taille];
        nbMedicaments = 0;
    }
    
    @Override
    public String toString() {
        String resultat = null;
        for (int i=0; i< nbMedicaments;i++) {
            resultat = resultat +lesMedicaments[i].toString()+"\n";
        }
        return resultat;
    }
    public void ajouter(medicament medicament) {
        if (nbMedicaments < lesMedicaments.length) {
    }
}}
