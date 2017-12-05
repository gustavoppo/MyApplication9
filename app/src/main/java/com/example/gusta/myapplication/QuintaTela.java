package com.example.gusta.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuintaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta_tela);
        Button entrar = (Button) findViewById(R.id.next);
        Bundle extras = getIntent().getExtras();
        TextView textliga = (TextView) findViewById(R.id.textView13);
        ImageView league = (ImageView) findViewById(R.id.imageView22);
        int liga = extras.getInt("liga");
        int lane = extras.getInt("lane");
        int teste = R.id.bronze;
        int lanesecundaria = extras.getInt("lanesecundaria");

        if (liga == R.id.bronze) {
            league.setImageResource(R.drawable.bronze);
            textliga.setText("Bronze");

        } else if (liga == R.id.prata) {
            league.setImageResource(R.drawable.silver);
            textliga.setText("Prata");

        } else if (liga == R.id.ouro) {
            league.setImageResource(R.drawable.gold);
            textliga.setText("Ouro");

        } else if (liga == R.id.platina) {
            league.setImageResource(R.drawable.platinum);
            textliga.setText("Platina");

        } else if (liga == R.id.diamante) {
            league.setImageResource(R.drawable.diamond);
            textliga.setText("Diamante");

        } else if (liga == R.id.mestre) {
            league.setImageResource(R.drawable.mestre);
            textliga.setText("Mestre");

        } else if (liga == R.id.desafiante) {
            league.setImageResource(R.drawable.desafiante);
            textliga.setText("Desafiante");

        }

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent entrar = new Intent(QuintaTela.this, SextaTela.class);
                startActivity(entrar);
            }
        });
    }
}