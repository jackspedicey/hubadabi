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

public class InputActivity9 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvSepupuLkPmnKd, tvSepupuLkPmnSa;
    EditText etSepupuLkPmnKd, etSepupuLkPmnSa;
    String sepupuLkPmnKd, sepupuLkPmnSa;
    TextView tvNotifSepupu;
    Function f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input9);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext9);
        btnPrev = findViewById(R.id.btnPrev9);
        tvSepupuLkPmnKd = findViewById(R.id.tvAnakLkPmnKd);
        tvSepupuLkPmnSa = findViewById(R.id.tvAnakLkPmnSa);
        etSepupuLkPmnKd = findViewById(R.id.etAnakLkPmnKd);
        etSepupuLkPmnSa = findViewById(R.id.etAnakLkPmnSa);
        tvNotifSepupu = findViewById(R.id.tvNotifSepupu);
        f = new Function();
        setVisibility();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                f.resetValueIA8();
                finish();
                //startActivity(new Intent(InputActivity9.this, InputActivity8.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Function f = new Function();
                sepupuLkPmnKd = String.valueOf(etSepupuLkPmnKd.getText().toString());
                sepupuLkPmnSa = String.valueOf(etSepupuLkPmnSa.getText().toString());

                ResultActivity.jSepupuLkPmnKd = f.convertStr(sepupuLkPmnKd);
                ResultActivity.jSepupuLkPmnSa = f.convertStr(sepupuLkPmnSa);
                startActivity(new Intent(InputActivity9.this, ConfirmActivity1.class));
            }
        });
    }

    public void setVisibility() {
        if (ResultActivity.jPamanKd >= 1 || ResultActivity.jPamanSa >= 1) {
            tvSepupuLkPmnKd.setVisibility(View.GONE);
            etSepupuLkPmnKd.setVisibility(View.GONE);
            tvSepupuLkPmnSa.setVisibility(View.GONE);
            etSepupuLkPmnSa.setVisibility(View.GONE);

            tvNotifSepupu.setVisibility(View.VISIBLE);
        }
    }
}
