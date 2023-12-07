package my_package;

public class ContractDirector {
    public ContractDirector(String title, int prod_year, int id, String role, int year, float value) {
        this.title = title;
        this.prod_year = prod_year;
        this.id = id;
        this.role = role;
        this.year = year;
        this.value = value;
    }

    public int getProdYear() {
        return prod_year;
    }

    public String getTitle(){
        return title;
    }

    public float getValue(){
        return value;
    }

    public String getRole(){
        return role;
    }

    public int getId(){
        return id;
    }

    public int getYear(){
        return year;
    }

    public void setProdYear(int prod_year) {
        this.prod_year = prod_year;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setValue(float value){
        this.value = value;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setYear(int year){
        this.year = year;
    }

    //TODO
    public void getMovie(){

    }
    //TODO
    public void getDirector(){
        
    }

    @Override
    public String toString() {
        return "[title=" + title + ", production year=" + prod_year + ", id=" + id + ", role=" + role + ", year=" + year + ", value=" + value + "]";
    }

    private String title;
    private int prod_year;
    private int id;
    private String role;
    private int year;
    private float value;
}