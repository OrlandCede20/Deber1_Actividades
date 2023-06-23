package com.example.debern1_cedenoorland;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ResourceBundle;

public class DatosRegistrados extends AppCompatActivity {

    TextView lbltitulo,lblcedula,lblnombres,lblfechanaci,lblciudad,lblgenero,lblcorreo,lbltelefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_registrados);

         lbltitulo = (TextView) findViewById(R.id.lblTitulo2);
         lblcedula = (TextView) findViewById(R.id.lblCedula3);
         lblnombres = (TextView) findViewById(R.id.lblNombres);
         lblfechanaci = (TextView) findViewById(R.id.lblFechaNaci);
         lblciudad = (TextView) findViewById(R.id.lblCiudad2);
         lblgenero = (TextView) findViewById(R.id.lblGenero2);
         lblcorreo = (TextView) findViewById(R.id.lblCorreo2);
         lbltelefono = (TextView) findViewById(R.id.lblTelefono);


        Bundle bundle = this.getIntent().getExtras();

        lbltitulo.setText(" Hola! Sus datos ingresados son: ");
        lblcedula.setText(" Cédula: " + bundle.getString("CEDULA"));
        lblnombres.setText(" Nombres: " + bundle.getString("NOMBRES"));
        lblfechanaci.setText(" Fecha de Nacimiento: " + bundle.getString("FechaNac"));
        lblciudad.setText(" Ciudad: " + bundle.getString("CIUDAD"));
        lblgenero.setText(" Género: " + bundle.getString("MASCULINO"));
        lblcorreo.setText(" Correo: " + bundle.getString("CORREO"));
        lbltelefono.setText(" Teléfono: " + bundle.getString("TELEFONO"));
    }


}