import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de  figuras valumetricas para cada tipo:  ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("Introduce los datos del Coche " + i);
            System.out.println("Introduce el id:");
            Long id = sc.nextLong();

            System.out.println("iNTRODUCE MARCA");
            String marca = sc.next();
            System.out.println("modelo");
            String modelo = sc.next();
            System.out.println("Introduce el año:");
            int año = sc.nextInt();
            System.out.println("matricula");
            String matricula = sc.next();


            Coche coche = new Coche(id, marca, modelo, año, matricula);

            //Coche coche = new Coche(1L, "Renault", "Megane", 2007, "9236478-Y");


            // Coche coche2=new Coche(2L,"Ferrari","FX-16",1998,"5214547-B");

            // Coche coche3=new Coche(3L,"Mercedes","GT-50",2001,"3456478-C");
            ///  Coche coche4=new Coche(4L,"Honda","Turbo-50",2015,"7556478-L");
            // Coche coche5=new Coche(5L,"Toyota","Toy-50",2013,"6656478-T");

            List<Coche> ordenarMatriculaList = new ArrayList<>();

            //  Set setcoches = new TreeSet();

            // setcoches.add(coche);
            //setcoches.add(coche2);
            //setcoches.add(coche3);
            //setcoches.add(coche4);
            // setcoches.add(coche5);
//

            //  System.out.println(setcoches);


            ordenarMatriculaList.add(coche);
            //ordenarMatriculaList.add(coche2);
            // ordenarMatriculaList.add(coche3);
            //ordenarMatriculaList.add(coche4);
            // ordenarMatriculaList.add(coche5);

            Collections.sort(ordenarMatriculaList);

        }


        Coche[] ordenarMatriculaList = new Coche[0];
        for (Coche coche1 : ordenarMatriculaList) System.out.println(coche1);


        }
    }
