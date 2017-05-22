package com.example.martin.myapplication;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConstraintSet constraintSet = new ConstraintSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(this).inflate(R.layout.activity_main, null);
        constraintSet.clone(constraintLayout);

        // START WORKS
        //constraintSet.connect(R.id.text, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 50);
        // LEFT DOES NOT
        constraintSet.connect(R.id.text, ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 50);
        constraintSet.connect(R.id.text, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, 50);
        constraintSet.connect(R.id.text, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 50);
        constraintSet.connect(R.id.text, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 50);

        constraintSet.applyTo(constraintLayout);

        setContentView(constraintLayout);
    }
}
