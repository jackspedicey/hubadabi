package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import id.zakafikry.ewaris.MainActivity;
import id.zakafikry.ewaris.R;

public class InputActivity1 extends AppCompatActivity {

    Button btnNext;
    Button btnHome;

    RadioGroup rgGender;
    RadioButton rbGender;
    EditText etTirkah;
    EditText etTajhiz;
    EditText etWasiat;
    EditText etHutang;

    int gender = 0;
    int tirkah = 0;
    int hutang = 0;
    int tajhiz = 0;
    int wasiat = 0;
    int irts = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input1);

        btnNext = (Button)findViewById(R.id.btnNext1);
        btnHome = (Button)findViewById(R.id.btnPrevF1);
        etTirkah = (EditText)findViewById(R.id.etTirkah);
        etTajhiz = (EditText)findViewById(R.id.etTajhiz);
        etWasiat = (EditText)findViewById(R.id.etWasiat);
        etHutang = (EditText)findViewById(R.id.etHutang);
        rgGender = (RadioGroup)findViewById(R.id.rgGender);

        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent i = new Intent(InputActivity1.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                String Tirkah = etTirkah.getText().toString();
                String Wasiat = etWasiat.getText().toString();
                String Tajhiz = etTajhiz.getText().toString();
                String Hutang = etHutang.getText().toString();
                tirkah = convert(Tirkah);
                tajhiz = convert(Tajhiz);
                wasiat = convert(Wasiat);
                hutang = convert(Hutang);
                irts = tirkah - (hutang + wasiat + tajhiz);

                if (tirkah > 0 && gender > 0) {
                    Intent i = new Intent(InputActivity1.this, InputActivity2.class);
                    Bundle b = new Bundle();
                    b.putInt("irts", irts);
                    b.putInt("gender", gender);
                    i.putExtras(b);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Tolong isi jenis kelamin Muwarrits dan juga jumlah tirkah", Toast.LENGTH_LONG).show();
                }

            }
        });

        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMale:
                        gender = 1;
                        break;
                    case R.id.rbFemale:
                        gender = 2;
                        break;
                }
            }
        });

    }

    public int convert (String s) {
        int i;
        if (s.equals("")){
            i = 0;
        } else {
            i = Integer.valueOf(s);
        }
        return i;
    }
}
