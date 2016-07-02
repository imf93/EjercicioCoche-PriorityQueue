import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.util.List;

/**
 * Created by Ivan on 02/07/2016.
 */
public class CocheMultiMap {
    static ListMultimap<Integer, Coche>cocheMultiMap  = ArrayListMultimap.create();


    public static void main(String[] args) {

        Coche coche = new Coche(1L, "Renault", "Megane", 2007, "9236478-Y");

        Coche coche2 = new Coche(2L, "Ferrari", "FX-16", 2007, "5214547-B");

        Coche coche3 = new Coche(3L, "Mercedes", "GT-50", 2001, "3456478-C");
        Coche coche4 = new Coche(4L, "Honda", "Turbo-50", 2015, "7556478-L");
        Coche coche5 = new Coche(5L, "Toyota", "Toy-50", 2013, "6656478-T");


        cocheMultiMap.put(2007, coche);
        cocheMultiMap.put(2007, coche2);
        cocheMultiMap.put(2001, coche3);
        cocheMultiMap.put(2015, coche4);
        cocheMultiMap.put(2013, coche5);

        System.out.println("Los coches del año 2007 son"+System.lineSeparator()+cocheMultiMap.get(2007));

    }

}
