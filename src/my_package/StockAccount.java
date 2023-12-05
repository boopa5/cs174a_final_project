package my_package;

public class StockAccount {
        public StockAccount(int sid, String symbols, Stock stock, CustomerProfile customer_profile, String username) {
            this.sid = sid;
            this.username = username;
            this.symbols = symbols;
            this.stock = stock;
            this.customer_profile = customer_profile;
        }

        public int getSid() {
            return sid;
        }

        public String getUsername() {
            return username;
        }

        public String getSymbols() {
            return symbols;
        }

        public Stock getStock() {
            return stock;
        }

        public CustomerProfile getCustomerProfile() {
            return customer_profile;
        }

        public void setSid(int sid) {
            this.sid = sid;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setSymbols(String symbols) {
            this.symbols = symbols;
        }

        public void setStock(Stock stock) {
            this.stock = stock;
        }

        public void setCustomerProfile(CustomerProfile customer_profile) {
            this.customer_profile = customer_profile;
        }


        @Override
        public String toString() {
            return "[sid=" + id + ", username=" + username + ", symbols=" + symbols + ", Stock=" + stock.toString() ", Customer Profile=" + customer_profile.toString() + + "]";
        }


        private int sid;
        private String username;
        private String symbols;
        private Stock stock;
        private CustomerProfile customer_profile;
    }