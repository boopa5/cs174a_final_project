package my_package;

public class Buy {
    public Buy(int tid, float og_price, float quant, int sid, int wtid) {
        this.tid = tid;
        this.sid = sid;
        this.wtid = wtid;
        this.og_price = og_price;
        this.quant = quant;
    }

    public int getTid() {
        return tid;
    }
    public int getWtid() {
        return wtid;
    }

    public int getSid() {
        return sid;
    }

    public float getOgPrice() {
        return og_price;
    }

    public float getQuant() {
        return quant;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setWtid(int wtid) {
        this.wtid = wtid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setOgPrice(float og_price) {
        this.og_price = og_price;
    }

    public void setQuant(float quant) {
        this.quant = quant;
    }

    //TODO
    public void executeBuy(float quant, Stock stock){

    }
    //TODO
    public void withdraw(){

    }
    //TODO
    public void getStockAccount(){

    }

    @Override
    public String toString() {
        return "[tid=" + tid + ", sid=" + sid + ", original price=" + og_price + ", quant=" + quant + ", withdraw tid=" + wtid + "]";
    }

    private int tid;
    private int wtid;
    private int sid;
    private float og_price;
    private float quant;
}