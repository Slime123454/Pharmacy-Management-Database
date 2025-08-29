/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacie;

/**
 *
 * @author Slime
 */
public class Homeopatique extends medicament {
    protected String plante;
    
    public Homeopatique(){
    }
    
    public Homeopatique (String libelle,int reference, float prix,String datedefabrication,String plante){
        super(libelle,reference,prix,datedefabrication);
        this.plante = plante;
    }
    @Override
    public float calculTaxeAppliquee(){
        float taux=0.2F;
        return prix*taux;
    }

    @Override
    public String toString() {
        return super.toString()+"homopathique" + "plante=" + plante +'}';
    }
    


    
    
}
