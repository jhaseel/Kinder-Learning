package com.alan.unitytest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.alan.unitytest2.recycler.RecyclerViewAdapter;
import com.alan.unitytest2.recycler.cuento;

import java.util.ArrayList;
import java.util.List;

public class lista extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adaptador;
    private List<cuento> lista ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        recyclerView=(RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        obtenerinformacion();
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
        adaptador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irreproductor();
                }
        });
        recyclerView.setAdapter(adaptador);
    }

    private void irreproductor(){
        Toast.makeText(lista.this, "se escogio", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,reproductor_de_video.class);
        startActivity(intent);
    }


}
