package com.company.Comportement;

import com.company.Deplacement;

import java.lang.reflect.Array;

public class ComportementCyclique implements InterfaceComportement {

    private Deplacement deplacement;
    private int mouvement[] = {-1, 0};
    private int mouvement2[] = {1, 0};

    public ComportementCyclique() {
        this.deplacement = new Deplacement(
                this.mouvement[0] + this.mouvement2[0], this.mouvement[1] + this.mouvement2[1]
        );
    }

    public ComportementCyclique(ComportementCyclique comportementCyclique) {
        this.deplacement.setX(comportementCyclique.deplacement.getX());
        this.deplacement.setY(comportementCyclique.deplacement.getY());
    }

    @Override
    public Deplacement getProchainMouvement() {
        return this.deplacement;
    }

    /*private ComportementCyclique getComportementInverse() {

    }*/

    public Deplacement getDeplacement() {
        return deplacement;
    }

    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }
}
