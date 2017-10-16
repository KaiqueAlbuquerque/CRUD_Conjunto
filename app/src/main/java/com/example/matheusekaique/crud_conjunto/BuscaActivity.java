package com.example.matheusekaique.crud_conjunto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BuscaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);
    }

    public void busca(View v)
    {
        EditText busca = (EditText) findViewById(R.id.edtBusca);
        String buscaText = busca.getEditableText().toString();

        Intent intent = new Intent(this, RetornoBuscaActivity.class);
        intent.putExtra("termo", buscaText);
        startActivity(intent);
    }
}
