package clase1;


import java.time.Year;
import java.util.Scanner;

public class Animal {

//atributos

public String nombre;
public int edad;
private String tipo;




Scanner lectura=new Scanner (System.in);

//metodos
//METODO CONSTRUCTOR
//metodo 1
public Animal(){

}
public Animal(String nombre,int edad){
this.nombre=nombre;
this.edad=edad;
}

public Animal(String nombre,String tipo){
}





//metodos accesores =getters y setters

//metodo getter = mostrar
public int getEdad(){
    return edad;
}

public String getNombre(){
    return nombre;
}

public String getTipo() {
    return tipo;
}

//metodo setter = escribir o definir
public void setEdad(int edad){
    this.edad=edad;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}













public void registrarAnimal(String p, int o){
    //cuerpo e instrucciones del metodo
    nombre=p;
    edad=o;
}

public void mostrarAnimal(){
    System.out.println("el nombre del animal ingresado es " + nombre + " y tiene "+edad+" años");


}

public int duplicarEdad(int edad){

    int duplicado=edad*2;
    return duplicado;

}


}