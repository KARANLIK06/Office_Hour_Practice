package inheritancePractice.okul;

public class Sinif extends Okul{
    public Sinif(int age) {
        super();
        System.out.println("Child class constructor with parameter");
    }

    public Sinif() {
        this(11);
        System.out.println("Child class constructor without parameter");
    }

    public static void main(String[] args) {
        Sinif sinif = new Sinif();
    }
}
