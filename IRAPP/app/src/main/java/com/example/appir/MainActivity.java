package com.example.appir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtSalarioBruto, edtNumeroDependentes;
    Button btnCalcular;
    TextView txtAvisoErro;

    private String NumeroDependentesValido(String txtNumero){
        int numeroTratado = 0;

        try {
            numeroTratado = Integer.parseInt(txtNumero);
        } catch (Exception erro){
            return "O número de dependêntes é inválido!";
        }
        if (numeroTratado < 0){
            return "O número de dependentes não pode ser negativo";
        }
        return "";
    }

    private String NumeroSalarioValido(String txtNumero){
        int numeroTratado = 0;

        try {
            numeroTratado = Integer.parseInt(txtNumero);
        } catch (Exception erro){
            return "O salário informado é inválido!";
        }
        if (numeroTratado < 0){
            return "O salário não pode ser negativo";
        }
        return "";
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSalarioBruto = (EditText) findViewById(R.id.edtSalarioBruto);
        edtNumeroDependentes = (EditText) findViewById(R.id.edtNumeroDependentes);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txtAvisoErro = (TextView) findViewById(R.id.txtAvisoErro);

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, CalculoDoIr.class);

                String strSalarioBruto = edtSalarioBruto.getText().toString();
                String strNumeroDependentes = edtNumeroDependentes.getText().toString();

                // Testa se os dados são válidos
                String testarSalarioBruto = NumeroSalarioValido(strSalarioBruto);
                String testarNumeroDependetes = NumeroDependentesValido(strNumeroDependentes);


                if (testarNumeroDependetes != "") {
                    txtAvisoErro.setText(testarNumeroDependetes);

                } else if (testarSalarioBruto != "") {
                    txtAvisoErro.setText(testarSalarioBruto);

                } else {
                    txtAvisoErro.setText("");
                    // Dados são válidos
                    Bundle bundle = new Bundle();
                    bundle.putString("SalarioBruto", strSalarioBruto);
                    bundle.putString("NumeroDependentes", strNumeroDependentes );

                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}