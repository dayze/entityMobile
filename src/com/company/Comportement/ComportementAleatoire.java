package com.company.Comportement;

import com.company.Deplacement;

import java.util.Random;

public class ComportementAleatoire implements InterfaceComportement {
    int minValue;
    int maxValue;

    public ComportementAleatoire(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public Deplacement getProchainMouvement() {
        Random r = new Random();
        int x = r.nextInt(this.maxValue - this.minValue) + this.minValue;
        int y = r.nextInt(this.maxValue - this.minValue) + this.minValue;
        return new Deplacement(x, y);
    }
}
