package com.alan.unitytest2.recycler;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.alan.unitytest2.R;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;

public class Preguntas extends AppCompatActivity implements View.OnClickListener,TextToSpeech.OnInitListener {
    private ImageButton rest,resf,escucha;
    private TextView actual,contador,correcto;
    private ControladorPreguntas controla = new ControladorPreguntas();
    private String[][] preguselecion;
    private String cuento1[][]= new String[6][2];
    private String cuento2[][]= new String[6][2];
    private String cuento3[][]= new String[6][2];
    private String cuento4[][]= new String[6][2];
    private String cuento5[][]= new String[6][2];
    private String cuento6[][]= new String[6][2];
    private String cuento7[][]= new String[6][2];
    private String cuento8[][]= new String[6][2];
    private String cuento9[][]= new String[6][2];
    private String cuento10[][]= new String[6][2];
    private Button sal;
    private int cont,correct,url;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            url = bundle.getInt("id");

        } else {
            Log.d("no se recibio nada", "     ");
        }

        rest= findViewById(R.id.verdadero);
        resf= findViewById(R.id.falso);
        rest.setImageResource(R.drawable.paloma);
        resf.setImageResource(R.drawable.incorrecto);

        rest.setOnClickListener(this);
        resf.setOnClickListener(this);

        actual=findViewById(R.id.pregunta);
        contador= findViewById(R.id.nump);
        correcto = findViewById(R.id.correctop);

       // sal=findViewById(R.id.salir);
        //sal.setOnClickListener(this);

        escucha= findViewById(R.id.escuchar);
        escucha.setOnClickListener(this);
        escucha.setImageResource(R.drawable.iconoson);
        //sal.setVisibility();

        //preguselecion= controla.Regresa(cuento1);
        Llenado();
        SelecionPreguntas(url);

        actual.setText(preguselecion[0][0]);
        contador.setText(" "+(cont+1));
        correcto.setText(" "+correct);
        tts = new TextToSpeech(this,this);
    }

    public void SelecionPreguntas(int id){
        if(id==R.raw.cigarraylahormiga){

            preguselecion= controla.Regresa(cuento1);
        }
        if(id==R.raw.leonyraton){

            preguselecion=controla.Regresa(cuento2);
        }
        if(id==R.raw.patofeo){

            preguselecion=controla.Regresa(cuento3);
        }
        if(id==R.raw.zorroyel_tigre){
            preguselecion=controla.Regresa(cuento4);
        }
        if(id==R.raw.arbolaventura){
            preguselecion=controla.Regresa(cuento5);
        }
        //if (id==R.raw.){}
       // if(id==R.raw.hanselygretel){}
        //if(id==R.raw.gigantegeneroso){ }
        if(id==R.raw.laollamagica){
            preguselecion=controla.Regresa(cuento6);
        }
        if(id==R.raw.zapateroyduendes){

        }

    }

    public void Llenado(){
        //hormiga
        cuento1[0][0]="¿este cuento es de animales?";
        cuento1[0][1]="true";
        cuento1[1][0]="¿este cuento trata de una hormiga?";
        cuento1[1][1]="true";
        cuento1[2][0]="¿este cuento se lleva acabo en el bosque?";
        cuento1[2][1]="true";
        cuento1[3][0]="¿el cuento habla de moustros?";
        cuento1[3][1]="false";
        cuento1[4][0]="¿el cuento se trata de un lobo?";
        cuento1[4][1]="false";
        cuento1[5][0]="¿el cuento se lleva acabo en una ciudad?";
        cuento1[5][1]="false";
    //raton leon
        cuento2[0][0]="¿este cuento es de animales?";
        cuento2[0][1]="true";
        cuento2[1][0]="¿este cuento habla sobre un leon?";
        cuento2[1][1]="true";
        cuento2[2][0]="¿este cuento se lleva acabo en el bosque?";
        cuento2[2][1]="true";
        cuento2[3][0]="¿hay un ratón en el cuento?";
        cuento2[3][1]="true";
        cuento2[4][0]="¿el cuento se trata de un lobo?";
        cuento2[4][1]="false";
        cuento2[5][0]="¿hay personas en el cuento ?";
        cuento2[5][1]="true";
        //pato feo
        cuento3[0][0]="¿este cuento es de animales?";
        cuento3[0][1]="true";
        cuento3[1][0]="¿este cuento trata de un pato?";
        cuento3[1][1]="true";
        cuento3[2][0]="¿hay agua en este cuento ?";
        cuento3[2][1]="true";
        cuento3[3][0]="¿hay personas en el cuento?";
        cuento3[3][1]="false";
        cuento3[4][0]="¿el cuento se trata de un lobo?";
        cuento3[4][1]="false";
        cuento3[5][0]="¿hay cochinitos en el cuento ?";
        cuento3[5][1]="false";
//tigre y zorro
        cuento4[0][0]="¿este cuento es de animales?";
        cuento4[0][1]="true";
        cuento4[1][0]="¿en este cuento hay un tigre?";
        cuento4[1][1]="true";
        cuento4[2][0]="¿hay arboles en el cuento?";
        cuento4[2][1]="true";
        cuento4[3][0]="¿el cuento habla de personas ?";
        cuento4[3][1]="false";
        cuento4[4][0]="¿el cuento se trata de un lobo?";
        cuento4[4][1]="false";
        cuento4[5][0]="¿hay cochinitos en el cuento ?";
        cuento4[5][1]="false";
//arbol
        cuento5[0][0]="¿hay animales en este cuento?";
        cuento5[0][1]="true";
        cuento5[1][0]="¿este cuento trata de un pato?";
        cuento5[1][1]="false";
        cuento5[2][0]="¿hay agua en este cuento ?";
        cuento5[2][1]="true";
        cuento5[3][0]="¿el cuento  habla de personas ?";
        cuento5[3][1]="false";
        cuento5[4][0]="¿hay pajaros en este cuento?";
        cuento5[4][1]="true";
        cuento5[5][0]="¿ hay casas en el cuento ?";
        cuento5[5][1]="true";
        ///abuelo
        cuento6[0][0]="¿hay animales en este cuento?";
        cuento6[0][1]="false";
        cuento6[1][0]="¿hay personas en este cuento?";
        cuento6[1][1]="true";
        cuento6[2][0]="¿hay agua en este cuento ?";
        cuento6[2][1]="true";
        cuento6[3][0]="¿el cuento habla de personas ?";
        cuento6[3][1]="false";
        cuento6[4][0]="¿el cuento se trata de un lobo?";
        cuento6[4][1]="false";
        cuento6[5][0]="¿hay cochinitos en el cuento ?";
        cuento6[5][1]="false";
//hase y gretel
        cuento7[0][0]="¿hay animales en este cuento?";
        cuento7[0][1]="true";
        cuento7[1][0]="¿este cuento trata de un pato?";
        cuento7[1][1]="true";
        cuento7[2][0]="¿hay agua en este cuento ?";
        cuento7[2][1]="true";
        cuento7[3][0]="¿el cuento  habla de personas ?";
        cuento7[3][1]="false";
        cuento7[4][0]="¿hay brujas en el cuento?";
        cuento7[4][1]="true";
        cuento7[5][0]="¿hay cochinitos en el cuento ?";
        cuento7[5][1]="false";
//gigante
        cuento8[0][0]="¿hay animales en este cuento?";
        cuento8[0][1]="false";
        cuento8[1][0]="¿hay niños en el cuento";
        cuento8[1][1]="true";
        cuento8[2][0]="¿hay agua en este cuento ?";
        cuento8[2][1]="false";
        cuento8[3][0]="¿el cuento es habla de personas ?";
        cuento8[3][1]="true";
        cuento8[4][0]="¿el cuento se trata de un lobo?";
        cuento8[4][1]="false";
        cuento8[5][0]="¿hay cochinitos en el cuento ?";
        cuento8[5][1]="false";
//olla magica
        cuento9[0][0]="¿hay animales en este cuento?";
        cuento9[0][1]="true";
        cuento9[1][0]="¿hay comida en este cuento?";
        cuento9[1][1]="true";
        cuento9[2][0]="¿hay casas en el cuento?";
        cuento9[2][1]="true";
        cuento9[3][0]="¿el cuento habla de personas ?";
        cuento9[3][1]="true";
        cuento9[4][0]="¿el cuento se trata de un lobo?";
        cuento9[4][1]="false";
        cuento9[5][0]="¿hay cochinitos en el cuento ?";
        cuento9[5][1]="false";
//zapatero
        cuento10[0][0]="¿hay animales en el cuento?";
        cuento10[0][1]="false";
        cuento10[1][0]="¿este cuento habla de un pato?";
        cuento10[1][1]="false";
        cuento10[2][0]="¿hay agua en este cuento ?";
        cuento10[2][1]="false";
        cuento10[3][0]="¿hay personas en el cuento ?";
        cuento10[3][1]="true";
        cuento10[4][0]="¿el cuento se trata de un lobo?";
        cuento10[4][1]="false";
        cuento10[5][0]="¿hay cochinitos en el cuento ?";
        cuento10[5][1]="false";
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.verdadero){
            //cont++;
            if(cont<3){
                if(preguselecion[cont][1].equals("true")){
                    //Toast.makeText(this,"le atinaste perro",Toast.LENGTH_SHORT).show();

                    //cont++;
                    correct++;

                    if(cont>=2){
                        Escuchar("correcto");
                        actual.setText("!Completado¡");
                        contador.setText(" "+(cont+1));
                        correcto.setText(" "+correct);
                        Escuchar("no hay mas preguntas");
                    }else{
                        Escuchar("correcto");
                        actual.setText(preguselecion[cont+1][0]);
                        contador.setText(" "+(cont+1));
                        correcto.setText(" "+correct);
                    }

                }else{
                   // Toast.makeText(this,"que pendejo",Toast.LENGTH_SHORT).show();

                    //cont++;
                    if(cont>=2){
                        Escuchar("incorrecto");
                        actual.setText("¡completado!");
                        contador.setText(" "+(cont+1));
                        correcto.setText(" "+correct);
                        Escuchar("no hay mas preguntas");
                    }else{
                        Escuchar("incorrecto");
                        actual.setText(preguselecion[cont+1][0]);
                        contador.setText(" "+(cont+1));
                        correcto.setText(" "+correct);
                    }

                }
                cont++;
            }else{
                //Toast.makeText(this,"se acabaron las preguntas",Toast.LENGTH_SHORT).show();
                String te="felicidades obtuviste "+correct+" respuestas correctas";
                Escuchar("Buen trabajo");
                finish();
            }

        }
        if(v.getId()==R.id.falso){
            //cont++;
            if(cont<3){
                if(preguselecion[cont][1].equals("false")){
                    //Toast.makeText(this,"le atinaste perro",Toast.LENGTH_SHORT).show();

                    //cont++;
                    correct++;
                    if(cont>=2){
                        Escuchar("correcto");
                        actual.setText("!Completado¡");
                        contador.setText(" "+(cont+1));
                        correcto.setText(" "+correct);
                        Escuchar("no hay mas preguntas");
                    }else{
                        Escuchar("correcto");
                        actual.setText(preguselecion[cont+1][0]);
                        contador.setText(" "+(cont+1));
                        correcto.setText(" "+correct);
                    }
                }else{
                   // Toast.makeText(this,"que pendejo",Toast.LENGTH_SHORT).show();

                    //cont++;
                    //correct++;
                    if(cont>=2){
                        Escuchar("incorrecto");
                        actual.setText("¡compleatdo!");
                        contador.setText(" "+(cont+1));
                        correcto.setText(" "+correct);
                        Escuchar("no hay mas preguntas");
                    }else{
                        Escuchar("incorrecto");
                        actual.setText(preguselecion[cont+1][0]);
                        contador.setText(" "+(cont+1));
                        correcto.setText(" "+correct);
                    }

                }
                cont++;
            }else {
                //Toast.makeText(this,"se acabaron las preguntas",Toast.LENGTH_SHORT).show();
                String te="felicidades obtuviste "+correct+" respuestas correctas";
                Escuchar("Buen trabajo");
                finish();
            }


        }

        if(v.getId()==R.id.escuchar){
            if(cont<3){
                Escuchar(preguselecion[cont][0]);
            }else{

            }


        }
    }

    @Override
    public void onInit(int status) {
        Locale loc = new Locale("es", "","");
        if(tts.isLanguageAvailable(loc) >= TextToSpeech.LANG_AVAILABLE){
            tts.setLanguage(loc);
        }
        tts.speak("Contesta las siguientes preguntas", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void Escuchar(String texto){
        if(cont<3){
            tts.speak(texto, TextToSpeech.QUEUE_FLUSH, null);
        }else{

        }

    }
}
