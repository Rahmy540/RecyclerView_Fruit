package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView tvDetail, tvName;
    private ImageView ivPhoto;
    String detail, name;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivPhoto = findViewById(R.id.iv_fruit);
        tvName = findViewById(R.id.tv_fruit_name);
        tvDetail = findViewById(R.id.tv_fruit_detail);

        name = getIntent().getStringExtra("Name");
        detail = getIntent().getStringExtra("Detail");
        image = getIntent().getIntExtra("Image", 0);
        ivPhoto.setImageResource(image);
        tvName.setText(name);
        tvDetail.setText(detail);
    }
}