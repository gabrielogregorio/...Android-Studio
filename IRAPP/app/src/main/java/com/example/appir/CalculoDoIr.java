package com.example.appir;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;
import java.util.Locale;

public class CalculoDoIr extends AppCompatActivity {

    TextView txtSalarioBruto, txtDeducaoDependetes;
    TextView txtValorInss, txtAlicota, txtParcelaDeduzir, txtIrRetido;
    Button btnVoltarTela;

    private float calcularInss(float numSalarioBruto){

        float Inss = 0f;
        float valorDescontadoInss = 0f;

        // Valor descontado do INSS
        if (numSalarioBruto < 1399.12f){
            Inss = 8.0f;

        } else if (numSalarioBruto >= 1399.13 && numSalarioBruto <= 2331.88){
            Inss = 9.0f;
        }

        else { // if (numSalarioBruto >= 2331.89 && numSalarioBruto <= 4663.75){
            Inss = 11.0f;
        }

        // Salário descontando o INSS
        valorDescontadoInss = numSalarioBruto * (Inss/100);
        if (valorDescontadoInss >  513.01) {
            return 513.0f;
        }
        return  valorDescontadoInss;
    }

    private float descontarInssSalario(float numSalarioBruto, float InssDescontado){
        return numSalarioBruto - InssDescontado;
    }

    private float calcularParcelaDeduzir(float numSalarioBruto, String acao){
        float parcelaDeduzir = 0f;
        float alicotaDeduzir = 0f;

        if (numSalarioBruto > 4664.68) {
            parcelaDeduzir = 869.36f;
            alicotaDeduzir = 27.5f;

        } else if (numSalarioBruto >= 3751.06 && numSalarioBruto <= 4664.68) {
            parcelaDeduzir = 636.13f;
            alicotaDeduzir = 22.5f;

        } else if (numSalarioBruto >= 2826.66 && numSalarioBruto <= 3751.05) {
            parcelaDeduzir = 354.80f;
            alicotaDeduzir = 15f;

        } else if (numSalarioBruto >= 1903.99 && numSalarioBruto <= 2826.65) {
            parcelaDeduzir = 142.80f;
            alicotaDeduzir = 7.5f;

        } else {
            parcelaDeduzir = 0f;
        }

        if (acao == "parcela")
            return  parcelaDeduzir;
        return alicotaDeduzir;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_do_ir);

        txtDeducaoDependetes = (TextView) findViewById(R.id.txtDeducaoDependetes);
        txtParcelaDeduzir = (TextView) findViewById(R.id.txtParcelaDeduzir);
        txtSalarioBruto = (TextView) findViewById(R.id.txtSalarioBruto);
        txtValorInss = (TextView) findViewById(R.id.txtValorInss);
        txtIrRetido = (TextView) findViewById(R.id.txtIrRetido);
        txtAlicota = (TextView) findViewById(R.id.txtAlicota);

        btnVoltarTela = (Button) findViewById(R.id.btnVoltarTela);


        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String strSalarioBruto = bundle.getString("SalarioBruto");
        String strNumeroDependentes = bundle.getString("NumeroDependentes");

        // O número de dependentes deve ser multiplicado pelo valor R$ 189,59;
        float numSalarioBruto = Float.parseFloat(strSalarioBruto);

        // Número de dependentes
        float numNumeroDependetes = Float.parseFloat(strNumeroDependentes);

        // Calculo do Inss e do salário final descontado
        float Inss = calcularInss(numSalarioBruto);

        // Dedução com dependentes
        float temporarioDeducao = numSalarioBruto - (numNumeroDependetes * 189.59f) - Inss;

        // Obtenção da parcela a deduzir e alicota
        float parcelaDeduzir = calcularParcelaDeduzir(temporarioDeducao, "parcela");
        float parcelaAlicota = calcularParcelaDeduzir(temporarioDeducao, "alicota");

        // Calculo do valor retido
        float valorRetiro = temporarioDeducao * (parcelaAlicota / 100f) - parcelaDeduzir;

        txtSalarioBruto.setText(strSalarioBruto);
        txtDeducaoDependetes.setText(String.format(Locale.US,"%.2f", temporarioDeducao));
        txtValorInss.setText(String.format(Locale.US,"%.2f", Inss));
        txtAlicota.setText(String.format(Locale.US,"%.2f", parcelaAlicota) + "%");
        txtParcelaDeduzir.setText(String.format(Locale.US,"%.2f", parcelaDeduzir));
        txtIrRetido.setText(String.format(Locale.US,"%.2f", valorRetiro));

        btnVoltarTela.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}

