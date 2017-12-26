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
    static Scanner scanner;
    static Map<String, Integer> statistics;

    final static String PATH = "D:\\Документы Бодрова\\Java курс\\ДЗ 4\\homework_4\\task4\\src\\main\\resources\\input.txt";

    public static void main(String[] args) throws FileNotFoundException {
        // reading from file
        readFromFile(PATH);

        // statistics to the console
        System.out.println(statistics);

        //alphabetical ordering
        alphabeticalOrdering();

        //output of the most common word
        mostOften();

    }

    /**
     * reading from file
     * @param path to file
     * @throws FileNotFoundException
     */
    static void readFromFile(String path) throws FileNotFoundException {
        scanner = new Scanner(new File(path));
        statistics = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
    }

    /**
     * alphabetical ordering using TreeSet
     */
   static void alphabeticalOrdering () {
        Set<String> words = new TreeSet<String>();
        Iterator<Map.Entry<String,Integer>>entryIterator1 = statistics.entrySet().iterator();
        while (entryIterator1.hasNext()){
            words.add(entryIterator1.next().getKey());
        }
        System.out.println(words);
    }


    /**
     * the most common word
     */
    static void mostOften () {
        int max = 0;
        String maxKey = null;
        for (String e: statistics.keySet()){
            if (statistics.get(e) > max) {
                max = statistics.get(e);
                maxKey = e;
            }
        }
        System.out.println("maxKey: " + maxKey + ", maxValue: " + max);
    }
}
