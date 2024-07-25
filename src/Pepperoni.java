public class Pepperoni extends Pizza  {

    private boolean isSpicyPizza;

    public boolean spicyPizza (){
        if (isSpicyPizza){
            isSpicyPizza = false;
            return isSpicyPizza;
        }
        isSpicyPizza = true;
        return isSpicyPizza;

    }

    public Pepperoni(int weight, int price, String type, boolean isSpicyPizza) {
        super(weight, price, type);
        this.isSpicyPizza = isSpicyPizza;
    }

    public boolean isSpicyPizza() {
        return isSpicyPizza;
    }

    public void setSpicyPizza(boolean spicyPizza) {
        isSpicyPizza = spicyPizza;
    }

    @Override
    public void deliveryPizza() {
        System.out.println("готовится пицца ");
    }

    @Override
    public void cookingPizza() {

    }

    @Override
    public void pizza() {


    }

    @Override
    public String toString() {
        return "Pepperoni{" +
                "weight=" + super.getWeight() +
                ", price=" + super.getPrice() +
                ", type='" + super.getType()  +
                "isSpicyPizza=" + isSpicyPizza + '\'' +
                '}';
    }
}
