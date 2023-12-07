package my_package;

public class StockAccount {
        public StockAccount(int sid, String symbols, String username) {
            this.sid = sid;
            this.username = username;
            this.symbols = symbols;
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

        //TODO GetStock 
        public void getStock() {
        }

        //TODO GetCustomerProfile 
        public void getCustomerProfile() {
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

        @Override
        public String toString() {
            return "[sid=" + sid + ", username=" + username + ", symbols=" + symbols  +"]";
        }


        private int sid;
        private String username;
        private String symbols;
    }