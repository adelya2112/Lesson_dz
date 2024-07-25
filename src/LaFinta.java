public class LaFinta extends  Pizza{

    private boolean  isWithMushrooms;

    public LaFinta(int weight, int price, String type) {
        super(weight, price, type);
    }

    public boolean isWithMushrooms (){
        if (isWithMushrooms){
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
