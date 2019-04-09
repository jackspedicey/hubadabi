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
import android.widget.TextView;

import id.zakafikry.ewaris.Model.Pewaris;
import id.zakafikry.ewaris.R;

public class InputActivity4 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvNenekA, tvNenekI, tvNotifKakek, tvNotifNenek;
    EditText etNenekA, etNenekI;
    CheckBox cbKakek;
    String nenekA, nenekI;
    Pewaris p = Pewaris.getInstance();

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

        tvNotifKakek = findViewById(R.id.tvNotifKakek);
        tvNotifNenek = findViewById(R.id.tvNotifNenek);

        setVisibility();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                p.resetValueIA3();
                finish();
                //startActivity(new Intent(InputActivity4.this, InputActivity3.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                try {
                    Pewaris f = new Pewaris();
                    nenekA = String.valueOf(etNenekA.getText().toString());
                    nenekI = String.valueOf(etNenekI.getText().toString());

                    p.setjNenekA(p.convertToInt(nenekA));
                    p.setjNenekI(p.convertToInt(nenekI));

                    Log.d("number", "error");

                    getCbVal();

                    if (p.getjAnakLk() >= 1 || p.getAyah() || p.getjCucuLk() >= 1) {
                        startActivity(new Intent(InputActivity4.this, ConfirmActivity1.class));
                    } else {
                        startActivity(new Intent(InputActivity4.this, InputActivity5.class));
                    }
                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity4.this);
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

    public void getCbVal() {
        if (cbKakek.isChecked()) {
            p.setKakek(true);
        }
    }

    public void setVisibility() {
        if (p.getAyah()) {
            cbKakek.setVisibility(View.GONE);
            tvNotifKakek.setVisibility(View.VISIBLE);
        }

        if (p.getIbu()) {
            tvNenekA.setVisibility(View.GONE);
            tvNenekI.setVisibility(View.GONE);
            etNenekI.setVisibility(View.GONE);
            etNenekA.setVisibility(View.GONE);
            tvNotifNenek.setVisibility(View.VISIBLE);
        }
    }
}
