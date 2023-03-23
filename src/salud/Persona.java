package salud;

import java.util.Scanner;

public class Persona {

        public String tipoDoc;
        public String documento;
    public String nombre;
    public String apellido;
    public double peso;
    public double estatura;
    public int edad;
    public String sexo;

    public void pedirDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento: ");
        tipoDoc = input.nextLine();
        System.out.println("Ingrese el número de documento: ");
        documento = input.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = input.nextLine();
        System.out.println("Ingrese el peso en kilogramos: ");
        peso = input.nextDouble();
        System.out.println("Ingrese la estatura en metros: ");
        estatura = input.nextDouble();
        System.out.println("Ingrese la edad: ");
        edad = input.nextInt();
        System.out.println("Ingrese el sexo (M o F): ");
        sexo = input.next();
        input.close();
    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    public void calcularImc() {
        double imc = peso / (estatura * estatura);
        if (imc < 20) {
            System.out.println("el peso está por debajo de lo ideal");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("el peso es ideal");
        } else {
            System.out.println("eay sobrepeso");
        }
    }

    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
      

    }
    public static void main(String[] args) {
        

        Persona llamar=new Persona();

        llamar.pedirDatos();
        llamar.mostrarPersona();
        llamar.calcularImc();
        llamar.mayorEdad();

    }
}

