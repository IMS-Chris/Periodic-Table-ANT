/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GroupProject.Business;

import GroupProject.Persistance.PeriodicElement;
import java.util.ArrayList;
/**
 *
 * @author chrishardin
 */
public class ElementSearchList {
    private ArrayList<PeriodicElement> ElementList = new ArrayList<PeriodicElement>();

     public ElementSearchList(String SearchText){
         PeriodicElement MyElement = new PeriodicElement(1);
        ElementList.add(MyElement);
    }
     
     public PeriodicElement GetElement(){
         PeriodicElement MyElement = new PeriodicElement(1);
         return MyElement;
     }

     public int GetTotalElements(){
         return ElementList.size();
     }


}
