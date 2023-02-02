package inheritancePractice.araba;

public class CDizelCorolla extends BCorolla {
    CDizelCorolla() {
        System.out.println("Dizel corolla constructor");
    }

    public static void main(String[] args) {
        BCorolla bCorolla = new BCorolla();

        System.out.println("-------------------------");

        CDizelCorolla cDizelCorolla = new CDizelCorolla();
        System.out.println(cDizelCorolla.brand);
        System.out.println(cDizelCorolla.productionPlace);
        System.out.println(cDizelCorolla.model);

    }
}
