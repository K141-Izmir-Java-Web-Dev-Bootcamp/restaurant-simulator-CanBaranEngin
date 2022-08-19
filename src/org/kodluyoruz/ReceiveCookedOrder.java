package org.kodluyoruz;

import java.util.concurrent.Callable;

import java.util.concurrent.FutureTask;

public class ReceiveCookedOrder implements Callable {

    private FutureTask<String> cookOrderFuture;

    public ReceiveCookedOrder(FutureTask<String> cookOrderFuture) {
        this.cookOrderFuture = cookOrderFuture;
    }

    public FutureTask<String> getCookOrderFuture() {
        return cookOrderFuture;
    }

    @Override
    public Object call() throws Exception {
        if("Take Salad".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Salad";
        }
        else if("Take Soup".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Soup";
        }
        else if("Take Kofte".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Kofte";
        }
        else if("Take Pasta".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Pasta";
        }
        else if("Take Chicken Wings".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Chicken Wings";
        }
        else if("Take Burger".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Burger";
        }
        else if("Take Paella".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Paella";
        }
        else if("Take Pizza".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Pizza";
        }
        else if("Take Baklava".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Baklava";
        }
        else if("Take Fanta".equalsIgnoreCase(cookOrderFuture.get())){
            System.out.println("Waiter: " + this.getCookOrderFuture().get().substring(5) + " order has been delivered");
            return "Fanta";
        }

        else {
            return null;
        }
    }
}
