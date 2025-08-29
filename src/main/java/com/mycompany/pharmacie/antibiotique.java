/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacie;

/**
 *
 * @author Slime
 */
public class antibiotique extends medicament implements remboursable{
    protected String bacterie;
    
    public antibiotique() {
    }
    
    public antibiotique(String libelle,int reference, float prix,String datedefabrication,String bacterie){
        super(libelle,reference,prix,datedefabrication);
        this.bacterie=bacterie;
    }
    
    @Override
    public float calculTaxeAppliquee() {
        float taux;
        switch (bacterie) {
            case "thermophyle":
               taux =0.1F;
               break;
            case "mesophyle":
            taux = 0.2F;
            break;
            default :
            taux = 0.15F;
            break;
        }
        return prix*taux;
    }

    @Override
    public String toString() {
        return "antibiotique{" + "bacterie=" + bacterie + '}';
    }

    @Override
    public float remboursement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
