public class Pepperoni extends Pizza  {

    private boolean isSpicyPizza;

    public boolean SpicyPizza (){
        if (isSpicyPizza){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public void deliveryPizza() {
        System.out.println("готовится пицца ");
    }

    @Override
    public void cookingPizza() {

    }
}
