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

public class InputActivity2 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvIrts;
    CheckBox cbAyah, cbSuami, cbIbu;
    TextView tvIstri;
    EditText etIstri, etAnakLk, etAnakPr;

    String istri, anakLk, anakPr;

    Function f = new Function();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input2);
        setTitle("Hitung");

        tvIrts = findViewById(R.id.tvNominal);
        btnNext = findViewById(R.id.btnNext2);
        btnPrev = findViewById(R.id.btnPrev2);
        cbAyah = findViewById(R.id.cbAyah);
        cbIbu = findViewById(R.id.cbIbu);
        cbSuami = findViewById(R.id.cbSuami);
        tvIstri = findViewById(R.id.tvIstri);
        etIstri = findViewById(R.id.etIstri);
        etAnakLk = findViewById(R.id.etAnakLk);
        etAnakPr = findViewById(R.id.etAnakPr);

        setGender();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //startActivity(new Intent(InputActivity2.this, InputActivity1.class));
                f.resetValueIA1();
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                istri = String.valueOf(etIstri.getText().toString());
                anakLk = String.valueOf(etAnakLk.getText().toString());
                anakPr = String.valueOf(etAnakPr.getText().toString());

                ResultActivity.jIstri = f.convertStr(istri);
                ResultActivity.jAnakLk = f.convertStr(anakLk);
                ResultActivity.jAnakPr = f.convertStr(anakPr);
                getCbVal();

                Intent i = new Intent(InputActivity2.this, InputActivity3.class);
                startActivity(i);
            }
        });
    }

    public void setGender () {
        if (!ResultActivity.gender) {
            cbSuami.setVisibility(View.GONE);
        } else if (ResultActivity.gender) {
            tvIstri.setVisibility(View.GONE);
            etIstri.setVisibility(View.GONE);
        }

        tvIrts.setText(String.valueOf(ResultActivity.irts));
    }

    public void getCbVal() {
        if (cbAyah.isChecked()) {
            ResultActivity.jAyah = 1;
        }

        if (cbIbu.isChecked()) {
            ResultActivity.jIbu = 1;
        }

        if (cbSuami.isChecked()) {
            ResultActivity.jSuami = 1;
        }
    }

}
