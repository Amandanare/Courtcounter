package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class courtCounter extends AppCompatActivity {
    int score = 0;
    int scoreb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
    }

    /**
     * Increase the score of Team A by 3 points.
     */
    public void addThreeForTeamA(View a) {
        score = score+ 3;
        displayForTeamA(score);
    }

    /**
     * Increase the score of team A by 2 points.
     */
    public void addTwoForTeamA(View a){
        score = score +2;
        displayForTeamA(score);
}

    /**
     * Increase the score of team A by 1 point.
     */

    public void addOneForTeamA(View a){
        score =  score + 1;
        displayForTeamA(score);
    }

    public void resetScore(){

    }

    public void displayForTeamA (int score){
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
                scoreview.setText(String.valueOf(score));
    }


    public void displayForTeamB (int score){
        TextView scoreview = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
}

    /**
     * Increase the scores of teamB by 3
     */
    public void addThreeForTeamB (View a){
     scoreb = scoreb + 3;
        displayForTeamB(scoreb);
    }

    /**
     * Increase the scores of teamB with 2
     */
    public void addTwoForTeamB(View a){
        scoreb= scoreb +2;
        displayForTeamB(scoreb);
    }

    /**
     * Increase the scores of teamB by 1
     */
    public void addOneForTeamB (View a){
        scoreb = scoreb + 1;
        displayForTeamB(scoreb);
    }

    /**
     * Reset the scores of teamA and teamB
     */
    public void resetScore (View a){
    score= 0;
    scoreb= 0;
    displayForTeamA(score);
    displayForTeamB(scoreb);
}

}
