package org.kodluyoruz;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ReceiveOrder implements Callable {

    private FutureTask<String> foodOrderFuture;

    public ReceiveOrder(FutureTask<String> foodOrderFuture) {
        this.foodOrderFuture = foodOrderFuture;
    }


    public FutureTask<String> getFoodOrderFuture() {
        return foodOrderFuture;
    }

    @Override
    public String call() throws Exception {

        if("Salad".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Salad";
        }
        else if("Soup".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Soup";
        }
        else if("Kofte".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");

            return "Kofte" ;
        }
        else if("Pasta".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Pasta";
        }
        else if("Chicken Wings".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Chicken Wings";
        }
        else if("Burger".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Burger";
        }
        else if("Paella".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Paella";
        }
        else if("Pizza".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Pizza";
        }
        else if("Baklava".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Baklava";
        }
        else if("Fanta".equalsIgnoreCase(foodOrderFuture.get())){
            System.out.println("Waiter: " + this.getFoodOrderFuture().get() + " order was received");
            return "Fanta";
        }

        else {
            return null;
        }
    }
    
}
