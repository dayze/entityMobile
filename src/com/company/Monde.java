package com.company;

import java.util.ArrayList;

public class Monde {

    private ArrayList<EntiteMobile> entiteMobiles;

    public Monde() {
        this.entiteMobiles = new ArrayList<>();
    }

    public void addEntiteMobile(EntiteMobile em) {
        this.entiteMobiles.add(em);
    }

    public void lanceIterations(int n) {
        System.out.println("début de l'itération");
        int indexEntiteMobile = 0;
        for (EntiteMobile em : this.entiteMobiles) {
            System.out.println("Iteration pour entiteMobile n°" + ++indexEntiteMobile);
            for (int i = 0; i < n; i++) {
                System.out.println("Deplacement n°" + i);
                Deplacement deplacement = em.getComportement().getProchainMouvement();
                em.setX(em.getX() + deplacement.getX());
                em.setY(em.getY() + deplacement.getY());
                System.out.println("s'est déplacé x:" + em.getX() + " y:" + em.getY());
                this.connaitreCollision(em, indexEntiteMobile);
            }
        }
    }

    private void displayDeplacement() {
        System.out.println("Deplacement ");
    }

    public void connaitreCollision() {
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
    }

    public void connaitreCollision(EntiteMobile em, int indexEntiteMobile) {
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


