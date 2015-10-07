package diegobr.crud_alumnos;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActividadPrincipal extends AppCompatActivity {

    private ImageButton btnNuevo;
    private ImageButton btnBuscar;
    private ImageButton btnModificar;
    private ImageButton btnEliminar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        btnNuevo =(ImageButton) findViewById(R.id.btnNuevo);
        btnBuscar=(ImageButton) findViewById(R.id.btnBuscar);
        btnModificar=(ImageButton) findViewById(R.id.btnModificar);
        btnEliminar=(ImageButton) findViewById(R.id.btnEliminar);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FrmConsulta.class);
                startActivity(i);

            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FrmConsulta.class);
                startActivity(i);

            }
        });

        btnModificar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FrmConsulta.class);
                startActivity(i);

            }
        });

        btnEliminar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FrmConsulta.class);
                startActivity(i);

            }
        });




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

}
