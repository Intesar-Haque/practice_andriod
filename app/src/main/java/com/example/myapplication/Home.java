package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView homeImageView = findViewById(R.id.imageView4);
        ImageView searchImageView = findViewById(R.id.imageView5);
        ImageView profileImageView = findViewById(R.id.imageView6);
        ImageView refreshImageView = findViewById(R.id.imageView7);

        homeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Home icon click
                replaceSpaceWithNewFragment(new HomeFragment());
            }
        });
        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceSpaceWithNewFragment(new Profile());
            }
        });
    }


    private void replaceSpaceWithNewFragment(Fragment fragment) {

        // Replace the Space with YourNewFragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null) // Optional: Add the transaction to the back stack
                .commit();
    }
}
