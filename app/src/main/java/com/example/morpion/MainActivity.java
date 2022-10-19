package com.example.morpion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Jeu jeu = new Jeu();
    ArrayList<Pion> casesPlateau = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ligne 1 :
        //Grille
        ImageButton vert_11_V = findViewById(R.id.vert_11);
        ImageButton vert_12_V = findViewById(R.id.vert_12);
        ImageButton vert_13_V = findViewById(R.id.vert_13);
        Pion vert_11 = new Pion();
        vert_11.setLigne(1);
        vert_11.setColonne(1);
        casesPlateau.add(vert_11);

        Pion vert_12 = new Pion();
        vert_12.setLigne(1);
        vert_12.setColonne(2);
        casesPlateau.add(vert_12);

        Pion vert_13 = new Pion();
        vert_13.setLigne(1);
        vert_13.setColonne(3);
        casesPlateau.add(vert_13);

        //Croix :
        ImageView croix_11_V = findViewById(R.id.croix_11);
        ImageView croix_12_V = findViewById(R.id.croix_12);
        ImageView croix_13_V = findViewById(R.id.croix_13);

        //Cercle:
        ImageView cercle_11_V = findViewById(R.id.cercle_11);
        ImageView cercle_12_V = findViewById(R.id.cercle_12);
        ImageView cercle_13_V = findViewById(R.id.cercle_13);

        //ligne 2 :
        //Grille
        ImageButton vert_21_V = findViewById(R.id.vert_21);
        ImageButton vert_22_V = findViewById(R.id.vert_22);
        ImageButton vert_23_V = findViewById(R.id.vert_23);
        Pion vert_21 = new Pion();
        vert_21.setLigne(2);
        vert_21.setColonne(1);
        casesPlateau.add(vert_21);

        Pion vert_22 = new Pion();
        vert_22.setLigne(2);
        vert_22.setColonne(2);
        casesPlateau.add(vert_22);

        Pion vert_23 = new Pion();
        vert_23.setLigne(2);
        vert_23.setColonne(3);
        casesPlateau.add(vert_23);

        //Croix :
        ImageView croix_21_V = findViewById(R.id.croix_21);
        ImageView croix_22_V = findViewById(R.id.croix_22);
        ImageView croix_23_V = findViewById(R.id.croix_23);

        //Cercle:
        ImageView cercle_21_V = findViewById(R.id.cercle_21);
        ImageView cercle_22_V = findViewById(R.id.cercle_22);
        ImageView cercle_23_V = findViewById(R.id.cercle_23);

        //ligne 3:
        //Grille
        ImageButton vert_31_V = findViewById(R.id.vert_31);
        ImageButton vert_32_V = findViewById(R.id.vert_32);
        ImageButton vert_33_V = findViewById(R.id.vert_33);
        Pion vert_31 = new Pion();
        vert_31.setLigne(3);
        vert_31.setColonne(1);
        casesPlateau.add(vert_31);

        Pion vert_32 = new Pion();
        vert_32.setLigne(3);
        vert_32.setColonne(2);
        casesPlateau.add(vert_32);

        Pion vert_33 = new Pion();
        vert_33.setLigne(3);
        vert_33.setColonne(3);
        casesPlateau.add(vert_33);

        //Croix :
        ImageView croix_31_V = findViewById(R.id.croix_31);
        ImageView croix_32_V = findViewById(R.id.croix_32);
        ImageView croix_33_V = findViewById(R.id.croix_33);

        //Cercle:
        ImageView cercle_31_V = findViewById(R.id.cercle_31);
        ImageView cercle_32_V = findViewById(R.id.cercle_32);
        ImageView cercle_33_V = findViewById(R.id.cercle_33);
        //set to invisible
        //cercle:
        cercle_11_V.setVisibility(View.INVISIBLE);
        cercle_12_V.setVisibility(View.INVISIBLE);
        cercle_13_V.setVisibility(View.INVISIBLE);
        cercle_21_V.setVisibility(View.INVISIBLE);
        cercle_22_V.setVisibility(View.INVISIBLE);
        cercle_23_V.setVisibility(View.INVISIBLE);
        cercle_31_V.setVisibility(View.INVISIBLE);
        cercle_32_V.setVisibility(View.INVISIBLE);
        cercle_33_V.setVisibility(View.INVISIBLE);
        //croix:
        croix_11_V.setVisibility(View.INVISIBLE);
        croix_12_V.setVisibility(View.INVISIBLE);
        croix_13_V.setVisibility(View.INVISIBLE);
        croix_21_V.setVisibility(View.INVISIBLE);
        croix_22_V.setVisibility(View.INVISIBLE);
        croix_23_V.setVisibility(View.INVISIBLE);
        croix_31_V.setVisibility(View.INVISIBLE);
        croix_32_V.setVisibility(View.INVISIBLE);
        croix_33_V.setVisibility(View.INVISIBLE);

        //Ajouts des listener sur la grille :
        //ligne 1
        vert_11_V.setOnClickListener(this);
        vert_12_V.setOnClickListener(this);
        vert_13_V.setOnClickListener(this);
        //ligne 2
        vert_21_V.setOnClickListener(this);
        vert_22_V.setOnClickListener(this);
        vert_23_V.setOnClickListener(this);
        //ligne 3
        vert_31_V.setOnClickListener(this);
        vert_32_V.setOnClickListener(this);
        vert_33_V.setOnClickListener(this);


        jeu.InitPartie(); //initialise le jeu pour commencer la partie
    }



    @Override
    public void onClick(View view) {
        if(view == findViewById(R.id.vert_11)){ //si l'element coché est la case 1.1
            if(jeu.getAuxCroix()){//si c'est au tour des croix
                Pion croix_11 = new Pion(); //on crée le pion 1.1
                croix_11.setColonne(1);//on ajoute les colonnes au pion
                croix_11.setLigne(1);//on ajoute les lignes au pion
                croix_11.setCasePlateau(findViewById(R.id.vert_11)); //on ajoute la case (objet graphique) 1.1 au pion
                ImageView croix_11_V = findViewById(R.id.croix_11); //on recupere la croix (objet graphique) 1.1 avec son id
                croix_11_V.setVisibility(View.VISIBLE); //on l'affiche
                jeu.ajoutePionCroix(croix_11);// on ajoute le pion à la liste de pions des croix
                jeu.setAuxCroix(false); //ce n'est plus le tour des croix, on mets donc l'attribut auxCroix à false
                //MAJListenerPlateau(); //mise a jour des listener du plateau
            }else{
                Pion cercle_11 = new Pion();
                ImageView cercle_11_V = findViewById(R.id.cercle_11);
                cercle_11_V.setVisibility(View.VISIBLE);
                cercle_11.setLigne(1);
                cercle_11.setColonne(1);
                cercle_11.setCasePlateau(findViewById(R.id.vert_11));
                jeu.ajoutePionCercle(cercle_11);
                jeu.setAuxCroix(true);
            }
        }else if(view == findViewById(R.id.vert_12)){
            if(jeu.getAuxCroix()){
                Pion croix_12 = new Pion();
                ImageView croix_12_V = findViewById(R.id.croix_12);
                croix_12_V.setVisibility(View.VISIBLE);
                croix_12.setColonne(2);
                croix_12.setLigne(1);
                croix_12.setCasePlateau(findViewById(R.id.vert_12));
                jeu.ajoutePionCroix(croix_12);
                jeu.setAuxCroix(false);
            }else{
                Pion cercle_12 = new Pion();
                ImageView cercle_12_V = findViewById(R.id.cercle_12);
                cercle_12_V.setVisibility(View.VISIBLE);
                cercle_12.setLigne(1);
                cercle_12.setColonne(2);
                cercle_12.setCasePlateau(findViewById(R.id.vert_12));
                jeu.ajoutePionCercle(cercle_12);
                jeu.setAuxCroix(true);
            }
        }else if(view == findViewById(R.id.vert_13)){
            if(jeu.getAuxCroix()){
                Pion croix_13 = new Pion();
                ImageView croix_13_V = findViewById(R.id.croix_13);
                croix_13_V.setVisibility(View.VISIBLE);
                croix_13.setColonne(3);
                croix_13.setLigne(1);
                croix_13.setCasePlateau(findViewById(R.id.vert_13));
                jeu.ajoutePionCroix(croix_13);
                jeu.setAuxCroix(false);
            }else{
                Pion cercle_13 = new Pion();
                ImageView cercle_13_V = findViewById(R.id.cercle_13);
                cercle_13_V.setVisibility(View.VISIBLE);
                cercle_13.setColonne(3);
                cercle_13.setLigne(1);
                cercle_13.setCasePlateau(findViewById(R.id.vert_13));
                jeu.ajoutePionCercle(cercle_13);
                jeu.setAuxCroix(true);
            }
        }else if(view == findViewById(R.id.vert_21)){
            if(jeu.getAuxCroix()){
                Pion croix_21 = new Pion();
                ImageView croix_21_V = findViewById(R.id.croix_21);
                croix_21_V.setVisibility(View.VISIBLE);
                croix_21.setLigne(2);
                croix_21.setColonne(1);
                croix_21.setCasePlateau(findViewById(R.id.vert_21));
                jeu.ajoutePionCroix(croix_21);
                jeu.setAuxCroix(false);
            }else{
                Pion cercle_21 = new Pion();
                ImageView cercle_21_V = findViewById(R.id.cercle_21);
                cercle_21_V.setVisibility(View.VISIBLE);
                cercle_21.setLigne(2);
                cercle_21.setColonne(1);
                cercle_21.setCasePlateau(findViewById(R.id.vert_21));
                jeu.ajoutePionCercle(cercle_21);
                jeu.setAuxCroix(true);
            }
        }else if(view == findViewById(R.id.vert_22)){
            if(jeu.getAuxCroix()){
                Pion croix_22 = new Pion();
                ImageView croix_22_V = findViewById(R.id.croix_22);
                croix_22_V.setVisibility(View.VISIBLE);
                croix_22.setColonne(2);
                croix_22.setLigne(2);
                croix_22.setCasePlateau(findViewById(R.id.vert_22));
                jeu.ajoutePionCroix(croix_22);
                jeu.setAuxCroix(false);
            }else{
                Pion cercle_22 = new Pion();
                ImageView cercle_22_V = findViewById(R.id.cercle_22);
                cercle_22_V.setVisibility(View.VISIBLE);
                cercle_22.setLigne(2);
                cercle_22.setColonne(2);
                cercle_22.setCasePlateau(findViewById(R.id.vert_22));
                jeu.ajoutePionCercle(cercle_22);
                jeu.setAuxCroix(true);
            }
        }else if(view == findViewById(R.id.vert_23)){
            if(jeu.getAuxCroix()){
                Pion croix_23 = new Pion();
                ImageView croix_23_V = findViewById(R.id.croix_23);
                croix_23_V.setVisibility(View.VISIBLE);
                croix_23.setColonne(3);
                croix_23.setLigne(2);
                croix_23.setCasePlateau(findViewById(R.id.vert_23));
                jeu.ajoutePionCroix(croix_23);
                jeu.setAuxCroix(false);
            }else{
                Pion cercle_23 = new Pion();
                ImageView cercle_23_V = findViewById(R.id.cercle_23);
                cercle_23_V.setVisibility(View.VISIBLE);
                cercle_23.setLigne(2);
                cercle_23.setColonne(3);
                cercle_23.setCasePlateau(findViewById(R.id.vert_23));
                jeu.ajoutePionCercle(cercle_23);
                jeu.setAuxCroix(true);
            }
        }else if(view == findViewById(R.id.vert_31)){
            if(jeu.getAuxCroix()){
                Pion croix_31 = new Pion();
                ImageView croix_31_V = findViewById(R.id.croix_31);
                croix_31_V.setVisibility(View.VISIBLE);
                croix_31.setColonne(1);
                croix_31.setLigne(3);
                croix_31.setCasePlateau(findViewById(R.id.vert_31));
                jeu.ajoutePionCroix(croix_31);
                jeu.setAuxCroix(false);
            }else{
                Pion cercle_31 = new Pion();
                ImageView cercle_31_V = findViewById(R.id.cercle_31);
                cercle_31_V.setVisibility(View.VISIBLE);
                cercle_31.setLigne(3);
                cercle_31.setColonne(1);
                cercle_31.setCasePlateau(findViewById(R.id.vert_31));
                jeu.ajoutePionCercle(cercle_31);
                jeu.setAuxCroix(true);
            }
        }else if(view == findViewById(R.id.vert_32)){
            if(jeu.getAuxCroix()){
                Pion croix_32 = new Pion();
                ImageView croix_32_V = findViewById(R.id.croix_32);
                croix_32_V.setVisibility(View.VISIBLE);
                croix_32.setColonne(2);
                croix_32.setLigne(3);
                croix_32.setCasePlateau(findViewById(R.id.vert_32));
                jeu.ajoutePionCroix(croix_32);
                jeu.setAuxCroix(false);
            }else{
                Pion cercle_32 = new Pion();
                ImageView cercle_32_V = findViewById(R.id.cercle_32);
                cercle_32_V.setVisibility(View.VISIBLE);
                cercle_32.setLigne(3);
                cercle_32.setColonne(2);
                cercle_32.setCasePlateau(findViewById(R.id.vert_32));
                jeu.ajoutePionCercle(cercle_32);
                jeu.setAuxCroix(true);
            }
        }else if(view == findViewById(R.id.vert_33)){
            if(jeu.getAuxCroix()){
                Pion croix_33 = new Pion();
                ImageView croix_33_V = findViewById(R.id.croix_33);
                croix_33_V.setVisibility(View.VISIBLE);
                croix_33.setColonne(3);
                croix_33.setLigne(3);
                croix_33.setCasePlateau(findViewById(R.id.vert_33));
                jeu.ajoutePionCroix(croix_33);
                jeu.setAuxCroix(false);
            }else{
                Pion cercle_33 = new Pion();
                ImageView cercle_33_V = findViewById(R.id.cercle_33);
                cercle_33_V.setVisibility(View.VISIBLE);
                cercle_33.setLigne(3);
                cercle_33.setColonne(3);
                cercle_33.setCasePlateau(findViewById(R.id.vert_33));
                jeu.ajoutePionCercle(cercle_33);
                jeu.setAuxCroix(true);
            }
        }
    }

    /*
    * Met à jour les listener sur les cases du plateau pour éviter de sélectionner des cases déjà cochées
    * renvoie void

    public void MAJListenerPlateau(){
        //on enleve les listener pour toutes les cases
        //on les rajoute pour les cases qui sont encore vides
        ArrayList<Pion> vides = jeu.getEmplacements_vides();
        for(int i = 0; i <= casesPlateau.size(); i++){
            for(int y = 0; y <= vides.size(); y++){
                int val_col_case = casesPlateau.get(i).getColonne();
                int val_lig_case = casesPlateau.get(i).getLigne();
                int val_col_vid = vides.get(y).getColonne();
                int val_lig_vid = vides.get(y).getLigne();
                if((casesPlateau.get(i).getColonne() == vides.get(y).getColonne()) && (casesPlateau.get(i).getLigne() == vides.get(y).getLigne())){
                    casesPlateau.get(i).getCasePlateau().setOnClickListener(this);
                }
                if(y == vides.size()){ //la case n'est pas vide, on enleve son listener
                    casesPlateau.get(i).getCasePlateau().setOnClickListener(null);
                }
            }
        }
    }*/
}