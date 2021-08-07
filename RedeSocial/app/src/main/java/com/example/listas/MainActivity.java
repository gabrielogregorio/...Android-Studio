package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lstContatos;
    private AdapterListView adapterListView;
    private ArrayList<itemListView> Itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstContatos = (ListView) findViewById(R.id.lstContatos);
        lstContatos.setOnItemClickListener(this);

        criarLista();
    }

    public void criarLista(){
        Itens = new ArrayList<itemListView>();

        itemListView item1 = new itemListView(
                R.drawable.homelander,
                "HomeLander",
                "O Super heroi mais poderoso do planeta terra, que defende os nossos interesses e nos protege dos vilões deste mundo",
                "4.500",
                "6.192",
                "Vocês que são os herois!!!!!");


        itemListView item2 = new itemListView(
                R.drawable.tempesta,
                "StormFront",
                "A nova integrante dos 7, ela veio para nos trazer a liberdade e nos ajudar na ameaca terrorista. 'Nossas ações exigem cuidado para proteger as pessoas de bem e prendermos os terroristas'",
                "7",
                "8.231",
                "Chupa aqui oh!"
        );

        itemListView item3 = new itemListView(R.drawable.pity,
                "pity",
                "Invadi essa porcaria de sistema para provar que vocês são uns bostas pra cacete, seus lixos corruptos!",
                "12",
                "2.432",
                "Vocês deveriams cuidar das suas vidas ao invés de ficar babando ovo desses supers FDP");

        itemListView item4 = new itemListView(R.drawable.star,
                "StarLight",
                "A Luz Estrela mais conhecida como StarLight tem poderes de controle de luz e eletricidade para iluminar nossos caminhos.",
                "4.900",
                "3.900",
                "Hoje está um lindo dia!"
                );

        itemListView item5 = new itemListView(R.drawable.kimico,
                "Kimico",
                "A terrorista do mal que mata pessoas e ameaça nosso interesses e nossa nação. Se você a ve-la, chame-nos com urgência!",
                "0",
                "1",
                ""
                );

        itemListView item6 = new itemListView(R.drawable.toby,
                "Peter Parker",
                "Peter Parker, o novo heroi do 7 que veio de outro universo diretamente para nos ajudar a proteger a nação",
                "29",
                "1.902",
                "Eu sou o homem Aranha!");

        Itens.add(item1);
        Itens.add(item2);
        Itens.add(item3);
        Itens.add(item4);
        Itens.add(item5);
        Itens.add(item6);

        adapterListView = new AdapterListView(this, Itens);
        lstContatos.setAdapter(adapterListView);;
        lstContatos.setCacheColorHint(Color.TRANSPARENT);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view,int i, long l){
        itemListView item = adapterListView.getItem(i);

        Intent intent = new Intent(MainActivity.this, Perfil.class);

        String strNome = item.getNome().toString();
        String strDescricao = item.getDescricao().toString();
        String strFrase = item.getFrase().toString();
        String strSeguidores = item.getSeguidores().toString();
        String strSeguindo = item.getSeguindo().toString();

        Bundle bundle = new Bundle();

        bundle.putString("strNome", strNome);
        bundle.putString("strDescricao", strDescricao);
        bundle.putString("strFrase", strFrase);
        bundle.putString("strSeguidores", strSeguidores);
        bundle.putString("strSeguindo", strSeguindo);

        intent.putExtra("imagemFoto", item.getFoto());
        intent.putExtras(bundle);
        startActivity(intent);

        }
}


