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

public class InputActivity3 extends AppCompatActivity {

    Button btnNext, btnPrev;
    EditText etCucuLk, etCucuPr;
    TextView tvCucuLk, tvCucuPr, tvNotifCucu, tvNotifCucuPr;
    String cucuLk, cucuPr;

    Function f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input3);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext3);
        btnPrev = findViewById(R.id.btnPrev3);
        tvCucuLk = findViewById(R.id.tvCucuLk);
        tvCucuPr = findViewById(R.id.tvCucuPr);
        etCucuLk = findViewById(R.id.etCucuLk);
        etCucuPr = findViewById(R.id.etCucuPr);

        tvNotifCucu = findViewById(R.id.tvNotifCucuLk);
        tvNotifCucuPr = findViewById(R.id.tvNotifCucuPr);
        setVisibility();

        f = new Function();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                f.resetValueIA2();
                finish();
                //startActivity(new Intent(InputActivity3.this, InputActivity2.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                cucuLk = String.valueOf(etCucuLk.getText().toString());
                cucuPr = String.valueOf(etCucuPr.getText().toString());

                ResultActivity.jCucuLk = f.convertStr(cucuLk);
                ResultActivity.jCucuPr = f.convertStr(cucuPr);

                startActivity(new Intent(InputActivity3.this, InputActivity4.class));

            }
        });
    }

    public void setVisibility() {
        if (ResultActivity.jAnakLk >= 1) {
            tvCucuLk.setVisibility(View.GONE);
            etCucuLk.setVisibility(View.GONE);
            tvCucuPr.setVisibility(View.GONE);
            etCucuPr.setVisibility(View.GONE);

            tvNotifCucu.setVisibility(View.VISIBLE);
        } else if (ResultActivity.jAnakPr >= 2) {
            tvCucuPr.setVisibility(View.GONE);
            etCucuPr.setVisibility(View.GONE);

            tvNotifCucuPr.setVisibility(View.VISIBLE);
        }
    }
}
