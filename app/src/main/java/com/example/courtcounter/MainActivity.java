package com.example.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
{
    TextView textView_teamA_score;
    TextView textView_teamB_score;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_teamA_score = (TextView) findViewById(R.id.textView_teamA_score);
        textView_teamB_score = (TextView) findViewById(R.id.textView_teamB_score);
    }

    public void onClick_button(View v)
    {
        int teamA_score = Integer.parseInt(textView_teamA_score.getText().toString());
        teamA_score = teamA_score + 3;
        textView_teamA_score.setText(Integer.toString(teamA_score));
    }
    public void onClick_button2(View v)
    {
        int teamA_score = Integer.parseInt(textView_teamA_score.getText().toString());
        teamA_score = teamA_score + 2;
        textView_teamA_score.setText(Integer.toString(teamA_score));
    }
    public void onClick_button3(View v)
    {
        int teamA_score = Integer.parseInt(textView_teamA_score.getText().toString());
        teamA_score++;
        textView_teamA_score.setText(Integer.toString(teamA_score));
    }
    public void onClick_button4(View v)
    {
        int teamB_score = Integer.parseInt(textView_teamB_score.getText().toString());
        teamB_score = teamB_score + 3;
        textView_teamB_score.setText(Integer.toString(teamB_score));
    }
    public void onClick_button5(View v)
    {
        int teamB_score = Integer.parseInt(textView_teamB_score.getText().toString());
        teamB_score = teamB_score + 2;
        textView_teamB_score.setText(Integer.toString(teamB_score));
    }
    public void onClick_button6(View v)
    {
        int teamB_score = Integer.parseInt(textView_teamB_score.getText().toString());
        teamB_score++;
        textView_teamB_score.setText(Integer.toString(teamB_score));
    }
    public void onClick_button7(View v)
    {
        textView_teamA_score.setText("0");
        textView_teamB_score.setText("0");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
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
}
