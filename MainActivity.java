package com.example.android.fanthundercatquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButton1Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer1A:
                if (button1Checked)
                    break;
            case R.id.answer1B:
                if (button1Checked)
                    break;
            case R.id.answer1C:
                if (button1Checked)
                    break;
            case R.id.answer1D:
                if (button1Checked)
                    totalScore = totalScore + 1;
                break;
        }
    }
    public void onRadioButton2Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer2A:
                if (button1Checked)
                    break;
            case R.id.answer2B:
                if (button1Checked)
                    break;
            case R.id.answer2C:
                if (button1Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.answer2D:
                if (button1Checked)
                    break;
        }
    }
    public void onRadioButton3Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer3A:
                if (button1Checked)
                    break;
            case R.id.answer3B:
                if (button1Checked)
                    break;
            case R.id.answer3C:
                if (button1Checked)
                    totalScore = totalScore + 1;
                break;
            case R.id.answer3D:
                if (button1Checked)
                    break;
        }
    }
    public void onRadioButton4Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer4A:
                if (button1Checked)
                    totalScore = totalScore + 1;
                    break;
            case R.id.answer4B:
                if (button1Checked)
                    break;
            case R.id.answer4C:
                if (button1Checked)
                    break;
            case R.id.answer4D:
                if (button1Checked)
                    break;
        }
    }
    public void onRadioButton5Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer5A:
                if (button1Checked)
                    totalScore = totalScore + 1;
                break;
            case R.id.answer5B:
                if (button1Checked)
                    break;
            case R.id.answer5C:
                if (button1Checked)
                    break;
            case R.id.answer5D:
                if (button1Checked)
                    break;
        }
    }
    public void onRadioButton6Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer6A:
                if (button1Checked)
                    break;
            case R.id.answer6B:
                if (button1Checked)
                    break;
            case R.id.answer6C:
                if (button1Checked)
                    break;
            case R.id.answer6D:
                if (button1Checked)
                    totalScore = totalScore + 1;
                    break;
        }
    }
    public void onRadioButton7Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        //Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer7A:
                if (button1Checked)
                    break;
            case R.id.answer7B:
                if (button1Checked)
                    break;
            case R.id.answer7C:
                if (button1Checked)
                    totalScore = totalScore + 1;
                    break;
        }

}
    private void Thank_You(View view) {
        if (totalScore == 0) {
            // Displays toast which shows the failure score message
            Toast.makeText(this, "Sorry, you got " + totalScore + " questions right. Try again.", Toast.LENGTH_SHORT).show();
        } else if (totalScore == 1){
            // Displays toast which shows the 1 question right score message
            Toast.makeText(this, "You got " + totalScore + " question right!", Toast.LENGTH_SHORT).show();
        } else if (totalScore >= 2) {
            // Displays toast which shows the success score message
            Toast.makeText(this, "Congratulations! You got " + totalScore + " questions right!", Toast.LENGTH_SHORT).show();
        }

    }
    }