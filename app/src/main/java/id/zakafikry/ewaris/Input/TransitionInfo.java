package id.zakafikry.ewaris.Input;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import id.zakafikry.ewaris.R;

public class TransitionInfo extends AppCompatActivity {
    TextView tvTI;
    Intent i;
    Button btnPrev, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_info);

        btnNext = findViewById(R.id.btnNextTI);
        btnPrev = findViewById(R.id.btnPrevTI);
        tvTI = findViewById(R.id.tvTrans);

        tvTI.setText("Setelah selesai memasukan data p, maka akan ketemu yang namanya Al-Irts (harta yang siap dibagi). Setelah itu baru masukan data ahli waris, mulai dari jumlah anak, ada tidaknya orang tua dan suami atau istri, jumlah cucu, dan seterusnya.");

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i = new Intent(TransitionInfo.this, InputActivity2.class);
                startActivity(i);
            }
        });
    }
}
