package diegobr.crud_alumnos;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FrmConsulta extends Activity implements AdapterView.OnItemClickListener {
    private ListView lvDatos;
    private ArrayAdapter<EntidadAlumnos> aaDatos;
    private ArrayList<EntidadAlumnos> alDatos;
    private EntidadAlumnos alumno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_consulta);

        lvDatos=(ListView)findViewById(R.id.lvAlumnos);
        ManejoDatabase con=new ManejoDatabase(getApplicationContext());
        SQLiteDatabase db=con.getReadableDatabase();
        Cursor cur = db.rawQuery("select * from alumno", null);
        alDatos=new ArrayList<EntidadAlumnos>();
        if (cur.moveToFirst()) {
            do{
                alumno=new EntidadAlumnos();
                alumno.setId(cur.getInt(1));
                alumno.setNombre((cur.getString(2)));
                alumno.setDireccion(cur.getString((3)));
                alumno.setTelefono(cur.getString(4));
            }
        }





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)

        Intent objEditar new Intent(this, FrmEditar.class);
        objEditar.putExtra("registro",(()))

        //finis



}
