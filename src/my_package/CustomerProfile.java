package my_package;

public class CustomerProfile {
        public CustomerProfile(String name, String state, String phoneNo, String email, String taxID, String username, String password) {
            this.name = name;
            this.state = state;
            this.phoneNo = phoneNo;
            this.email = email;
            this.taxID = taxID;
            this.username = username;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public String getState() {
            return state;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public String getEmail() {
            return email;
        }

        public String getTaxID() {
            return taxID;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setTaxID(String taxID) {
            this.taxID = taxID;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "[email=" + email + ", name=" + name + ", password=" + password + ", phoneNo="
                    + phoneNo + ", state=" + state + ", taxID=" + taxID + ", username=" + username + "]";
        }


        private String name;
        private String state;
        private String phoneNo;
        private String email;
        private String taxID;
        private String username;
        private String password;
    }