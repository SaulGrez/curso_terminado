package com.example.curso_php;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import curso_avanzado.activitys.tema1avaActivity;

public class contenido_avanzado extends AppCompatActivity implements RecyclerAdapter3.RecyclerItemClick, SearchView.OnQueryTextListener {

    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter3 adapter;
    private List<ItemList> items;
    Button btnBackAva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_avanzado);

        initViews();
        initValues();
        initListener();

        btnBackAva=(Button)findViewById(R.id.btnBackAva);
        btnBackAva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Button btnMulti3=(Button)findViewById(R.id.btnMulti3);
        btnMulti3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(contenido_avanzado.this,multi_avanzado.class));
            }
        });
    }


    private void initViews(){
        rvLista = findViewById(R.id.rvLista);
        svSearch = findViewById(R.id.svSearch);
    }

    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        //adapter = new RecyclerAdapter(items,this);
        adapter = new RecyclerAdapter3(this, items);
        rvLista.setAdapter(adapter);
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }
    private List<ItemList> getItems() {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("include y require", "Nos ayuda a incluir varios archivos, incluidos texto o códigos, en un solo programa.", R.drawable.transparent_b));
        itemLists.add(new ItemList("manejo de archivos", "Uso de las funciones: fopen(), fread(), fwrite(), fclose().", R.drawable.transparent_b));
        itemLists.add(new ItemList("función fopen", "Función incorporada que se usa para abrir un archivo o una URL.", R.drawable.transparent_b));
        itemLists.add(new ItemList("función fread", "Función incorporada que lee bytes de longitud.", R.drawable.transparent_b));
        itemLists.add(new ItemList("función fclose", "Función incorporada que se utiliza para cerrar un archivo", R.drawable.transparent_b));
        itemLists.add(new ItemList("función fwrite", "Función incorporada que se usa para escribir en un archivo abierto", R.drawable.transparent_b));
        itemLists.add(new ItemList("cookies", "Realiza un seguimiento de información", R.drawable.transparent_b));
        itemLists.add(new ItemList("sesiones", "Almacena datos en un servidor en lugar de en la computadora", R.drawable.transparent_b));
        itemLists.add(new ItemList("filter", "Es una extensión que filtra los datos desinfectando o validándolos", R.drawable.transparent_b));
        itemLists.add(new ItemList("función cal_days_in_month", "Se utiliza para devolver la cantidad de días en un mes", R.drawable.transparent_b));
        itemLists.add(new ItemList("función cal_info", "Se utiliza para devolver información sobre un calendario específico.", R.drawable.transparent_b));
        itemLists.add(new ItemList("función easter_date", "Devuelve la fecha de Pascua en el año pasado como argumento.", R.drawable.transparent_b));
        /*itemLists.add(new ItemList("", "", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 14", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 15", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 16", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 17", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 18", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 19", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 20", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("", "", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 22", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 23", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 24", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 25", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 26", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 27", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 28", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 29", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 30", "Descripcion del tema a ver.", R.drawable.transparent_b));*/

        return itemLists;
    }



    @Override
    public void itemClick(ItemList item) {
        Intent intent = new Intent(this, tema1avaActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.filter(newText);
        return false;
    }

    //--------------------------------------------------------------------------
    /*public void Anterior(View view) {
        Intent anterior = new Intent(this, Curso.class);
        startActivity(anterior);
        finish();
    }*/



    //--------------------------------------------------------------------------
    public void playlist(View view) {
        Intent playlist = new Intent(this, multi_avanzado.class);
        startActivity(playlist);
        finish();
    }
}
