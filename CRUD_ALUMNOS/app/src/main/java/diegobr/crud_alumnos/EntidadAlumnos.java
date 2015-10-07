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


    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return this.Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCarrera() {
        return this.Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCorreo() {
        return this.Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNacimiento() {
        return this.Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
    @Override
    public String toString(){
        return this.Id+"-"+this.Nombre+"-"+this.Direccion+"-"+this.Telefono+"-"+this.Sexo+"-"+this.Carrera+"-"+this.Nacimiento+"-"+this.Correo;
    }
}
