import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    public void testEstimarTiempoMoto() {
        Moto moto = new Moto("Honda CBR", "Rojo", 120.0);
        assertEquals(1.4125, moto.estimarTiempoMoto(), 0.0001);
    }
}