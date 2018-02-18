package id.zakafikry.ewaris.IntroActivity;

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
                    pausePlayers();
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
                    pausePlayers();
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
                    pausePlayers();
                    annisa176.start();
                }
            }
        });
    }

    private void pausePlayers() {
        if (annisa11.isPlaying())
            annisa11.stop();
        annisa11 = MediaPlayer.create(DalilActivity.this, R.raw.annisa11);
        if (annisa12.isPlaying())
            annisa12.stop();
        annisa12 = MediaPlayer.create(DalilActivity.this, R.raw.annisa12);
        if (annisa176.isPlaying())
            annisa176.stop();
        annisa176 = MediaPlayer.create(DalilActivity.this, R.raw.annisa176);

    }

    public void onBackPressed() {
        finish();
        annisa11.stop();
        annisa12.stop();
        annisa176.stop();
    }
}
