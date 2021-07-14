package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test2 {
    @Test
    public void shouldReturn1000IfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnExpectedfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnZeroIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }
}
