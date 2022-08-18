package org.kodluyoruz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) {
        int orderSelect = (int) ((Math.random() * (10 - 1)) + 1);


        ExecutorService waiters = Executors.newFixedThreadPool(3);
        ExecutorService chefs = Executors.newFixedThreadPool(2);
        ExecutorService tables = Executors.newFixedThreadPool(5);


        FutureTask<String> foodOrderFuture = new FutureTask<String>(new FoodOrder(orderSelect));

        tables.execute(foodOrderFuture);






    }
}
