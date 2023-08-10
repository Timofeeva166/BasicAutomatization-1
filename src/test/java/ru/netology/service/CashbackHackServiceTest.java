package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(100, service.remain(900));
        Assert.assertEquals(1000, service.remain(0));
        Assert.assertEquals(1, service.remain(999));
        Assert.assertEquals(0, service.remain(1000));
    }
}