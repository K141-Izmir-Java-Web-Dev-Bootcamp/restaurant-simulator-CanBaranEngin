package org.kodluyoruz;

import java.util.concurrent.Callable;

public class FoodOrder implements Callable {

    private int orderSelect;

    public FoodOrder(int orderSelect) {
        this.orderSelect = orderSelect;
    }

    public int getOrderSelect() {
        return orderSelect;
    }

    @Override
    public String call() throws Exception {
        String orderedMealName;

        switch (orderSelect) {
            case 1:
                orderedMealName = Meal.getMealObjById(1).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 2:
                orderedMealName = Meal.getMealObjById(2).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 3:
                orderedMealName = Meal.getMealObjById(3).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 4:
                orderedMealName = Meal.getMealObjById(4).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 5:
                orderedMealName = Meal.getMealObjById(5).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 6:
                orderedMealName = Meal.getMealObjById(6).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 7:
                orderedMealName = Meal.getMealObjById(7).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 8:
                orderedMealName = Meal.getMealObjById(8).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 9:
                orderedMealName = Meal.getMealObjById(9).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            case 10:
                orderedMealName = Meal.getMealObjById(10).getName();
                System.out.println(orderedMealName + " ordered.");
                break;

            default:
                orderedMealName=null;
                break;
        }
        return orderedMealName;
    }
}
