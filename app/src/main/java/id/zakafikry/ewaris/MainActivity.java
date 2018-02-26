package id.zakafikry.ewaris;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.zakafikry.ewaris.InputActivity.InputActivity1;
import id.zakafikry.ewaris.IntroActivity.IntroActivity;

public class MainActivity extends AppCompatActivity {
    Button btnStart, btnIntro, btnHelp, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);
        btnIntro = findViewById(R.id.btnIntro);
        btnAbout = findViewById(R.id.btnAbout);
        btnHelp = findViewById(R.id.btnHelp);

        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, InputActivity1.class));
            }
        });

        btnIntro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, IntroActivity.class));
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HelpActivity.class));
            }
        });
    }
}
