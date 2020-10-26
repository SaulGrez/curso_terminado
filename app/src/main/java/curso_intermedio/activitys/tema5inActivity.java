package curso_intermedio.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.curso_php.R;
import com.example.curso_php.contenido_intermedio;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import curso_intermedio.adapters.AdapIT5;
import curso_intermedio.temas.Temain_5;

public class tema5inActivity extends AppCompatActivity {

    DatabaseReference t5reference;
    RecyclerView t5recyclerView;
    ArrayList<Temain_5> t5list;
    AdapIT5 t5adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter5);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        t5recyclerView = (RecyclerView) findViewById(R.id.rvtema5);
        t5recyclerView.setLayoutManager(new LinearLayoutManager(this));
        t5list = new ArrayList<Temain_5>();

        t5reference = FirebaseDatabase.getInstance().getReference().child("intermedio").child("tema5");
        t5reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                t5list.clear();

                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {
                    Temain_5 t5 = dataSnapshot1.getValue(Temain_5.class);
                    t5list.add(t5);
                }
                t5adapter = new AdapIT5(tema5inActivity.this,t5list);
                t5recyclerView.setAdapter(t5adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void ant_tema(View view) {
        Intent anterior = new Intent(this, tema17inActivity.class);
        startActivity(anterior);
        finish();
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void sig_tema(View view) {
        Intent siguiente = new Intent(this, tema6inActivity.class);
        startActivity(siguiente);
        finish();
    }
}