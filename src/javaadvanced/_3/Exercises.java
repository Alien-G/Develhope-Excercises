package javaadvanced._3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here

        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        toSet(list); // <-- uncomment
        toSet(set); // <-- uncomment
    }

    // Write your method for exercise 2 here

    private static Set<String> toSet(Collection<String> collection) {
        Set<String> newSet= new HashSet<>();
        newSet.addAll(collection);
        return newSet;
    }

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: List, because it maintains the order in which elements were added to it.
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: Map, as it allows for key-value pairs, so you could store each student's name
     *    as a key and their grades as a value.
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: List
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: Map, just like with the students and their grades a map could allow to store each
     *    product as a key and its price as the value.
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: List, as it maintains the order in which elements were added.
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: Map, State as the key and population as the value.
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: Map, for the reasons mentioned beforehand.
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: Map, you can store the courses as the key and the professor's name as the value.
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: Map
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: Map
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: Map
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: Map
     */

}