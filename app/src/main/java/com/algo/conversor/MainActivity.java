package com.algo.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button MillasKms,KmsMillas,CFarenheit,FarenheitC;
    EditText entrada,salida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MillasKms=findViewById(R.id.MillasKms);
        KmsMillas=findViewById(R.id.KmsMillas);
        CFarenheit=findViewById(R.id.CFarenheit);
        FarenheitC=findViewById(R.id.FarenheitC);
        entrada=findViewById(R.id.entrada);
        salida=findViewById(R.id.salida);

        MillasKms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Conversiones conversiones=new Conversiones();
                salida.setText(conversiones.MillasKms(entrada.getText().toString()));
            }
        });
        KmsMillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Conversiones conversiones=new Conversiones();
                salida.setText(conversiones.KmsMillas(entrada.getText().toString()));
            }
        });
        CFarenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Conversiones conversiones=new Conversiones();
                salida.setText(conversiones.CFarenheit(entrada.getText().toString()));
            }
        });
        FarenheitC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Conversiones conversiones=new Conversiones();
                salida.setText(conversiones.FarenheitC(entrada.getText().toString()));
            }
        });
    }
}