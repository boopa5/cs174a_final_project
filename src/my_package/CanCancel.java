package my_package;

public class CanCancel {
    public CanCancel(int tid) {
        this.tid = tid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "[tid=" + tid + "]";
    }

    private int tid;
}