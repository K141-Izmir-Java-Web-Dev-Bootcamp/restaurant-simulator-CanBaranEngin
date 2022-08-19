package org.kodluyoruz;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CookOrder implements Callable {

    private FutureTask<String> receiveOrderFuture;

    public CookOrder(FutureTask<String> receiveOrderFuture) {
        this.receiveOrderFuture = receiveOrderFuture;
    }

    public FutureTask<String> getReceiveOrderFuture() {
        return receiveOrderFuture;
    }



    @Override
    public String call() throws Exception {

        if("Salad".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(1).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Salad";
        }
        else if("Soup".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(2).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Soup";
        }
        else if("Kofte".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(3).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Kofte";
        }
        else if("Pasta".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(4).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Pasta";
        }
        else if("Chicken Wings".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(5).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Chicken Wings";
        }
        else if("Burger".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(6).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Burger";
        }
        else if("Paella".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(7).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Paella";
        }
        else if("Pizza".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(8).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Pizza";
        }
        else if("Baklava".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(9).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Baklava";
        }
        else if("Fanta".equalsIgnoreCase(receiveOrderFuture.get())){
            Thread.sleep(Meal.getMealObjById(10).getPreparingTime());
            System.out.println("Chef: " + this.getReceiveOrderFuture().get() + " order was prepared");
            return "Take Fanta";
        }

        else {
            return null;
        }

    }
}
