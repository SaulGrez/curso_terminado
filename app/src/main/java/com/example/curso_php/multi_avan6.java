package com.example.curso_php;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class multi_avan6 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_avan6);


        MediaController mediaController = new MediaController(this);

        videoView = findViewById(R.id.vid);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);



        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/php-app-5b4e1.appspot.com/o/Multimedia_avanzado%2FPHP%205-%20Excepciones%20-%20Ejemplo%20sencillo.mp4?alt=media&token=cc11f932-08f9-400d-be74-7f4fbb7c68d2");
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