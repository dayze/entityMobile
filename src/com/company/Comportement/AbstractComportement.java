package com.company.Comportement;

import com.company.Deplacement;

public class AbstractComportement {

    protected Deplacement deplacement;

    /**
     * Constructeur
     */
    public AbstractComportement(){
        this.deplacement = new Deplacement();
    }
}
