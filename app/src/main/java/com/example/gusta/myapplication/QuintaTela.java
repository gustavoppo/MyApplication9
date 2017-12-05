package com.example.gusta.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        int teste = R.id.bronze;


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

        /*
         * cogigo para a lane principal
         */

        Bundle lanes = getIntent().getExtras();

        TextView textlane = (TextView) findViewById(R.id.textView15);
        ImageView lanepric = (ImageView) findViewById(R.id.imageView23);


        int lane = lanes.getInt("lane");
        int teste1 = R.id.radiotop;

        if (lane == R.id.radiotop) {
            lanepric.setImageResource(R.drawable.top);
            textlane.setText("Top");

        } else if (lane == R.id.radiojg)

        {
            lanepric.setImageResource(R.drawable.jg);
            textlane.setText("Caçador");

        } else if (lane == R.id.radiomid) {
            lanepric.setImageResource(R.drawable.mid);
            textlane.setText("Meio");

        } else if (lane == R.id.radioadc) {
            lanepric.setImageResource(R.drawable.bot);
            textlane.setText("Atirador");

        } else if (lane == R.id.radiosup) {

            lanepric.setImageResource(R.drawable.sop);
            textlane.setText("Suporte");
        }

        /*
         * cogigo para a lane secundaria
         */

        Bundle lanese = getIntent().getExtras();

        TextView textlanes = (TextView) findViewById(R.id.textView16);
        ImageView lanesec = (ImageView) findViewById(R.id.imageView24);

        int lanesecundaria = lanese.getInt("lanesecundaria");
        int teste2 = R.id.radiotop;

        if (lanesecundaria == R.id.top1) {
            lanesec.setImageResource(R.drawable.top);
            textlanes.setText("Top");

        } else if (lanesecundaria == R.id.jg1)

        {
            lanepric.setImageResource(R.drawable.jg);
            textlanes.setText("Caçador");

        } else if (lanesecundaria == R.id.mid1) {
            lanesec.setImageResource(R.drawable.mid);
            textlanes.setText("Meio");

        } else if (lanesecundaria == R.id.adc1) {
            lanesec.setImageResource(R.drawable.bot);
            textlanes.setText("Atirador");

        } else if (lanesecundaria == R.id.sup1) {

            lanesec.setImageResource(R.drawable.sop);
            textlanes.setText("Suporte");
        }

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent entrar = new Intent(QuintaTela.this, SextaTela.class);
                startActivity(entrar);
            }
        });
    }

    public void sair (View c) {

        Intent volt = new Intent(QuintaTela.this, MainActivity.class);
        startActivity(volt);
    }

    public void editar(View v) {

        Intent edit = new Intent(QuintaTela.this, SegundaTela.class);
        startActivity(edit);
    }

}

