package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args) {
        one();
        System.out.println("====================================");
        two();
        System.out.println("====================================");
        three();
        System.out.println("====================================");
        four();
        System.out.println("====================================");
        five();
        System.out.println("====================================");
        six();

    }


    /*
    Write a Java program that creates an ArrayList of strings and then adds five strings to the list.
        Then remove the first and last elements of the list, and then print the remaining elements to the console.
     */
    public static void one() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("grape");
        fruits.add("ananas");
        System.out.println("fruits = " + fruits);

        fruits.remove(0);
        fruits.remove(fruits.size() - 1);

        System.out.println("fruits = " + fruits);
    }


    /*
     2.Write a Java program that creates an ArrayList of 10 integers, and then removes the elements at index positions 2, 4, and 6 from
        the list. The program should then print the resulting list to the console.
     */

    public static void two() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }
        numbers.remove(2);
        numbers.remove(4);
        numbers.remove(6);
        System.out.println("numbers = " + numbers);


    }

    /*
      3.Write a java program that create an arraylist has random numbers, then check those number, if they are even,
         add again to the arraylist
     */

    public static void three() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        System.out.println("randomNumbers = " + randomNumbers);
    }


    /*
    4.Write a Java program that creates an ArrayList of 10 random integers between 1 and 100,
        and then sorts the list in ascending order.
     */

    public static void four() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        System.out.println("randomNumbers = " + randomNumbers);
        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);
    }

    /*
     5. Write a Java program that creates an ArrayList of strings and adds five strings to the list. The program
        should then reverse the order of the elements in the list and print the resulting list to the console.
     */


    public static void five() {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("ruby");
        list.add("javascript");

        System.out.println(list);
        Collections.reverse(list);
        System.out.println("reverse list = " + list);

    }




    /*
      6. Write a Java program that creates an ArrayList of integers and adds 10 random integers to the list.
        The program should then find the smallest and largest elements in the list and print them to the console.

     */
    public static void six() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        System.out.println("randomNumbers = " + randomNumbers);
        int max = Collections.max(randomNumbers);
        int min = Collections.min(randomNumbers);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
