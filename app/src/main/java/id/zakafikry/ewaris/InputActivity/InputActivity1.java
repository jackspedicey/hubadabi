package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import id.zakafikry.ewaris.Class.Function;
import id.zakafikry.ewaris.MainActivity;
import id.zakafikry.ewaris.R;

public class InputActivity1 extends AppCompatActivity {

    Button btnNext, btnHome;

    RadioGroup rgGender;
    RadioButton rbMale, rbFemale;
    EditText etTirkah, etTajhiz, etWasiat, etHutang;

    Function f = new Function();

    String tirkah, hutang, tajhiz, wasiat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input1);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext1);
        btnHome = findViewById(R.id.btnPrevF1);
        etTirkah = findViewById(R.id.etTirkah);
        etTajhiz = findViewById(R.id.etTajhiz);
        etWasiat = findViewById(R.id.etWasiat);
        etHutang = findViewById(R.id.etHutang);
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);

        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //finish();
                Intent i = new Intent(InputActivity1.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                tirkah = String.valueOf(etTirkah.getText().toString());
                hutang = String.valueOf(etHutang.getText().toString());
                tajhiz = String.valueOf(etTajhiz.getText().toString());
                wasiat = String.valueOf(etWasiat.getText().toString());

                ResultActivity.tirkah = f.convertStr(tirkah);
                ResultActivity.hutang = f.convertStr(hutang);
                ResultActivity.tajhiz = f.convertStr(tajhiz);
                ResultActivity.wasiat = f.convertStr(wasiat);
                int limit = ResultActivity.tirkah / 3;

                ResultActivity.irts = ResultActivity.tirkah - (ResultActivity.hutang + ResultActivity.wasiat + ResultActivity.tajhiz);

                if (ResultActivity.irts > 0 && ResultActivity.wasiat <= limit) {
                    if (rbMale.isChecked() || rbFemale.isChecked()) {
                    Intent i = new Intent(InputActivity1.this, InputActivity2.class);
                    startActivity(i);
                    }
                }

                if (!rbMale.isChecked() && !rbFemale.isChecked()) {
                    Toast.makeText(getApplicationContext(), "tolong isikan jenis kelamin muwarrits", Toast.LENGTH_SHORT).show();
                } else if (ResultActivity.irts <= 0) {
                    Toast.makeText(getApplicationContext(), "tidak ada harta yang dapat dibagi", Toast.LENGTH_SHORT).show();
                } else if (ResultActivity.wasiat > limit) {
                    Toast.makeText(getApplicationContext(), "jumlah wasiat tidak boleh lebih dari 1/3 Tirkah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMale:
                        ResultActivity.gender = false;
                        break;
                    case R.id.rbFemale:
                        ResultActivity.gender = true;
                        break;
                }
            }
        });
    }
}
