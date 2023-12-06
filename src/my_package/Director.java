package my_package;

public class Director {
    public Director(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "[id=" + id + "]";
    }

    private int id;
}