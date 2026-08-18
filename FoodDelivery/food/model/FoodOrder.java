package food.model;

public abstract class FoodOrder{

    private int orderId;
    private String customerName;
    private double amount;

    static String restauranttName = "Food Express";

    private static int orderCounter = 0;

    public FoodOrder(int orderId, String customerName, double amount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        orderCounter++;
    }

    //getter

    public int getOrderId(){
        return orderId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getAmount(){
        return amount;
    }

    //setter

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

     public abstract double calculateDeliveryCharge();

    public static void displayTotalOrder(){
        System.out.println("Total Orders:  "+orderCounter);
    }

    public static String getRestaurantName(){
        return restauranttName;
    }

}