package com.alan.unitytest2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Cuentos extends android.support.v4.app.Fragment {
    private ImageView animales,fantasia,aventura;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista= inflater.inflate(R.layout.fragment_cuentos, container, false);

        animales=(ImageView) vista.findViewById(R.id.cuentoanimales);
        animales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irseccion("animales");

            }
        });

        fantasia=(ImageView) vista.findViewById(R.id.cuentofantasia);
        fantasia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irseccion("fantasia");

            }
        });

        aventura=(ImageView) vista.findViewById(R.id.cuentoaventuras);
        aventura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irseccion("aventura");

            }
        });

        return vista;
    }

    private void irseccion(String categoria){
        Intent intent= new Intent(getContext(),lista.class);
        intent.putExtra("categoria",categoria);
        startActivity(intent);
    }
}
