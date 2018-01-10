package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.zakafikry.ewaris.R;

public class InputActivity8 extends AppCompatActivity {

    Button btnNext;
    Button btnPrev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input8);

        btnNext = (Button)findViewById(R.id.btnNext8);
        btnPrev = (Button)findViewById(R.id.btnPrev8);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity8.this, InputActivity7.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity8.this, InputActivity9.class));
            }
        });
    }
}
