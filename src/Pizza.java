public abstract class Pizza implements Prepare, Deliver {

    private int weight;
    private int price;

    public Pizza() {
    }

    public Pizza(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }





    @Override
    public String toString() {
        return "Pizza{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
