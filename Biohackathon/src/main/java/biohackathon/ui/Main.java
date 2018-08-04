
package biohackathon.ui;

import biohackathon.domain.Box;
import biohackathon.domain.Reagent;



public class Main {


    
    public static void main(String[] args) throws ClassNotFoundException {
        Reagent Xho1 = new Reagent("Xho1", "31.12.2020", "Free to use");
        Box igemEnzymes = new Box("igemEnzymes");
        
        igemEnzymes.add(Xho1);
        
        System.out.println(igemEnzymes);
    }
    
}
