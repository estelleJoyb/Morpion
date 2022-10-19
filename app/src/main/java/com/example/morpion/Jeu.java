package com.example.morpion;

import android.widget.ImageView;

import java.util.ArrayList;

public class Jeu {
    ArrayList<Pion> pions_croix = new ArrayList<Pion>();
    ArrayList<Pion> pions_cercle = new ArrayList<Pion>();
    ArrayList<Pion> emplacements_vides = new ArrayList<Pion>();
    boolean auxCroix; //vrai si c'est au tour des croix de jouer


    public Jeu(){
        this.pions_croix = pions_croix;
        this.pions_cercle = pions_cercle;
        this.emplacements_vides = emplacements_vides;
        this.auxCroix = auxCroix;
    }

    public void InitPartie(){
        auxCroix = true;
        //insertion des 9 emplacements du plateau
        Pion pion_11 = new Pion();
        pion_11.setColonne(1);
        pion_11.setLigne(1);
        Pion pion_12 = new Pion();
        pion_12.setColonne(2);
        pion_12.setLigne(1);
        Pion pion_13 = new Pion();
        pion_13.setColonne(3);
        pion_13.setLigne(1);
        Pion pion_21 = new Pion();
        pion_21.setLigne(2);
        pion_21.setColonne(1);
        Pion pion_22 = new Pion();
        pion_22.setColonne(2);
        pion_22.setLigne(2);
        Pion pion_23 = new Pion();
        pion_23.setColonne(3);
        pion_23.setLigne(2);
        Pion pion_31 = new Pion();
        pion_31.setColonne(1);
        pion_31.setLigne(3);
        Pion pion_32 = new Pion();
        pion_32.setColonne(2);
        pion_32.setLigne(3);
        Pion pion_33 = new Pion();
        pion_33.setColonne(3);
        pion_33.setLigne(3);
        emplacements_vides.add(pion_11);
        emplacements_vides.add(pion_12);
        emplacements_vides.add(pion_13);
        emplacements_vides.add(pion_21);
        emplacements_vides.add(pion_22);
        emplacements_vides.add(pion_23);
        emplacements_vides.add(pion_31);
        emplacements_vides.add(pion_32);
        emplacements_vides.add(pion_33);
    }

    public ArrayList<Pion> getEmplacements_vides(){
        return this.emplacements_vides;
    }

    public boolean getAuxCroix(){
        return this.auxCroix;
    }

    public void setAuxCroix(boolean bo){
        this.auxCroix = bo;
    }

    public void ajoutePionCroix(Pion pion){
        pions_croix.add(pion);
        int col = pion.getColonne();
        int lig = pion.getLigne();
        for(int i = 0; i <= emplacements_vides.size(); i++){//donc on enlève le pions de la liste des pions dispo
            if(emplacements_vides.get(i).getColonne() == col && emplacements_vides.get(i).getLigne() == lig){
                emplacements_vides.remove(emplacements_vides.get(i));
                i = emplacements_vides.size();
            }
        }
    }

    public void ajoutePionCercle(Pion pion){
        pions_cercle.add(pion);
        int col = pion.getColonne();
        int lig = pion.getLigne();
        for(int i = 0; i <= emplacements_vides.size(); i++){//donc on enlève le pions de la liste des pions dispo
            if(emplacements_vides.get(i).getColonne() == col && emplacements_vides.get(i).getLigne() == lig){
                emplacements_vides.remove(emplacements_vides.get(i));
            }
        }
    }
}
