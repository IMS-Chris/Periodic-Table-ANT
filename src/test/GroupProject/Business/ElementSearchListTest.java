package GroupProject.Business;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ElementSearchListTest {
    
    @Test
    public void testGetElement() {
        ElementSearchList TestElementSearch = new ElementSearchList("Hydrogen");

        assertEquals("GetElement Test:", "Hydrogen", TestElementSearch.GetElement().GetElementName());

    }

    @Test
    public void testGetTotalElements() {
        ElementSearchList TestElementSearch = new ElementSearchList("Hydrogen");

        assertEquals("TotalElements Test:", 1, TestElementSearch.GetTotalElements());

    }



}
