package com.example.gorgeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaInicial extends AppCompatActivity {

    Button btnCalcular;

    EditText valorConta, qtdPessoas, porcentagemGorgeta;

    public static float valorTotalConta, qtdPagaPessoa, gorgetaPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        iniciarComponentes();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e("botão", "pressionado");

              float porcentagem = Float.parseFloat(porcentagemGorgeta.getText().toString());
               float pessoas = Float.parseFloat(qtdPessoas.getText().toString());
              float conta = Float.parseFloat(valorConta.getText().toString());

               valorTotalConta = ((porcentagem/100) * conta) + conta;
               qtdPagaPessoa = valorTotalConta / pessoas;
               gorgetaPessoa = (porcentagem/100 * conta) / pessoas;

                Intent intent = new Intent(TelaInicial.this, Valores.class);
                startActivity(intent);
            }
        });


    }

    private void iniciarComponentes() {
        btnCalcular = findViewById(R.id.btnCalcular);

        valorConta = (EditText) findViewById(R.id.valorConta);

        qtdPessoas = (EditText) findViewById(R.id.qtdPessoas);

        porcentagemGorgeta = (EditText) findViewById(R.id.porcentagemGorgeta);
    }
}