package clase1;

public class Persona {
    
//atributos

private String cargo;
private String valorhora;
private int horastrabajadas;
private String departamento;

//metodo constructor
public Persona(String cargo,String valorhora, int horastrabajadas, String departamento){
    this.cargo=cargo;
    this.valorhora=valorhora;
    this.horastrabajadas=horastrabajadas;
    this.departamento=departamento;
    }



//metodos getters y setters:
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
public String getValorhora() {
    return valorhora;
}
public void setValorhora(String valorhora) {
    this.valorhora = valorhora;
}
public int getHorastrabajadas() {
    return horastrabajadas;
}
public void setHorastrabajadas(int horastrabajadas) {
    this.horastrabajadas = horastrabajadas;
}
public String getDepartamento() {
    return departamento;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
}



}
