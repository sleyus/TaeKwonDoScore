package com.example.android.taekwondoscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScorePlayerA = 0;
    int ScorePlayerB = 0;
    int ScoreKyounggoPlayerA=0;
    int ScoreKyounggoPlayerB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayerA(0);
        displayForPlayerB(0);
        displayKyounggoPlayerA(0);
        displayKyounggoPlayerB(0);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void addOneForPlayerA(View v) {
        ScorePlayerA = ScorePlayerA + 1;
        displayForPlayerA(ScorePlayerA);
    }
    public void addTwoForPlayerA(View v) {
        ScorePlayerA = ScorePlayerA + 2;
        displayForPlayerA(ScorePlayerA);
    }
    public void addThreeForPlayerA(View v) {
        ScorePlayerA = ScorePlayerA + 3;
        displayForPlayerA(ScorePlayerA);
    }
    public void addFourForPlayerA(View v) {
        ScorePlayerA = ScorePlayerA + 4;
        displayForPlayerA(ScorePlayerA);
    }
    public void minusOneForPlayerA(View v) {
        ScorePlayerA = ScorePlayerA -1;
        displayForPlayerA(ScorePlayerA);
    }
    public void addOneForKyounggoPlayerA(View v){

            if (ScoreKyounggoPlayerA ==1) {
                ScoreKyounggoPlayerA=0;
                displayKyounggoPlayerA(ScoreKyounggoPlayerA);
                ScorePlayerA--;
                displayForPlayerA(ScorePlayerA);
            }
        else {
                ScoreKyounggoPlayerA++;
                displayKyounggoPlayerA(ScoreKyounggoPlayerA);
            }
    }
    public void addOneForPlayerB(View v) {
        ScorePlayerB = ScorePlayerB + 1;
        displayForPlayerB(ScorePlayerB);
    }
    public void addTwoForPlayerB(View v) {
        ScorePlayerB = ScorePlayerB + 2;
        displayForPlayerB(ScorePlayerB);
    }
    public void addThreeForPlayerB(View v) {
        ScorePlayerB = ScorePlayerB + 3;
        displayForPlayerB(ScorePlayerB);
    }
    public void addFourForPlayerB(View v) {
        ScorePlayerB = ScorePlayerB + 4;
        displayForPlayerB(ScorePlayerB);
    }
    public void minusOneForPlayerB(View v) {
        ScorePlayerB = ScorePlayerB -1;
        displayForPlayerB(ScorePlayerB);
    }

    public void addOneForKyounggoPlayerB(View v) {

        if (ScoreKyounggoPlayerB == 1) {
            ScoreKyounggoPlayerB = 0;
            displayKyounggoPlayerB(ScoreKyounggoPlayerB);
            ScorePlayerB--;
            displayForPlayerB(ScorePlayerB);
        } else {
            ScoreKyounggoPlayerB++;
            displayKyounggoPlayerB(ScoreKyounggoPlayerB);
        }
    }
    public void resetScore(View v){
        ScorePlayerA = 0;
        ScorePlayerB = 0;
        ScoreKyounggoPlayerA = 0;
        ScoreKyounggoPlayerB = 0;
        displayForPlayerA(ScorePlayerA);
        displayForPlayerB(ScorePlayerB);
        displayKyounggoPlayerA(ScoreKyounggoPlayerA);
        displayKyounggoPlayerB(ScoreKyounggoPlayerB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayKyounggoPlayerA(int scoreKyounggo){
        TextView scoreView = (TextView) findViewById(R.id.player_a_kyonggo);
        scoreView.setText(String.valueOf(scoreKyounggo));
    }
    public void displayKyounggoPlayerB(int scoreKyounggo){
        TextView scoreView = (TextView) findViewById(R.id.player_b_kyonggo);
        scoreView.setText(String.valueOf(scoreKyounggo));
    }
}
