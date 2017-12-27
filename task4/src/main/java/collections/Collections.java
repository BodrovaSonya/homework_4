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
    private Scanner scanner;
    private Map<String, Integer> statistics;

    public Collections(String path) throws FileNotFoundException {
        readFromFile(path);
    }

    public Map<String, Integer> getStatistics() {
        return statistics;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // reading from file
        Collections collections = new Collections("D:\\Документы Бодрова\\Java курс\\ДЗ 4\\homework_4\\task4\\src\\main\\resources\\input.txt");

        // statistics to the console
        System.out.println(collections.getStatistics());

        //alphabetical ordering
        collections.alphabeticalOrdering(collections.getStatistics());

        //output of the most common word
        collections.mostOften(collections.getStatistics());

    }

    /**
     * reading from file
     * @param path to file
     * @throws FileNotFoundException
     */
    void readFromFile(String path) throws FileNotFoundException {
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
   void alphabeticalOrdering (Map<String, Integer> statis) {
        Set<String> words = new TreeSet<String>();
        Iterator<Map.Entry<String,Integer>>entryIterator1 = statis.entrySet().iterator();
        while (entryIterator1.hasNext()){
            words.add(entryIterator1.next().getKey());
        }
        System.out.println(words);
    }


    /**
     * the most common word
     */
    void mostOften (Map<String, Integer> statis) {
        int max = 0;
        String maxKey = null;
        for (String e: statis.keySet()){
            if (statis.get(e) > max) {
                max = statis.get(e);
                maxKey = e;
            }
        }
        System.out.println("maxKey: " + maxKey + ", maxValue: " + max);
    }
}
