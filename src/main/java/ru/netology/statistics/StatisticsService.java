package ru.netology.statistics;

public class StatisticsService {

    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long averageSales = sumSales (sales) / sales.length;
        return averageSales;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int monthsUnderAverage(long[] sales) {
        int monthsUnderAverage = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                monthsUnderAverage += 1;
            }
        }
        return monthsUnderAverage;
    }

    public int monthsOverAverage(long[] sales) {
        int monthsOverAverage = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                monthsOverAverage += 1;
            }
        }
        return monthsOverAverage;
    }
}
