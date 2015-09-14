package diegobr.crud_alumnos;

/**
 * Created by Diego on 14/09/2015.
 */

import java.io.Serializable;

/**
 * Created by Diego on 14/09/2015.
 */
public class EntidadAlumnos implements Serializable {
    private int Id;
    private String Nombre;
    private String Direccion;
    private int Telefono;
    private String Sexo;
    private String Carrera;
    private String Correo;
    private String Nacimiento;


    private int getId() {
        return this.Id;
    }

    private void setId(int Id) {
        this.Id = Id;
    }

    private String getNombre() {
        return this.Nombre;
    }

    private void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    private String getDireccion() {
        return this.Direccion;
    }

    private void setDire(String Direccion) {
        this.Direccion = Direccion;
    }
}
