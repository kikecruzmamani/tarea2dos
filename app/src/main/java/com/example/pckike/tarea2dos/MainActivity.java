package com.example.pckike.tarea2dos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private TextView tvCero;
    private TextView tvUno;
    private TextView tvDos;
    private TextView tvTres;
    private TextView tvCuatro;
    private TextView tvCinco;
    private TextView tvSeis;
    private TextView tvSiete;
    private TextView tvOcho;
    private TextView tvNueve;
    private TextView tvCE;
    private TextView tvComa;
    private TextView tvDivision;
    private TextView tvMultiplicacion;
    private TextView tvResta;
    private TextView tvSuma;
    private TextView tvIgual;
    private TextView tvResultado;
    private TextView concatenar;

    private double x, y, resultado;
    private String signo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        x = 0;
        y = 0;
        signo="";

        tvCero = (TextView) findViewById(R.id.tvCero);
        tvUno = (TextView) findViewById(R.id.tvUno);
        tvDos = (TextView) findViewById(R.id.tvDos);
        tvTres = (TextView) findViewById(R.id.tvTres);
        tvCuatro = (TextView) findViewById(R.id.tvCuatro);
        tvCinco = (TextView) findViewById(R.id.tvCinco);
        tvSeis = (TextView) findViewById(R.id.tvSeis);
        tvSiete = (TextView) findViewById(R.id.tvSiete);
        tvOcho = (TextView) findViewById(R.id.tvOcho);
        tvNueve = (TextView) findViewById(R.id.tvNueve);
        tvCE = (TextView) findViewById(R.id.tvCe);
        tvComa = (TextView) findViewById(R.id.tvComa);
        tvDivision = (TextView) findViewById(R.id.tvDivision);
        tvMultiplicacion = (TextView) findViewById(R.id.tvMultiplicacion);
        tvResta = (TextView) findViewById(R.id.tvResta);
        tvSuma = (TextView) findViewById(R.id.tvSuma);
        tvIgual = (TextView) findViewById(R.id.tvIgual);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        tvResultado.setText("");

        tvCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "0");
            }
        });

        tvUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "1");
            }
        });

        tvDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "2");
            }
        });

        tvTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "3");
            }
        });

        tvCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "4");
            }
        });
        tvCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "5");
            }
        });

        tvSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "6");
            }
        });

        tvSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "7");
            }
        });

        tvOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "8");
            }
        });

        tvNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + "9");
            }
        });

        tvComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                tvResultado.setText(concatenar.getText().toString() + ".");
            }
        });

        tvDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signo="/";
                concatenar = (TextView) findViewById(R.id.tvResultado);
                x = Double.parseDouble(concatenar.getText().toString());
                tvResultado.setText("");
            }
        });

        tvMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signo="*";
                concatenar = (TextView) findViewById(R.id.tvResultado);
                x = Double.parseDouble(concatenar.getText().toString());
                tvResultado.setText("");
            }
        });

        tvResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signo="-";
                concatenar = (TextView) findViewById(R.id.tvResultado);
                x = Double.parseDouble(concatenar.getText().toString());
                tvResultado.setText("");
            }
        });

        tvSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signo="+";
                concatenar = (TextView) findViewById(R.id.tvResultado);
                x = Double.parseDouble(concatenar.getText().toString());
                tvResultado.setText("");
            }
        });

        tvIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (TextView) findViewById(R.id.tvResultado);
                y = Double.parseDouble(concatenar.getText().toString());

                if(signo.equals("/")){
                    tvResultado.setText("");
                    resultado = x / y;
                }

                if(signo.equals("*")){
                    tvResultado.setText("");
                    resultado = x * y;
                }

                if(signo.equals("-")){
                    tvResultado.setText("");
                    resultado = x - y;
                }

                if(signo.equals("+")){
                    tvResultado.setText("");
                    resultado = x + y;
                }
                String res= String.valueOf(resultado);
                tvResultado.setText(res);
            }
        });

        tvCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 0;
                y = 0;
                resultado = 0;
                tvResultado.setText("");
            }
        });
    }
}