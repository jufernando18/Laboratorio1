package com.example.juan.apppunto1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eDato;
    TextView sPdato,sPerimetro,sArea,sVolumen;
    String data,opcion;
    double cperimetro,carea,cvolumen,datop;
    Button bGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sPdato= findViewById(R.id.sPdato);
        eDato= findViewById(R.id.eDato);
        sPerimetro= findViewById(R.id.sPerimetro);
        sArea= findViewById(R.id.sArea);
        sVolumen= findViewById(R.id.sVolumen);
        bGuardar= findViewById(R.id.bGuardar);
    }
    public void onRadioButtonClicked(View view) {
        int id= view.getId();
        //Log.d("botton","Guardado");
        if (id==R.id.rCubo){
            data= " Tamaño del lado(m):";
            opcion="a";
        } else if (id==R.id.rCuadrado){
            data= " Tamaño del lado(m):";
            opcion="b";
        } else if (id==R.id.rTriangulo){
            data= " Tamaño del lado(m):";
            opcion="c";
        } else {
            data= " Radio(m):";
            opcion="d";
        }
        sPdato.setText(data);
    }


    public void guardar(View view) {
        int id = view.getId();
        if (id == R.id.bGuardar) {
            datop = Double.parseDouble(eDato.getText().toString());
            if (opcion == "a") {
                sPerimetro.setText("No aplica");
                carea = datop * datop * 4;
                sArea.setText(Double.toString(carea));
                cvolumen = datop * datop * datop;
                sVolumen.setText(Double.toString(cvolumen));
            }else if (opcion=="b"){
                cperimetro=datop*4;
                sPerimetro.setText(Double.toString(cperimetro));
                carea = datop * datop ;
                sArea.setText(Double.toString(carea));
                sVolumen.setText("No aplica");
            }else if (opcion=="c"){
                cperimetro=datop*3;
                sPerimetro.setText(Double.toString(cperimetro));
                carea = Math.sqrt(3)*datop * datop/4 ;
                sArea.setText(Double.toString(carea));
                sVolumen.setText("No aplica");
            }else if (opcion=="d"){
                cperimetro=2*Math.PI*datop;
                sPerimetro.setText(Double.toString(cperimetro));
                carea = Math.PI*datop * datop ;
                sArea.setText(Double.toString(carea));
                sVolumen.setText("No aplica");
            } else {
                sPerimetro.setText("No aplica");
                sArea.setText("No aplica");
                sVolumen.setText("No aplica");
            }
        } else {
            sPerimetro.setText("No aplica");
            sArea.setText("No aplica");
            sVolumen.setText("No aplica");
        }
    }
}
