package clase1;

public class Ave extends Animal {
    
    //atributo propio
    private String envergadura;


    public Ave(){

    }

    public Ave(String nombre, int edad, String envergadura){
        super(nombre, edad);
        this.envergadura=envergadura;

    }


    //metodos acesores getters y setters
    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }
    
    //metodos propios
    public void mostrarAve(){
        System.out.println("el nombre del animal es "+getNombre()+" tiene "+getEdad()+" años y la envergadura de la ave es "
        + this.envergadura);

    }



}
