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

import curso_avanzado.activitys.tema1avaActivity;
import curso_avanzado.activitys.tema2avaActivity;
import curso_avanzado.activitys.tema3avaActivity;
import curso_avanzado.activitys.tema4avaActivity;
import curso_avanzado.activitys.tema5avaActivity;
import curso_avanzado.activitys.tema6avaActivity;
import curso_avanzado.activitys.tema7avaActivity;
import curso_avanzado.activitys.tema8avaActivity;
import curso_avanzado.activitys.tema9avaActivity;

public class RecyclerAdapter3 extends RecyclerView.Adapter<RecyclerAdapter3.RecyclerHolder> {
    private Context context;
    private List<ItemList> items;
    private List<ItemList> originalItems;
    //private RecyclerItemClick itemClick;

    public RecyclerAdapter3(Context context, List items) {
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
        holder.cva.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_transition));
        holder.imgItem.setImageResource(item.getImgResource());
        holder.tvTitulo.setText(item.getTitulo());
        holder.tvDescripcion.setText(item.getDescripcion());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //itemClick.itemClick(item);
               if (items.get(position).getTitulo().matches("include y require")){
                    Intent iractivity1 = new Intent(context, tema1avaActivity.class);
                    context.startActivity(iractivity1);
                }

                if (items.get(position).getTitulo().matches("manejo de archivos")){
                    Intent iractivity2 = new Intent(context, tema2avaActivity.class);
                    context.startActivity(iractivity2);
                }
                if (items.get(position).getTitulo().matches("función fopen")){
                    Intent iractivity3 = new Intent(context, tema3avaActivity.class);
                    context.startActivity(iractivity3);
                }
                if (items.get(position).getTitulo().matches("función fread")){
                    Intent iractivity4 = new Intent(context, tema4avaActivity.class);
                    context.startActivity(iractivity4);
                }

                if (items.get(position).getTitulo().matches("función fclose")){
                    Intent iractivity5 = new Intent(context, tema5avaActivity.class);
                    context.startActivity(iractivity5);
                }

                if (items.get(position).getTitulo().matches("función fwrite")){
                    Intent iractivity6 = new Intent(context, tema6avaActivity.class);
                    context.startActivity(iractivity6);
                }

                if (items.get(position).getTitulo().matches("cookies")){
                    Intent iractivity7 = new Intent(context, tema7avaActivity.class);
                    context.startActivity(iractivity7);
                }

                if (items.get(position).getTitulo().matches("sesiones")){
                    Intent iractivity8 = new Intent(context, tema8avaActivity.class);
                    context.startActivity(iractivity8);
                }
                if (items.get(position).getTitulo().matches("filter")){
                    Intent iractivity9 = new Intent(context, tema9avaActivity.class);
                    context.startActivity(iractivity9);
                }
                if (items.get(position).getTitulo().matches("función cal_days_in_month")){
                    Intent iractivity10 = new Intent(context, tema10avaActivity.class);
                    context.startActivity(iractivity10);
                }

                if (items.get(position).getTitulo().matches("función cal_info")){
                    Intent iractivity11 = new Intent(context, tema11avaActivity.class);
                    context.startActivity(iractivity11);
                }

                if (items.get(position).getTitulo().matches("función easter_date")){
                    Intent iractivity12 = new Intent(context, tema12avaActivity.class);
                    context.startActivity(iractivity12);
                }
                if (items.get(position).getTitulo().matches("Tema 13")){
                    Intent iractivity13 = new Intent(context, tema13avaActivity.class);
                    context.startActivity(iractivity13);
                }
                if (items.get(position).getTitulo().matches("Tema 14")){
                    Intent iractivity14 = new Intent(context, tema14avaActivity.class);
                    context.startActivity(iractivity14);
                }

                if (items.get(position).getTitulo().matches("Tema 15")){
                    Intent iractivity15 = new Intent(context, tema15avaActivity.class);
                    context.startActivity(iractivity15);
                }

                if (items.get(position).getTitulo().matches("Tema 16")){
                    Intent iractivity16 = new Intent(context, tema16avaActivity.class);
                    context.startActivity(iractivity16);
                }

                if (items.get(position).getTitulo().matches("Tema 17")){
                    Intent iractivity17 = new Intent(context, tema17avaActivity.class);
                    context.startActivity(iractivity17);
                }

                if (items.get(position).getTitulo().matches("Tema 18")){
                    Intent iractivity18 = new Intent(context, tema18avaActivity.class);
                    context.startActivity(iractivity18);
                }
                if (items.get(position).getTitulo().matches("Tema 19")){
                    Intent iractivity19 = new Intent(context, tema19avaActivity.class);
                    context.startActivity(iractivity19);
                }
                if (items.get(position).getTitulo().matches("Tema 20")){
                    Intent iractivity20 = new Intent(context, tema20avaActivity.class);
                    context.startActivity(iractivity20);
                }

               /* if (items.get(position).getTitulo().matches("Tema 21")){
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
        CardView cva;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            cva = itemView.findViewById(R.id.cvb);


        }
    }

    public  interface RecyclerItemClick {
        void itemClick(ItemList item);
    }


}

