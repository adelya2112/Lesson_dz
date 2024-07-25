public abstract class Pizza implements Prepare, Deliver {

    private int weight;
    private int price;
    private String type;


    public Pizza(int weight, int price, String type) {
        this.weight = weight;
        this.price = price;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void pizza ();


    @Override
    public String toString() {
        return "Pizza{" +
                "weight=" + weight +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
