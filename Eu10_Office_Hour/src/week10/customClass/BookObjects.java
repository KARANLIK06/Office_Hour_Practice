package week10.customClass;

public class BookObjects {
    public static void main(String[] args) {

        Books sapiens = new Books();

        sapiens.getInfo();
        sapiens.setBook("Sapiens","Harrari",2015,"History");
        sapiens.getInfo();

        System.out.println("**********************************************");
        Books howGoogleWorks = new Books();
        howGoogleWorks.setBook("How Google Works", "Eric", 2016,"Business");
        howGoogleWorks.getInfo();


//        System.out.println(sapiens);
        System.out.println("*************************");

        Products p1 = new Products();
        System.out.println(p1.name);
        System.out.println(p1.price);
        System.out.println(p1.quantity);

        p1.setName();
        System.out.println(p1.name);

        p1.setPrice(10.0);
        System.out.println(p1.price);


        System.out.println("******** movies ***************");
        Movies m1 = new Movies();
        m1.getTitle();

        m1.setTitle("Top Gun");
        m1.setDirector("Johnson");
        m1.movieInfo();


    }


}
