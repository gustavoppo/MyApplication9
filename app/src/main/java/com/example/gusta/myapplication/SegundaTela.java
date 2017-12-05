package com.example.gusta.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;


public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        final RadioGroup check = (RadioGroup) findViewById(R.id.elo);
        Button entrar = (Button) findViewById(R.id.next);
        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int selected = check.getCheckedRadioButtonId();
                if (selected != -1) {
                    Intent entrar = new Intent(SegundaTela.this, TerceiraTela.class);
                    entrar.putExtra("liga", selected);
                    startActivity(entrar);
                } else {
                    Toast.makeText(getApplicationContext(), "Selecione uma liga", Toast.LENGTH_SHORT).show();
                }


            }

        });
    }

}
