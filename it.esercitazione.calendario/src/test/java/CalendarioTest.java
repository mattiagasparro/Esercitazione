import org.example.Calendario;
import org.example.Evento;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class CalendarioTest {

    @Test
    public void testAddEvento() {
        Calendario calendario = new Calendario();
        Evento evento = new Evento("Evento 1", "Descrizione 1", 1, 1, 2020);

        calendario.addEvento(evento);
        ArrayList<Evento> eventi = calendario.getEventi();

        assertEquals(1, eventi.size());
        assertEquals("Evento 1", eventi.get(0).getNome());
        assertEquals("Descrizione 1", eventi.get(0).getDescrizione());
    }

    @Test
    public void testRemoveEvento() {
        Calendario calendario = new Calendario();
        Evento evento1 = new Evento("Evento 1", "Descrizione 1", 1, 1, 2020);
        Evento evento2 = new Evento("Evento 2", "Descrizione 2", 2, 2, 2020);
        calendario.addEvento(evento1);
        calendario.addEvento(evento2);

        calendario.removeEvento("Evento 1");
        ArrayList<Evento> eventi = calendario.getEventi();
        assertEquals(1, eventi.size());
        assertEquals("Evento 2", eventi.get(0).getNome());
        assertEquals("Descrizione 2", eventi.get(0).getDescrizione());
    }
}
