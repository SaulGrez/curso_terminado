package com.example.curso_php;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class multi_avan5 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_avan5);


        MediaController mediaController = new MediaController(this);

        videoView = findViewById(R.id.vid);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);



        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/php-app-5b4e1.appspot.com/o/Multimedia_avanzado%2FSesiones%20en%20PHP%20-%20Uso%20de%20Sesiones%20en%20PHP%20-%20Ejemplos%20de%20Sesiones%20en%20PHP%20-%20FACILITO%20PHP%2020-PARTE%201.mp4?alt=media&token=e4c286d3-7297-44bb-9c57-ae862ffaafa5");
        videoView.setVideoURI(uri);
        videoView.start();
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void ant_tema(View view) {
        Intent anterior = new Intent(this, multi_avanzado.class);
        startActivity(anterior);
        finish();
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}