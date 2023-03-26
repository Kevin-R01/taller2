package clase1;

public class Persona2 {
    
//atributos

private String cargo;
private String valorhora;
private int horastrabajadas;
private String departamento;

//metodo constructor
public Persona2(String cargo,String valorhora, int nombres, String departamento){
    this.cargo=cargo;
    this.valorhora=valorhora;
    this.horastrabajadas=nombres;
    this.departamento=departamento;
    }



public Persona2(String tipoDocumento, String numeroDocumento, String nombres, String apellidos) {
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
