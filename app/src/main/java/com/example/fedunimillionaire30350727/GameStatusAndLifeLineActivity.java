package com.example.fedunimillionaire30350727;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fedunimillionaire30350727.Models.GameUtil;


public class GameStatusAndLifeLineActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_status_and_life_line);

        Button btn1 = (Button) findViewById(R.id.btn_half_lifeline);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.btn_ask_the_audience);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.btn_switch_question);
        btn3.setOnClickListener(this);


        TextView questionStat = (TextView) findViewById(R.id.question_gameStatus);
        questionStat.setText(questionStat.getText() + "You are on question: " + GameUtil.getCurrentQuiz() + "\n");
        questionStat.setText(questionStat.getText() + "You have won safe money: " + "$" + GameUtil.getSafeMoneyWon() + "\n");
        questionStat.setText(questionStat.getText() + "You have remaining " + (11 - GameUtil.getCurrentQuiz()) + " quiz to answer");

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_half_lifeline:

                Toast.makeText(this, "LIFELIEN", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_ask_the_audience:
                Toast.makeText(this, "ASKAUDIENCE", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btn_switch_question:
                Toast.makeText(this, "SWITEH", Toast.LENGTH_SHORT).show();
                break;

            default:

        }
    }
}