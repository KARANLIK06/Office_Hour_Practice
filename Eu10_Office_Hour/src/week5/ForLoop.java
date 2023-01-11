package week5;

public class ForLoop {
    public static void main(String[] args) {
     sumNumber();
        System.out.println("---------------------");
     stars();


    }

    public static void sumNumber() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }


    public static void stars(){
        for (int i = 1; i < 6; i++) {
            System.out.println("*".repeat(i));
        }
    }


}
