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

public class InputActivity6 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvSdrLkSa, tvSdrPrSa, tvSdrLkSi, tvSdrPrSi, tvNotifSdrSa, tvNotifSdrPrSa, tvNotifSdrSi;
    EditText etSdrLkSa, etSdrPrSa, etSdrLkSi, etSdrPrSi;
    String sdrLkSa, sdrPrSa, sdrLkSi, sdrPrSi;
    Function f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input6);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext6);
        btnPrev = findViewById(R.id.btnPrev6);

        tvSdrLkSa = findViewById(R.id.tvSaudaraLkSa);
        tvSdrPrSa = findViewById(R.id.tvSaudaraPrSa);
        etSdrLkSa = findViewById(R.id.etSaudaraLkSa);
        etSdrPrSa = findViewById(R.id.etSaudaraPrSa);

        tvSdrLkSi = findViewById(R.id.tvSaudaraLkSi);
        tvSdrPrSi = findViewById(R.id.tvSaudaraPrSi);
        etSdrLkSi = findViewById(R.id.etSaudaraLkSi);
        etSdrPrSi = findViewById(R.id.etSaudaraPrSi);

        tvNotifSdrSa = findViewById(R.id.tvNotifSdrSa);
        tvNotifSdrPrSa = findViewById(R.id.tvNotifSdrPrSa);
        tvNotifSdrSi = findViewById(R.id.tvNotifSdrSi);

        setVisibility();
        f = new Function();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                f.resetValueIA5();
                finish();
                //startActivity(new Intent(InputActivity6.this, InputActivity5.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                sdrLkSa = String.valueOf(etSdrLkSa.getText().toString());
                sdrPrSa = String.valueOf(etSdrPrSa.getText().toString());
                sdrLkSi = String.valueOf(etSdrLkSi.getText().toString());
                sdrPrSi = String.valueOf(etSdrPrSi.getText().toString());

                ResultActivity.jSaudaraLkSa = f.convertStr(sdrLkSa);
                ResultActivity.jSaudaraPrSa = f.convertStr(sdrPrSa);
                ResultActivity.jSaudaraLkSi = f.convertStr(sdrLkSi);
                ResultActivity.jSaudaraPrSi = f.convertStr(sdrPrSi);

                if (ResultActivity.jAnakLk >= 1 || ResultActivity.jAyah >= 1 || ResultActivity.jCucuLk >= 1 || ResultActivity.jKakek >= 1
                        || ResultActivity.jSaudaraLkKd >= 1) {
                    startActivity(new Intent(InputActivity6.this, ConfirmActivity1.class));
                } else {
                    startActivity(new Intent(InputActivity6.this, InputActivity7.class));
                }
            }
        });
    }

    public void setVisibility() {
        if (ResultActivity.jSaudaraPrKd >= 2 && ResultActivity.jSaudaraLkKd == 0) {

            etSdrPrSa.setVisibility(View.GONE);
            tvSdrPrSa.setVisibility(View.GONE);

            tvNotifSdrPrSa.setVisibility(View.VISIBLE);
        } else if (ResultActivity.jSaudaraLkKd >= 1) {
            etSdrLkSa.setVisibility(View.GONE);
            tvSdrLkSa.setVisibility(View.GONE);
            etSdrPrSa.setVisibility(View.GONE);
            tvSdrPrSa.setVisibility(View.GONE);

            tvNotifSdrSa.setVisibility(View.VISIBLE);
        }

        if (ResultActivity.jKakek == 1) {
            etSdrLkSi.setVisibility(View.GONE);
            etSdrPrSi.setVisibility(View.GONE);
            tvSdrLkSi.setVisibility(View.GONE);
            tvSdrPrSi.setVisibility(View.GONE);

            tvNotifSdrSi.setVisibility(View.VISIBLE);
        }
    }
}
