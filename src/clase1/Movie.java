package clase1;

import javax.lang.model.element.Name;

public class Movie {
 
//atributos
    private String name;
    private String category;
    int year;
    public String duration;

    

}


// quien ve el atributo name?: ningun objecto lo ve
// quien ve el atributo categoty?: ningun objecto lo ve
// quien ve el atributo year?: lo ve los objectos del mismo paquete
// quien ve el atributo duration?: lo ve todos los objectos de todos los paquetes