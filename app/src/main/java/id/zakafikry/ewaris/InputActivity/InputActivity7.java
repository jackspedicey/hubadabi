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

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity7.this, InputActivity6.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                keponakanLkKd = String.valueOf(etKeponakanLkKd.getText().toString());
                KeponakanLkSa = String.valueOf(etKeponakanLkSa.getText().toString());

                ResultActivity.jKeponakanLkKd = f.convertStr(keponakanLkKd);
                ResultActivity.jKeponakanLkSa = f.convertStr(KeponakanLkSa);

                startActivity(new Intent(InputActivity7.this, InputActivity8.class));
            }
        });
    }
}
