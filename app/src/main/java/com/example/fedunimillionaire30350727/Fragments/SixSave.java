package com.example.fedunimillionaire30350727.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fedunimillionaire30350727.Models.GameUtil;
import com.example.fedunimillionaire30350727.Models.Question;
import com.example.fedunimillionaire30350727.R;

import java.util.ArrayList;

public class SixSave extends Fragment implements View.OnClickListener{

    ArrayList<Question> questions;
    int saved;

    private TextView amount;
    private Button collect, neglect;

    public SixSave(ArrayList<Question> questions, int saved){
        this.questions = questions;
        this.saved = saved;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.save_fagment, container, false);

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        amount = view.findViewById(R.id.amount);
        view.findViewById(R.id.save).setOnClickListener(this);

        amount.append("You Won $"+32000);
    }

    @Override
    public void onClick(View v) {
            if(v.getId()==R.id.save){
                saved = 32000;
                GameUtil.setSafeMoneyWon(3200);
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.questions_holder, new Question7Fragment(questions,saved))
                        .commit();

        }
    }
}
