package ru.kirpichenkov.bubleSort;
//Реализуйте алгоритм сортировки пузырьком для сортировки массива
public class bubleSort {
    public static void main(String[] args) {
        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=Math.random()*100;
        }
        //запускаем цикл прохода по массиву
        for (int i = 0; i < array.length; i++) {
             //внутрениий цикл перемещает значения массива с одного место на другое при условии если array[j] > array[j + 1]
            for (int j = 0; j < array.length - i - 1; j++) {
                //если значение массива больше array[j] чем следующее после него
                if (array[j] > array[j + 1]) {
                    //то сохраняем это значение в переменную temp
                    double temp = array[j];
                    //текущее значение массива на котором мы находимся длеаем равным предыдущему
                    array[j] = array[j + 1];
                    //а на место array[j] мы ставим то значени что в условии оказалось больше
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
