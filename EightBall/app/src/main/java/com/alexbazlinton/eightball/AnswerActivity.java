package com.alexbazlinton.eightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    private TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerTextView = findViewById(R.id.answerTextView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String randomAnswer = extras.getString("randomAnswer");

        answerTextView.setText(randomAnswer);


    }
}
