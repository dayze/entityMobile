package com.company.Comportement;

import com.company.Deplacement;

import java.util.HashMap;

public class ComportementToutDroit implements InterfaceComportement {
    private HashMap<String, int[]> directions = new HashMap<>();
    private String direction;

    public ComportementToutDroit(String direction) {
        this.directions.put("HAUT", new int[]{0, 1});
        this.directions.put("BAS", new int[]{0, -1});
        this.directions.put("GAUCHE", new int[]{-1, 0});
        this.directions.put("DROITE", new int[]{1, 0});
        this.direction = direction;
    }

    @Override
    public Deplacement getProchainMouvement() {
        int[] xy = this.directions.get(this.direction);
        Deplacement deplacement = new Deplacement(xy[0], xy[1]);
        return deplacement;
    }


}
