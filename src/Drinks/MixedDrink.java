package Drinks;
import Menu.ColdDrink;
import Menu.HotDrink;

public interface MixedDrink{

    String name = null;
    Integer percentage = null;
    HotDrink hotDrink = null;
    ColdDrink coldDrink = null;


    default void calcPrice(HotDrink hotDrink, ColdDrink coldDrink){
        System.out.println(coldDrink.getPrice() + hotDrink.getPrice());
    }

    default void calcTemperature(HotDrink hotDrink, Integer percentage){
        System.out.println(hotDrink.getTemperature() * percentage + 10 * (100 - percentage) / 100);

    }



}

