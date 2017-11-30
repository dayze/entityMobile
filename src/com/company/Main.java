package com.company;

import com.company.Comportement.ComportementAleatoire;
import com.company.Comportement.ComportementCombine;
import com.company.Comportement.ComportementCyclique;
import com.company.Comportement.ComportementToutDroit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Monde monde = new Monde();
        ArrayList<int[]> d = new ArrayList<>();
        d.add(new int[]{5,2});
        d.add(new int[]{2,3});
        EntiteMobile entiteMobile1 = new EntiteMobile(new ComportementCyclique(d));
        monde.ajoutEntiteMobile(entiteMobile1);
        monde.lanceIteration(20);

     /*   EntiteMobile entiteMobile1 = new EntiteMobile(new ComportementToutDroit("HAUT"));
        EntiteMobile entiteMobile2 = new EntiteMobile(new ComportementToutDroit("HAUT"));
        EntiteMobile entiteMobile3 = new EntiteMobile(new ComportementAleatoire(1, 4));
        EntiteMobile entiteMobile4 = new EntiteMobile(
                new ComportementCombine(new ComportementAleatoire(1, 3),
                        new ComportementToutDroit("HAUT"))
        );

        monde.ajoutEntiteMobile(entiteMobile1);
        monde.ajoutEntiteMobile(entiteMobile2);
        monde.ajoutEntiteMobile(entiteMobile3);
        monde.ajoutEntiteMobile(entiteMobile4);
        monde.lanceIteration(20);
        //monde.connaitreCollisions();

        System.out.println("Entité mobile 1 x:" + entiteMobile1.getX() + " y:" + entiteMobile1.getY());
        System.out.println("Entité mobile 2 x:" + entiteMobile2.getX() + " y:" + entiteMobile2.getY());
        System.out.println("Entité mobile 3 x:" + entiteMobile3.getX() + " y:" + entiteMobile3.getY());
        System.out.println("Entité mobile 4 x:" + entiteMobile4.getX() + " y:" + entiteMobile4.getY());
        */
    }
}
