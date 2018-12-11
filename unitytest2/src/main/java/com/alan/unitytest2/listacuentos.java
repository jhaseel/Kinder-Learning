package com.alan.unitytest2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alan.unitytest2.recycler.RecyclerViewAdapter;
import com.alan.unitytest2.recycler.cuento;

import java.util.ArrayList;
import java.util.List;


public class listacuentos extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adaptador;
    private List<cuento> lista ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistalista= inflater.inflate(R.layout.fragment_listacuentos, container, false);

        recyclerView=(RecyclerView) vistalista.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        obtenerinformacion();

        return vistalista;
    }

    public void obtenerinformacion(){
        lista=new ArrayList<cuento>();
        lista.add(new cuento("Caperucita","caperucita roja",R.drawable.fantasia));
        lista.add(new cuento("Caperucita","caperucita roja",R.drawable.fantasia));
        lista.add(new cuento("Caperucita","caperucita roja",R.drawable.fantasia));
        lista.add(new cuento("Caperucita","caperucita roja",R.drawable.fantasia));
        lista.add(new cuento("Caperucita","caperucita roja",R.drawable.fantasia));
        lista.add(new cuento("Caperucita","caperucita roja",R.drawable.fantasia));
        iniciaradaptador();

    }




    private void iniciaradaptador(){
        adaptador= new RecyclerViewAdapter(lista);
        recyclerView.setAdapter(adaptador);
    }


}
