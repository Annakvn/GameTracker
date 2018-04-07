package com.example.android.gametracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeam1;
    int goalsTeam2;
    int yellowCards1;
    int yellowCards2;
    int redCards1;
    int redCards2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method that displays the total goals in Score box for team 1
    public void displayGoalsForTeam1(int score){
        TextView scoreView = findViewById(R.id.team_1_Goals);
        scoreView.setText(String.valueOf(score));

    }
    //method that adds goals
    public void addGoalT1(View v){
        goalsTeam1 ++;
        displayGoalsForTeam1(goalsTeam1);
    }
    //method that displays the total goals in Score box for team 2
    public void displayGoalsForTeam2(int score){
        TextView scoreView = findViewById(R.id.team_2_Goals);
        scoreView.setText(String.valueOf(score));
    }
    //method that adds goals
    public void addGoalT2(View v){
        goalsTeam2 ++;
        displayGoalsForTeam2(goalsTeam2);
    }
    //method that displays the total red cards for team 1
    public void displayRedCardsForTeam1(int cards){
        TextView scoreView = findViewById(R.id.red_1_cards);
        scoreView.setText(String.valueOf(cards));
    }
    //method that adds red cards
    public void addRedCard1(View v){
        redCards1 ++;
        displayRedCardsForTeam1(redCards1);
    }
    //method that displays the total red cards for team 2
    public void displayRedCardsForTeam2(int cards){
        TextView scoreView = findViewById(R.id.red_2_cards);
        scoreView.setText(String.valueOf(cards));
    }
    //method that adds red cards
    public void addRedCard2(View v){
        redCards2 ++;
        displayRedCardsForTeam2(redCards2);
    }
    //method that displays the total yellow cards for team 1
    public void displayYellowCardsForTeam1(int cards){
        TextView scoreView = findViewById(R.id.yellow_1_cards);
        scoreView.setText(String.valueOf(cards));
    }
    //method that adds yellow cards
    public void addYellowCard1(View v){
        yellowCards1 ++;
        displayYellowCardsForTeam1(yellowCards1);
    }
    //method that displays the total yellow cards for team 2
    public void displayYellowCardsForTeam2(int cards){
        TextView scoreView = findViewById(R.id.yellow_2_cards);
        scoreView.setText(String.valueOf(cards));
    }
    //method that adds yellow cards
    public void addYellowCard2(View v){
        yellowCards2 ++;
        displayYellowCardsForTeam2(yellowCards2);
    }
    //method that adds yellow cards
    public void resetsAllScores(View v){
        goalsTeam1 = 0;
        goalsTeam2 = 0;
        redCards2 = 0;
        redCards1 = 0;
        yellowCards1 = 0;
        yellowCards2 = 0;
        displayGoalsForTeam1(goalsTeam1);
        displayGoalsForTeam2(goalsTeam2);
        displayRedCardsForTeam1(redCards1);
        displayRedCardsForTeam2(redCards2);
        displayYellowCardsForTeam1(yellowCards1);
        displayYellowCardsForTeam2(yellowCards2);
    }
}
