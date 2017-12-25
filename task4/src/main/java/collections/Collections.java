package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Прочитать слова из файла.
 Отсортировать в алфавитном порядке.
 Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
 Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class Collections {
    public static void main(String[] args) throws FileNotFoundException {
        // чтение слов из файла
        Scanner scanner = new Scanner(new File("D:\\Документы Бодрова\\Java курс\\ДЗ 4\\homework_4\\task4\\src\\main\\resources\\input.txt"));
        Map<String, Integer> statistics = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
                    Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }

        // вывод статистики на консоль
        System.out.println(statistics);

        // дерево для вывода слов в алфавитном порядке
        Set<String> words = new TreeSet<String>();
        Iterator<Map.Entry<String,Integer>>entryIterator1 = statistics.entrySet().iterator();
        while (entryIterator1.hasNext()){
            words.add(entryIterator1.next().getKey());
        }
        System.out.println(words);

        // поиск самого часто встречающегося слова
        Iterator<Map.Entry<String,Integer>>entryIterator = statistics.entrySet().iterator();
        int maxValue = 0;
        String maxKeyValue = null;
        while (entryIterator.hasNext()){
            if ((entryIterator.next().getValue()) > maxValue ) {
                maxValue = entryIterator.next().getValue();
                maxKeyValue = entryIterator.next().getKey();
            }
        }
        if (maxValue > 0) {
            System.out.println("Maximum: " + maxKeyValue + " " + maxValue);
        }




    }


}
