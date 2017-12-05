package com.example.gusta.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class TerceiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        Button entrar = (Button) findViewById(R.id.next);
        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent entrar = new Intent(TerceiraTela.this, QuartaTela.class);
                startActivity(entrar);
            }

        });
    }

}