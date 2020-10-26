package com.example.curso_php;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Curso extends AppCompatActivity {

    Button btn_contI,btn_contF,btn_contA,btnBack1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        btnBack1 = (Button)findViewById(R.id.btnBack);
        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btn_contI = (Button)findViewById(R.id.btn_contI);
        btn_contI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Curso.this,contenido_basico.class));
            }
        });

        btn_contF = (Button)findViewById(R.id.btn_contF);
        btn_contF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Curso.this,contenido_intermedio.class));
            }
        });

        btn_contA = (Button)findViewById(R.id.btn_contA);
        btn_contA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Curso.this,contenido_avanzado.class));
            }
        });
    }
/*
    public void bas(View view){
        Intent bas = new Intent(this,contenido_basico.class);
        startActivity(bas);
        finish();

    }
    public void intermedio(View view){
        Intent intermedio = new Intent(this,contenido_intermedio.class);
        startActivity(intermedio);
        finish();

    }

    public void avan(View view){
        Intent avan = new Intent(this,contenido_avanzado.class);
        startActivity(avan);
        finish();

    }

    public void Anterior(View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
        finish();
    }


    public void logo(View view) {
        Intent logo= new Intent(this, MainActivity.class);
        startActivity(logo);
        finish();
    }*/
}