package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.zakafikry.ewaris.R;

public class InputActivity3 extends AppCompatActivity {

    Button btnNext;
    Button btnPrev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input3);

        btnNext = (Button)findViewById(R.id.btnNext3);
        btnPrev = (Button)findViewById(R.id.btnPrev3);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity3.this, InputActivity2.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity3.this, InputActivity4.class));
            }
        });
    }
}
