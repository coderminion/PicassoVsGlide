package com.coderminion.refreshlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    String URL_IMAGE = "https://raw.githubusercontent.com/coderminion/AndroidListViewGridView/master/app/src/main/res/drawable/selena.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Picasso.with(this).load(URL_IMAGE).into((ImageView) findViewById(R.id.picasso));
        Glide.with(this).load(URL_IMAGE).into((ImageView) findViewById(R.id.glide));

    }
}
