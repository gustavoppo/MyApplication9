package com.example.gusta.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuintaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta_tela);
        Button entrar = (Button) findViewById(R.id.entrar);


        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent entrar = new Intent(QuintaTela.this,SextaTela.class);
                startActivity(entrar);
            }
        });
    }
}
