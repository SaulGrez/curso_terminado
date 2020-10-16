package com.example.curso_php;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class multi_inter6 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_inter6);


        MediaController mediaController = new MediaController(this);

        videoView = findViewById(R.id.vid);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);



        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/php-app-5b4e1.appspot.com/o/Multimedia_intermedio%2F18.-%20Curso%20PHP%207%20-%20Array%20Multidimensional.mp4?alt=media&token=bda9dd1d-d139-41cb-beb2-3c21d2ce2da7");
        videoView.setVideoURI(uri);
        videoView.start();
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void ant_tema(View view) {
        Intent anterior = new Intent(this, multi_intermedio.class);
        startActivity(anterior);
        finish();
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}