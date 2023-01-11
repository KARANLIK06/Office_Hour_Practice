package week6;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int even=0;
        int odd=0;
        for (int i = 0; i <=9; i++) {
            numbers[i]=i;
            }
        for (int i = 0; i < 10; i++) {

        if (i%2==0){
            even+=i;
        }else {
            odd+=i;
        }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }

    }

