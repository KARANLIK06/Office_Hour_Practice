package week10.constructors;

public class ApplicationObject {
    public static void main(String[] args) {

        Application app1 = new Application("Instagram");
        System.out.println(app1);

        Application app2 = new Application("Youtube","10.3");
        System.out.println(app2);

        Application app3 = new Application("Appium","2.9","Tom");
        System.out.println(app3);
    }
}
