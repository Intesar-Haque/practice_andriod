package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView iconImageView = findViewById(R.id.imageView4);
        iconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle icon click here
                replaceSpaceWithNewFragment();
            }
        });
    }

    private void replaceSpaceWithNewFragment() {
        // Create an instance of YourNewFragment
        HomeFragment yourNewFragment = new HomeFragment();

        // Replace the Space with YourNewFragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, yourNewFragment)
                .addToBackStack(null) // Optional: Add the transaction to the back stack
                .commit();
    }
}
