public class Order {
    public String name;
    public String bank;
    public int amount;

    public Order(String name, int amount, String bank) {
        this.name = name;
        this.amount = amount;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return  name + " " +amount + " "+ bank;
    }
}
