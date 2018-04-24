package com.alexbazlinton.eightball;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EightBallActivity extends AppCompatActivity {

  private EditText questionEditText;
  private Button shakeButton;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_eight_ball);

    questionEditText = findViewById(R.id.questionEditText);
    shakeButton = findViewById(R.id.shakeButton);


  }

  public void onShakeButtonClicked(View button){

    AnswerProvider answerProvider = new AnswerProvider();
    EightBall eightBall = new EightBall(answerProvider);
    String randomAnswer = eightBall.randomAnswer();


    String question = questionEditText.getText().toString();
    Log.d(getClass().toString(), "The question asked was" + question);

    Intent intent = new Intent(this, AnswerActivity.class);
    intent.putExtra("randomAnswer", randomAnswer);
    startActivity(intent);
  }






}
