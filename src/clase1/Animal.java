package clase1;


import java.util.Scanner;

public class Animal {

//atributos

private String nombre;
public int edad;



Scanner lectura=new Scanner (System.in);

//metodos



public void registrarAnimal(String p, int o){
    //cuerpo e instrucciones del metodo
    nombre=p;
    edad=o;
}

public void mostrarAnimal(){
    System.out.println("el nombre del animal ingresado es " + nombre + "");


}

public int duplicarEdad(int edad){

    int duplicado=edad*2;
    return duplicado;

}


}