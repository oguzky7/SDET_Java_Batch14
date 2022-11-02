package Practise;

class Account {
    long acc_no;
    String name;
    String email;
    double amount;

    public Account(long acc_no, String name, String email, double amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getAmount() {
        return amount;
    }

    public static void main(String[] args) {

    }
}