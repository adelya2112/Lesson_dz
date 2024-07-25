public class Margarita extends Pizza  {
    private boolean isWithMeat;

    public Margarita(int weight, int price, String type) {
        super(weight, price, type);
    }


    public boolean WithMeat (){
        if (isWithMeat){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public void deliveryPizza() {

    }

    @Override
    public void cookingPizza() {

    }

    @Override
    public void pizza() {

    }
}
