package com.company;

import com.company.Comportement.ComportementAleatoire;
import com.company.Comportement.ComportementCombine;
import com.company.Comportement.ComportementCyclique;
import com.company.Comportement.ComportementToutDroit;

public class Main {

    public static void main(String[] args) {
        Monde monde = new Monde();
        EntiteMobile entiteMobile1 = new EntiteMobile(new ComportementToutDroit("HAUT"));
        EntiteMobile entiteMobile2 = new EntiteMobile(new ComportementToutDroit("HAUT"));
        EntiteMobile entiteMobile3 = new EntiteMobile(new ComportementAleatoire(1, 4));
        EntiteMobile entiteMobile4 = new EntiteMobile(new ComportementCombine(new ComportementAleatoire(1, 3),
                new ComportementToutDroit("HAUT")));

        monde.addEntiteMobile(entiteMobile1);
        monde.addEntiteMobile(entiteMobile2);
        monde.addEntiteMobile(entiteMobile3);
        monde.addEntiteMobile(entiteMobile4);
        monde.lanceIterations(20);
        monde.connaitreCollision();

        System.out.println("Entité mobile 1 x:" + entiteMobile1.getX() + " y:" +entiteMobile1.getY() );
        System.out.println("Entité mobile 2 x:" + entiteMobile2.getX() + " y:" +entiteMobile2.getY() );
        System.out.println("Entité mobile 3 x:" + entiteMobile3.getX() + " y:" +entiteMobile3.getY() );
        System.out.println("Entité mobile 4 x:" + entiteMobile4.getX() + " y:" +entiteMobile4.getY() );
    }
}
