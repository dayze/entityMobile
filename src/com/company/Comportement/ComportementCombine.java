package com.company.Comportement;

import com.company.Deplacement;

public class ComportementCombine extends AbstractComportement {

    private InterfaceComportement comportement1;
    private InterfaceComportement comportement2;

    /**
     * Constructeur
     *
     * @param comportement1 : instance de InterfaceCollision
     * @param comportement2 : instance de InterfaceCollision
     */
    public ComportementCombine(InterfaceComportement comportement1, InterfaceComportement comportement2) {
        super();
        this.comportement1 = comportement1;
        this.comportement2 = comportement2;
    }

    // ******************************
    // Méthodes publiques
    // ******************************

    /**
     * Retourne le prochain mouvement en ajoutant les coordonnées de deux déplacements
     *
     * @return deplacement : Instance de la classe Deplacement
     */
    @Override
    public Deplacement getProchainMouvement() {
        Deplacement deplacement1 = this.comportement1.getProchainMouvement();
        Deplacement deplacement2 = this.comportement2.getProchainMouvement();
        int x = deplacement1.getX() + deplacement2.getX();
        int y = deplacement1.getY() + deplacement2.getY();
        this.deplacement.setX(x);
        this.deplacement.setY(y);
        return this.deplacement;
    }
}
