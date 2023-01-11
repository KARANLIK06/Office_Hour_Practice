package week6;

import java.util.Arrays;

public class ArraysReverseNumber {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i]=i;
        }
        for (int i = numbers.length-1; i >= 0; i--) {
            numbers[numbers.length-1-i]=i;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
