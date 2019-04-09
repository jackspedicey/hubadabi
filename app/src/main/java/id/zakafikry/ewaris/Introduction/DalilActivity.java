package id.zakafikry.ewaris.Introduction;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import id.zakafikry.ewaris.R;

public class DalilActivity extends AppCompatActivity {
    ImageButton play1, play2, play3;
    MediaPlayer annisa11, annisa12, annisa176;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalil);
        setTitle("Dalil");

        annisa11 = MediaPlayer.create(DalilActivity.this, R.raw.annisa11);
        annisa12 = MediaPlayer.create(DalilActivity.this, R.raw.annisa12);
        annisa176 = MediaPlayer.create(DalilActivity.this, R.raw.annisa176);

        play1 = findViewById(R.id.btnPlay1);
        play2 = findViewById(R.id.btnPlay2);
        play3 = findViewById(R.id.btnPlay3);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (annisa11.isPlaying()) {
                    annisa11.pause();
                } else {
                    stopPlayer();
                    annisa11 = MediaPlayer.create(DalilActivity.this, R.raw.annisa11);
                    annisa11.setVolume(50, 50);
                    annisa11.start();
                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (annisa12.isPlaying()) {
                    annisa12.pause();
                } else {
                    stopPlayer();
                    annisa12 = MediaPlayer.create(DalilActivity.this, R.raw.annisa12);
                    annisa12.setVolume(50, 50);
                    annisa12.start();
                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (annisa176.isPlaying()) {
                    annisa176.pause();
                } else {
                    stopPlayer();
                    annisa176 = MediaPlayer.create(DalilActivity.this, R.raw.annisa176);
                    annisa176.setVolume(50, 50);
                    annisa176.start();
                }
            }
        });
    }

    private void stopPlayer() {
        if (annisa11.isPlaying()) {
            annisa11.stop();
        }
        if (annisa12.isPlaying()) {
            annisa12.stop();
        }
        if (annisa176.isPlaying()) {
            annisa176.stop();
        }
    }

    public void onBackPressed() {
        finish();
        annisa11.stop();
        annisa12.stop();
        annisa176.stop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        annisa11.stop();
        annisa11.release();

        annisa12.stop();
        annisa12.release();

        annisa176.stop();
        annisa176.release();
    }

    public void stop() {
        if (annisa11 != null) {
            annisa11.release();
            annisa11 = null;
        }

        if (annisa12 != null) {
            annisa12.release();
            annisa12 = null;
        }

        if (annisa176 != null) {
            annisa176.release();
            annisa176 = null;
        }
    }

    public void play(Context c, int rid) {
        stop();

        MediaPlayer MP;
        MP = MediaPlayer.create(c, rid);
        MP.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stop();
            }
        });

        MP.start();
    }
}
