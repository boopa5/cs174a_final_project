package my_package;

public class AccrueInterest {
    public AccrueInterest(int tid, float amount, int mid) {
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

    //TODO
    public void calculateInterest(){

    }
    //TODO
    public void getMarketAccount(){
        
    }

    @Override
    public String toString() {
        return "[tid=" + tid + ", mid" + mid + ", amount " + amount + "]";
    }

    private int tid;
    private int mid;
    private float amount;
}