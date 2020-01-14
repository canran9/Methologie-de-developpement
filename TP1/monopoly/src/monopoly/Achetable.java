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
public abstract class Achetable extends Case {

    private int prix;
    private Joueur proprietaire;

    public Achetable() {
    }

    public Achetable(int prix, Joueur proprietaire, int numCase, String nomCase) {
        super(numCase, nomCase);
        this.prix = prix;
        this.proprietaire = proprietaire;
    }

    public Achetable(Achetable achetable) {
        super(achetable);
        this.nomCase = achetable.getNomCase();
        this.proprietaire = achetable.getProprietaire();
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void acheter(Joueur J) {
        if (this.getProprietaire() == null) {
            J.setFortune(J.getFortune() - this.getPrix());
            this.setProprietaire(J);
        }
    }

    public abstract int loyer();

    @Override
    public String toString() {
        String s = super.toString();
        if (this.getProprietaire() == null) {
            return s + "(coût : " + this.getPrix() + "€) - sans propriétaire";
        } else {
            return s + "(coût : " + this.getPrix() + "€) - propriétaire : " + this.getProprietaire().getNom() + ", ";
        }

    }

    public void reset() {
        this.setProprietaire(null);
    }
}
