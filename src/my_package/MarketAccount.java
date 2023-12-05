package my_package;

public class MarketAccount {
        public MarketAccount(int mid, float balance, String username) {
            this.mid = mid;
            this.balance = balance;
            this.username = username;
        }

        public float getBalance() {
            return balance;
        }

        public int getMid() {
            return mid;
        }

        public String getUsername() {
            return username;
        }


        public void setMid(int mid) {
            this.mid = mid;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }

        public void setUsername(String username) {
            this.username = username;
        }
        @Override
        public String toString() {
            return "[mid=" + mid + ", balance=" + balance + ", username=" + username + "]";
        }


        private String mid;
        private String balance;
        private String username;
    }