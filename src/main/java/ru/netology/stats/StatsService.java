package ru.netology.stats;

public class StatsService {

    public int calcAllSales(int[] amount) {
        int amountSales = 0; // общая сумма продаж

        for (int i = 0; i < amount.length; i++) {
            amountSales += amount[i];
        }
        return amountSales;
    }

    public int calcAverageSalesAmount(int[] amount) {
        int firstAmount = 0; // первоначальное значение для отчета суммы
        int averAmount = 0;

        for (int i = 0; i < amount.length; i++) {
            averAmount = (firstAmount += amount[i]) / amount.length + 1;
        }
        return averAmount;
    }

    public int calcMaxSales(int[] sales) {
        int maxMonth = 0; // номер месяца по максимальным продажам

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int calcMinSales(int[] sales) {
        int minMonth = 0; // номер месяца по минимальным продажам

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calcSalesUnderAverage(int[] amount) {

        int months = 0; // кол-во месяцев
        int salesUnderAverage = calcAverageSalesAmount(amount);
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] < salesUnderAverage) {
                months++;
            }
        }
        return months;
    }

    public int calcSalesAboveAverage(int[] amount) {

        int months = 0; // кол-во месяцев
        int salesUnderAverage = calcAverageSalesAmount(amount);
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > salesUnderAverage) {
                months++;
            }
        }
        return months;
    }

}
