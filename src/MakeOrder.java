public class MakeOrder {
    String name;
    int quantity;

    public MakeOrder(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void showAllOrders(){
        System.out.printf("Name: %s\n Quantity: %s\n",name,quantity);
    }
}
