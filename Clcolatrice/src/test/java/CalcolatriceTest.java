import org.example.Calcolatrice;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcolatriceTest {
    Calcolatrice miaCalcolatrice = new Calcolatrice();
    double delta = 0.0001;

    @Test
    public void testSomma() {
        assertEquals(5.0, miaCalcolatrice.somma(2, 3), delta);
    }

    @Test
    public void testSottrazione() {
        assertEquals(2.0, miaCalcolatrice.sottrazione(4, 2), delta);
    }

    @Test
    public void testDivisione() {
        assertEquals(2.0, miaCalcolatrice.divisione(8, 4), delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisione0() {
        assertEquals(miaCalcolatrice.divisione(8, 0), delta);
    }

    @Test
    public void testPotenza() {
        assertEquals(8.0, miaCalcolatrice.potenza(2, 3), delta);
    }

    @Test
    public void testMedia() {
        assertEquals(5.0, miaCalcolatrice.media(new double[] { 2, 4, 6, 8 }), delta);
    }
}
