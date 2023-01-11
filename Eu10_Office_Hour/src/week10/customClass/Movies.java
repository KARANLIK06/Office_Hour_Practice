package week10.customClass;

public class Movies {
    public String title;
    public String director;
    public int year;
    public double rating;


    public void getTitle(){
        System.out.println(title);
    }

    public String getDirector(){
        return director;
    }

    public int getYear(){
        return year;
    }

    public double getRating(){
        return rating;
    }

    public void setTitle(String movieName){
        title = movieName;
    }

    public void setDirector(String newDirector){
        director = newDirector;
    }

    public void movieInfo(){
        System.out.println("The movie title is: " + title + ", directed by " + director);
    }
}
/*
Design a Movie class with the following attributes:
title (a string)
director (a string)
year (an integer)
rating (a double)
The Movie class should have the following methods:

getTitle(): returns the title of the movie
getDirector(): returns the director of the movie
getYear(): returns the year the movie was released
getRating(): returns the rating of the movie
setRating(double rating): sets the rating of the movie
toString(): returns a string representation of the movie in the following format: "Title (Year) - directed by Director - Rating: rating"
 */
