package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import id.zakafikry.ewaris.R;

public class InputActivity2 extends AppCompatActivity {

    Button btnNext;
    Button btnPrev;
    TextView tvNominal;
    CheckBox cbAyah;
    CheckBox cbSuami;
    CheckBox cbIbu;
    TextView tvIstri;
    EditText etIstri;
    EditText etAnakLk;
    EditText etAnakPr;

    int irts;
    int ayah = 0;
    int ibu = 0;
    int suami = 0;
    int istri = 0;
    int anakLk = 0;
    int anakPr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input2);

        tvNominal = (TextView)findViewById(R.id.tvNominal);
        btnNext = (Button)findViewById(R.id.btnNext2);
        btnPrev = (Button)findViewById(R.id.btnPrev2);
        cbAyah = (CheckBox)findViewById(R.id.cbAyah);
        cbIbu = (CheckBox)findViewById(R.id.cbIbu);
        cbSuami = (CheckBox)findViewById(R.id.cbSuami);
        tvIstri = (TextView)findViewById(R.id.tvIstri);
        etIstri = (EditText)findViewById(R.id.etIstri);
        etAnakLk = (EditText)findViewById(R.id.etAnakLk);
        etAnakPr = (EditText)findViewById(R.id.etAnakPr);

        setGender();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                startActivity(new Intent(InputActivity2.this, InputActivity1.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                getCbVal();

                InputActivity1 ia1 = new InputActivity1();
                String Istri = etIstri.getText().toString();
                String AnakLk = etAnakLk.getText().toString();
                String AnakPr = etAnakPr.getText().toString();
                istri = ia1.convert(Istri);
                anakLk = ia1.convert(AnakLk);
                anakPr = ia1.convert(AnakPr);

                Bundle b = new Bundle();
                b.putInt("irtsI2", irts);
                b.putInt("ayah", ayah);
                b.putInt("ibu", ibu);
                b.putInt("suami", suami);
                b.putInt("istri", istri);
                b.putInt("anakLk", anakLk);
                b.putInt("anakPr", anakPr);

                if (anakLk >= 1 && ayah == 1) {
                    Intent i = new Intent(InputActivity2.this, FinishActivity1.class);
                    i.putExtras(b);
                    startActivity(i);
                } else if (anakLk >= 1 && ayah == 0) {
                    Intent i = new Intent(InputActivity2.this, InputActivity4.class);
                    i.putExtras(b);
                    startActivity(i);
                } else {
                    Intent i = new Intent(InputActivity2.this, InputActivity3.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
    }

    public void setGender () {
        Intent i = getIntent();
        Bundle b = i.getExtras();
        int gender = b.getInt("gender");
        if (gender == 1) {
            cbSuami.setVisibility(View.GONE);
        }else if (gender == 2){
            tvIstri.setVisibility(View.GONE);
            etIstri.setVisibility(View.GONE);
        }

        irts = b.getInt("irts");
        tvNominal.setText(String.valueOf(irts));
    }

    public void getCbVal() {
        if (cbAyah.isChecked()){
            ayah = 1;
        } else {
            ayah = 0;
        }

        if (cbIbu.isChecked()){
            ibu = 1;
        } else {
            ibu = 0;

        }if (cbSuami.isChecked()){
            suami = 1;
        } else {
            suami = 0;
        }
    }
}
