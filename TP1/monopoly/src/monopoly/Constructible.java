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
public class Constructible extends Achetable {

    private int nbMaison;
    private int loyerMaison;
    private int loyerHotel;

    public Constructible() {
    }

    public Constructible(int numCase, String nomCase, int prix, Joueur proprietaire, int prixMaison, int prixHotel) {
        super(prix, proprietaire, numCase, nomCase);
        this.nbMaison = 0;
        this.loyerMaison = loyerMaison;
        this.loyerHotel = loyerHotel;
    }

    public Constructible(int nbMaison, int loyerMaison, int loyerHotel, int prix, Joueur proprietaire, int numCase, String nomCase) {
        super(prix, proprietaire, numCase, nomCase);
        this.nbMaison = nbMaison;
        this.loyerMaison = loyerMaison;
        this.loyerHotel = loyerHotel;
    }

    public int getNbMaison() {
        return nbMaison;
    }

    public void setNbMaison(int nbMaison) {
        this.nbMaison = nbMaison;
    }

    public int getLoyerMaison() {
        return loyerMaison;
    }

    public void setLoyerMaison(int loyerMaison) {
        this.loyerMaison = loyerMaison;
    }

    public int getLoyerHotel() {
        return loyerHotel;
    }

    public void setLoyerHotel(int loyerHotel) {
        this.loyerHotel = loyerHotel;
    }

    public int loyer(Joueur J) {
        int temp = (int) Math.floor(this.getPrix() * 0.05);
        // vérifier que le joueur n'a pas de proprietaire null
        if ((this.getProprietaire() == J) || (this.getProprietaire() == null)) {
            return 0;
        } // si le joueur a 5 maisons, c'est considé comme un hotêl
        else if (this.getNbMaison() == 5) {
            return temp + this.getLoyerHotel();
        } // calculer le prix total de maison 
        else {
            return temp + this.getLoyerMaison() * this.getNbMaison();
        }
    }

    @Override
    public void reset() {
        super.reset();
        this.setNbMaison(0);
    }

    @Override
    public String toString() {
        super.toString();
        return null;
    }

    public int loyer() {
        int temp = (int) (this.getPrix() * 0.05);
        if (this.getNbMaison() == 5) {
            return temp + this.getLoyerHotel();
        } else {
            return temp + this.getLoyerMaison() * this.getNbMaison();
        }
    }

    public void construire() {
        // Le prix d'une maison correspond à 10% du prix du terrain
        int somme = (int) (this.getPrix() * 0.1);
        this.getProprietaire().setFortune(this.getProprietaire().getFortune() - somme);
        this.setNbMaison(this.getNbMaison() + 1);
    }
}
