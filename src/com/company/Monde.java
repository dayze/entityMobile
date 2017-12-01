package com.company;

import java.util.ArrayList;

public class Monde {

    private ArrayList<EntiteMobile> entiteMobiles;

    /* Constructeur */
    public Monde() {
        this.entiteMobiles = new ArrayList<>();
    }

    /* Permet d'ajouter une entité mobile */
    public void ajoutEntiteMobile(EntiteMobile em) {
        this.entiteMobiles.add(em);

    }


    public void lanceIteration(int n) {
        this.lanceIteration(n, true);
    }

    /* Parcours la liste d'entités mobiles du monde */
    public void lanceIteration(int n, boolean collisions) {
        System.out.println("début de l'itération");
        for (int i = 0; i < n; i++) {
            int indexEntiteMobile = 0;
            for (EntiteMobile em : this.entiteMobiles) {
                System.out.println("Iteration pour entiteMobile n°" + ++indexEntiteMobile);
                System.out.println("Deplacement n°" + i);
                em.deplacer();
                System.out.println("s'est déplacé x:" + em.getX() + " y:" + em.getY());
                if (collisions) {
                    this.connaitreCollisions(em, indexEntiteMobile);
                }
            }
        }
    }
/*
    public void connaitreCollisions() {
        int indexEntiteMobile = 0;
        for (EntiteMobile em : this.entiteMobiles) {
            int nbCollisions = 0;
            indexEntiteMobile++;
            for (EntiteMobile em2 : this.entiteMobiles) {
                if (!em2.equals(em)) {
                    if (em.getX() == em2.getX() && em.getY() == em2.getY()) {
                        nbCollisions++;
                    }
                }
            }
            System.out.println("Entite n°" + indexEntiteMobile + " a subit " + nbCollisions + " collision");
        }
    }*/

    public void connaitreCollisions(EntiteMobile em, int indexEntiteMobile) {
        int nbCollisions = 0;
        for (EntiteMobile em2 : this.entiteMobiles) {
            if (!em2.equals(em)) {
                if (em.getX() == em2.getX() && em.getY() == em2.getY()) {
                    nbCollisions++;
                }
            }
        }
        System.out.println("Entite n°" + indexEntiteMobile + " a subit " + nbCollisions + " collision");
    }
}


