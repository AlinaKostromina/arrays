package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findAllSalesAmount() {

        StatsService service = new StatsService();

        int[] amount = { 200, 600, 400, 560, 700 };

         int expectedAmount = 2460;
         int actualAmount = service.calcAllSales(amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void calcAverageAmount() {

        StatsService service = new StatsService();

        int[] amount = { 200, 600, 400, 560, 700 };

        int expectedAmount = 493;
        int actualAmount = service.calcAverageSalesAmount(amount);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void calcMaxSales() {

        StatsService service = new StatsService();

        int[] sales = { 200, 600, 400, 560, 700 };

        int expectedAmount = 5;
        int actualAmount = service.calcMaxSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void calcMinSales() {

        StatsService service = new StatsService();

        int[] sales = { 200, 600, 400, 560, 700 };

        int expectedAmount = 1;
        int actualAmount = service.calcMinSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void calcSalesUnderAverage() {

        StatsService service = new StatsService();

        int[] sales = { 200, 600, 400, 560, 700 };

        // average 493;
        int expectedAmount = 2;
        int actualAmount = service.calcSalesUnderAverage(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void calcSalesAboveAverage() {

        StatsService service = new StatsService();

        int[] sales = { 200, 600, 400, 560, 700 };

        // average 493;
        int expectedAmount = 3;
        int actualAmount = service.calcSalesAboveAverage(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }





}
