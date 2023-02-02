package week12.encapsulation;

import week12.encapsulation.BookInfo;

public class BookObjects {
    static BookInfo cydeo= new BookInfo("Cydeo",2015,2586312357L,true);

    public static void main(String[] args) {
        System.out.println(cydeo.getBookName());
        System.out.println(cydeo.getYear());
        cydeo.setYear(2020);
        System.out.println(cydeo.getYear());

        cydeo.setBorrowed(false);
        System.out.println(cydeo.isBorrowed());
    }
}
