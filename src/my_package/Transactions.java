package my_package;

public class Transactions {
        public Transactions(int tid, String date, String time) {
            this.mid = tid;
            this.date = date;
            this.time = time;
        }

        public float getDate() {
            return date;
        }

        public int getTid() {
            return tid;
        }

        public String getTime() {
            return time;
        }


        public void setTid(int mid) {
            this.tid = tid;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }
        @Override
        public String toString() {
            return "[tid=" + tid + ", date=" + date + ", time=" + time + "]";
        }


        private int tid;
        private String balance;
        private String username;
    }