package diegobr.crud_alumnos;

import android.app.Activity;
import android.content.res.Resources;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.security.PrivateKey;
import java.util.ArrayList;

public class Activity_mostrar extends AppCompatActivity {

    private EditText etNombre;
    private EditText etControl;
    private EditText etTelefono;
    private EditText etDireccion;
    private Spinner etSexo;
    private Spinner etCarrera;
    private EditText etEmail;
    private Button etNacimiento;
    private Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_mostrar);
        etNombre =(EditText) findViewById(R.id.textNombre);
        etControl =(EditText) findViewById(R.id.textControl);
        etTelefono=(EditText) findViewById(R.id.textTelefono);
        etDireccion=(EditText) findViewById(R.id.textDireccion);
        etSexo=(Spinner) findViewById(R.id.spinnerSexo);
        etCarrera=(Spinner) findViewById(R.id.spinnerCarrera);
        etEmail=(EditText) findViewById(R.id.textEmail);
        etNacimiento=(Button) findViewById(R.id.reminder_date);
        btnGuardar =(Button) findViewById(R.id.btnGuardar);

    }

    public void OnClick(View V){
        EntidadAlumnos objEnt=new EntidadAlumnos();
        objEnt.setNombre(etNombre.getText().toString());

        conAlumno objAlumno =new conAlumno(this);
        objAlumno.insertarAlumno(objEnt);



    }










    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_mostrar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
