package Menu;

import Drinks.MixedDrink;

public abstract class ColdDrink implements MixedDrink{

     private String name;
     private Integer price;

    public ColdDrink(String name){
        this.name = name;
    }

    public ColdDrink(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public Integer getPrice(){
        return price;
    }
    public boolean equals(String name){
       return false;
    }

    @Override
    public String toString() {
        return "ColdDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
