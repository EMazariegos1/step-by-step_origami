package com.example.step_by_steporigami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InstructionsActivity extends AppCompatActivity {
    TextView origamiNameTV;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        origamiNameTV = findViewById(R.id.origami_name);
        image = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("origami_name_key");
        int instructions = intent.getIntExtra("origami_instructions_key", 0);

        origamiNameTV.setText(name);
        image.setImageDrawable(getDrawable(instructions));
    }
}