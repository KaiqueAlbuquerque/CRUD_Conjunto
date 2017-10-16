package com.example.matheusekaique.crud_conjunto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetalhesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent origem = getIntent();
        String andar = origem.getStringExtra("andar");
        String tamanho = origem.getStringExtra("tamanho");
        String salas = origem.getStringExtra("salas");
        String valor = origem.getStringExtra("valor");
        String observacao = origem.getStringExtra("observacao");
        String situacao = origem.getStringExtra("situacao");

        TextView txtAndar = (TextView) findViewById(R.id.txtAndar);
        TextView txtTamanho = (TextView) findViewById(R.id.txtTamanho);
        TextView txtSalas = (TextView) findViewById(R.id.txtSalas);
        TextView txtValor = (TextView) findViewById(R.id.txtValor);
        TextView txtObservacao = (TextView) findViewById(R.id.txtObservacao);
        TextView txtSituacao = (TextView) findViewById(R.id.txtSituacao);

        txtAndar.setText(andar);
        txtTamanho.setText(tamanho + "m²");
        txtSalas.setText(salas);
        txtValor.setText("R$" + valor);
        txtObservacao.setText(observacao);
        txtSituacao.setText(situacao.contains("1") ? "Ativo" : "Inativo");
    }
}
