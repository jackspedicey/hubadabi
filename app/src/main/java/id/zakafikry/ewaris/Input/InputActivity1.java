package id.zakafikry.ewaris.Input;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import id.zakafikry.ewaris.Model.Pewaris;
import id.zakafikry.ewaris.R;
import id.zakafikry.ewaris.Util.NumberTextWatcherForThousand;

public class InputActivity1 extends AppCompatActivity {

    Button btnNext, btnPrev;

    RadioGroup rgGender;
    RadioButton rbMale, rbFemale;
    EditText etTirkah, etTajhiz, etWasiat, etHutang;

    Pewaris p = Pewaris.getInstance();
    //Pewaris p;
    String tirkah, hutang, tajhiz, wasiat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input1);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext1);
        btnPrev = findViewById(R.id.btnPrev1);
        etTirkah = findViewById(R.id.etTirkah);
        etTajhiz = findViewById(R.id.etTajhiz);
        etWasiat = findViewById(R.id.etWasiat);
        etHutang = findViewById(R.id.etHutang);
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);

        etTirkah.addTextChangedListener(new NumberTextWatcherForThousand(etTirkah));
        etTajhiz.addTextChangedListener(new NumberTextWatcherForThousand(etTajhiz));
        etWasiat.addTextChangedListener(new NumberTextWatcherForThousand(etWasiat));
        etHutang.addTextChangedListener(new NumberTextWatcherForThousand(etHutang));

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    tirkah = String.valueOf(etTirkah.getText().toString().replaceAll(",", ""));
                    hutang = String.valueOf(etHutang.getText().toString().replaceAll(",", ""));
                    tajhiz = String.valueOf(etTajhiz.getText().toString().replaceAll(",", ""));
                    wasiat = String.valueOf(etWasiat.getText().toString().replaceAll(",", ""));

                    p.setTirkah(p.convertToLong(tirkah));
                    p.setHutang(p.convertToLong(hutang));
                    p.setTajhiz(p.convertToLong(tajhiz));
                    p.setWasiat(p.convertToLong(wasiat));

                    Log.d("number", "error");
                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity1.this);
                    // Setting Dialog Title
                    a1.setTitle("Angka Kurang Tepat");

                    // Setting Dialog Message
                    a1.setMessage("Angka yang anda masukan tidak dapat diproses oleh aplikasi, mohon diperiksa kembali");

                    a1.setPositiveButton("Ya",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int button1) {
                                    // if this button is clicked, close
                                    // current activity
                                    dialog.cancel();
                                }

                            });

                    // Showing Alert Message
                    AlertDialog alertDialog = a1.create();
                    alertDialog.show();
                }

                long limit = p.getTirkah() / 3;

                p.setIrts(p.getTirkah() - (p.getHutang() + p.getWasiat() + p.getTajhiz()));

                if (!rbMale.isChecked() && !rbFemale.isChecked()) {
                    Toast.makeText(getApplicationContext(), "tolong isikan jenis kelamin muwarrits", Toast.LENGTH_SHORT).show();
                } else if (p.getIrts() <= 0) {
                    Toast.makeText(getApplicationContext(), "tidak ada harta yang dapat dibagi", Toast.LENGTH_SHORT).show();
                } else if (p.getWasiat() > limit) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity1.this);
                    // Setting Dialog Title
                    // Setting Dialog Message
                    a1.setMessage("Jumlah wasiat tidak boleh melebihi sepertiga jumlah harta peninggalan");

                    a1.setPositiveButton("Ya",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int button1) {
                                    // if this button is clicked, close
                                    // current activity
                                    dialog.cancel();
                                    etWasiat.setText(String.valueOf(p.getTirkah() / 3));
                                }

                            });

                    // Showing Alert Message
                    AlertDialog alertDialog = a1.create();
                    alertDialog.show();
                } else if (p.getIrts() > 0 && p.getWasiat() <= limit) {
                    if (rbMale.isChecked() || rbFemale.isChecked()) {
                        Intent i = new Intent(InputActivity1.this, TransitionInfo.class);
                        startActivity(i);
                    }
                }
            }
        });

        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMale:
                        p.setMale(false);
                        break;
                    case R.id.rbFemale:
                        p.setMale(true);
                        break;
                }
            }
        });
    }
}
