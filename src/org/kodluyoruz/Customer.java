package org.kodluyoruz;

public class Customer extends Person{

    public Customer(int id, String name, int role) {
        super(id, name, role);
    }

    public void giveOrder(){
        System.out.println("Meal order was given.");


    }
}
