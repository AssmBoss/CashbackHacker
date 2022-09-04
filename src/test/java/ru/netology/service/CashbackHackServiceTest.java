package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldGive100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 5900;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGive200() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int amount = 800;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGive0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}