package com.company.Comportement;

import com.company.Deplacement;

abstract class AbstractComportement implements InterfaceComportement {

    protected Deplacement deplacement;

    /**
     * Constructeur
     */
    public AbstractComportement() {
        this.deplacement = new Deplacement();
    }

}
