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
public class Gare extends Achetable {

    public Gare() {
        super();
    }

    public Gare(int prix, int numCase, String nomCase) {
        super(prix, null, numCase, nomCase);
    }

    public Gare(int prix, Joueur proprietaire, int numCase, String nomCase) {
        super(prix, proprietaire, numCase, nomCase);
    }

   
    @Override
    public int loyer() {
        if (this.getProprietaire() == null) {
            return 0;
        } else {
            // A modifier
            //  2500 * PlateauDeJeu.nbGares(this.getProprietaire());
            return 2500;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
