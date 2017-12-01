package com.company.Comportement;

import com.company.Deplacement;

import java.util.ArrayList;
import java.util.Collections;

public class ComportementCyclique extends AbstractComportement implements InterfaceComportement {

    private ArrayList<int[]> lstMouvements;
    private int curseur; /* permet de récupérer le nième mouvement */

    /**
     * Constructeur
     *
     * @param lstMouvements : liste de mouvements ( [x,y] )
     */
    public ComportementCyclique(ArrayList<int[]> lstMouvements) {
        super();
        this.curseur = 0;
        this.lstMouvements = lstMouvements;
    }

    /**
     * Constructeur en profondeur
     *
     * @param comportementCyclique : instance de la classe ComportementCyclique
     */
    public ComportementCyclique(ComportementCyclique comportementCyclique) {
        this(comportementCyclique.getLstMouvements());
    }

    // ******************************
    // Méthodes publiques
    // ******************************

    /**
     * Retourne le prochain mouvement et prépare le curseur
     *
     * @return deplacement : Instance de la classe Deplacement
     */
    @Override
    public Deplacement getProchainMouvement() {
        this.reinitialisationDuCurseur();
        this.setDeplacement();
        this.curseur++;
        return this.deplacement;
    }

    /**
     * Retourne un comportement avec une liste de mouvements inversés
     *
     * @return deplacement : Instance de la classe Deplacement
     */
    public ComportementCyclique getComportementInverse() {
        ArrayList<int[]> lstMouvementsInverses = this.getLstMouvements();
        /* inversement des valeurs */
        for (int[] mouvement : lstMouvementsInverses) {
            int tmp = mouvement[0];
            mouvement[0] = mouvement[1] * -1;
            mouvement[1] = tmp * -1;
        }
        /* inversement des mouvements dans la liste */
        Collections.reverse(lstMouvementsInverses);
        return new ComportementCyclique(lstMouvementsInverses);
    }

    // ******************************
    // Méthodes privées
    // ******************************

    /**
     * Setter privé qui permet d'affecter deplacement à partir de lstMouvements et de curseur.
     */
    private void setDeplacement() {
        this.deplacement.setX(this.lstMouvements.get(this.curseur)[0]);
        this.deplacement.setY( this.lstMouvements.get(this.curseur)[1]);
    }

    /**
     * Remize à zero du curseur
     */
    private void reinitialisationDuCurseur() {
        if (this.curseur >= this.lstMouvements.size()) {
            this.curseur = 0;
        }
    }

    // ******************************
    // Getters et Setters
    // ******************************

    public ArrayList<int[]> getLstMouvements() {
        return lstMouvements;
    }

    public void setLstMouvements(ArrayList<int[]> lstMouvements) {
        this.lstMouvements = lstMouvements;
    }
}
