package inheritancePractice.okul;

public class Sinif2 extends Okul2 {
    String class2= "11-F";
    String phoneNumber="333442523";

    Sinif2(String phoneNumber) {
        System.out.println(phoneNumber);
        System.out.println(this.phoneNumber);
        System.out.println(super.phoneNumber);
        System.out.println(this.phoneNumber);
        System.out.println(phoneNumber);

    }

    public static void main(String[] args) {
        Sinif2 sinif2= new Sinif2("5552152477");

    }
}
