package dcx.ufpb.br.poo.conta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaTest {


    @Test
    public void testaConstrutor(){
        Conta c1 = new Conta(100);
        assertEquals(100, c1.getSaldo());
        c1.creditar(20);
        assertEquals(120, c1.getSaldo());
        c1.debitar(100);
        assertEquals(20, c1.getSaldo());

        assertThrows(IllegalArgumentException.class, () ->c1.creditar(-10));
        assertThrows(IllegalArgumentException.class, () -> c1.debitar(-10));
    }
}
