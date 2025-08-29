/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacie;

/**
 *
 * @author Slime
 */
public abstract class medicament {
    protected String libelle;
    protected int reference;
    protected float prix;
    protected String datedefabrication;
    
        public medicament() {
        }
        
        public medicament (String libelle,int reference, float prix,String datedefabrication) {
            this.libelle = libelle;
            this.reference = reference;
            this.prix = prix;
            this.datedefabrication = datedefabrication;
        }

    @Override
    public String toString() {
        return "medicament{" + "libelle=" + libelle + ", reference=" + reference + ", prix=" + prix + ", datedefabrication=" + datedefabrication + '}';
    }
        
        public abstract float calculTaxeAppliquee();
        
        
        public static void main(String[] args) {
        }
}
