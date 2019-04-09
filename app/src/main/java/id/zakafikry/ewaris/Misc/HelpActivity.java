package id.zakafikry.ewaris.Misc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.zakafikry.ewaris.R;

public class HelpActivity extends AppCompatActivity {
    Button helpHitung, helpIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        setTitle("Bantuan");

        helpHitung = findViewById(R.id.btnHelpHitung);
        helpIntro = findViewById(R.id.btnHelpIntro);

        helpHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HelpActivity.this, help_hitung.class);
                startActivity(i);
            }
        });

        helpIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HelpActivity.this, help_pengenalan.class);
                startActivity(i);
            }
        });
    }
}
