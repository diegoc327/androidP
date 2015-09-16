package diegobr.crud_alumnos;

/**
 * Created by diego on 9/15/2015.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ManejoDatabase extends SQLiteOpenHelper{
    public static final String BASEDATOS="alumnosBD";
    public static final String NUMERO = "numero";
    public static final String NOMBRE ="nombre";
    public static final String DIRECCION ="direccion";
    public static final String TELEFONO ="telefono";
    public static final String SEXO = "sexo";
    public static final String CARRERA = "carrera";
    public static final String NACIMIENTO = "nacimimiento";
    public ManejoDatabase(Context context){
        super(context,BASEDATOS,null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase db){
        Log.i("System.out","Voy aca----->");
        db.execSQL("CREATE TABLE alumno(codigo INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, numero TEXT," +
                   " nombre TEXT, direccion TEXT, telefono INT, sexo TEXT carrera TEXT, nacimiento TEXT);");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        android.util.Log.v("alumno","Actualizando para borrar los datos");
        db.execSQL("DROP TABLE IF EXIST alumno");
        onCreate();
    }
}