package com.alan.unitytest2.recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alan.unitytest2.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>
        implements View.OnClickListener{

    private View.OnClickListener listener;

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private View.OnClickListener listener;
        public ViewHolder(View itemView) {
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.imgcuento);
        }
    }

    public List<cuento> listaregistros;
    public Context context;

    public RecyclerViewAdapter(List<cuento> listaregistros,Context context) {
        this.listaregistros = listaregistros;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cuento,parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Picasso.get().load(downloadURL).into(imagen);
        holder.img.setImageResource(listaregistros.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return listaregistros.size();
    }

}

