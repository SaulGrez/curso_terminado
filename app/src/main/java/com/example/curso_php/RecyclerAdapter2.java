package com.example.curso_php;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import curso_intermedio.activitys.tema10inActivity;
import curso_intermedio.activitys.tema11inActivity;
import curso_intermedio.activitys.tema12inActivity;
import curso_intermedio.activitys.tema13inActivity;
import curso_intermedio.activitys.tema14inActivity;
import curso_intermedio.activitys.tema15inActivity;
import curso_intermedio.activitys.tema16inActivity;
import curso_intermedio.activitys.tema17inActivity;
import curso_intermedio.activitys.tema18inActivity;
import curso_intermedio.activitys.tema19inActivity;
import curso_intermedio.activitys.tema20inActivity;
import curso_intermedio.activitys.tema2inActivity;
import curso_intermedio.activitys.tema3inActivity;
import curso_intermedio.activitys.tema4inActivity;
import curso_intermedio.activitys.tema5inActivity;
import curso_intermedio.activitys.tema6inActivity;
import curso_intermedio.activitys.tema7inActivity;
import curso_intermedio.activitys.tema8inActivity;
import curso_intermedio.activitys.tema9inActivity;
import curso_intermedio.activitys.temai_1;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.RecyclerHolder> {
    private Context context;
    private List<ItemList> items;
    private List<ItemList> originalItems;
    //private RecyclerItemClick itemClick;

    public RecyclerAdapter2(Context context, List items) {
        this.context = context;
        this.items = items;
        this.originalItems = new ArrayList<>();
        originalItems.addAll(items);
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view,parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, final int position) {
        final ItemList item = items.get(position);
        holder.cvi.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_transition));
        holder.imgItem.setImageResource(item.getImgResource());
        holder.tvTitulo.setText(item.getTitulo());
        holder.tvDescripcion.setText(item.getDescripcion());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //itemClick.itemClick(item);
                if (items.get(position).getTitulo().matches("clases")){
                    Intent iractivity1 = new Intent(context,temai_1.class);
                    context.startActivity(iractivity1);
                }
                if (items.get(position).getTitulo().matches("herencia")){
                    Intent iractivity2 = new Intent(context, tema2inActivity.class);
                    context.startActivity(iractivity2);
                }
                if (items.get(position).getTitulo().matches("visibilidad")){
                    Intent iractivity3 = new Intent(context, tema3inActivity.class);
                    context.startActivity(iractivity3);
                }
                if (items.get(position).getTitulo().matches("constructores")){
                    Intent iractivity4 = new Intent(context, tema4inActivity.class);
                    context.startActivity(iractivity4);
                }

                if (items.get(position).getTitulo().matches("destructores")){
                    Intent iractivity17 = new Intent(context, tema17inActivity.class);
                    context.startActivity(iractivity17);
                }

                if (items.get(position).getTitulo().matches("propiedades y métodos")){
                    Intent iractivity5 = new Intent(context, tema5inActivity.class);
                    context.startActivity(iractivity5);
                }

                if (items.get(position).getTitulo().matches("interfaces")){
                    Intent iractivity6 = new Intent(context, tema6inActivity.class);
                    context.startActivity(iractivity6);
                }

                if (items.get(position).getTitulo().matches("clases abstractas")){
                    Intent iractivity7 = new Intent(context, tema7inActivity.class);
                    context.startActivity(iractivity7);
                }

                if (items.get(position).getTitulo().matches("excepciones")){
                    Intent iractivity8 = new Intent(context, tema8inActivity.class);
                    context.startActivity(iractivity8);
                }
                if (items.get(position).getTitulo().matches("http-php")){
                    Intent iractivity9 = new Intent(context, tema9inActivity.class);
                    context.startActivity(iractivity9);
                }
                if (items.get(position).getTitulo().matches("servicio http")){
                    Intent iractivity10 = new Intent(context, tema10inActivity.class);
                    context.startActivity(iractivity10);
                }

                if (items.get(position).getTitulo().matches("uso de matrices")){
                    Intent iractivity11 = new Intent(context, tema11inActivity.class);
                    context.startActivity(iractivity11);
                }
                if (items.get(position).getTitulo().matches("función: array_change")){
                    Intent iractivity12 = new Intent(context, tema12inActivity.class);
                    context.startActivity(iractivity12);
                }
                if (items.get(position).getTitulo().matches("función: array_column")){
                    Intent iractivity13 = new Intent(context, tema13inActivity.class);
                    context.startActivity(iractivity13);
                }
                if (items.get(position).getTitulo().matches("función: array_combine")){
                    Intent iractivity14 = new Intent(context, tema14inActivity.class);
                    context.startActivity(iractivity14);
                }

                if (items.get(position).getTitulo().matches("función: array_count_values")){
                    Intent iractivity15 = new Intent(context, tema15inActivity.class);
                    context.startActivity(iractivity15);
                }

                if (items.get(position).getTitulo().matches("función: array_diff")){
                    Intent iractivity16 = new Intent(context, tema16inActivity.class);
                    context.startActivity(iractivity16);
                }

                if (items.get(position).getTitulo().matches("funciones date and time")){
                    Intent iractivity18 = new Intent(context, tema18inActivity.class);
                    context.startActivity(iractivity18);
                }
                /* if (items.get(position).getTitulo().matches("Tema 19")){
                    Intent iractivity19 = new Intent(context, tema19inActivity.class);
                    context.startActivity(iractivity19);
                }
                if (items.get(position).getTitulo().matches("Tema 20")){
                    Intent iractivity20 = new Intent(context, tema20inActivity.class);
                    context.startActivity(iractivity20);
                }

               if (items.get(position).getTitulo().matches("Tema 21")){
                    Intent iractivity21 = new Intent();
                    context.startActivity(iractivity21);
                }*/
            }
        });
    }

    @Override
    public int getItemCount() {

        return items.size();
    }


    public void filter(final String strSearch) {
        if (strSearch.length() == 0) {
            items.clear();
            items.addAll(originalItems);
        }
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                items.clear();
                List<ItemList> collect = originalItems.stream()
                        .filter(i -> i.getTitulo().toLowerCase().contains(strSearch))
                        .collect(Collectors.toList());

                items.addAll(collect);
            }
            else {
                items.clear();
                for (ItemList i : originalItems) {
                    if (i.getTitulo().toLowerCase().contains(strSearch)) {
                        items.add(i);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }


    public static class RecyclerHolder extends RecyclerView.ViewHolder{

        private ImageView imgItem;
        private TextView tvTitulo;
        private TextView tvDescripcion;
        CardView cvi;


        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            cvi = itemView.findViewById(R.id.cvb);


        }
    }

    public  interface RecyclerItemClick {
        void itemClick(ItemList item);
    }


}