package com.company;

import com.company.Comportement.ComportementAleatoire;
import com.company.Comportement.ComportementCombine;
import com.company.Comportement.ComportementCyclique;
import com.company.Comportement.ComportementToutDroit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Monde monde = new Monde();

        // ******************************
        // les comportements
        // ******************************

        ComportementAleatoire ca = new ComportementAleatoire(2, 5);
        ComportementToutDroit ctd = new ComportementToutDroit(EnumDirection.GAUCHE);
        ComportementCombine cb = new ComportementCombine(ca, ctd);

        ArrayList<int[]> lstMouvements = new ArrayList<>();
        lstMouvements.add(new int[]{5, 2});
        lstMouvements.add(new int[]{3, 0});
        ComportementCyclique cc = new ComportementCyclique(lstMouvements);

        // ******************************
        // les entitées
        // ******************************

        /* Entitée aléatoire */
        EntiteeMobile emAleatoire = new EntiteeMobile(ca);

         /* Entitée tout droit */
        EntiteeMobile emToutDroit = new EntiteeMobile(ctd);

        /* Entitée combinée */
        EntiteeMobile emCombine = new EntiteeMobile(cb);

        /* Entitée cyclique */
        EntiteeMobile emCyclique = new EntiteeMobile(cc);


        // ******************************
        // ajout des entitées
        // ******************************
        monde.ajoutEntiteMobile(emAleatoire);
        monde.ajoutEntiteMobile(emCombine);
        monde.ajoutEntiteMobile(emCyclique);
        monde.ajoutEntiteMobile(emToutDroit);


        // ******************************
        // TEST
        // ******************************
        monde.lanceIteration(20, false, true);

    }
}
