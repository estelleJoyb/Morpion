package com.example.morpion;

import android.widget.ImageView;

public class Pion {
    private int ligne;
    private int colonne;
    ImageView casePlateau;

    public Pion(){
        this.ligne = ligne;
        this.colonne = colonne;
        this.casePlateau = casePlateau;

    }

    public ImageView getCasePlateau(){
        return this.casePlateau;
    }

    public void setCasePlateau(ImageView vert){
        this.casePlateau = vert;
    }

    public void setLigne(int laligne){
        this.ligne = laligne;
    }
    public void setColonne(int lacolonne){
        this.colonne = lacolonne;
    }

    public int getLigne(){
        return this.ligne;
    }

    public int getColonne(){
        return this.colonne;
    }
}
