package com.example.fedunimillionaire30350727;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fedunimillionaire30350727.Models.GameUtil;


public class GameStatusAndLifeLineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_status_and_life_line);

        TextView questionStat=(TextView)findViewById(R.id.question_gameStatus);
        questionStat.setText(questionStat.getText()+"You are on question: "+ GameUtil.getCurrentQuiz()+"\n");
        questionStat.setText(questionStat.getText()+"You have won safe money: "+"$"+GameUtil.getSafeMoneyWon()+"\n");
        questionStat.setText(questionStat.getText()+"You have remaining "+ (11-GameUtil.getCurrentQuiz())+" quiz to answer");
    }

}