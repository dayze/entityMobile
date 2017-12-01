package com.company;

import com.company.Comportement.ComportementCyclique;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Monde monde = new Monde();
        ArrayList<int[]> d = new ArrayList<>();
        d.add(new int[]{5,2});
        d.add(new int[]{2,3});
        EntiteeMobile entiteMobile1 = new EntiteeMobile(new ComportementCyclique(d));
        EntiteeMobile entiteMobile5 = new EntiteeMobile(new ComportementCyclique(d));/*
        EntiteeMobile entiteMobile2 = new EntiteeMobile(new ComportementToutDroit("HAUT"));
        EntiteeMobile entiteMobile3 = new EntiteeMobile(new ComportementAleatoire(1, 4));
        EntiteeMobile entiteMobile4 = new EntiteeMobile(
                new ComportementCombine(new ComportementAleatoire(1, 3),
                        new ComportementToutDroit("HAUT"))
        );*/
        monde.ajoutEntiteMobile(entiteMobile1);/*
        monde.ajoutEntiteMobile(entiteMobile2);
        monde.ajoutEntiteMobile(entiteMobile3);
        monde.ajoutEntiteMobile(entiteMobile4);*/
        monde.ajoutEntiteMobile(entiteMobile5);
        monde.lanceIteration(20, false);

     /*   EntiteeMobile entiteMobile1 = new EntiteeMobile(new ComportementToutDroit("HAUT"));
        EntiteeMobile entiteMobile2 = new EntiteeMobile(new ComportementToutDroit("HAUT"));
        EntiteeMobile entiteMobile3 = new EntiteeMobile(new ComportementAleatoire(1, 4));
        EntiteeMobile entiteMobile4 = new EntiteeMobile(
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
