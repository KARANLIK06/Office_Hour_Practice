package week11.staticPractice;

public class StaticObjects {

    static StaticPractice sp = new StaticPractice();
    public static void main(String[] args) {

        System.out.println(sp.a);
        System.out.println(sp.b);

        System.out.println(StaticPractice.a);
    }
}
