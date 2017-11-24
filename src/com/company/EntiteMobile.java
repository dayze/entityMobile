package com.company;

import com.company.Comportement.InterfaceComportement;

public class EntiteMobile {
    private InterfaceComportement comportement;
    private int x;
    private int y;

    public EntiteMobile(InterfaceComportement comportement) {
        this.comportement = comportement;
        /*this.x = (int) (Math.random() * 100);
        this.y = (int) (Math.random() * 100);*/
        this.x = 0;
        this.y = 1;
        System.out.println("Le point a été créé a x: " + this.x + " y:" + this.y);
    }

    public InterfaceComportement getComportement() {
        return comportement;
    }

    public void setComportement(InterfaceComportement comportement) {
        this.comportement = comportement;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
