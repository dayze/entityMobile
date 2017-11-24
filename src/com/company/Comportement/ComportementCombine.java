package com.company.Comportement;

import com.company.Deplacement;

public class ComportementCombine implements InterfaceComportement {

    InterfaceComportement comportement1;
    InterfaceComportement comportement2;

    public ComportementCombine(InterfaceComportement comportement1, InterfaceComportement comportement2) {
        this.comportement1 = comportement1;
        this.comportement2 = comportement2;
    }

    @Override
    public Deplacement getProchainMouvement() {
        Deplacement deplacement1 = comportement1.getProchainMouvement();
        Deplacement deplacement2 = comportement1.getProchainMouvement();
        return new Deplacement(deplacement1.getX() + deplacement2.getX(), deplacement1.getY() + deplacement2.getY());
    }
}
