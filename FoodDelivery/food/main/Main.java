package food.main;

import food.model.FoodOrder;
import food.model.PremiumOrder;
import food.model.RegularOrder;
import food.utility.OrderUtility;

public class Main {

    public static void main(String[] args) {

        // Creating six orders
        FoodOrder[] orders = new FoodOrder[6];

        orders[0] = new RegularOrder(101, "Rahul", 800);
        orders[1] = new PremiumOrder(102, "Ananya", 1200);
        orders[2] = new RegularOrder(103, "Rohan", 600);
        orders[3] = new PremiumOrder(104, "Priya", 1500);
        orders[4] = new RegularOrder(105, "Aman", 1000);
        orders[5] = new PremiumOrder(106, "Neha", 2000);

        System.out.println("====================================");
        System.out.println("       " + FoodOrder.getRestaurantName());
        System.out.println("====================================");

        // Display bills
        for (FoodOrder order : orders) {

            if (OrderUtility.validateAmount(order.getAmount())
                    && OrderUtility.validateCustomerName(order.getCustomerName())) {

                OrderUtility.generateOrderSummary(order);

            } else {
                System.out.println("Invalid order details for Order ID: "
                        + order.getOrderId());
            }
        }

        // Display total number of orders
        System.out.println();
        FoodOrder.displayTotalOrder();
    }
}