package diegobr.crud_alumnos;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;


public class AgregarAlumnos extends Activity {



    //Variables
    private Button mDateButton;
    public Calendar mCalendar;
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    DialogFragment dateFragment;
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
        setContentView(R.layout.activity_agregar_alumnos);

//Datos de la entidad
        etNombre =(EditText) findViewById(R.id.textNombre);
        etControl =(EditText) findViewById(R.id.textControl);
        etTelefono=(EditText) findViewById(R.id.textTelefono);
        etDireccion=(EditText) findViewById(R.id.textDireccion);
        etSexo=(Spinner) findViewById(R.id.spinnerSexo);
        etCarrera=(Spinner) findViewById(R.id.spinnerCarrera);
        etEmail=(EditText) findViewById(R.id.textEmail);
        etNacimiento=(Button) findViewById(R.id.reminder_date);








        btnGuardar =(Button) findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    EntidadAlumnos objEnt=new EntidadAlumnos();
                    objEnt.setNombre(etNombre.getText().toString());
                    objEnt.setId(Integer.parseInt(etControl.getText().toString()));
                    objEnt.setCarrera(etCarrera.getSelectedItem().toString());
                    objEnt.setCorreo(etEmail.getText().toString());
                    objEnt.setDireccion(etDireccion.getText().toString());
                    objEnt.setSexo(etSexo.getSelectedItem().toString());
                    objEnt.setTelefono(Integer.parseInt(etTelefono.getText().toString()));

                    conAlumno objAlumno =new conAlumno(getBaseContext());
                    objAlumno.insertarAlumno(objEnt);

                Intent i = new Intent(getApplicationContext(), FrmConsulta.class);
                startActivity(i);
            }
        });

        if (getIntent().getExtras()!=null) {
            String[] dato = getIntent().getExtras().getString("Registro").split("-");

            etControl.setText(dato[0]);
            etNombre.setText(dato[1]);
            etDireccion.setText(dato[2]);
            etTelefono.setText((dato[3]));
            Toast.makeText(this,dato[4],Toast.LENGTH_SHORT).show();
            String[]c=dato;
            int index=2;
            c[0]= ("Ing. Gestión Empresarial");
            c[1]=("Ing. Sistemas Computacionales");
            c[2]= ("Ing. Electromecánica");
            c[3]=("Ing. Tecnologías de la Información y Comunicación");
            c[4]= ("Arquitectura");
            c[5]=("Lic. Gastronomía");
            c[6]=("Lic. Turismo");
            for (int x=0; x==6;x++){
            //Toast.makeText((this),"for",Toast.LENGTH_SHORT).show();
                if(dato[5].equals(c[x])){
                    etCarrera.setSelection(x);
                    index=x;
                    System.out.println("igualdad");
                    //Toast.makeText(this,"igualdad",Toast.LENGTH_SHORT).show();
                }
            }
            Toast.makeText(this,Integer.toString(index),Toast.LENGTH_SHORT).show();

        }


//Botones Calendario

        mDateButton = (Button) findViewById(R.id.reminder_date);
        mCalendar = Calendar.getInstance();

        mDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog(v);
            }
        });


//Datos de Spinner
        Spinner spinnerSexo = (Spinner) findViewById(R.id.spinnerSexo);

        ArrayAdapter<CharSequence> adapterSexo = ArrayAdapter.createFromResource(this,
                R.array.gender_array, android.R.layout.simple_spinner_item);

        adapterSexo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerSexo.setAdapter(adapterSexo);

        Spinner spinnerCarrera = (Spinner) findViewById(R.id.spinnerCarrera);

        ArrayAdapter<CharSequence> adapterCarrera = ArrayAdapter.createFromResource(this,
                R.array.career_array, android.R.layout.simple_spinner_item);
        adapterCarrera.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCarrera.setAdapter(adapterCarrera);

//fin onCreate
    }
    //Funciones para el calendario
    public void showDatePickerDialog(View v) {
        dateFragment = new DatePickerFragment();
        dateFragment.show(getFragmentManager(), "datePicker");

    }


    public void updateDateButtonText() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        String dateForButton = dateFormat.format(mCalendar.getTime());
        mDateButton.setText(dateForButton);
    }


    class DatePickerFragment extends DialogFragment implements
            DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            mCalendar.set(Calendar.YEAR, year);
            mCalendar.set(Calendar.MONTH, month);
            mCalendar.set(Calendar.DAY_OF_MONTH, day);
            updateDateButtonText();
        }
    }

























    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_agregar_alumnos, menu);
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
