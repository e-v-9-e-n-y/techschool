public class Account {
    public Account(int id, String holder, int amount, int devisor) {
        this.holder = holder;
        this.amount = amount;
        this.devisor = devisor;
        this.id = id;
    }

    private String holder;

    private int amount;

    private int devisor;

    public int getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }

    public int getDevisor() {
        return devisor;
    }

    private int id;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
