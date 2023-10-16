import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    @Test
    public void testEstimarTiempoAuto() {
        Auto auto = new Auto("Kia Morning", "Blanco", 5, 58.0);
        assertEquals(2.9224137931034484, auto.estimarTiempoAuto(), 0.0001);
    }
}