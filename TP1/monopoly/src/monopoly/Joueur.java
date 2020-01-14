/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author muruowang
 */
public class Joueur {
    public String nom;
    private int fortune;
    private Case position;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getFortune() {
        return fortune;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public Case getPosition() {
        return position;
    }

    public void setPosition(Case position) {
        this.position = position;
    }

    /**
     * j1.paiement(j2) le joueur j2 tombe sur une case dont j1 est le
     * propriétaire l'argent va donc de j2 vers j1
     */
    public void paiement(Joueur j) {
        if( getPosition() instanceof Achetable){
        // pour gérer le cas où le joueur n'a pas assez d'argent pour payer le loyer
        int somme = Math.min(((Achetable) (this.getPosition())).loyer(), j.getFortune()); 
        this.setFortune(this.getFortune() + somme);
        j.setFortune(j.getFortune() - somme);
        }
    }
}
