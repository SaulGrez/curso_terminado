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

import curso_basico.activitys.tema1;

public class contenido_basico extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {

    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter adapter;
    private List<ItemList> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_basico);

        initViews();
        initValues();
        initListener();

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
        adapter = new RecyclerAdapter(this, items);
        rvLista.setAdapter(adapter);
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }

    private List<ItemList> getItems() {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("introducción", "¿Qué es php?...", R.drawable.transparent_b));
        itemLists.add(new ItemList("estándares de codificación", "El conjunto de reglas para su codificación", R.drawable.transparent_b));
        itemLists.add(new ItemList("sintaxis básica", "Se definen la sintaxis del lenguaje PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("variables", "Tipos de variables y como se definen", R.drawable.transparent_b));
        itemLists.add(new ItemList("echo y print", "Se da a conocer para que sirven estas funciones", R.drawable.transparent_b));
        itemLists.add(new ItemList("tipos de datos", "Se definen los datos que puede almacenar una variable", R.drawable.transparent_b));
        itemLists.add(new ItemList("strings", "Uso de string en PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("constantes", "Uso de constantes y como se declaran.", R.drawable.transparent_b));
        itemLists.add(new ItemList("sentencias if/if-else", "Uso de condicionales if y if-else", R.drawable.transparent_b));
        itemLists.add(new ItemList("sentencia switch", "Uso de switch-case y sus funciones", R.drawable.transparent_b));
        itemLists.add(new ItemList("bucles", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("constantes mágicas", "Funciones de constantes mágicas en PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("métodos get y post", "Uso de los métodos get() and post()", R.drawable.transparent_b));
        itemLists.add(new ItemList("superglobales", "Declaración de variables superglobales", R.drawable.transparent_b));
        itemLists.add(new ItemList("funciones", "Tipos de funciones en PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("funciones matemáticas", "Palabras reservadas y sus funciones matemáticas", R.drawable.transparent_b));
        itemLists.add(new ItemList("tipos de errores", "Tipos de errores en PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("manejo de errores", "Corregir algunos errores comunes en PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("", "", R.drawable.transparent_b));
         /*itemLists.add(new ItemList("tema 22", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("tema 23", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("tema 24", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("tema 25", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("tema 26", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("tema 27", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("tema 28", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("tema 29", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("tema 30", "Descripcion del tema a ver.", R.drawable.transparent_b));*/



        return itemLists;
    }


    @Override
    public void itemClick(ItemList item) {
        Intent intent = new Intent(this, tema1.class);
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
    public void Anterior(View view) {
        Intent anterior = new Intent(this, Curso.class);
        startActivity(anterior);
        finish();
    }

    //--------------------------------------------------------------------------
    public void playlist(View view) {
        Intent playlist = new Intent(this, multi_basico.class);
        startActivity(playlist);
        finish();
    }

}


