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

public class InputActivity8 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvPamanKd, tvPamanSa, tvNotifPaman;
    EditText etPamanKd, etPamanSa;
    String PamanKd, PamanSa;
    Pewaris p = Pewaris.getInstance();

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
        tvNotifPaman = findViewById(R.id.tvNotifPaman);
        setVisibility();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                p.resetValueIA7();
                finish();
                //startActivity(new Intent(InputActivity8.this, InputActivity7.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Pewaris f = new Pewaris();
                    PamanKd = String.valueOf(etPamanKd.getText().toString());
                    PamanSa = String.valueOf(etPamanSa.getText().toString());

                    p.setjPamanKd(f.convertToInt(PamanKd));
                    p.setjPamanSa(f.convertToInt(PamanSa));

                    Log.d("number", "error");

                    if (p.getjAnakLk() >= 1 || p.getAyah() || p.getjCucuLk() >= 1 || p.getKakek()
                            || p.getjSaudaraLkKd() >= 1 || p.getjSaudaraLkSa() >= 1
                            || p.getjKeponakanLkKd() >= 1 || p.getjKeponakanLkSa() >= 1) {
                        startActivity(new Intent(InputActivity8.this, ConfirmActivity1.class));
                    } else {
                        startActivity(new Intent(InputActivity8.this, InputActivity9.class));
                    }
                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity8.this);
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
        if (p.getjKeponakanLkKd() >= 1 || p.getjKeponakanLkSa() >= 1) {
            tvPamanKd.setVisibility(View.GONE);
            etPamanKd.setVisibility(View.GONE);
            tvPamanSa.setVisibility(View.GONE);
            etPamanSa.setVisibility(View.GONE);

            tvNotifPaman.setVisibility(View.VISIBLE);
        }
    }
}
