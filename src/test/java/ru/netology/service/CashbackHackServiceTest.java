package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldGive100Junit4() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 5900;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }


    @Test
    public void shouldGive100Junit5() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 5900;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}