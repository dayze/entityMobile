package com.company.Comportement;

import com.company.Deplacement;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ComportementCyclique implements InterfaceComportement {

    private Deplacement deplacement;
    private ArrayList<int[]> lstMouvements;
    private int cursor;

    public ComportementCyclique(ArrayList<int[]> lstMouvements) {
        this.cursor = 0;
        this.lstMouvements = lstMouvements;
    }

    public ComportementCyclique(ComportementCyclique comportementCyclique) {
        this(comportementCyclique.getLstMouvements());
    }

    @Override
    public Deplacement getProchainMouvement() {
        this.manageCursor();
        this.setDeplacement();
        this.cursor++;
        return this.deplacement;
    }

    private void manageCursor() {
        if (this.cursor >= this.lstMouvements.size()) {
            this.cursor = 0;
        }
    }

    private ComportementCyclique getComportementInverse() {
        ArrayList<int[]> lstMouvementsInverses = this.getLstMouvements();
        for (int[] mouvement : lstMouvementsInverses) {
            mouvement[0] = mouvement[0] * -1;
            mouvement[1] = mouvement[1] * -1;
        }
        return new ComportementCyclique(lstMouvementsInverses);
    }

    public Deplacement getDeplacement() {
        return deplacement;
    }

    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }

    private void setDeplacement() {
        this.deplacement = new Deplacement(
                this.lstMouvements.get(this.cursor)[0],
                this.lstMouvements.get(this.cursor)[1]
        );
    }

    public ArrayList<int[]> getLstMouvements() {
        return lstMouvements;
    }

    public void setLstMouvements(ArrayList<int[]> lstMouvements) {
        this.lstMouvements = lstMouvements;
    }
}
