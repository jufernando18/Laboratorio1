package com.example.juan.apppunto2;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText eNombre,ePassword,ePassword2,eCorreo;
    TextView tFecha,tInformacion;
    String ciudad="",pasatiempo="",sexo="",fnacimiento="",nombre="",correo="",contrasena="",contrasena2="",p1="",p2="",p3="",p4="";
    CheckBox cLeer,cNadar,cComer,cBailar;
    Spinner opciones;
    private int dia,mes,ano,error,entrada=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  //      eFecha=findViewById(R.id.eFecha);
        tFecha=findViewById(R.id.tFecha);
        tInformacion=findViewById(R.id.tInformacion);
        cNadar=findViewById(R.id.cNadar);
        cBailar=findViewById(R.id.cBailar);
        cComer=findViewById(R.id.cComer);
        cLeer=findViewById(R.id.cLeer);
        opciones=findViewById(R.id.sp01);
        eNombre=findViewById(R.id.eNombre);
        ePassword=findViewById(R.id.ePassword);
        ePassword2=findViewById(R.id.ePassword2);
        eCorreo=findViewById(R.id.eCorreo);

        opciones.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.opciones,android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);
    }



    public void onRadioButtonClicked(View view) {
        int id= view.getId();
        if (id==R.id.rFemenino){
            sexo= "Femenino";
        } else if (id==R.id.rMasculino){
            sexo= "Masculino";
        }
    }

    public void guardar(View view) {
        int id=view.getId();
        if (id==R.id.bFecha){
            final Calendar c= Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    fnacimiento=year+"/"+(month+1)+"/"+dayOfMonth;
                    tFecha.setText(fnacimiento);
                }
            }
                                                                    ,dia,mes,ano);
            datePickerDialog.show();
        } else if (id==R.id.bAceptar){
            nombre=eNombre.getText().toString();

            contrasena=ePassword.getText().toString();
            contrasena2=ePassword2.getText().toString();
            correo=eCorreo.getText().toString();
            error=0;
            if (nombre.equals("")) {
               // eNombre.setError("ingrese el nombre");
                error=1;
            }

            if (contrasena.equals("")) {
                //ePassword.setError("ingrese la contraseña");
                error=1;
            }
            if (contrasena2.equals("")) {
                //ePassword2.setError("confirme su contraseña");
                error=1;
            }
            if (correo.equals("")) {
                //eCorreo.setError("ingrese el correo");
                error=1;
            }
            if (sexo.equals("")){
                error=1;
            }
            if (fnacimiento.equals("")){
                error=1;
            }
            if (ciudad.equals("")){
                error=1;
            }
            if (pasatiempo.equals("")){
               // cComer.setError("seleccione un pasatiempos");
            }
            if (error==0) {
                if (contrasena.equals(contrasena2)) {
                    tInformacion.setText("nombre: " + nombre + "\n" + "contraseña: " + contrasena + "\n" + "correo: " + correo + "\n" + "sexo: " + sexo + "\n" + "fecha de nacimiento: " + fnacimiento + "\n" + "ciudad de nacimiento: " + ciudad + "\n" + "hobbies: " + pasatiempo);
                }else {
                    tInformacion.setText("las contraseñas no coinciden");
                }
            }{
                if (error==1){
                    tInformacion.setText("faltan campos por ingresar");
                }
            }
        }

    }



    public void onCheckBoxClicked(View view) {
        int id= view.getId();

        switch (id){
            case R.id.cLeer:
                if (cLeer.isChecked()){
                    p1=" leer";
                } else {
                    p1="";
                }
                break;
            case R.id.cBailar:
                if (cBailar.isChecked()){
                    p2=" bailar";
                } else {
                    p2="";
                }
                break;
            case R.id.cComer:
                if (cComer.isChecked()){
                    p3=" comer";
                } else {
                    p3="";
                }
                break;
            case R.id.cNadar:
                if (cNadar.isChecked()){
                    p4=" nadar";
                } else {
                    p4="";
                }
                break;
            default:

        }
        pasatiempo=p1+p2+p3+p4;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.sp01:
                ciudad=parent.getItemAtPosition(position).toString();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

