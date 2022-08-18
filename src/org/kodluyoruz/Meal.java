package org.kodluyoruz;

import java.util.ArrayList;

public class Meal {

    private int id;
    private String name;
    private int preparingTime;
    private int consumptionTime;

    public Meal(int id, String name, int preparingTime, int consumptionTime) {
        this.id = id;
        this.name = name;
        this.preparingTime = preparingTime;
        this.consumptionTime = consumptionTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreparingTime() {
        return preparingTime;
    }

    public void setPreparingTime(int preparingTime) {
        this.preparingTime = preparingTime;
    }

    public int getConsumptionTime() {
        return consumptionTime;
    }

    public void setConsumptionTime(int consumptionTime) {
        this.consumptionTime = consumptionTime;
    }

    public static ArrayList<Meal> meals(){
        ArrayList<Meal> mealList = new ArrayList<>();
        mealList.add(new Meal(1,"Salad",200,300));
        mealList.add(new Meal(2,"Soup",250,300));
        mealList.add(new Meal(3,"Kofte",250,400));
        mealList.add(new Meal(4,"Pasta",150,250));
        mealList.add(new Meal(5,"Chicken Wings",250,400));
        mealList.add(new Meal(6,"Burger",300,500));
        mealList.add(new Meal(7,"Paella",500,400));
        mealList.add(new Meal(8,"Pizza",350,500));
        mealList.add(new Meal(9,"Baklava",100,200));
        mealList.add(new Meal(10,"Fanta",25,100));

        return mealList;

    }

    public static Meal getMealObjById(int id){
        for (Meal m:Meal.meals())
        {
            if(m.getId()==id){
                return m;
            }
        }
        return null;
    }

}
