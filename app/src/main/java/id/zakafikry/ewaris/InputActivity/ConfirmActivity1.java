package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.zakafikry.ewaris.Class.Function;
import id.zakafikry.ewaris.R;

public class ConfirmActivity1 extends AppCompatActivity {

    Button btnHitung, btnPrev;
    Function f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm1);
        setTitle("Hitung");

        btnHitung = findViewById(R.id.btnHtgF1);
        btnPrev = findViewById(R.id.btnPrevF1);
        f = new Function();

        btnHitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ConfirmActivity1.this, ResultActivity.class));
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.resetValueIA9();
                finish();
                //startActivity(new Intent(ConfirmActivity1.this, InputActivity9.class));
            }
        });


    }

}
