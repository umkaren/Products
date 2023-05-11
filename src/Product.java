public class Product {
    private String name;
    private int quantity;
    private double cost;

    public Product(String name, int quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }
    public void printProduct() {
        System.out.println(this.name + " costs " + this.cost + " per unit. " + this.quantity + " unit(s) were purchased.");
    }
    public void totalCost() {
        double total = this.quantity * this.cost;
        System.out.println("Total cost is " + total);
    }
}
