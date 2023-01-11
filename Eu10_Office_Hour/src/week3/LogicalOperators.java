package week3;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
        System.out.println(true&&false);
        System.out.println(false&&false);
        System.out.println(true||false);

        boolean d,e,f;
        d=e=f=true;
        System.out.println(!d||(d&&f));

        int x=20;
        int y= 10;
        double z=x++ - y*7/y-- +x*10;
        System.out.println("z = " + z);

        long a=3_000L;
        double b=(float) a;
        int c=(short)b;
        System.out.println(c%1000);

    }
}
