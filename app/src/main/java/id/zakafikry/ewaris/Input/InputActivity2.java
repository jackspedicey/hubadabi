package id.zakafikry.ewaris.Input;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

import id.zakafikry.ewaris.Model.Pewaris;
import id.zakafikry.ewaris.R;

public class InputActivity2 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvIrts;
    CheckBox cbAyah, cbSuami, cbIbu;
    TextView tvIstri;
    EditText etIstri, etAnakLk, etAnakPr;
    Spinner spIstri;

    String istri, anakLk, anakPr;

    Pewaris p = Pewaris.getInstance();

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
            public void onClick(View v) {
                //startActivity(new Intent(InputActivity2.this, InputActivity1.class));
                p.resetValueIA1();
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    istri = String.valueOf(etIstri.getText().toString());
                    anakLk = String.valueOf(etAnakLk.getText().toString());
                    anakPr = String.valueOf(etAnakPr.getText().toString());

                    p.setjIstri(p.convertToInt(istri));
                    p.setjAnakLk(p.convertToInt(anakLk));
                    p.setjAnakPr(p.convertToInt(anakPr));
                    Log.d("number", "error");

                    getCbVal();

                    Intent i = new Intent(InputActivity2.this, InputActivity3.class);

                    if (p.getjIstri() > 4) {
                        Toast.makeText(getApplicationContext(), "Jumlah maksimal istri empat", Toast.LENGTH_SHORT).show();
                    } else {
                        startActivity(i);
                    }

                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity2.this);
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
            }
        });
    }

    public void setGender() {
        Locale localeId = new Locale("in", "ID");
        NumberFormat rp = NumberFormat.getCurrencyInstance(localeId);

        if (!p.isMale()) {
            cbSuami.setVisibility(View.GONE);
        } else if (p.isMale()) {
            tvIstri.setVisibility(View.GONE);
            etIstri.setVisibility(View.GONE);
        }

        tvIrts.setText(String.valueOf(rp.format(p.getIrts())));
    }

    public void getCbVal() {
        if (cbAyah.isChecked()) {
            p.setAyah(true);
        }

        if (cbIbu.isChecked()) {
            p.setIbu(true);
        }

        if (cbSuami.isChecked()) {
            p.setSuami(true);
        }
    }

}
