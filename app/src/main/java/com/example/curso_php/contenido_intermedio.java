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

import curso_intermedio.activitys.temai_1;


public class contenido_intermedio extends AppCompatActivity implements RecyclerAdapter2.RecyclerItemClick, SearchView.OnQueryTextListener {

    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter2 adapter;
    private List<ItemList> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_intermedio);

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
        adapter = new RecyclerAdapter2(this, items);
        rvLista.setAdapter(adapter);
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }

    private List<ItemList> getItems() {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("clases en php", "Declaración de clases en PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("herencia", "Conceptos de herencia y sus aplicaciones en PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("visibilidad", "Definicon de private y protected y su funcion en las clases ", R.drawable.transparent_b));
        itemLists.add(new ItemList("constructores", "Uso de constructores en PHP", R.drawable.transparent_b));
        itemLists.add(new ItemList("propiedades y métodos", "Descripcion del tema inter 4.", R.drawable.transparent_b));
        itemLists.add(new ItemList("interfaces", "Uso de interfaces para definir métodos de una clase.", R.drawable.transparent_b));
        itemLists.add(new ItemList("clases abstractas", "uso y aplicación de clases abstractas", R.drawable.transparent_b));
        itemLists.add(new ItemList("excepciones", "solicitudes http con php", R.drawable.transparent_b));
        itemLists.add(new ItemList("http-php", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("servicio http", "Cómo crear un servicio http usando php", R.drawable.transparent_b));
        itemLists.add(new ItemList("uso de matrices", "Uso de matrices con la función array()", R.drawable.transparent_b));
        itemLists.add(new ItemList("función: array_change", "Cambiar parámetros en matrices", R.drawable.transparent_b));
        itemLists.add(new ItemList("función: array_column", "Función para combinar dos matrices", R.drawable.transparent_b));
        itemLists.add(new ItemList("función: array_combine", "Aplicación y uso de la función array_combine", R.drawable.transparent_b));
        itemLists.add(new ItemList("función: array_count_values", "Uso de la función para contar valores de una matriz", R.drawable.transparent_b));
        itemLists.add(new ItemList("función: array_diff", "Funccón para calcular la diferencia entre 2 matrices.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 17", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 18", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 19", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 20", "Descripcion del tema a ver.", R.drawable.transparent_b));
        itemLists.add(new ItemList("Tema 21", "Descripcion del tema a ver.", R.drawable.transparent_b));
         /* itemLists.add(new ItemList("Tema 22", "Descripcion del tema a ver.", R.drawable.transparent_b));
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
        Intent intent = new Intent(this, temai_1.class);
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


    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void Anterior(View view) {
        Intent anterior = new Intent(this, Curso.class);
        startActivity(anterior);
        finish();
    }



    //--------------------------------------------------------------------------
    public void playlist(View view) {
        Intent playlist = new Intent(this, multi_intermedio.class);
        startActivity(playlist);
        finish();
    }
}

