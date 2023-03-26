package principal;
import Salud.Persona;

public class Inicio {

    public static void main(String[] args) {
        Persona persona1 = new Persona("TI", "5865865836", "Brayan", "Ortiz", 0, 0, 0, 'm');
        persona1.pedirDatos();
        persona1.mostrarPersona();
        String imc = persona1.calcularImc();
        if (imc.equals("pesobajo")) {
            System.out.println("el peso está por debajo de lo ideal");
        } else if (imc.equals("pesoideal")) {
            System.out.println("el peso es ideal");
        } else {
            System.out.println("tiene sobrepeso");
        }
persona1.mayorEdad();
    }
    
}