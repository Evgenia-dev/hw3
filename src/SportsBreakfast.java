public class SportsBreakfast {
    public static void main(String[] args) {
        int bananasCount = 5;
        int bananaWeight = 80;
        int milkVolume = 200;
        int milkWeightPer100ml = 105;
        int milkWeight = (milkVolume / 100) * milkWeightPer100ml;

        int iceCreamCount = 2;
        int iceCreamWeightPerBrick = 100;
        int iceCreamWeight = iceCreamCount * iceCreamWeightPerBrick;
        int eggsCount = 4;
        int eggWeight = 70;
        int eggsWeight = eggsCount * eggWeight;
        int totalWeightInGrams = (bananasCount * bananaWeight) + milkWeight + iceCreamWeight + eggsWeight;
        double totalWeightInKilograms = totalWeightInGrams / 1000.0;
        System.out.printf("Общий вес спортзавтрака: %d граммов\n", totalWeightInGrams);
        System.out.printf("Общий вес спортзавтрака: %.2f килограммов\n", totalWeightInKilograms);
    }
}
class WeightLossCalculator {
    public static void main(String[] args) {
        int weightToLose = 7000;
        int lossPerDayLow = 250;
        int lossPerDayHigh = 500;
        int daysLow = weightToLose / lossPerDayLow;
        int daysHigh = weightToLose / lossPerDayHigh;
        double averageDays = (daysLow + daysHigh) / 2.0;
        System.out.printf("Количество дней для похудения при потере 250 грамм в день: %d дней\n", daysLow);
        System.out.printf("Количество дней для похудения при потере 500 грамм в день: %d дней\n", daysHigh);
        System.out.printf("Среднее количество дней для достижения результата: %.2f дней\n", averageDays);
    }
}
