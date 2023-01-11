package week6;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};
        int total1 = 0;
        for (String name : names) {
            total1 += Integer.valueOf(name.substring(name.length() - 4));

        }
        System.out.println("total1 = " + total1);

        System.out.println("---------------------------------------");


        int total2 = 0;
        for (String each : names) {
            total2 += Integer.parseInt(each.substring(each.length() - 4));
        }
        System.out.println("total2 = " + total2);
    }
}