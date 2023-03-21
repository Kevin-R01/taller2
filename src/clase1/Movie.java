package clase1;

import java.util.Scanner;
import java.util.Locale.Category;

import javax.lang.model.element.Name;

public class Movie {
 
//atributos
    public String name;
    public String category;
    int year;
    public String duration;

    Scanner lectura =new Scanner(System.in);

public Movie(){

}

    public Movie(String name,String category){
        this.name=name;
        this.category=category;
        }

    public Movie(String name,int year){
            this.name=name;
            this.year=year;
            }

    public Movie(String name,String category, int year){
            this.name=name;
            this.category=category;
            this.year=year;
            }
    

        public void registrarPelicula(String p, String m){
            //cuerpo e instrucciones del metodo
            name=p;
            category=m;
        }

        public void mostrarPelicula(){
            System.out.println("el nombre de la pelicula es  " + name +", su categoria es"+category+"y el año de la pelicula es"+year);
        }
        public void mostrarPelicula(String name, int year){
            System.out.println("el nombre de la pelicula es" + name +", su categoria es"+category+"y el año de la pelicula es"+year);
        }
        public void mostrarPelicula(String name,String category, int year){
            System.out.println("el nombre de la pelicula es" + name +", su categoria es"+category+"y el año de la pelicula es"+year);
        }

        //metodo getter = mostrar
public int getYear(){
    return year;
}
public String getName(){
    return name;
}
public String getCategory() {
    return category;
}
public String getDuration() {
    return duration;
}

//metodo setter = definir
public void setYear(int year){
    this.year=year;
}
public void setName(String name){
    this.name=name;
}
public void setCategory(String category){
    this.category=category;
}
public void setDuration(String duration){
    this.duration=duration;
}

    

}


// quien ve el atributo name?: ningun objecto lo ve
// quien ve el atributo categoty?: ningun objecto lo ve
// quien ve el atributo year?: lo ve los objectos del mismo paquete
// quien ve el atributo duration?: lo ve todos los objectos de todos los paquetes