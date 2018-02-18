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
    TextView tvCucuLk, tvCucuPr;
    String cucuLk, cucuPr;

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

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity3.this, InputActivity2.class));
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
}
