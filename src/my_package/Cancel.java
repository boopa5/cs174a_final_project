package my_package;

public class Cancel {
    public Cancel(int tid, int sid, int otid) {
        this.tid = tid;
        this.sid = sid;
        this.otid = otid;
    }

    public int getTid() {
        return tid;
    }
    public int getOtid() {
        return otid;
    }

    public int getSid() {
        return sid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setOtid(int otid) {
        this.otid = otid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    //TODO
    public void cancelTransaction(Transaction transaction){

    }
    //TODO
    public void getCanCancelTransaction(){

    }
    //TODO
    public void getStockAccount(){
        
    }

    @Override
    public String toString() {
        return "[tid=" + tid + ", sid=" + sid + ", other tid=" + otid + "]";
    }

    private int tid;
    private int otid;
    private int sid;
}