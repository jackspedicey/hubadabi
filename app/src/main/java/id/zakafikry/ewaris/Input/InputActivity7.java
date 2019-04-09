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
import android.widget.TextView;

import id.zakafikry.ewaris.Model.Pewaris;
import id.zakafikry.ewaris.R;

public class InputActivity7 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvKeponakanLkKd, tvKeponakanLkSa;
    EditText etKeponakanLkKd, etKeponakanLkSa;
    String keponakanLkKd, KeponakanLkSa;
    Pewaris p = Pewaris.getInstance();
    TextView tvNotifKeponakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input7);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext7);
        btnPrev = findViewById(R.id.btnPrev7);
        tvKeponakanLkKd = findViewById(R.id.tvAnakLkSdrKd);
        tvKeponakanLkSa = findViewById(R.id.tvAnakLkSdrSa);
        etKeponakanLkKd = findViewById(R.id.etAnakLkSdrKd);
        etKeponakanLkSa = findViewById(R.id.etAnakLkSdrSa);
        tvNotifKeponakan = findViewById(R.id.tvNotifKeponakan);

        setVisibility();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                p.resetValueIA6();
                finish();
                //startActivity(new Intent(InputActivity7.this, InputActivity6.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Pewaris f = new Pewaris();
                    keponakanLkKd = String.valueOf(etKeponakanLkKd.getText().toString());
                    KeponakanLkSa = String.valueOf(etKeponakanLkSa.getText().toString());

                    p.setjKeponakanLkKd(p.convertToInt(keponakanLkKd));
                    p.setjKeponakanLkSa(p.convertToInt(KeponakanLkSa));

                    Log.d("number", "error");

                    if (p.getjAnakLk() >= 1 || p.getAyah() || p.getjCucuLk() >= 1 || p.getKakek()
                            || p.getjSaudaraLkKd() >= 1 || p.getjSaudaraLkSa() >= 1) {
                        startActivity(new Intent(InputActivity7.this, ConfirmActivity1.class));
                    } else if (p.getjAnakPr() >= 1 || p.getjCucuPr() >= 1) {
                        if (p.getjSaudaraPrKd() >= 1 || p.getjSaudaraPrSa() >= 1) {
                            startActivity(new Intent(InputActivity7.this, ConfirmActivity1.class));
                        } else {
                            startActivity(new Intent(InputActivity7.this, InputActivity8.class));
                        }
                    } else {
                        startActivity(new Intent(InputActivity7.this, InputActivity8.class));

                    }
                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity7.this);
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

    public void setVisibility() {
        if (p.getjSaudaraLkSa() >= 1) {
            tvKeponakanLkKd.setVisibility(View.GONE);
            etKeponakanLkKd.setVisibility(View.GONE);
            tvKeponakanLkSa.setVisibility(View.GONE);
            etKeponakanLkSa.setVisibility(View.GONE);

            tvNotifKeponakan.setVisibility(View.VISIBLE);
        } else if (p.getjAnakPr() >= 1 || p.getjCucuPr() >= 1) {
            if (p.getjSaudaraPrKd() >= 1 || p.getjSaudaraPrSa() >= 1) {
                tvKeponakanLkKd.setVisibility(View.GONE);
                etKeponakanLkKd.setVisibility(View.GONE);
                tvKeponakanLkSa.setVisibility(View.GONE);
                etKeponakanLkSa.setVisibility(View.GONE);

                tvNotifKeponakan.setVisibility(View.VISIBLE);
                tvNotifKeponakan.setText("Keponakan dilewati karena sudah terhalang oleh Ashobah ma'al Ghoir (Anak atau Cucu Perempuan bersama Saudara perempuang kandung atau Saudara perempuan se-ayah)");
            }
        }
    }
}
