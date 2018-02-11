package com.example.android.footballScoreKeeper;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreSlovakia ;
    int scoreItaly ;
    int foulsSlovakia;
    int foulsItaly;
    TextView slovakGoals;
    TextView italyGoals;
    TextView slovakFouls;
    TextView italyFouls;
    String keyScoreS;
    String keyScoreI;
    String keyFoulS;
    String keyFoulsI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slovakGoals = (TextView) findViewById(R.id.team_a_score);
        slovakFouls = (TextView) findViewById(R.id.team_a_fouls);
        italyGoals = (TextView) findViewById(R.id.team_b_score);
        italyFouls = (TextView) findViewById(R.id.team_b_fouls);

        foulsItaly = 0;
        foulsSlovakia = 0;
        scoreSlovakia = 0;
        scoreItaly = 0;
        displayForSlovakia(scoreSlovakia);
        displayForItaly(scoreItaly);
        displayFoulsItaly(foulsItaly);
        displayFoulsSlovakia(foulsSlovakia);
        keyScoreS = "scoreSlovakia";
        keyScoreI = "scoreItaly";
        keyFoulS = "foulsSlovakia";
        keyFoulsI = "foulsItaly";
    }

    /**
     * Before the app is about to "die", we have the score in the bundle using this method
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ;
        outState.putInt("keyScoreS", scoreSlovakia);
        outState.putInt("keyScoreI", scoreItaly);
        outState.putInt("keyFoulsS", foulsSlovakia);
        outState.putInt("keyFoulsI", foulsItaly);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreSlovakia = savedInstanceState.getInt("keyScoreS");
        scoreItaly = savedInstanceState.getInt("keyScoreI");
        foulsSlovakia = savedInstanceState.getInt("keyFoulsS");
        foulsItaly = savedInstanceState.getInt("keyFoulsI");
        displayForSlovakia(scoreSlovakia);
        displayForItaly(scoreItaly);
        displayFoulsItaly(foulsItaly);
        displayFoulsSlovakia(foulsSlovakia);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForSlovakia(int score) {
         slovakGoals.setText(String.valueOf(score));
    }

        /**
         * Displays the fouls score for Team A.
         */
    public void displayFoulsSlovakia(int score) {
        slovakFouls.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForItaly(int score) {
        italyGoals.setText(String.valueOf(score));
    }

        /**
         * Displays the fouls score for Team B.
         */
    public void displayFoulsItaly(int score) {
        italyFouls.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void goalSlovakia(View v) {
        scoreSlovakia = scoreSlovakia + 1;
        displayForSlovakia(scoreSlovakia);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void directKickSlovakia(View v) {
        scoreSlovakia = scoreSlovakia + 1;
        displayForSlovakia(scoreSlovakia);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void penaltySlovakia(View v) {
        scoreSlovakia = scoreSlovakia + 1;
        displayForSlovakia(scoreSlovakia);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void PenaltyItaly(View v) {
        scoreItaly = scoreItaly + 1;
        displayForItaly(scoreItaly);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreSlovakia = 0;
        scoreItaly = 0;
        foulsSlovakia = 0;
        foulsItaly = 0;
        displayForSlovakia(scoreSlovakia);
        displayForItaly(scoreItaly);
        displayFoulsSlovakia(foulsSlovakia);
        displayFoulsItaly(foulsItaly);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void directKickItaly(View v) {
        scoreItaly = scoreItaly + 1;
        displayForItaly(scoreItaly);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void goalItaly(View v) {
        scoreItaly = scoreItaly + 1;
        displayForItaly(scoreItaly);
    }

    /**
     * Increase the fouls for Team B by 1 point.
     */
    public void foulsItaly(View v) {
        foulsItaly = foulsItaly + 1;
        displayFoulsItaly(foulsItaly);
    }

    /**
     * Increase the fouls for Team B by 1 point.
     */
    public void foulsSlovakia(View v) {
        foulsSlovakia = foulsSlovakia + 1;
        displayFoulsSlovakia(foulsSlovakia);
    }



}
