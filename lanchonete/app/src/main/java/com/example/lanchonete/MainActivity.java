package com.example.lanchonete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtCoca, edtFanta, edtSuco;
    CheckBox chkCoca, chkFanta, chkSuco;
    RadioButton rdMaiorIdade, rdMenorIdade;
    TextView txtResultado, txValorCoca ,txValorFanta ,txValorSuco;
    Button btnCalcular, btnLimpar;

    private float validaDados(EditText quantidade, float preco) {
        try{
            return Float.parseFloat(quantidade.getText().toString()) * preco;
        } catch(Exception e) {
            return -1;
        }
    }

    public float calculaPreco(CheckBox chk, EditText edt, float preco){
        if (chk.isChecked()){
            float teste = validaDados(edt, preco);
            if (teste == -1) {
                txtResultado.setText("Existem campos inválidos");
                return -1;
            }
            return teste;
        }
        return  0;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCoca = (EditText) findViewById(R.id.edtCoca);
        edtFanta = (EditText) findViewById(R.id.edtFanta);
        edtSuco = (EditText) findViewById(R.id.edtSuco);

        chkCoca = (CheckBox) findViewById(R.id.chkCoca);
        chkFanta = (CheckBox) findViewById(R.id.chkFanta);
        chkSuco = (CheckBox) findViewById(R.id.chkSuco);

        rdMaiorIdade = (RadioButton) findViewById(R.id.rdMaiorIdade);
        rdMenorIdade = (RadioButton) findViewById(R.id.rdMenorIdade);

        txtResultado = (TextView) findViewById(R.id.txtResultado);
        txValorCoca = (TextView) findViewById(R.id.txValorCoca);
        txValorFanta = (TextView) findViewById(R.id.txValorFanta);
        txValorSuco = (TextView) findViewById(R.id.txValorSuco);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);

        rdMaiorIdade.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                rdMenorIdade.setChecked(false);
            }
        });

        rdMenorIdade.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                rdMaiorIdade.setChecked(false);
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtCoca.setText("");
                edtFanta.setText("");
                edtSuco.setText("");
                txtResultado.setText("");
                rdMaiorIdade.setChecked(false);
                rdMenorIdade.setChecked(false);
                chkCoca.setChecked(false);
                chkFanta.setChecked(false);
                chkSuco.setChecked(false);
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (rdMenorIdade.isChecked()) {
                    txtResultado.setText("Você não tem poder aqui jovem. Va assistir picapau!");
                } else {
                    if (rdMaiorIdade.isChecked()) {

                        float totalCompra = 0;
                        float teste = 0;

                        while (true){

                            teste = calculaPreco(chkFanta, edtFanta, Float.parseFloat(txValorFanta.getText().toString()));
                            if (teste == -1) break;
                            totalCompra = totalCompra + teste;

                            teste = calculaPreco(chkSuco, edtSuco, Float.parseFloat(txValorSuco.getText().toString()));
                            if (teste == -1) break;
                            totalCompra = totalCompra + teste;

                            teste = calculaPreco(chkCoca, edtCoca, Float.parseFloat(txValorCoca.getText().toString()));
                            if (teste == -1) break;
                            totalCompra = totalCompra + teste;

                            txtResultado.setText("O preco dessa brincadeira é R$: " + totalCompra );
                            break;
                        }

                    } else {
                        txtResultado.setText("Você precisa dizer se é maior de idade ou não!");
                    }
                }
            }
        });
    }
}