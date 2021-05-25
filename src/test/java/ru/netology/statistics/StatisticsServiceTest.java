package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void shouldCalculateSumSales() {
        StatisticsService service = new StatisticsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatisticsService service = new StatisticsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFoundMinSalesMonth() {
        StatisticsService service = new StatisticsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFoundMaxSalesMonth() {
        StatisticsService service = new StatisticsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsUnderAverage() {
        StatisticsService service = new StatisticsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthsUnderAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsOverAverage() {
        StatisticsService service = new StatisticsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthsOverAverage(sales);

        assertEquals(expected, actual);
    }
}