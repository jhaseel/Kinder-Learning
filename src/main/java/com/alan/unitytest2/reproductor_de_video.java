package com.alan.unitytest2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.alan.unitytest2.recycler.Preguntas;

public class reproductor_de_video extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    VideoView simpleVideoView;
    private Bundle args = new Bundle();
    private int url=R.raw.monstruo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_reproductor_de_video);
        setContentView(R.layout.activity_reproductor_de_video);

        getSupportActionBar().hide();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            url = bundle.getInt("url");

        } else {
            Log.d("no se recibio nada", "     ");
        }

        simpleVideoView = (VideoView) findViewById(R.id.simpleVideoView);
        String ruta="android.resource://" + getPackageName() + "/" + url;
        simpleVideoView.setVideoURI(Uri.parse(ruta));
        MediaController media=new MediaController(this);
        simpleVideoView.setMediaController(media);
        media.setAnchorView(simpleVideoView);

        simpleVideoView.start();

        simpleVideoView.setOnCompletionListener(this);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        String mensaje="id cuneto : "+url;
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
        Intent pre = new Intent(this,Preguntas.class);
        pre.putExtra("id",url);
        startActivity(pre);
        finish();
    }
}
