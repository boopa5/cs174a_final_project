package my_package;

public class Deposit {
    public Deposit(int tid, float amount, int mid) {
        this.tid = tid;
        this.mid = mid;
        this.amount = amount;
    }

    public int getTid() {
        return tid;
    }

    public int getMid() {
        return mid;
    }

    public float getAmount() {
        return amount;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "[tid=" + tid + ", mid" + mid + ", amount " + amount + "]";
    }

    private int tid;
    private int mid;
    private float amount;
}