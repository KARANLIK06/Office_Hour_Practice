package week8;

public class CustomMethodPractice {
    public static void main(String[] args) {
        space("this is java office hour");

        System.out.println(investment(20000.0, 5.5, 3));


    }



    public static void space(String str) {
        int countspace = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                countspace++;
            }
        }
        System.out.println(countspace);
    }

    public static double investment(double amount, double rate, int year){
        amount += amount*year*rate;
        return amount;
    }


}
