import java.util.PriorityQueue;

/**
 * Created by Ivan on 02/07/2016.
 */
public class CochePriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Coche>cochePriorityQueue=new PriorityQueue<>(new CompararCocheAño());


        Coche coche = new Coche(1L, "Renault", "Megane", 2007, "9236478-Y");

        Coche coche2 = new Coche(2L, "Ferrari", "FX-16", 2007, "5214547-B");

        Coche coche3 = new Coche(3L, "Mercedes", "GT-50", 2001, "3456478-C");
        Coche coche4 = new Coche(4L, "Honda", "Turbo-50", 2015, "7556478-L");
        Coche coche5 = new Coche(5L, "Toyota", "Toy-50", 2013, "6656478-T");

        cochePriorityQueue.add(coche);

        cochePriorityQueue.add(coche2);
        cochePriorityQueue.add(coche3);
        cochePriorityQueue.add(coche4);
        cochePriorityQueue.add(coche5);


        while(true) {
            Coche coches=cochePriorityQueue.poll();

            if(coches==null) {

                break;
            }
            else {

                System.out.println(coches);
            }

        }








    }


}
