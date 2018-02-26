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

public class InputActivity7 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvKeponakanLkKd, tvKeponakanLkSa;
    EditText etKeponakanLkKd, etKeponakanLkSa;
    String keponakanLkKd, KeponakanLkSa;
    Function f;
    TextView tvNotifKeponakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input7);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext7);
        btnPrev = findViewById(R.id.btnPrev7);
        tvKeponakanLkKd = findViewById(R.id.tvAnakLkSdrKd);
        tvKeponakanLkSa = findViewById(R.id.tvAnakLkSdrSa);
        etKeponakanLkKd = findViewById(R.id.etAnakLkSdrKd);
        etKeponakanLkSa = findViewById(R.id.etAnakLkSdrSa);
        tvNotifKeponakan = findViewById(R.id.tvNotifKeponakan);

        f = new Function();
        setVisibility();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                f.resetValueIA6();
                finish();
                //startActivity(new Intent(InputActivity7.this, InputActivity6.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                keponakanLkKd = String.valueOf(etKeponakanLkKd.getText().toString());
                KeponakanLkSa = String.valueOf(etKeponakanLkSa.getText().toString());

                ResultActivity.jKeponakanLkKd = f.convertStr(keponakanLkKd);
                ResultActivity.jKeponakanLkSa = f.convertStr(KeponakanLkSa);

                if (ResultActivity.jAnakLk >= 1 || ResultActivity.jAyah >= 1 || ResultActivity.jCucuLk >= 1 || ResultActivity.jKakek >= 1
                        || ResultActivity.jSaudaraLkKd >= 1 || ResultActivity.jSaudaraLkSa >= 1) {
                    startActivity(new Intent(InputActivity7.this, ConfirmActivity1.class));
                } else {

                    startActivity(new Intent(InputActivity7.this, InputActivity8.class));

                }
            }
        });
    }

    public void setVisibility() {
        if (ResultActivity.jSaudaraLkSa >= 1) {
            tvKeponakanLkKd.setVisibility(View.GONE);
            etKeponakanLkKd.setVisibility(View.GONE);
            tvKeponakanLkSa.setVisibility(View.GONE);
            etKeponakanLkSa.setVisibility(View.GONE);

            tvNotifKeponakan.setVisibility(View.VISIBLE);
        }
    }
}
