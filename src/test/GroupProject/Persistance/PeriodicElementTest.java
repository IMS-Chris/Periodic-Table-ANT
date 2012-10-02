package GroupProject.Persistance;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class PeriodicElementTest {
    
    @Test
    public void testConstruction() {
        PeriodicElement TestElement = new PeriodicElement(1);

        assertEquals("Atomic Nubmer:", 1, TestElement.GetAtomicNumber());

    }

    @Test
    public void testGetElementName() {
        PeriodicElement TestElement = new PeriodicElement(1);
        String ElementName = "Hydrogen";

        assertEquals("Element Name:", ElementName, TestElement.GetElementName());
    }

    @Test
    public void testGetElementImage() {
        PeriodicElement TestElement = new PeriodicElement(1);
        String ImageLocation = "/whereItsAt";

        assertEquals("Element Image:", ImageLocation, TestElement.GetElementImage());

    }

    @Test
    public void testGetElementAtomicWeight() {
        PeriodicElement TestElement = new PeriodicElement(1);
        double ElementWeight = 1.01;

        assertEquals("Atomic Weight:", ElementWeight, TestElement.GetAtomicWeight());
    }

    @Test
    public void testIsMetallic() {
        PeriodicElement TestElement = new PeriodicElement(1);
        boolean isMetallic = false;

        assertEquals("Atomic Weight:", isMetallic, TestElement.isMetallic());
    }

}