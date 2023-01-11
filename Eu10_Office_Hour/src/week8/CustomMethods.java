package week8;

public class CustomMethods {
    public static void main(String[] args) {
        manualTesting("Ahmet");
        manualTesting("Mehmet", "Google");

    }

    public static void manualTesting(String name) {
        System.out.println(name + ", please test this manual test");
    }

    public static void manualTesting(String name, String projectName) {
        System.out.println(name + ", please test this " + projectName + " manual test");
    }

    public static void manualTesting(String name, String projectName, int time ) {
        System.out.println(name + ", please test this " + projectName + " manual test in " + time + " hour" );
    }


    public static void webAppTesting() {
        System.out.println("This is for web app testing");

    }

    public static void apiTesting() {
        System.out.println("This is for api  testing");

    }

    public static void dataBaseTesting() {
        System.out.println("This is for data base testing");

    }


}