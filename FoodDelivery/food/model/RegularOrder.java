package food.model;
import food.service.Discountable;

public class RegularOrder extends FoodOrder implements Discountable{
    public RegularOrder(int orderId, String customerName, double amount){
        super(orderId, customerName, amount);
    }

    //method overriding

    @Override
    public double calculateDeliveryCharge(){
        return 80;
    }

    @Override
    public double applyDiscount(){
        return getAmount()*0.10;
    }

}