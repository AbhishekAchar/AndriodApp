package com.example.afforestation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.os.Handler;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    VideoView videoView =(VideoView)findViewById(R.id.vdVw);
    //Set MediaController  to enable play, pause, forward, etc options.
    MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
    //Location of Media File
    Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.growing_tree_animation);
    //Starting VideView By Setting MediaController and URI
        //videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, homepage.class);
                startActivity(i);
                finish();
            }
        }, 1000);

    }


}



