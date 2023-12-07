package my_package;

public class Stock {
        public Stock(String symbol, float closing_price, float current_price, int id) {
            this.symbol = symbol;
            this.closing_price = closing_price;
            this.current_price = current_price;
            this.id = id;
        }

        public float getClosingPrice() {
            return closing_price;
        }

        public float getCurrentPrice() {
            return current_price;
        }

        public int getid() {
            return id;
        }

        public String getSymbol() {
            return symbol;
        }

        //TODO add get Actor Director
        public void getAssociatedActorDirector(){

        }

        public void setId(int id) {
            this.id = id;
        }

        public void setClosingPrice(float closing_price) {
            this.closing_price = closing_price;
        }

        public void setCurrentPrice(float current_price) {
            this.current_price = current_price;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
        @Override
        public String toString() {
            return "[id=" + id + ", closing_price=" + closing_price + ", current_price=" + current_price + ", symbol=" + symbol + "]";
        }
        private int id;
        private float closing_price;
        private float current_price;
        private String symbol;
    }