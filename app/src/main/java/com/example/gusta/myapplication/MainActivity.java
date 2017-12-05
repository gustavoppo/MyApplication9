package com.example.gusta.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);
        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#CDBE70")));

        Button entrar = (Button) findViewById(R.id.entrar);
        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TextView tLogin = (TextView)  findViewById(R.id.tLogin);
                TextView tSenha = (TextView)  findViewById(R.id.tSenha);

                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();


                    if (login.equals("teste")&& senha.equals("123456")){
                    alert("Login realizado com sucesso");

                        Intent entrar = new Intent(MainActivity.this,SegundaTela.class);
                        startActivity(entrar);

               }else{
                    alert("Login ou Senha incorreto");
               }



            }
        });
    }
    private void alert (String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}

