package clase1;

import java.util.Scanner;

public class Prueba {

public static void main(String[] args) {
   
    Scanner lectura=new Scanner(System.in);

    Animal guacamayo=new Animal();


    Movie titanic=new Movie();
    Animal panda=new Animal("bambu", 10);
    panda.mostrarAnimal();

    Movie up=new Movie("la noche del demonio", "terror");
    up.mostrarPelicula();


    guacamayo.setNombre("ñanga");
    guacamayo.setEdad(41);

    guacamayo.mostrarAnimal();

    System.out.println("el nombre del guacamayo es "+guacamayo.getNombre()+" y su edad es "+guacamayo.getEdad());



    

    System.out.println("ingrese el nombre del animal ");
    String nombre=lectura.nextLine();

    System.out.println("ingrese la edad del animal ");
    int edad=lectura.nextInt();
guacamayo.registrarAnimal(nombre,edad);//llamar un metodo
guacamayo.mostrarAnimal();

    
int duplicado=guacamayo.duplicarEdad(edad);
System.out.println("la edad duplicada del animas es "+duplicado);
}


}