package com.example.gusta.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Button entrar = (Button) findViewById(R.id.next);
        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }

        });
    }

}