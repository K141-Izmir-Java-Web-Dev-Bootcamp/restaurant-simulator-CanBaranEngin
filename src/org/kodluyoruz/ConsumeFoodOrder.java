package org.kodluyoruz;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ConsumeFoodOrder implements Callable {
    private FutureTask<String> receiveCookedOrderFuture;

    public ConsumeFoodOrder(FutureTask<String> receiveCookedOrderFuture) {
        this.receiveCookedOrderFuture = receiveCookedOrderFuture;
    }

    public FutureTask<String> getReceiveCookedOrderFuture() {
        return receiveCookedOrderFuture;
    }

    @Override
    public Object call() throws Exception {
        if("Salad".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(1).getConsumptionTime());
            return "Salad";
        }
        else if("Soup".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(2).getConsumptionTime());
            return "Soup";
        }
        else if("Kofte".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(3).getConsumptionTime());
            return "Kofte";
        }
        else if("Pasta".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(4).getConsumptionTime());
            return "Pasta";
        }
        else if("Chicken Wings".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(5).getConsumptionTime());
            return "Chicken Wings";
        }
        else if("Burger".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(6).getConsumptionTime());
            return "Burger";
        }
        else if("Paella".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(7).getConsumptionTime());
            return "Paella";
        }
        else if("Pizza".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(8).getConsumptionTime());
            return "Pizza";
        }
        else if("Baklava".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(9).getConsumptionTime());
            return "Baklava";
        }
        else if("Fanta".equalsIgnoreCase(receiveCookedOrderFuture.get())){
            System.out.println("Customer: " + this.getReceiveCookedOrderFuture().get() + " order has been consumed");
            Thread.sleep(Meal.getMealObjById(10).getConsumptionTime());
            return "Fanta";
        }

        else {
            return null;
        }
    }
}
