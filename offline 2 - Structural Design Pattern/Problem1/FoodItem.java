public class FoodItem implements MenuComponent {
    private String name;
    private int price;

    public FoodItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println(name + " - " + price+"tk");
    }

}
