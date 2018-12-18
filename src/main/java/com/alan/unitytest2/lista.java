package com.alan.unitytest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.alan.unitytest2.recycler.RecyclerViewAdapter;
import com.alan.unitytest2.recycler.cuento;

import java.util.ArrayList;
import java.util.List;

public class lista extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adaptador;
    private List<cuento> lista ;
    private Bundle args = new Bundle();
    private String categris="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        getSupportActionBar().hide();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            categris = bundle.getString("categoria");

        } else {
            Log.d("no se recibio nada", "     ");
        }
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        if (categris.equals("animales")){
            animales();
        }else if (categris.equals("fantasia")){
            fantasia();

        } else if (categris.equals("aventura")){
            aventura();
        }
    }


    public void animales(){
        lista=new ArrayList<cuento>();
        lista.add(new cuento("el leon y el raton","esfuerzo, perdonar, gratitud.",R.drawable.leon_raton,R.raw.leonyraton));
        lista.add(new cuento("el patito feo","humildad, bondad, no juzgar por las apariencias",R.drawable.patitofeo,R.raw.patofeo));
        lista.add(new cuento("el zorro y el tigre","La inteligencia y la astucia son más importantes que la fuerza.",R.drawable.zorroytigre,R.raw.zorroyel_tigre));
        lista.add(new cuento("la cigarra y la hormiga","ayudar, cooperación, justicia",R.drawable.hormiga_cigarra,R.raw.cigarraylahormiga));
        iniciaradaptador();
    }

    public void fantasia(){
        lista=new ArrayList<cuento>();
        lista.add(new cuento("el gigante generoso","generosidad, solidaridad, gratitud",R.drawable.gigante,R.raw.arbolaventura));
        lista.add(new cuento("la olla magicao","actitud positiva, creatividad",R.drawable.ollamagica,R.raw.laollamagica));
        lista.add(new cuento("el zapatero y los duendes","gratitud, felicidad",R.drawable.zapateroyduendes,R.raw.arbolaventura));

        iniciaradaptador();
    }


    public void aventura() {
        lista = new ArrayList<cuento>();
        lista.add(new cuento("el arbol triste", "caperucita roja", R.drawable.arboltriste,R.raw.arbolaventura));
        lista.add(new cuento("el abuelo y el nieto", "La familia y de las personas mayores.", R.drawable.seis,R.raw.arbolaventura));
        lista.add(new cuento("hansel y gretel", "ingenio, las apariencias engañan, fraternidad, colaboración", R.drawable.hansel,R.raw.arbolaventura));

        iniciaradaptador();

    }

    private void iniciaradaptador(){
        adaptador= new RecyclerViewAdapter(lista,this);
        adaptador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int url=  lista.get(recyclerView.getChildAdapterPosition(view)).getUrl();
                Log.d("lista -1",""+url);
                irreproductor(url);
            }
        });
        recyclerView.setAdapter(adaptador);
    }

    private void irreproductor(int url) {
        Intent intent = new Intent(this, reproductor_de_video.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
