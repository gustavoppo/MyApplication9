package com.example.gusta.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuartaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta_tela);
        Bundle extras = getIntent().getExtras();
        final int liga = extras.getInt("liga");
        final int lane = extras.getInt("lane");
        final RadioGroup check = (RadioGroup) findViewById(R.id.radioGroup3);
        Button entrar = (Button) findViewById(R.id.next);
        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int selected = check.getCheckedRadioButtonId();
                if (selected != -1) {

                    Intent entrar = new Intent(QuartaTela.this, QuintaTela.class);
                    entrar.putExtra("lanesecundaria", selected);
                    entrar.putExtra("liga", liga);
                    entrar.putExtra("lane", lane);
                    startActivity(entrar);
                } else {
                    Toast.makeText(getApplicationContext(), "Selecione um lane", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}