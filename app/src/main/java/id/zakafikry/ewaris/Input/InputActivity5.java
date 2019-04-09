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

public class InputActivity5 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvSdrLkKd, tvSdrPrKd, tvNotifSaudaraKd;
    EditText etSdrLkKd, etSdrPrKd;
    String sdrLkKd, sdrPrKd;
    Pewaris p = Pewaris.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input5);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext5);
        btnPrev = findViewById(R.id.btnPrev5);
        tvSdrLkKd = findViewById(R.id.tvSaudaraLkKd);
        tvSdrPrKd = findViewById(R.id.tvSaudaraPrKd);
        etSdrLkKd = findViewById(R.id.etSaudaraLkKd);
        etSdrPrKd = findViewById(R.id.etSaudaraPrKd);

        tvNotifSaudaraKd = findViewById(R.id.tvNotifSaudaraKd);

        setVisibility();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                p.resetValueIA4();
                finish();
                //startActivity(new Intent(InputActivity5.this, InputActivity4.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Pewaris f = new Pewaris();
                    sdrLkKd = String.valueOf(etSdrLkKd.getText().toString());
                    sdrPrKd = String.valueOf(etSdrPrKd.getText().toString());

                    p.setjSaudaraLkKd(p.convertToInt(sdrLkKd));
                    p.setjSaudaraPrKd(p.convertToInt(sdrPrKd));

                    Log.d("number", "error");

                    if (p.getjAnakLk() >= 1 || p.getAyah() || p.getjCucuLk() >= 1 || p.getKakek()) {
                        startActivity(new Intent(InputActivity5.this, ConfirmActivity1.class));
                    } else {
                        startActivity(new Intent(InputActivity5.this, InputActivity6.class));

                    }
                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity5.this);
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
        if (p.getKakek()) {
            tvSdrLkKd.setVisibility(View.GONE);
            etSdrLkKd.setVisibility(View.GONE);
            tvSdrPrKd.setVisibility(View.GONE);
            etSdrPrKd.setVisibility(View.GONE);

            tvNotifSaudaraKd.setVisibility(View.VISIBLE);
        }
    }
}
