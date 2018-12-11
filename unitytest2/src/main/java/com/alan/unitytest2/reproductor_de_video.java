package com.alan.unitytest2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class reproductor_de_video extends AppCompatActivity {
    VideoView simpleVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_de_video);

        simpleVideoView = (VideoView) findViewById(R.id.simpleVideoView);
        String ruta="android.resource://" + getPackageName() + "/" + R.raw.monstruo;
        simpleVideoView.setVideoURI(Uri.parse(ruta));

        MediaController media=new MediaController(this);
        simpleVideoView.setMediaController(media);
        media.setAnchorView(simpleVideoView);
    }
}
