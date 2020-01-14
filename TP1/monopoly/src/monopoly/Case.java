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
public abstract class Case {
    private int numCase;
    String nomCase;

    public Case(){
    numCase = 0;
    nomCase = "CaseNull";
    }
   
    public Case(int numCase, String nomCase) {
        this.numCase = numCase;
        this.nomCase = nomCase;
    }
    
    // recopie de Case si c'est un Objet, il faut insntanier 
    public Case(Case c){
     this.nomCase = c.nomCase;
     this.numCase = c.numCase;
    }    

    public int getNumCase() {
        return numCase;
    }

    public void setNumCase(int numCase) {
        this.numCase = numCase;
    }

    public String getNomCase() {
        return nomCase;
    }

    public void setNomCase(String nomCase) {
        this.nomCase = nomCase;
    }
    
    @Override
    public String toString(){
        return this.nomCase;
    }
}
