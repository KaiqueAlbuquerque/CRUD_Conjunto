package com.example.matheusekaique.crud_conjunto;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RetornoBuscaActivity extends AppCompatActivity {

    public List<Conjunto> conjuntos = new ArrayList();
    private ListView listViewConjuntos;

    public void inicializaConjuntos() {//int andar, double tamanho, int salas, double valor, String observacao, int situacao
        conjuntos = new ArrayList<>();
        conjuntos.add(new Conjunto(1, 2.5, 5, 4850.2, "Disponível", 1));
        conjuntos.add(new Conjunto(2, 12.5, 12, 8250.2, "Disponível", 1));
        conjuntos.add(new Conjunto(3, 3.5, 2, 750.2, "Disponível", 1));
        conjuntos.add(new Conjunto(4, 5.5, 3, 9650.2, "Em Reforma", 0));
        conjuntos.add(new Conjunto(5, 7.5, 6, 750.2, "Alugada", 0));
        conjuntos.add(new Conjunto(6, 2.8, 9, 4250.2, "Alugada", 0));
        conjuntos.add(new Conjunto(7, 9.5, 7, 2150.2, "Alugada", 0));
        conjuntos.add(new Conjunto(8, 22.5, 8, 2850.2, "Não pode ser alugada", 0));
        conjuntos.add(new Conjunto(9, 7.5, 20, 2540.2, "Disponível", 1));
        conjuntos.add(new Conjunto(10, 72.5, 30, 2050.2, "Disponível", 1));
        conjuntos.add(new Conjunto(11, 2.5, 5, 4850.2, "Disponível", 1));
        conjuntos.add(new Conjunto(12, 12.5, 12, 8250.2, "Disponível", 1));
        conjuntos.add(new Conjunto(13, 3.5, 2, 750.2, "Disponível", 1));
        conjuntos.add(new Conjunto(14, 5.5, 3, 9650.2, "Em Reforma", 0));
        conjuntos.add(new Conjunto(15, 7.5, 6, 750.2, "Alugada", 0));
        conjuntos.add(new Conjunto(16, 2.8, 9, 4250.2, "Alugada", 0));
        conjuntos.add(new Conjunto(17, 9.5, 7, 2150.2, "Alugada", 0));
        conjuntos.add(new Conjunto(18, 22.5, 8, 2850.2, "Não pode ser alugada", 0));
        conjuntos.add(new Conjunto(19, 7.5, 20, 2540.2, "Disponível", 1));
        conjuntos.add(new Conjunto(20, 72.5, 30, 2050.2, "Disponível", 1));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retorno_busca);

        listViewConjuntos = (ListView) findViewById(R.id.listViewConjuntos);
        inicializaConjuntos();

        Intent origem = getIntent();
        String busca = origem.getStringExtra("termo");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, realizaBusca(busca));

        listViewConjuntos.setAdapter(adapter);
        listViewConjuntos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(RetornoBuscaActivity.this, DetalhesActivity.class);

                Conjunto item = getConjunto(listViewConjuntos.getItemAtPosition(position).toString());

                intent.putExtra("andar", String.valueOf(item.getAndar()));
                intent.putExtra("tamanho", String.valueOf(item.getTamanho()));
                intent.putExtra("salas", String.valueOf(item.getSalas()));
                intent.putExtra("valor", String.valueOf(item.getValor()));
                intent.putExtra("observacao", item.getObservacao());
                intent.putExtra("situacao", String.valueOf(item.getSituacao()));
                startActivity(intent);
            }
        });
    }

    public List<String> realizaBusca(String busca) {
        List<String> retorno = new ArrayList<>();

        for (Conjunto item : conjuntos) {
            if (busca.isEmpty()) {
                retorno.add("Andar " + item.getAndar());
            } else {
                if (String.valueOf(item.getAndar()).contains(busca)) {
                    retorno.add("Andar " + item.getAndar());
                }
            }
        }

        return retorno;
    }

    public Conjunto getConjunto(String busca) {
        busca = busca.replace("Andar ", "");

        for (Conjunto item : conjuntos) {
            if (String.valueOf(item.getAndar()).equals(busca)) {
                return item;
            }
        }
        return new Conjunto();
    }
}
