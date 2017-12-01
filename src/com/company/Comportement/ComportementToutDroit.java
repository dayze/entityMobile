package com.company.Comportement;

import com.company.Deplacement;

import java.util.HashMap;

public class ComportementToutDroit extends AbstractComportement implements InterfaceComportement {

    private HashMap<String, int[]> directions = new HashMap<>();
    private String direction;

    /**
     * Constructeur
     *
     * @param direction :
     */
    public ComportementToutDroit(String direction) {
        super();
        this.directions.put("HAUT", new int[]{0, 1});
        this.directions.put("BAS", new int[]{0, -1});
        this.directions.put("GAUCHE", new int[]{-1, 0});
        this.directions.put("DROITE", new int[]{1, 0});
        this.direction = direction;
    }

    // ******************************
    // Méthodes publiques
    // ******************************

    /**
     * Retourne le prochain mouvement en
     *
     * @return deplacement : Instance de la classe Deplacement
     */
    @Override
    public Deplacement getProchainMouvement() {
        int[] xy = this.directions.get(this.direction);
        this.deplacement.setX(xy[0]);
        this.deplacement.setY(xy[1]);
        return this.deplacement;
    }


}
