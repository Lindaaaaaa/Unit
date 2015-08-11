package com.example.unit;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by mac on 02/08/2015.
 */

public class Splash extends Activity {
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle Ilike) {
        super.onCreate(Ilike);
        setContentView(R.layout.splash);
        song=MediaPlayer.create(Splash.this,R.raw.firecrac4);
        song.start();
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openMyActivity=new Intent("com.example.unit.Menu");
                   startActivity(openMyActivity);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        song.release();
        finish();
    }
}

