package com.example.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView cake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cake = findViewById(R.id.ivCake);

        Picasso.get().
                load("https://www.carlogos.org/logo/BMW-M-logo-1920x1080.png").
                into(cake);


    }
}
