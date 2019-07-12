package com.example.basictranslator;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer speakEnglish;
    private MediaPlayer goodEvening;
    private MediaPlayer hello;
    private MediaPlayer howAreYou;
    private MediaPlayer iLiveIn;
    private MediaPlayer myNameIs;
    private MediaPlayer please;
    private MediaPlayer welcome;




    public void interact(View view){
        Log.i("Status","Button licked");
        Button accessView = (Button) view; //makes view a button called accessView
        int tag = Integer.parseInt(accessView.getTag().toString()); //get the tag from the view (ie buttons #1-8) and converts that to a string.
                                                                    // Which is then converted to int.
        Log.i("Tag #", " "+ tag);

        if(tag == 0){
            speakEnglish.start();
        }
        if(tag == 1){
            goodEvening.start();
        }
        if(tag == 2){
            hello.start();
        }
        if(tag == 3){
            howAreYou.start();
        }
        if(tag == 4){
            iLiveIn.start();
        }
        if(tag==5){
            myNameIs.start();
        }
        if(tag == 6){
            please.start();
        }
        if(tag == 7){
            welcome.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speakEnglish = MediaPlayer.create(this,R.raw.doyouspeakenglish);
        goodEvening = MediaPlayer.create(this,R.raw.goodevening);
        hello = MediaPlayer.create(this,R.raw.hello);
        howAreYou = MediaPlayer.create(this,R.raw.howareyou);
        iLiveIn = MediaPlayer.create(this,R.raw.ilivein);
        myNameIs = MediaPlayer.create(this,R.raw.mynameis);
        please = MediaPlayer.create(this,R.raw.please);
        welcome = MediaPlayer.create(this,R.raw.welcome);
    }
}
