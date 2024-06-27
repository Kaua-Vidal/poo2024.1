package dcx.ufpb.br.poo.conta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContaTest {
    @Test
    public void testaConstrutor(){
        Conta c1 = new Conta(100);
        assertEquals(100, c1.getSaldo());
    }

    @Test
    public void testaCreditar(){
        Conta c2 = new Conta(50);
        assertTrue(c2.getSaldo()==50);
        double saldoDepois = c2.creditar(10);
        assertEquals(60,saldoDepois);
        //c2.creditar(10);
        //assertTrue(c2.getSaldo()==60);
    }

    @Test
    public void testaCreditarComValorNegativo(){
        Conta c3 = new Conta(1000);
        assertEquals(1000,c3.getSaldo(), 0.01);
        assertThrows(IllegalArgumentException.class,()-> c3.creditar(-10));
    }

    @Test
    public void testaDebitar(){
        Conta c4 = new Conta(1000);
        assertEquals(1000, c4.getSaldo());
        double saldoDepois = (c4.debitar(10));
        assertEquals(990, saldoDepois);
    }
}
