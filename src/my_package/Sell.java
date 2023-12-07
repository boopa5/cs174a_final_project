package my_package;

public class Sell {
    public Sell(int tid, float og_price, float sell_price, float quant, int sid, int dtid) {
        this.tid = tid;
        this.sid = sid;
        this.dtid = dtid;
        this.og_price = og_price;
        this.quant = quant;
    }

    public int getTid() {
        return tid;
    }
    public int getDtid() {
        return dtid;
    }

    public int getSid() {
        return sid;
    }

    public float getOgPrice() {
        return og_price;
    }

    public float getSellPrice() {
        return sell_price;
    }

    public float getQuant() {
        return quant;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setDtid(int dtid) {
        this.dtid = dtid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setOgPrice(float og_price) {
        this.og_price = og_price;
    }

    public void setSellPrice(float sell_price) {
        this.sell_price = sell_price;
    }

    public void setQuant(float quant) {
        this.quant = quant;
    }
    //TODO
    public void executeSell(float quant, Stock stock){

    }
    //TODO
    public void deposit(){

    }
    //TODO
    public void getStockAccount(){
        
    }



    @Override
    public String toString() {
        return "[tid=" + tid + ", sid=" + sid + ", original price=" + og_price + ", sell price=" + sell_price + ", quant=" + quant + ", deposit tid=" + dtid + "]";
    }

    private int tid;
    private int dtid;
    private int sid;
    private float og_price;
    private float sell_price;
    private float quant;
}