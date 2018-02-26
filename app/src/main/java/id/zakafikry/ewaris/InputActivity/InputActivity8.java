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

public class InputActivity8 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvPamanKd, tvPamanSa, tvNotifPaman;
    EditText etPamanKd, etPamanSa;
    String PamanKd, PamanSa;
    Function f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input8);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext8);
        btnPrev = findViewById(R.id.btnPrev8);
        tvPamanKd = findViewById(R.id.tvPamanKd);
        tvPamanSa = findViewById(R.id.tvPamanSa);
        etPamanKd = findViewById(R.id.etPamanKd);
        etPamanSa = findViewById(R.id.etPamanSa);
        tvNotifPaman = findViewById(R.id.tvNotifPaman);
        setVisibility();

        f = new Function();


        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                f.resetValueIA7();
                finish();
                //startActivity(new Intent(InputActivity8.this, InputActivity7.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                PamanKd = String.valueOf(etPamanKd.getText().toString());
                PamanSa = String.valueOf(etPamanSa.getText().toString());

                ResultActivity.jPamanKd = f.convertStr(PamanKd);
                ResultActivity.jPamanSa = f.convertStr(PamanSa);
                if (ResultActivity.jAnakLk >= 1 || ResultActivity.jAyah >= 1 || ResultActivity.jCucuLk >= 1 || ResultActivity.jKakek >= 1
                        || ResultActivity.jSaudaraLkKd >= 1 || ResultActivity.jSaudaraLkSa >= 1
                        || ResultActivity.jKeponakanLkKd >= 1 || ResultActivity.jKeponakanLkSa >= 1) {
                    startActivity(new Intent(InputActivity8.this, ConfirmActivity1.class));
                } else {
                    startActivity(new Intent(InputActivity8.this, InputActivity9.class));
                }
            }
        });
    }

    public void setVisibility() {
        if (ResultActivity.jKeponakanLkKd >= 1 || ResultActivity.jKeponakanLkSa >= 1) {
            tvPamanKd.setVisibility(View.GONE);
            etPamanKd.setVisibility(View.GONE);
            tvPamanSa.setVisibility(View.GONE);
            etPamanSa.setVisibility(View.GONE);

            tvNotifPaman.setVisibility(View.VISIBLE);
        }
    }
}
