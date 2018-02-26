package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.zakafikry.ewaris.Class.Function;
import id.zakafikry.ewaris.R;

public class InputActivity5 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvSdrLkKd, tvSdrPrKd, tvNotifSaudaraKd;
    EditText etSdrLkKd, etSdrPrKd;
    String sdrLkKd, sdrPrKd;
    Function f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input5);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext5);
        btnPrev = findViewById(R.id.btnPrev5);
        tvSdrLkKd = findViewById(R.id.tvSaudaraLkKd);
        tvSdrPrKd = findViewById(R.id.tvSaudaraPrKd);
        etSdrLkKd = findViewById(R.id.etSaudaraLkKd);
        etSdrPrKd = findViewById(R.id.etSaudaraPrKd);

        tvNotifSaudaraKd = findViewById(R.id.tvNotifSaudaraKd);

        setVisibility();
        f = new Function();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                f.resetValueIA4();
                finish();
                //startActivity(new Intent(InputActivity5.this, InputActivity4.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                sdrLkKd = String.valueOf(etSdrLkKd.getText().toString());
                sdrPrKd = String.valueOf(etSdrPrKd.getText().toString());

                ResultActivity.jSaudaraLkKd = f.convertStr(sdrLkKd);
                ResultActivity.jSaudaraPrKd = f.convertStr(sdrPrKd);

                if (ResultActivity.jAnakLk >= 1 || ResultActivity.jAyah >= 1 || ResultActivity.jCucuLk >= 1 || ResultActivity.jKakek >= 1) {
                    startActivity(new Intent(InputActivity5.this, ConfirmActivity1.class));
                } else {
                    startActivity(new Intent(InputActivity5.this, InputActivity6.class));

                }
            }
        });
    }

    public void setVisibility() {
        if (ResultActivity.jKakek == 1) {
            tvSdrLkKd.setVisibility(View.GONE);
            etSdrLkKd.setVisibility(View.GONE);
            tvSdrPrKd.setVisibility(View.GONE);
            etSdrPrKd.setVisibility(View.GONE);

            tvNotifSaudaraKd.setVisibility(View.VISIBLE);
        }
    }
}
