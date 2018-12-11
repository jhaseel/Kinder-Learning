package com.alan.unitytest2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;



public class cuentos extends Fragment {

    private ImageView animales,fantasia,moustruos,aventuras;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistacuentos=inflater.inflate(R.layout.fragment_cuentos, container, false);

        animales=(ImageView) vistacuentos.findViewById(R.id.cuentoanimales);
        fantasia=(ImageView) vistacuentos.findViewById(R.id.cuentofantasia);
        moustruos=(ImageView) vistacuentos.findViewById(R.id.cuentomonstruo);
        aventuras=(ImageView) vistacuentos.findViewById(R.id.cuentoaventuras);


        animales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(),lista.class);
                startActivity(intent);
            }
        });

        fantasia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getContext(),lista.class);
                startActivity(intent);
            }
        });

        moustruos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getContext(),lista.class);
                startActivity(intent);
            }
        });

        aventuras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getContext(),lista.class);
                startActivity(intent);
            }
        });


        return vistacuentos;
    }




}
