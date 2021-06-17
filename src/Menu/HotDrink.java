package Menu;

import Drinks.MixedDrink;

public abstract class HotDrink implements MixedDrink{

     private String name;
     private Integer temperature;
     private Integer price;

    public HotDrink(){
        this.name = "Hot Drink";
        this.temperature = 75;
        this.price = 2;
    }
    public HotDrink(String name){
        this.name = name;
    }
    public HotDrink(Integer price){
        this.price = price;
    }
     public HotDrink(String name, Integer price) {
        this.name = name;
        this.price = price;
     }
    public HotDrink(String name, Integer temperature, Integer price){
        this.name = name;
        this.temperature = temperature;
        this.price = price;
    }

     public String getName(){
        return name;
    }
    public Integer getTemperature(){
        return temperature;
    }
    public Integer getPrice(){
        return this.price;
    }
    public Integer calcPrice(Integer price){
        return this.price;
    }

    public boolean equals(String name){
        return false;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", price=" + price +
                '}';
    }

}
