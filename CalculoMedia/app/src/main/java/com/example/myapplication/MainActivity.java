package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNome, edtDisciplina, edtNota1, edtNota2, edtMedia, edtFaltas, edtStatus;
    Button btnCalculaMeia, btnLimpaDados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R é arquivo de recurso
        setContentView(R.layout.activity_main);  // R é um arquivo interno do andoid, um R.java

        // SetContentView é o método que inicia o XML
        // Posso ter um Java e vários XML...

        // Linkar o Widget Java com o XML
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtDisciplina = (EditText) findViewById(R.id.edtDisciplina);
        edtNota1 = (EditText) findViewById(R.id.edtNota1);
        edtNota2 = (EditText) findViewById(R.id.edtNota2);
        edtMedia = (EditText) findViewById(R.id.edtMedia);
        edtFaltas = (EditText) findViewById(R.id.edtFaltas);
        edtStatus = (EditText) findViewById(R.id.edtStatus);

        btnCalculaMeia = (Button) findViewById(R.id.btnCalculaMeia);
        btnLimpaDados = (Button) findViewById(R.id.btnLimpaDados);

        btnLimpaDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNome.setText("");
                edtDisciplina.setText("");
                edtNota1.setText("");
                edtNota2.setText("");
                edtMedia.setText("");
                edtFaltas.setText("");
                edtStatus.setText("");
            }
        });

        btnCalculaMeia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                try {
                    float N1 = Float.parseFloat(edtNota1.getText().toString());
                    float N2 = Float.parseFloat (edtNota2.getText().toString());
                    float faltas = Float.parseFloat(edtFaltas.getText().toString());
                    float resultado = (N1+N2) / 2;

                    edtMedia.setText(String.valueOf(resultado) );

                    if (faltas > 20){
                        edtStatus.setText("Reprovado por faltas");
                    } else {
                        if (resultado > 6){
                            edtStatus.setText("Aprovado!");
                        } else {
                            edtStatus.setText("Reprovado por Nota baixa");
                        }
                    }

                } catch(Exception ex) {
                    edtStatus.setText("Digite valores válidos"  );
                }
            }
        });
    }

    //MINUTO 20:50=> https://www.youtube.com/watch?v=P0ASoN0YksE
}
