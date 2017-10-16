package com.example.matheusekaique.crud_conjunto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void fazLogin(View v)
    {
        EditText usuario = (EditText) findViewById(R.id.edtUsuario);
        EditText senha = (EditText) findViewById(R.id.edtSenha);

        String usuarioText = usuario.getEditableText().toString();
        String senhaText = senha.getEditableText().toString();

        if(usuarioText.isEmpty())
        {
            usuario.setError("Campo usuário não pode ser vazio");
            return;
        }

        if(senhaText.isEmpty())
        {
            senha.setError("Campo senha não pode ser vazio");
            return;
        }

        if(usuarioText.equals("usuario") && senhaText.equals("senha123"))
        {
            Toast.makeText(this, "Seja Bem-vindo", Toast.LENGTH_LONG).show();
            Intent busca = new Intent(this,BuscaActivity.class);
            startActivity(busca);
        }else
        {
            Toast.makeText(this, "Login inválido. Utilize o Login de teste:\n\n Usuário= usuario\nSenha= senha123 ", Toast.LENGTH_LONG).show();
        }

    }
}
