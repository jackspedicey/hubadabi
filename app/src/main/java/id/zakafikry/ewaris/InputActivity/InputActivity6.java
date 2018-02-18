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
    TextView tvSdrLkSa, tvSdrPrSa, tvSdrLkSi, tvSdrPrSi;
    EditText etSdrLkSa, etSdrPrSa, etSdrLkSi, etSdrPrSi;
    String sdrLkSa, sdrPrSa, sdrLkSi, sdrPrSi;

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

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {

                startActivity(new Intent(InputActivity6.this, InputActivity5.class));
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

                startActivity(new Intent(InputActivity6.this, InputActivity7.class));
            }
        });
    }
}
