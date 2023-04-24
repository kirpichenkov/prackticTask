package ru.kirpichenkov.searchForPrimeNumbers;


//Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

public class searchForPrimeNumbers {
    public static void main(String[] args) {

//запускаем цикл в котором будут генерироваться наши простые числа
        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
//поскольку в условии сказано использовать циклЫ - то если нужно прям 2 цикла чтоб было
            //данный цикл для этого
//        boolean isPrime=true;
//
//        for(int j =2; j<i; j++){
//            if(i%j==0){
//                System.out.println(i);
//                break;
//            }
//            break;
//        }

        }
    }
}
