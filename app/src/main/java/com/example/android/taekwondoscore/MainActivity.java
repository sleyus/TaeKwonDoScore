package com.example.android.taekwondoscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scorePlayerA = 0;
    private int scorePlayerB = 0;
    private int scoreKyounggoPlayerA=0;
    private int scoreKyounggoPlayerB=0;

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
        scorePlayerA ++;
        displayForPlayerA(scorePlayerA);
    }
    public void addTwoForPlayerA(View v) {
        scorePlayerA +=2;
        displayForPlayerA(scorePlayerA);
    }
    public void addThreeForPlayerA(View v) {
        scorePlayerA +=3;
        displayForPlayerA(scorePlayerA);
    }
    public void addFourForPlayerA(View v) {
        scorePlayerA +=4;
        displayForPlayerA(scorePlayerA);
    }
    public void minusOneForPlayerA(View v) {
        scorePlayerA -=1;
        displayForPlayerA(scorePlayerA);
    }
    public void addOneForKyounggoPlayerA(View v){

            if (scoreKyounggoPlayerA ==1) {
                scoreKyounggoPlayerA=0;
                displayKyounggoPlayerA(scoreKyounggoPlayerA);
                scorePlayerA--;
                displayForPlayerA(scorePlayerA);
            }
        else {
                scoreKyounggoPlayerA++;
                displayKyounggoPlayerA(scoreKyounggoPlayerA);
            }
    }
    public void addOneForPlayerB(View v) {
        scorePlayerB += 1;
        displayForPlayerB(scorePlayerB);
    }
    public void addTwoForPlayerB(View v) {
        scorePlayerB += 2;
        displayForPlayerB(scorePlayerB);
    }
    public void addThreeForPlayerB(View v) {
        scorePlayerB += 3;
        displayForPlayerB(scorePlayerB);
    }
    public void addFourForPlayerB(View v) {
        scorePlayerB += 4;
        displayForPlayerB(scorePlayerB);
    }
    public void minusOneForPlayerB(View v) {
        scorePlayerB -=1;
        displayForPlayerB(scorePlayerB);
    }

    public void addOneForKyounggoPlayerB(View v) {

        if (scoreKyounggoPlayerB == 1) {
            scoreKyounggoPlayerB = 0;
            displayKyounggoPlayerB(scoreKyounggoPlayerB);
            scorePlayerB--;
            displayForPlayerB(scorePlayerB);
        } else {
            scoreKyounggoPlayerB++;
            displayKyounggoPlayerB(scoreKyounggoPlayerB);
        }
    }
    public void resetScore(View v){
        scorePlayerA = 0;
        scorePlayerB = 0;
        scoreKyounggoPlayerA = 0;
        scoreKyounggoPlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
        displayKyounggoPlayerA(scoreKyounggoPlayerA);
        displayKyounggoPlayerB(scoreKyounggoPlayerB);
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
