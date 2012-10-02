/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GroupProject.Persistance;

/**
 *
 * @author chrishardin
 */
public class PeriodicElement {
    private int AtomicNumber;

    public PeriodicElement(int AtomicNumber) {
        this.AtomicNumber = AtomicNumber;
    }

    public double GetAtomicWeight(){
        return 1.01;
    }

    public int GetAtomicNumber(){

        return AtomicNumber;
    }

    public String GetElementName(){

        return "Hydrogen";
    }

    public String GetElementImage(){

        return "/whereItsAt";
    }

    public boolean isMetallic(){

        return false;
    }

}
