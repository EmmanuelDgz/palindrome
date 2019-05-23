package com.emmanuel.palindrome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPalindrome = findViewById(R.id.btnPalindrome);
        Button btnAmigos = findViewById(R.id.btnNumAmigos);

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pal_activity = new Intent(MainActivity.this, Palindrome.class);
                startActivity(pal_activity);
            }
        });

        btnAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amigos_activity = new Intent(MainActivity.this, Amigos.class);
                startActivity(amigos_activity);
            }
        });
    }
}
