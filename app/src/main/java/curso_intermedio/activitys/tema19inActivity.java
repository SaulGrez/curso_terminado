package curso_intermedio.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import curso_intermedio.adapters.AdapIT19;
import com.example.curso_php.R;
import com.example.curso_php.contenido_intermedio;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import curso_intermedio.temas.Temain_19;

public class tema19inActivity extends AppCompatActivity {
    DatabaseReference t19reference;
    RecyclerView t19recyclerView;
    ArrayList<Temain_19> t19list;
    AdapIT19 t19adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter19);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        t19recyclerView = (RecyclerView) findViewById(R.id.rvtema19);
        t19recyclerView.setLayoutManager(new LinearLayoutManager(this));
        t19list = new ArrayList<Temain_19>();

        t19reference = FirebaseDatabase.getInstance().getReference().child("intermedio").child("tema19");
        t19reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                t19list.clear();

                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {
                    Temain_19 t19 = dataSnapshot1.getValue(Temain_19.class);
                    t19list.add(t19);
                }
                t19adapter = new AdapIT19(tema19inActivity.this,t19list);
                t19recyclerView.setAdapter(t19adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void ant_tema(View view) {
        Intent anterior = new Intent(this, tema18inActivity.class);
        startActivity(anterior);
        finish();
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void sig_tema(View view) {
        Intent siguiente = new Intent(this, tema20inActivity.class);
        startActivity(siguiente);
        finish();
    }
}