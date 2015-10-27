package diegobr.crud_alumnos;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;


/**
 * Created by diego on 9/15/2015.
 */
public class conAlumno {
    Context context;
    public conAlumno(Context context) {
        this.context = context;
    }
        public void insertarAlumno(EntidadAlumnos alumno){
            ManejoDatabase manejoDB=new ManejoDatabase(this.context);
            SQLiteDatabase db=manejoDB.getWritableDatabase();
            ContentValues cv=new ContentValues();
            cv.put(manejoDB.NUMERO,alumno.getId());
            cv.put(manejoDB.NOMBRE,alumno.getNombre());
            cv.put(manejoDB.DIRECCION,alumno.getDireccion());
            cv.put(manejoDB.TELEFONO,alumno.getTelefono());
            cv.put(manejoDB.SEXO,alumno.getSexo());
            cv.put(manejoDB.CARRERA,alumno.getCarrera());
            cv.put(manejoDB.NACIMIENTO,alumno.getNacimiento());
            cv.put(manejoDB.CORREO,alumno.getCorreo());
            //cv.put(manejoDB.)

            db.insert("alumno", manejoDB.NOMBRE, cv);
            db.close();

            Toast.makeText(context, "Correcto",Toast.LENGTH_LONG).show();
            //Toast.m
        }
    public void actualizarAlumno(EntidadAlumnos alumno){

        ManejoDatabase manejoDB=new ManejoDatabase(this.context);
        SQLiteDatabase db=manejoDB.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(manejoDB.NUMERO,alumno.getId());
        cv.put(manejoDB.NOMBRE,alumno.getNombre());
        cv.put(manejoDB.DIRECCION,alumno.getDireccion());
        cv.put(manejoDB.TELEFONO,alumno.getTelefono());
        cv.put(manejoDB.SEXO,alumno.getSexo());
        cv.put(manejoDB.CARRERA,alumno.getCarrera());
        cv.put(manejoDB.NACIMIENTO,alumno.getNacimiento());
        cv.put(manejoDB.CORREO,alumno.getCorreo());

        db.update("alumno", cv, "numero=" + String.valueOf(alumno.getId()), null
        );

        db.close();
        Toast.makeText(this.context, "Actualizado correctamente", Toast.LENGTH_LONG).show();

        //
    }

    public void eliminarAlumno(Integer numero){
        ManejoDatabase manejoDB=new ManejoDatabase(this.context);
        SQLiteDatabase db=manejoDB.getWritableDatabase();
        db.delete("alumno", "codigo="+String.valueOf(numero), null);
    }

}


