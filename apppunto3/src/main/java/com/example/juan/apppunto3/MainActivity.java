package com.example.juan.apppunto3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tResultado, tNumero;
    String data="",opr="",datax="";
    private double Rresultado = 0, Roperando = 0, Raux = 0;
    private int contador = 3,RST=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tNumero = findViewById(R.id.tNumero);
        tResultado = findViewById(R.id.tResultado);
    }

    public void guardar(View view) {                                //Otra forma
        int id = view.getId();
        if ((RST==1)){
            Rresultado = 0;
            Roperando = 0;
            Raux = 0;
            contador = 3;
            data = "";
            datax = "";
            opr = "";
            tNumero.setText("0");
            tResultado.setText("0");
            RST = 0;
        }
        if (id == R.id.bNumeroAC){
            Rresultado = 0;
            Roperando = 0;
            Raux = 0;
            contador = 3;
            data = "";
            datax = "";
            opr = "";
            tNumero.setText("0.0");
            tResultado.setText("0.0");
            RST = 0;
        }   else if (id == R.id.bNumerodiv) {
            if (contador==0){
                Raux = Raux / Roperando;
            } else if (contador==1){
                Raux = Roperando * Raux;
            } else if (contador==2){
                Raux = Raux-Roperando;
            } else if (contador==3){
                Raux = Roperando + Raux;
            }
/*            if (!(Raux == 0)) {
                Rresultado = Roperando / Raux;
                Raux = Rresultado;
            }*/
            contador = 0;
            data = Double.toString(Rresultado);
            datax=datax+Double.toString(Roperando)+"/";
            Roperando=0;
            tNumero.setText(datax);
            tResultado.setText(data);
        } else if (id == R.id.bNumeromult) {
            if (contador==0){
                Raux = Raux / Roperando;
            } else if (contador==1){
                Raux = Roperando * Raux;
            } else if (contador==2){
                Raux = Raux-Roperando;
            } else if (contador==3){
                Raux = Roperando + Raux;
            }
//            Rresultado = Roperando * Raux;
            contador = 1;
            data = Double.toString(Raux);
            datax=datax+Double.toString(Roperando)+"*";
            Roperando=0;
            tNumero.setText(datax);
            tResultado.setText(data);
        } else if (id == R.id.bNumeromenos) {
            if (contador==0){
                Raux = Raux / Roperando;
            } else if (contador==1){
                Raux = Roperando * Raux;
            } else if (contador==2){
                Raux = Raux-Roperando;
            } else if (contador==3){
                Raux = Roperando + Raux;
            }
//            Rresultado = Roperando - Raux;
            contador = 2;
            data = Double.toString(Raux);
            datax=datax+Double.toString(Roperando)+"-";
            Roperando=0;
            tNumero.setText(datax);
            tResultado.setText(data);
        } else if (id == R.id.bNumeromas) {
            if (contador==0){
                Raux = Raux / Roperando;
            } else if (contador==1){
                Raux = Roperando * Raux;
            } else if (contador==2){
                Raux = Raux-Roperando;
            } else if (contador==3){
                Raux = Roperando + Raux;
            }
//            Rresultado = Roperando + Raux;
            contador = 3;
            data = Double.toString(Raux);
            datax=datax+Double.toString(Roperando)+"+";
            Roperando=0;
            tNumero.setText(datax);
            tResultado.setText(data);
        } else if (id == R.id.bNumeroigual) {
            if (contador==0){
                Raux = Raux / Roperando;
            } else if (contador==1){
                Raux = Roperando * Raux;
            } else if (contador==2){
                Raux = Raux-Roperando;
            } else if (contador==3){
                Raux = Roperando + Raux;
            }
            /*Rresultado=R*/
//            contador = 5;
            data = Double.toString(Raux);
            datax=datax+Double.toString(Roperando);
            tNumero.setText(datax);
            tResultado.setText(data);
            RST=1;
        } else if (id == R.id.bNumeropunto) {
            contador = 0;
            data = Double.toString(Rresultado);
            tResultado.setText(data);
        } else if (id == R.id.bNumero0) {
            Roperando = Roperando * 10;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero1) {
            Roperando = Roperando * 10 + 1;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero2) {
            Roperando = Roperando * 10 + 2;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero3) {
            Roperando = Roperando * 10 + 3;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero4) {
            Roperando = Roperando * 10 + 4;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero5) {
            Roperando = Roperando * 10 + 5;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero6) {
            Roperando = Roperando * 10 + 6;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero7) {
            Roperando = Roperando * 10 + 7;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero8) {
            Roperando = Roperando * 10 + 8;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        } else if (id == R.id.bNumero9) {
            Roperando = Roperando * 10 + 9;
            data=Double.toString(Roperando);
            tNumero.setText(data);
        }
    }
}