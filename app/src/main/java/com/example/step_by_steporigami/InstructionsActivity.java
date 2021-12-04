package com.example.step_by_steporigami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class InstructionsActivity extends AppCompatActivity {
    TextView origamiNameTV;
    TableRow images;
    TableRow descriptions;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        origamiNameTV = findViewById(R.id.origami_name);
        images = findViewById(R.id.Image_row);
        descriptions = findViewById(R.id.description_row);

        Intent intent = getIntent();
        String name = intent.getStringExtra("origami_name_key");
        position = intent.getIntExtra("origami_instructions_key", 0);

        origamiNameTV.setText(name);
        fillGallery();
    }

    private void fillGallery() {
        ImageView image;
        TextView description;

        for(int i = 0; i < OrigamiDB.instructions[position].length; i++){
            image = new ImageView(this);
            description = new TextView(this);
            image.setImageDrawable(getDrawable(OrigamiDB.instructions[position][i]));
            description.setText(OrigamiDB.descriptions[position][i]);
            images.addView(image);
            descriptions.addView(description);
        }
    }
}