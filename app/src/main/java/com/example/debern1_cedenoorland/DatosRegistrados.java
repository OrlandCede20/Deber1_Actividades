package com.example.debern1_cedenoorland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ResourceBundle;

public class DatosRegistrados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_registrados);

        TextView lbltitulo = (TextView) findViewById(R.id.lblTitulo2);
        TextView lblcedula = (TextView) findViewById(R.id.lblCedula3);
        TextView lblnombres = (TextView) findViewById(R.id.lblNombres);
        TextView lblfechanaci = (TextView) findViewById(R.id.lblFechaNaci);
        TextView lblciudad = (TextView) findViewById(R.id.lblCiudad2);
        TextView lblgenero = (TextView) findViewById(R.id.lblGenero2);
        TextView lblcorreo = (TextView) findViewById(R.id.lblCorreo2);
        TextView lbltelefono = (TextView) findViewById(R.id.lblTelefono);

        Bundle bundle = this.getIntent().getExtras();

        lbltitulo.setText(" Hola! sus datos ingresados son:");
        lblcedula.setText(" Cédula: " + bundle.getString("CEDULA"));
        lblnombres.setText(" Nombres: " + bundle.getString("NOMBRES"));
        lblfechanaci.setText(" Fecha de Nacimiento: " + bundle.getString("FechaNac"));
        lblciudad.setText(" Ciudad: " + bundle.getString("CIUDAD"));
        lblgenero.setText(" Género: " + bundle.getString("MASCULINO"));
        //lblcorreo.setText(" Género \n " + bundle.getString("FEMENINO"));
        lblcorreo.setText(" Correo: " + bundle.getString("CORREO"));
        lbltelefono.setText(" Teléfono: " + bundle.getString("TELEFONO"));
    }


}