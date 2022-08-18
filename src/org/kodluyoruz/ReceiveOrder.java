package org.kodluyoruz;

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

            return "Waiter : Salad order was received";
        }
        else if("Soup".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Soup order was received";
        }
        if("Kofte".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Kofte order was received";
        }
        if("Salad".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Salad order was received";
        }
        if("Salad".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Salad order was received";
        }
        if("Salad".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Salad order was received";
        }
        if("Salad".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Salad order was received";
        }
        if("Salad".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Salad order was received";
        }
        if("Salad".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Salad order was received";
        }
        if("Salad".equalsIgnoreCase(foodOrderFuture.get())){

            return "Waiter : Salad order was received";
        }



        return null;
    }
}
