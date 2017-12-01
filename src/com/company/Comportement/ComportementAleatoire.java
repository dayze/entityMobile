package com.company.Comportement;

import com.company.Deplacement;

import java.util.Random;

public class ComportementAleatoire extends AbstractComportement implements InterfaceComportement {

    private int minValue;
    private int maxValue;

    /**
     * Constructeur
     *
     * @param minValue : int
     * @param maxValue : int
     */
    public ComportementAleatoire(int minValue, int maxValue) {
        super();
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    // ******************************
    // Méthodes publiques
    // ******************************

    /**
     * Retourne le prochain mouvement en créant aléatoirement les coordonées
     *
     * @return deplacement : Instance de la classe Deplacement
     */
    @Override
    public Deplacement getProchainMouvement() {
        Random r = new Random();
        int x = r.nextInt(this.maxValue - this.minValue) + this.minValue;
        int y = r.nextInt(this.maxValue - this.minValue) + this.minValue;
        this.deplacement.setX(x);
        this.deplacement.setY(y);
        return this.deplacement;
    }
}
