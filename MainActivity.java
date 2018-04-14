package com.example.android.fanthundercatquiz;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    String userName;


    // Method pulled from Submit Button

    public void onSubmit(View view) {
        int totalScore = 0;

        //Declaring user's answer variable
        String userAnswer;
        //Initiating the EditText box from .xml

        EditText grabbedText = findViewById(R.id.name_field);
        //Placing the captured text into the userName string
        userName = grabbedText.getText().toString();

        //Declaring the selected radio buttons numerical identity
        int question2Answer;

        //Declaring current radiobutton test
        RadioButton whichButton;

        // Setting up all radiogroups 1 through 7
        RadioGroup mRadioGroupQ1 = findViewById(R.id.q1);
        RadioGroup mRadioGroupQ2 = findViewById(R.id.q2);
        RadioGroup mRadioGroupQ3 = findViewById(R.id.q3);
        RadioGroup mRadioGroupQ4 = findViewById(R.id.q4);
        RadioGroup mRadioGroupQ5 = findViewById(R.id.q5);
        RadioGroup mRadioGroupQ6 = findViewById(R.id.q6);
        RadioGroup mRadioGroupQ7 = findViewById(R.id.q7);


        // Test if player's choice is correct and update the correctAnswer variable
        // get selected radio button from radioGroup
        question2Answer = mRadioGroupQ1.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        whichButton = findViewById(question2Answer);
        // Convert to string the value of the selected button selection
        userAnswer = whichButton.getText().toString();
        if (userAnswer.equals("Bengali")) {
            totalScore++;
        }

        // Test if player's choice is correct and update the correctAnswer variable
        // get selected radio button from radioGroup
        question2Answer = mRadioGroupQ2.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        whichButton = findViewById(question2Answer);
        // Convert to string the value of the selected button selection
        userAnswer = whichButton.getText().toString();
        if (userAnswer.equals("They fear him")) {
            totalScore++;
        }

        // Test if player's choice is correct and update the correctAnswer variable
        // get selected radio button from radioGroup
        question2Answer = mRadioGroupQ3.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        whichButton = findViewById(question2Answer);
        // Convert to string the value of the selected button selection
        userAnswer = whichButton.getText().toString();
        if (userAnswer.equals("Nunchucks")) {
            totalScore++;
        }

        // Test if player's choice is correct and update the correctAnswer variable
        // get selected radio button from radioGroup
        question2Answer = mRadioGroupQ4.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        whichButton = findViewById(question2Answer);
        // Convert to string the value of the selected button selection
        userAnswer = whichButton.getText().toString();
        if (userAnswer.equals("Fire")) {
            totalScore++;
        }

        // Test if player's choice is correct and update the correctAnswer variable
        // get selected radio button from radioGroup
        question2Answer = mRadioGroupQ5.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        whichButton = findViewById(question2Answer);
        // Convert to string the value of the selected button selection
        userAnswer = whichButton.getText().toString();
        if (userAnswer.equals("Lord")) {
            totalScore++;
        }

        // Test if player's choice is correct and update the correctAnswer variable
        // get selected radio button from radioGroup
        question2Answer = mRadioGroupQ6.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        whichButton = findViewById(question2Answer);
        // Convert to string the value of the selected button selection
        userAnswer = whichButton.getText().toString();
        if (userAnswer.equals("Bo staff")) {
            totalScore++;
        }
        // Test if player's choice is correct and update the correctAnswer variable
        // get selected radio button from radioGroup
        question2Answer = mRadioGroupQ7.getCheckedRadioButtonId();
        // find the radiobutton by returned id
        whichButton = findViewById(question2Answer);
        // Convert to string the value of the selected button selection
        userAnswer = whichButton.getText().toString();
        if (userAnswer.equals("invisibility")) {
            totalScore++;
        }

        // place code here for the checkboxes
        CheckBox cb1 = findViewById(R.id.True_checkbox);
        // Test for true answer
        if (cb1.isChecked()) {
            totalScore++;
        }

        // Possible Toast output for when the quiz has been tallied
        Toast.makeText(this, "Looks like " + userName + " has correctly answered " + totalScore + " questions out of a total of 8 questions.", Toast.LENGTH_LONG).show();
    }
}


