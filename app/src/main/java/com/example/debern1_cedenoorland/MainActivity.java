package com.example.debern1_cedenoorland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    EditText txtcedula,txtnombres,txtfecha,txtciudad,txtcorreo,txttelefono;
    RadioButton rbmasculino,rbfemenino;

    int comprobador=0;

    public void btnEnviar(View view){

        txtcedula = (EditText)findViewById(R.id.txtCedula);
        txtnombres  = (EditText)findViewById(R.id.txtNombre);
        txtfecha = (EditText)findViewById(R.id.txtFechaNac);
        txtciudad = (EditText)findViewById(R.id.txtCiudad);
        rbmasculino = (RadioButton) findViewById(R.id.rbMasculino);
        rbfemenino = (RadioButton)findViewById(R.id.rbFemenino);
        txtcorreo = (EditText)findViewById(R.id.txtCorreo);
        txttelefono = (EditText)findViewById(R.id.txtTelefono);

        //Comprobar la selección del genero para el usuario
        String selecrb = rbmasculino.isChecked()?"MASCULINO":"FEMENINO";

        Intent intent = new Intent(MainActivity.this, DatosRegistrados.class);

        Bundle bndl = new Bundle();
        bndl.putString("CEDULA",txtcedula .getText().toString());
        bndl.putString("NOMBRES", txtnombres.getText().toString());
        bndl.putString("FechaNac", txtfecha.getText().toString());
        bndl.putString("CIUDAD", txtciudad.getText().toString());
        bndl.putString("MASCULINO", selecrb);
        bndl.putString("CORREO", txtcorreo.getText().toString());
        bndl.putString("TELEFONO", txttelefono.getText().toString());


        ValidarVacios();

        intent.putExtras(bndl);
        if (comprobador==1)
        startActivity(intent);
        else
            comprobador=0;
    }
    //Método de limpieza sencillo
    public void Limpieza(View v) {
        txtcedula.setText("");
        txtnombres.setText("");
        txtfecha.setText("");
        txtciudad.setText("");
        txtcorreo.setText("");
        txttelefono.setText("");
        rbmasculino.setChecked(false);
        rbfemenino.setChecked(false);
    }

    //Declaración de variables para cada texts
    public void ValidarVacios()
    {
        String cd = txtcedula.getText().toString(),
                nb=txtnombres.getText().toString(),
                fh=txtfecha.getText().toString(),
                cid=txtciudad.getText().toString(),
                crre=txtcorreo.getText().toString(),
                telf=txttelefono.getText().toString();
        //Condiciónal para verificar el estado vacío de cada text
        if (cd.isEmpty() || nb.isEmpty() || fh.isEmpty() || cid.isEmpty() || crre.isEmpty() || telf.isEmpty())
        {
            txtcedula.setError("El campo está vacío");
            txtnombres.setError("El campo está vacío");
            txtfecha.setError("El campo está vacío");
            txtciudad.setError("El campo está vacío");
            txtcorreo.setError("El campo está vacío");
            txttelefono.setError("El campo está vacío");
            comprobador=0;
        }
        else
        {
            comprobador=1 ;
        }
    }
}