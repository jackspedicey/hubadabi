package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import id.zakafikry.ewaris.Class.Function;
import id.zakafikry.ewaris.R;

public class InputActivity4 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvNenekA, tvNenekI;
    EditText etNenekA, etNenekI;
    CheckBox cbKakek;

    String nenekA, nenekI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input4);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext4);
        btnPrev = findViewById(R.id.btnPrev4);
        tvNenekA = findViewById(R.id.tvNenekAyah);
        tvNenekI = findViewById(R.id.tvNenekIbu);
        etNenekA = findViewById(R.id.etNenekAyah);
        etNenekI = findViewById(R.id.etNenekIbu);
        cbKakek = findViewById(R.id.cbKakek);



        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity4.this, InputActivity3.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                nenekA = String.valueOf(etNenekA.getText().toString());
                nenekI = String.valueOf(etNenekI.getText().toString());

                getCbVal();
                ResultActivity.jNenekA = f.convertStr(nenekA);
                ResultActivity.jNenekI = f.convertStr(nenekI);

                startActivity(new Intent(InputActivity4.this, InputActivity5.class));
            }
        });
    }

    public void getCbVal() {
        if (cbKakek.isChecked()) {
            ResultActivity.jKakek = 1;
        }
    }
}
