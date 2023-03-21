
import clase1.Movie;
import clase1.Animal;
import clase1.Ave;

public class App {
    public static void main(String[] args) throws Exception {
       

       Animal loro = new Animal();
        
        Movie minions= new Movie();

        Movie avatar=new Movie();


        Ave condor=new Ave();
        condor.setNombre("condor");
        condor.setEdad(50);
        condor.setEnvergadura("300cm");


        condor.mostrarAve();





        avatar.setName("duro de matar");
        avatar.setYear(2020);
        avatar.setCategory("action");
        avatar.setDuration("140");

        System.out.println("el nombre de la pelicula es "+avatar.getName()+", el año de estreno fue en el  "+avatar.getYear()
        +" con su categoria que es "+avatar.getCategory()+" y la duracion de la pelicula es de "+avatar.getDuration()+" minutos");
    
    }




}
