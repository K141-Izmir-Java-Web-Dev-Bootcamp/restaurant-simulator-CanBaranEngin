package org.kodluyoruz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) {


        ExecutorService waiters = Executors.newFixedThreadPool(3);
        ExecutorService chefs = Executors.newFixedThreadPool(2);
        ExecutorService tables = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 6; i++) {

            int orderSelect = (int) ((Math.random() * (10 - 1)) + 1);
            FutureTask<String> foodOrderFuture = new FutureTask<String>(new FoodOrder(orderSelect));
            FutureTask<String> receiveOrderFuture = new FutureTask<String>(new ReceiveOrder(foodOrderFuture));
            FutureTask<String> cookOrderFuture = new FutureTask<>(new CookOrder(receiveOrderFuture));
            FutureTask<String> receiveCookedOrderFuture = new FutureTask<>(new ReceiveCookedOrder(cookOrderFuture));
            FutureTask<String> consumeFoodOrderFuture = new FutureTask<>(new ConsumeFoodOrder(receiveCookedOrderFuture));

            tables.execute(foodOrderFuture);
            waiters.execute(receiveOrderFuture);
            chefs.execute(cookOrderFuture);
            waiters.execute(receiveCookedOrderFuture);
            tables.execute(consumeFoodOrderFuture);

        }

        waiters.shutdown();
        chefs.shutdown();
        tables.shutdown();







    }
}
