package my_package;

public class Actor {
    public Actor(int id) {
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