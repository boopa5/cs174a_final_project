package my_package;

public class Review {
    public Review(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "[text=" + text + "]";
    }

    private String text;
}