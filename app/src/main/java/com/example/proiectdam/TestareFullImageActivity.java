package com.example.proiectdam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class TestareFullImageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testare_full_image);
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        com.example.proiectdam.TestareAdapter imageAdapter = new
                com.example.proiectdam.TestareAdapter(this);
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.ImagineMica[position]);
    }
}