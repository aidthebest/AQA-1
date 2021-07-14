package service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn1000IfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnExpectedfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }
}