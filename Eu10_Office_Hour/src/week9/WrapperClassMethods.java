package week9;

public class WrapperClassMethods {
    public static void main(String[] args) {

        // autoboxing
        int a =40;
        Integer b = a;
        System.out.println(b);

        // unboxing
        Integer c= 50;
        int d =c;
        System.out.println(d);

    /*
    parseInt(); parse a string and return its integer value
    valueOf()   convert a string to an Integer object
    toString(); take a int/Integer's string value(convert it to string object)
    Integer.max or min;
     */

        System.out.println(Integer.toString(123).concat("OneTwoThree"));

        String str = "123house258";
        int total=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                total += Integer.valueOf(""+str.charAt(i));
            }
        }
        System.out.println("total = " + total);
    }
}
