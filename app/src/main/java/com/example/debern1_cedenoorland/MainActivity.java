package com.example.debern1_cedenoorland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CargaComponentes()
    {

    }
    public void btnEnviar(View view){
        EditText txtcedula = (EditText)findViewById(R.id.txtCedula);
        EditText txtnombres = (EditText)findViewById(R.id.txtNombre);
        EditText txtfecha = (EditText)findViewById(R.id.txtFechaNac);
        EditText txtciudad = (EditText)findViewById(R.id.txtCiudad);
        RadioButton rbmasculino = (RadioButton) findViewById(R.id.rbMasculino);
        RadioButton rbfemenino = (RadioButton)findViewById(R.id.rbFemenino);
        EditText txtcorreo = (EditText)findViewById(R.id.txtCorreo);
        EditText txttelefono = (EditText)findViewById(R.id.txtTelefono);
        Intent intent = new Intent(MainActivity.this, DatosRegistrados.class);

        Bundle bndl = new Bundle();
        bndl.putString("CEDULA",txtcedula .getText().toString());
        bndl.putString("NOMBRES", txtnombres.getText().toString());
        bndl.putString("FechaNac", txtfecha.getText().toString());
        bndl.putString("CIUDAD", txtciudad.getText().toString());
        bndl.putString("MASCULINO", rbmasculino.getText().toString());
        //bndl.putString("FEMENINO", rbmasculino.getText().toString());
        bndl.putString("CORREO", txtcorreo.getText().toString());
        bndl.putString("TELEFONO", txttelefono.getText().toString());

        intent.putExtras(bndl);

        startActivity(intent);
    }
    public void Limpieza(View v) {
        EditText txtcedula = (EditText)findViewById(R.id.txtCedula);
        EditText txtnombres = (EditText)findViewById(R.id.txtNombre);
        EditText txtfecha = (EditText)findViewById(R.id.txtFechaNac);
        EditText txtciudad = (EditText)findViewById(R.id.txtCiudad);
        RadioButton rbmasculino = (RadioButton) findViewById(R.id.rbMasculino);
        RadioButton rbfemenino = (RadioButton)findViewById(R.id.rbFemenino);
        EditText txtcorreo = (EditText)findViewById(R.id.txtCorreo);
        EditText txttelefono = (EditText)findViewById(R.id.txtTelefono);

        txtcedula.setText("");
        txtnombres.setText("");
        txtfecha.setText("");
        txtciudad.setText("");
        txtcorreo.setText("");
        txttelefono.setText("");
    }
}