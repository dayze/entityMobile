package com.company;

import java.util.ArrayList;

public class Monde {

    private ArrayList<EntiteeMobile> entiteesMobiles;

    /**
     * Constructeur
     */
    public Monde() {
        this.entiteesMobiles = new ArrayList<>();
    }

    // ******************************
    // Méthodes publiques
    // ******************************

    /**
     * Permet d'ajouter une EntiteeMobile à l'Arraylist entiteesMobiles.
     *
     * @param em : instance de la classe EntiteeMobile
     */
    public void ajoutEntiteMobile(EntiteeMobile em) {
        this.entiteesMobiles.add(em);
    }

    /**
     * Parcours l' Arraylist entiteesMobiles et effectue un déplacement n fois.
     *
     * @param n : nombre d'iterations
     */
    public void lanceIteration(int n) {
        this.lanceIteration(n, true);
    }

    /**
     * Parcours l' Arraylist entiteesMobiles et effectue un déplacement n fois.
     *
     * @param n          : nombre d'iterations
     * @param collisions : affiche les collisions si true
     */
    public void lanceIteration(int n, boolean collisions) {
        System.out.println("\n ### Début de l'itération \n");
        for (int i = 0; i < n; i++) {
            int indexEntiteeMobile = 0;
            for (EntiteeMobile em : this.entiteesMobiles) {
                System.out.println("## Iteration pour l'EntiteeMobile n°" + ++indexEntiteeMobile);
                System.out.println("# Déplacement n° " + i);
                em.deplacer();
                System.out.println("=> s'est déplacée avec x:" + em.getX() + " y: " + em.getY());
                if (collisions) {
                    this.connaitreCollisions(em);
                } else {
                    System.out.println("\n");
                }
            }
        }
    }

    /**
     * Permet d'affichr les collisions entre EntiteesMobiles
     *
     * @param em : une instance de la classe EntiteMobile
     */
    public void connaitreCollisions(EntiteeMobile em) {
        int nbCollisions = 0;
        for (EntiteeMobile em2 : this.entiteesMobiles) {
            if (!em2.equals(em)) {
                if (em.getX() == em2.getX() && em.getY() == em2.getY()) {
                    nbCollisions++;
                }
            }
        }
        System.out.println("=> a subit " + nbCollisions + " collision(s). \n");
    }
}


