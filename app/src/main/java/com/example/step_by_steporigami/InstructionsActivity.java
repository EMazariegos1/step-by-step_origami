package com.example.step_by_steporigami;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.List;

public class InstructionsActivity extends AppCompatActivity {
    TextView origamiNameTV;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        origamiNameTV = findViewById(R.id.origami_name);


        Intent intent = getIntent();
        String name = intent.getStringExtra("origami_name_key");
        position = intent.getIntExtra("origami_instructions_key", 0);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragmentContainerView2, InstructionListFragment.newInstance(position)).commit();

        origamiNameTV.setText(name);
    }

}