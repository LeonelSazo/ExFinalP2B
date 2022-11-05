package com.example.exfinalp2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText Id_Juador2 = frindViewById(R.editTextTextMultiLine);
        editText Jugador2 = frindViewById(R.editTextTextMultiLine2);
        editTextTextMultiLine Partidos2 = frindViewById(R.editTextTextMultiLine3);
        editTextTextMultiLine Goles2 = frindViewById(R.editTextTextMultiLine4);

        String IdJugador2 = Id_Juador2.getText().toString();
        tring Jugador_2 = Juador2.getText().toString();
        int partidos2 = Integer.ParseInt(Partidos2);
        int goles2 = Integer.ParseInt(Goles2);


        Button Button1 = frindViewById(R.id.Button1);
        Button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                crear();
            }

            Button Button2 = frindViewById(R.id.Button2);
        Button1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Actualizar();
                }

        });
    }
}