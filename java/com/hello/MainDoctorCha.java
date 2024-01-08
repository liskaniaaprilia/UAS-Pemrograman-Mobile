package com.hello;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainDoctorCha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorcha);

        VideoView videoView = findViewById(R.id.video_doctor);

        // Menggunakan Uri untuk mengonversi path video ke bentuk yang sesuai
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.doctor;
        Uri uri = Uri.parse(videoPath);

        // Set URI video ke VideoView
        videoView.setVideoURI(uri);

        // Membuat dan mengaitkan MediaController untuk memungkinkan kontrol video
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        // Memulai pemutaran video
        videoView.start();
    }
}
