package com.algo.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Declaro variables
     */
    Button MillasKms,KmsMillas,CFarenheit,FarenheitC;
    EditText entrada;
    TextView salida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Pongo a las variables lo que les corresponde
         */
        MillasKms=findViewById(R.id.MillasKms);
        KmsMillas=findViewById(R.id.KmsMillas);
        CFarenheit=findViewById(R.id.CFarenheit);
        FarenheitC=findViewById(R.id.FarenheitC);
        entrada=findViewById(R.id.entrada);
        salida=findViewById(R.id.salida);

        /**
         * Metodo que convierte millas en kms
         */
        MillasKms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Conversiones conversiones=new Conversiones();
                salida.setText(conversiones.MillasKms(entrada.getText().toString()));
            }
        });
        /**
         * Metodo que convierte kms en millas
         */
        KmsMillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Conversiones conversiones=new Conversiones();
                salida.setText(conversiones.KmsMillas(entrada.getText().toString()));
            }
        });
        /**
         * Metodo que convierte celsius en farenheit
         */
        CFarenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Conversiones conversiones=new Conversiones();
                salida.setText(conversiones.CFarenheit(entrada.getText().toString()));
            }
        });
        /**
         * Metodo que convierte Farenheit en celsius
         */
        FarenheitC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Conversiones conversiones=new Conversiones();
                salida.setText(conversiones.FarenheitC(entrada.getText().toString()));
            }
        });
    }
}