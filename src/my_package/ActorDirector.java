package my_package;

public class ActorDirector {
    public ActorDirector(int id, String dob, String name, String symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDob() {
        return dob;
    }

    //TODO GetStock 
    public void getStock() {
        //return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", symbol=" + symbol + ", dob=" + dob"]";
    }

    private int id;
    private String name;
    private String symbol;
    private String dob;
}