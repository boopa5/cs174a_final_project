package my_package;

public class About {
    public About(String title, int prod_year) {
        this.title = title;
        this.prod_year = prod_year;
    }

    public int getProdYear() {
        return prod_year;
    }

    public String getTitle(){
        return title;
    }

    public void setProdYear(int prod_year) {
        this.prod_year = prod_year;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    //TODO
    public void getMovie(){

    }

    @Override
    public String toString() {
        return "[title=" + title + ", production year=" + prod_year +  "]";
    }

    private String title;
    private int prod_year;
}