package com.example.ali_pc.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Questions questions = new Questions();
    private TextView mScore;
    private TextView mQuesv1;
    private Button btnc1;
    private Button btnc2;
    private Button btnc;
    private Button btnc3;
    private String mAnswer;
    private int i = 0;
    private int quesNo = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScore = (TextView) findViewById(R.id.score);
        mQuesv1 = (TextView) findViewById(R.id.ques);
        btnc1 = (Button) findViewById(R.id.btn1);
        btnc2 = (Button) findViewById(R.id.bt21);
        btnc = (Button) findViewById(R.id.btn3);
        btnc3= (Button) findViewById(R.id.btn4);
        updateQuestion();

        btnc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnc1.getText()== mAnswer)
                {
                    i = i + 1;
                    updateScore(i);
                    updateQuestion();
                    Toast.makeText(MainActivity.this,"Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(MainActivity.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        btnc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnc2.getText()== mAnswer)
                {
                    i = i + 1;
                    updateScore(i);
                    updateQuestion();
                    Toast.makeText(MainActivity.this,"Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(MainActivity.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnc.getText()== mAnswer)
                {
                    i = i + 1;
                    updateScore(i);
                    updateQuestion();
                    Toast.makeText(MainActivity.this,"Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(MainActivity.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        btnc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnc3.getText()== mAnswer)
                {
                    i = i + 1;
                    updateScore(i);
                    updateQuestion();
                    Toast.makeText(MainActivity.this,"Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(MainActivity.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }
    private void updateQuestion (){
         mQuesv1.setText(questions.getQues(quesNo));
        btnc1.setText(questions.getChoice1(quesNo));
        btnc2.setText(questions.getChoice2(quesNo));
        btnc.setText(questions.getChoice3(quesNo));
        btnc3.setText(questions.getChoice4(quesNo));

        mAnswer = questions.getAnswer(quesNo);
        quesNo++;

    }

    private void updateScore (int point){

        mScore.setText(""+i);
    }
}
