public class Margarita extends Pizza  {
    private boolean isWithMeat;


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
}
