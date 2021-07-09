package com.codepath.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PostDetailsActivity extends AppCompatActivity {

    TextView tvDate;
    TextView tvDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);
        tvDate = findViewById(R.id.tvDate);
        tvDescription = findViewById(R.id.tvDescription);

        String createdAt = getIntent().getStringExtra("createdAt");
        String description = getIntent().getStringExtra("caption");
        // set the title and overview
        //Log.i("postdetails",createdAt);
        tvDate.setText(createdAt);
        tvDescription.setText(description);

    }
}