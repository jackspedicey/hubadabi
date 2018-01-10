package id.zakafikry.ewaris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.zakafikry.ewaris.InputActivity.InputActivity1;

public class MainActivity extends AppCompatActivity {
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button)findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, InputActivity1.class));
            }
        });
    }
}
