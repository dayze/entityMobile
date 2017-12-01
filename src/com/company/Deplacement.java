package com.company;

public class Deplacement {

    private int x;
    private int y;

    /**
     * Constructeur
     *
     * @param x : coordonnée X
     * @param y : coordonnée Y
     */
    public Deplacement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constrcuteur vide
     */
    public Deplacement() {

    }

    // ******************************
    // Getters et Setters
    // ******************************

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
