package com.alan.unitytest2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;


public class menu extends AppCompatActivity {
    private BottomNavigationView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Cuentos()).commit();

        menu=(BottomNavigationView) findViewById(R.id.navigation_bottom);
        menu.setOnNavigationItemSelectedListener(listener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener listener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment seleccionado=null;

                    if (item.getItemId()==R.id.cuentos) {
                        seleccionado= new Cuentos();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,seleccionado).commit();
                    }else
                    if (item.getItemId()==R.id.descubre) {
                       irunity();
                        }
                    return true;
                }
            };

    private void irunity(){
        Intent intent= new Intent(this,UnityPlayerActivity.class);
        startActivity(intent);
    }
}
