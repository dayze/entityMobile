package com.company;

import java.util.ArrayList;

public class Monde {

    private ArrayList<EntiteeMobile> entiteesMobiles;
    private ArrayList<ArrayList<Deplacement>> deplacementGlobalHistorique; // second algorithme

    /**
     * Constructeur
     */
    public Monde() {
        this.entiteesMobiles = new ArrayList<>();
        this.deplacementGlobalHistorique = new ArrayList<>();
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
        this.lanceIteration(n, true, false);
    }

    /**
     * Parcours l' Arraylist entiteesMobiles et effectue un déplacement n fois.
     *
     * @param n           : nombre d'iterations
     * @param collisions1 : affiche les collisions via la solution 1 si true
     * @param collisions2 : affiche les collisions via la solution 2 si true
     */
    public void lanceIteration(int n, boolean collisions1, boolean collisions2) {
        System.out.println("\n ### Début de l'itération \n");
        for (int i = 0; i < n; i++) {
            int indexEntiteeMobile = 0;
            ArrayList<Deplacement> lstDeplacement = new ArrayList<>(); // second algorithme
            for (EntiteeMobile em : this.entiteesMobiles) {
                ++indexEntiteeMobile;
                System.out.println("## Iteration pour l'EntiteeMobile n°" + indexEntiteeMobile);
                System.out.println("# Déplacement n° " + i);
                em.deplacer();
                System.out.println("=> s'est déplacée avec x:" + em.getX() + " y: " + em.getY());
                if (collisions1) {
                    this.connaitreCollisions(em);
                } else {
                    System.out.println("\n");
                }
                lstDeplacement.add(new Deplacement(em.getX(), em.getY())); // second algorithme

            }
            this.deplacementGlobalHistorique.add(lstDeplacement); // second algorithme
        }
        if (collisions2) {
            this.connaitreCollisions2();
        }
    }

    /**
     * Permet d'affichr les collisions entre EntiteesMobiles (version 1)
     *
     * @param em : une instance de la classe EntiteMobile
     */
    private void connaitreCollisions(EntiteeMobile em) {
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

    /**
     * Permet d'affichr les collisions entre EntiteesMobiles (version 2)
     */
    public void connaitreCollisions2() {
        System.out.println("### Début de l'estimation des collisions ... \n");
        for (ArrayList<Deplacement> listDeplacementParIteration : this.deplacementGlobalHistorique) {
            int i = 0;
            for (Deplacement deplacementTeste : listDeplacementParIteration) {
                int j = 0;
                for (Deplacement deplacementCompare : listDeplacementParIteration) {
                    if (j > i) { /* on ne compare pas avec les déplacements d'indice inférieur */
                        if (deplacementTeste.getX() == deplacementCompare.getX() && deplacementTeste.getY() == deplacementCompare.getY()) {
                            System.out.println("L'entitée mobile N°" + i + " a connu une collision avec l'entitée mobile N°" + j + " aux coordonnées x:" + deplacementCompare.getX() + " et y:" + deplacementCompare.getY() + " \n");
                        }
                    }
                    j++;
                }
                i++;
            }
        }
        System.out.println("### Fin de l'etimation des collisions");
    }
}


