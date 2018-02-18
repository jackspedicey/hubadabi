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
    TextView tvPamanKd, tvPamanSa;
    EditText etPamanKd, etPamanSa;
    String PamanKd, PamanSa;
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

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity8.this, InputActivity7.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                PamanKd = String.valueOf(etPamanKd.getText().toString());
                PamanSa = String.valueOf(etPamanSa.getText().toString());

                ResultActivity.jPamanKd = f.convertStr(PamanKd);
                ResultActivity.jPamanSa = f.convertStr(PamanSa);

                startActivity(new Intent(InputActivity8.this, InputActivity9.class));
            }
        });
    }
}
