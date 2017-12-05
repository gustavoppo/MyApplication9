package com.example.gusta.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;


public class TerceiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        Button tNext = (Button) findViewById(R.id.next);
        Bundle extras = getIntent().getExtras();
        final int liga = extras.getInt("liga");
        tNext.setOnClickListener(new View.OnClickListener() {
            final RadioGroup check = (RadioGroup) findViewById(R.id.radioGroup2);

            @Override
            public void onClick(View v) {
                int selected = check.getCheckedRadioButtonId();
                if (selected != -1) {

                    Intent entrar = new Intent(TerceiraTela.this, QuartaTela.class);
                    entrar.putExtra("lane", selected);
                    entrar.putExtra("liga", liga);
                    startActivity(entrar);
                } else {
                    Toast.makeText(getApplicationContext(), "Selecione um lane", Toast.LENGTH_SHORT).show();
                }

            }

        });
    }

}