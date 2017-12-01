package com.company;

import com.company.Comportement.InterfaceComportement;


import java.util.ArrayList;

public class EntiteeMobile {
    private InterfaceComportement comportement;
    private int x;
    private int y;
    private ArrayList<Deplacement> deplacementsHistorique;

    /**
     * Constructor
     *
     * @param comportement : Interface Comportement
     */
    public EntiteeMobile(InterfaceComportement comportement) {
        this.deplacementsHistorique = new ArrayList<>();
        this.comportement = comportement;
        /* Génération aléatoire des valeurs pour X et Y */
        this.x = (int) (Math.random() * 100);
        this.y = (int) (Math.random() * 100);
        System.out.println("L'entitée mobile a été créée avec les coordonnées x: " + this.x + " et y:" + this.y);
    }

    // ******************************
    // Méthodes publiques
    // ******************************

    /**
     * Permet de déplacer l'EntiteeMobile et d'ajouter le déplacement dans l'historique
     */
    public void deplacer() {
        Deplacement deplacement = this.comportement.getProchainMouvement();
        this.setX(this.x + deplacement.getX());
        this.setY(this.y + deplacement.getY());
        this.deplacementsHistorique.add(deplacement);
    }

    // ******************************
    // Getters et setters
    // ******************************

    public void setComportement(InterfaceComportement comportement) {
        this.comportement = comportement;
    }

    public InterfaceComportement getComportement() {
        return comportement;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ArrayList<Deplacement> getDeplacementsHistoric() {
        return deplacementsHistorique;
    }
}