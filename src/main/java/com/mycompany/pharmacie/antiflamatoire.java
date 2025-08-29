/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacie;

/**
 *
 * @author Slime
 */
public class antiflamatoire extends medicament implements remboursable {
    protected String molecule;
    protected int acidite;
    
    public antiflamatoire(String libelle,int reference, float prix,String datedefabrication,String molecule,int acidite){
        super(libelle,reference,prix,datedefabrication);
        this.molecule = molecule;
        this.acidite = acidite;
    }
    public antiflamatoire() {
    }
    
    
    @Override
    public float calculTaxeAppliquee() {
        float taux = 0;
        switch (molecule) {
            case"steroidien":
                taux =0.1F;
                break;
            case"non steroidient":
                taux=0.15F;
                break;
        }
        return prix*taux;
    }

    @Override
    public String toString() {
        return "antiflamatoire{" + "molecule=" + molecule + ", acidite=" + acidite + '}';
    }
    
    @Override
    public float remboursement() {
        return prix*0.8F;
    }
}
