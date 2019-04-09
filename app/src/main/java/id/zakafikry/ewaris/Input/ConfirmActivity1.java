package id.zakafikry.ewaris.Input;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.zakafikry.ewaris.Model.Pewaris;
import id.zakafikry.ewaris.R;

public class ConfirmActivity1 extends AppCompatActivity {

    Button btnHitung, btnPrev;
    Pewaris p = Pewaris.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm1);
        setTitle("Hitung");

        btnHitung = findViewById(R.id.btnHtgF1);
        btnPrev = findViewById(R.id.btnPrevF1);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ConfirmActivity1.this, ResultActivity.class));
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.resetValueIA9();
                finish();
                //startActivity(new Intent(ConfirmActivity1.this, InputActivity9.class));
            }
        });


    }

}
