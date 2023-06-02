package com.example.gorgeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Valores extends AppCompatActivity {

    TextView gorgetaPessoa, valorTotal, valorPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores);

        iniciarComponentes();

        float contaValor = TelaInicial.valorTotalConta;
        float gorgetaPorPessoa = TelaInicial.gorgetaPessoa;
        float pessoaValor = TelaInicial.qtdPagaPessoa;

         valorTotal.setText(Float.toString(contaValor));

         gorgetaPessoa.setText(Float.toString(gorgetaPorPessoa));

         valorPessoa.setText(Float.toString(pessoaValor));
    }

    private void iniciarComponentes() {

        gorgetaPessoa = (TextView) findViewById(R.id.gorgetaPessoa);
        valorTotal = (TextView) findViewById(R.id.valorTotal);
        valorPessoa = (TextView) findViewById(R.id.valorPessoa);
    }
}