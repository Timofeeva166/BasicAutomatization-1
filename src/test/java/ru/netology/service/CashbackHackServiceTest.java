package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(900), 100);
        Assert.assertEquals(service.remain(0), 1000);
        Assert.assertEquals(service.remain(999), 1);
        Assert.assertEquals(service.remain(1000), 0);
    }
}