package com.company.Comportement;

import com.company.Deplacement;
import com.company.EnumDirection;

import java.util.HashMap;

public class ComportementToutDroit extends AbstractComportement implements InterfaceComportement {

    private HashMap<String, int[]> directions = new HashMap<>();
    private EnumDirection direction;

    /**
     * Constructeur
     *
     * @param direction : EnumDirection
     */
    public ComportementToutDroit(EnumDirection direction) {
        super();
        this.direction = direction;
    }

    // ******************************
    // Méthodes publiques
    // ******************************

    /**
     * Retourne le prochain mouvement en fonction de l'EnumDirection
     *
     * @return deplacement : Instance de la classe Deplacement
     */
    @Override
    public Deplacement getProchainMouvement() {
        int[] mouvement = new int[]{};
        switch (this.direction) {
            case HAUT:
                mouvement[0] = 0;
                mouvement[1] = 1;
                break;
            case BAS:
                mouvement[0] = 0;
                mouvement[1] = -1;
                break;
            case GAUCHE:
                mouvement[0] = -1;
                mouvement[1] = -1;
                break;
            case DROITE:
                mouvement[0] = 1;
                mouvement[1] = 0;
                break;
        }
        this.deplacement.setX(mouvement[0]);
        this.deplacement.setY(mouvement[1]);
        return this.deplacement;
    }


}
