import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BiciTest {

    @Test
    public void testEstimarTiempoBici() {
        Bici bici = new Bici("Trek Mountain Bike", "Verde", 20.0);
        assertEquals(8.475, bici.estimarTiempoBici(), 0.0001);
    }
}