package ru.kirpichenkov.sortMapValues;

/*
1. Отсортировать словарь(Map) по значениям
2. вернуть новый отсортированный словарь

финальный вывод должен быть такой

one=1;
two=2
three=3;
four=4;
five=5;
 */

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class sortMapValues {
    public static void main(String[] args) {
        //map.of - метод для быстрого создания https://javarush.com/groups/posts/4076-kofe-breyk-211-sravnenie-mapof-i-new-hashmap-v-java-chto-takoe-obrabotka-iskljucheniy-v-java-i-
        Map<String, Integer> nonSortedMap = Map.of(
                "two",2,
                "three",3,
                "five",5,
                "one",1,
                "our",4
        );
        //солздаем сортированную мапу
        Map<String, Integer> sortedMap = sortByValue(nonSortedMap);
        //выводим мапу на экран
        sortedMap.entrySet().forEach(System.out::println);

        //Есть и второй способ
        nonSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
    //метод сортировки мапы
    static Map<String,Integer> sortByValue(Map<String, Integer> map){
        //мы должны заиспользовать TreeMap - ведь мы знаем что тримэп в конструторе использует компоратор
        //три мап сортирует по ключу, как бы сделать так, чтобы он сортировал по значению?
        //для этого и нужен компаратор
      //  MyMapComparator myMapComparator = new MyMapComparator(map);
        //И вот если честно - не понимаю почему вот здесь нужно передавать в скобках (new MyMapComparator(map1)) почему тоже самое не отрабатывает при создании самой объекта My
        TreeMap<String,Integer> temp = new TreeMap<>(new MyMapComparator(map));

        temp.putAll(map);
        return temp;
    }

    static class MyMapComparator implements Comparator<String>{
    private final Map<String, Integer> map;

        public MyMapComparator(Map<String, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(String o1, String o2) {
            return map.get(o1)-map.get(o2);
        }
    }
}


