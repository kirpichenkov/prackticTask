package ru.kirpichenkov.maxMinAvg;

public class maxMinAvg {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            avg += array[i];
            avg += array[i] / array.length;
        }

        System.out.println("Максимальное значение массива = " + max);
        System.out.println("Минимальное значение массива = " + min);
        System.out.println("Среднее значение масиива = " + (avg / array.length));

    }

}
