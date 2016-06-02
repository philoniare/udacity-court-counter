package com.example.philoniare.court_counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    @Bind(R.id.team_a_score) TextView tv_team_a_score;
    @Bind(R.id.team_b_score) TextView tv_team_b_score;

    private void addPointsToScoreTeamA(int pointsToAdd) {
        scoreTeamA += pointsToAdd;
    }

    private void addPointsToScoreTeamB(int pointsToAdd) {
        scoreTeamB += pointsToAdd;
    }

    private void displayScoreTeamA() {
        tv_team_a_score.setText(Integer.toString(scoreTeamA));
    }

    private void displayScoreTeamB() {
        tv_team_b_score.setText(Integer.toString(scoreTeamB));
    }

    @OnClick(R.id.team_a_three_points)
    public void add_three_points_team_a(View view) {
        addPointsToScoreTeamA(3);
        displayScoreTeamA();
    }

    @OnClick(R.id.team_b_three_points)
    public void add_three_points_team_b(View view) {
        addPointsToScoreTeamB(3);
        displayScoreTeamB();
    }

    @OnClick(R.id.team_a_two_points)
    public void add_two_points_team_a(View view) {
        addPointsToScoreTeamA(2);
        displayScoreTeamA();
    }

    @OnClick(R.id.team_b_two_points)
    public void add_two_points_team_b(View view) {
        addPointsToScoreTeamB(2);
        displayScoreTeamB();
    }

    @OnClick(R.id.team_a_free_throw)
    public void free_throw_team_a(View view) {
        addPointsToScoreTeamA(1);
        displayScoreTeamA();
    }

    @OnClick(R.id.team_b_free_throw)
    public void free_throw_team_b(View view) {
        addPointsToScoreTeamB(1);
        displayScoreTeamB();
    }

    @OnClick(R.id.reset_points)
    public void reset_points(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA();
        displayScoreTeamB();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
