package com.example.curso_php;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.controls.templates.TemperatureControlTemplate;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer);

        Button btnBack=(Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView t = (TextView) findViewById(R.id.tvRefer1);
        t.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tdos = (TextView) findViewById(R.id.tvRefer2);
        tdos.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ttres = (TextView) findViewById(R.id.tvRefer3);
        ttres.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tcuatro = (TextView) findViewById(R.id.tvRefer4);
        tcuatro.setMovementMethod(LinkMovementMethod.getInstance());

    }

}