package my_package;

public class Movie {
    public Movie(String title, int prod_year, float rating) {
        this.title = title;
        this.prod_year = prod_year;
        this.rating = rating;
    }

    public int getoProdYear() {
        return prod_year;
    }

    public String getTitle(){
        return title;
    }

    public float getRating(){
        return rating;
    }

    public void setProdYear(int prod_year) {
        this.prod_year = prod_year;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(float rating){
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "[title=" + title + ", production year" + prod_year + ", rating" + rating + "]";
    }

    private String title;
    private int prod_year;
    private float rating;
}