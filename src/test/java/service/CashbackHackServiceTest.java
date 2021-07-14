package service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn1000IfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnExpectedfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnZeroIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }
}