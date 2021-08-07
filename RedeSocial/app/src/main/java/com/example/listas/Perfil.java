package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {

    ImageView imgFoto;
    TextView txtNome, txtSeguindo, txtSeguidores, txtPost1;
    Button btnSeguir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        imgFoto = (ImageView) findViewById(R.id.imgFoto);
        txtNome = (TextView) findViewById(R.id.txtNome);
        btnSeguir = (Button) findViewById(R.id.btnSeguir);
        txtSeguindo = (TextView) findViewById(R.id.txtSeguindo);
        txtSeguidores = (TextView) findViewById(R.id.txtSeguidores);
        txtPost1 = (TextView) findViewById(R.id.txtPost1);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String strNome = bundle.getString("strNome");
        String strDescricao = bundle.getString("strDescricao");
        String strFrase = bundle.getString("strFrase");

        String strSeguidores = bundle.getString("strSeguidores");
        String strSeguindo = bundle.getString("strSeguindo");
        int res = bundle.getInt("imagemFoto");

        txtSeguindo.setText(strSeguindo);
        txtSeguidores.setText(strSeguidores);
        txtPost1.setText(strFrase);

        imgFoto.setImageResource(res);
        txtNome.setText(strNome);
    }
}