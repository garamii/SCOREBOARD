package com.example.android.scoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int aTeamTotalScore = 0;
    private int bTeamTotalScore = 0;
    private TextView aTeamPointView;
    private TextView bTeamPointView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aTeamPointView = (TextView) findViewById(R.id.aTeamTotalScore);
        bTeamPointView = (TextView) findViewById(R.id.bTeamTotalScore);
    }
  public void aSubmitScore(View view) {
      //A팀 버튼 클릭시 작동!
      if (view.getId() == R.id.aPlus3) {
          aTeamTotalScore += 3;
      } else if (view.getId() == R.id.aPlus2) {
          aTeamTotalScore += 2;
      } else if (view.getId() == R.id.aTeamFreeThrow) {
          aTeamTotalScore++;
      }
      aDisplayScore(aTeamTotalScore);
  }

  public void bSubmitScore(View view) {

      //A팀 버튼 클릭시 작동
      if (view.getId() == R.id.bPlus3) {
          bTeamTotalScore += 3;
      } else if (view.getId() == R.id.bPlus2) {
          bTeamTotalScore += 2;
      } else if (view.getId() == R.id.bTeamFreeThrow) {
          bTeamTotalScore++;
      }
        bDisplayScore(bTeamTotalScore);
      }
    public void submitReset(View view){
        if(view.getId() == R.id.reset){
            aTeamTotalScore =0;
            bTeamTotalScore =0;
        }
        aDisplayScore(aTeamTotalScore);
        bDisplayScore(bTeamTotalScore);
    }

   private void aDisplayScore(int number){
       aTeamPointView.setText("" + number);

    }

   private void bDisplayScore(int number){

       bTeamPointView.setText("" + number);
    }


}
