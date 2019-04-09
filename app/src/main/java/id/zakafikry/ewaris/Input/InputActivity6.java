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

public class InputActivity6 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvSdrLkSa, tvSdrPrSa, tvSdrLkSi, tvSdrPrSi, tvNotifSdrSa, tvNotifSdrPrSa, tvNotifSdrSi;
    EditText etSdrLkSa, etSdrPrSa, etSdrLkSi, etSdrPrSi;
    String sdrLkSa, sdrPrSa, sdrLkSi, sdrPrSi;
    Pewaris p = Pewaris.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input6);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext6);
        btnPrev = findViewById(R.id.btnPrev6);

        tvSdrLkSa = findViewById(R.id.tvSaudaraLkSa);
        tvSdrPrSa = findViewById(R.id.tvSaudaraPrSa);
        etSdrLkSa = findViewById(R.id.etSaudaraLkSa);
        etSdrPrSa = findViewById(R.id.etSaudaraPrSa);

        tvSdrLkSi = findViewById(R.id.tvSaudaraLkSi);
        tvSdrPrSi = findViewById(R.id.tvSaudaraPrSi);
        etSdrLkSi = findViewById(R.id.etSaudaraLkSi);
        etSdrPrSi = findViewById(R.id.etSaudaraPrSi);

        tvNotifSdrSa = findViewById(R.id.tvNotifSdrSa);
        tvNotifSdrPrSa = findViewById(R.id.tvNotifSdrPrSa);
        tvNotifSdrSi = findViewById(R.id.tvNotifSdrSi);

        setVisibility();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                p.resetValueIA5();
                finish();
                //startActivity(new Intent(InputActivity6.this, InputActivity5.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Pewaris f = new Pewaris();
                    sdrLkSa = String.valueOf(etSdrLkSa.getText().toString());
                    sdrPrSa = String.valueOf(etSdrPrSa.getText().toString());
                    sdrLkSi = String.valueOf(etSdrLkSi.getText().toString());
                    sdrPrSi = String.valueOf(etSdrPrSi.getText().toString());

                    p.setjSaudaraLkSa(p.convertToInt(sdrLkSa));
                    p.setjSaudaraPrSa(p.convertToInt(sdrPrSa));
                    p.setjSaudaraLkSi(p.convertToInt(sdrLkSi));
                    p.setjSaudaraPrSi(p.convertToInt(sdrPrSi));

                    Log.d("number", "error");

                    if (p.getjAnakLk() >= 1 || p.getAyah() || p.getjCucuLk() >= 1 || p.getKakek()
                            || p.getjSaudaraLkKd() >= 1) {
                        startActivity(new Intent(InputActivity6.this, ConfirmActivity1.class));
                    } else {
                        startActivity(new Intent(InputActivity6.this, InputActivity7.class));
                    }
                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity6.this);
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
        if (p.getjSaudaraPrKd() >= 2 && p.getjSaudaraLkKd() == 0) {
            etSdrPrSa.setVisibility(View.GONE);
            tvSdrPrSa.setVisibility(View.GONE);

            tvNotifSdrPrSa.setVisibility(View.VISIBLE);
        } else if (p.getjSaudaraLkKd() >= 1) {
            etSdrLkSa.setVisibility(View.GONE);
            tvSdrLkSa.setVisibility(View.GONE);
            etSdrPrSa.setVisibility(View.GONE);
            tvSdrPrSa.setVisibility(View.GONE);

            tvNotifSdrSa.setVisibility(View.VISIBLE);
        } else if (p.getjAnakPr() >= 1 || p.getjCucuPr() >= 1) {
            if (p.getjSaudaraPrKd() >= 1) {
                etSdrLkSa.setVisibility(View.GONE);
                tvSdrLkSa.setVisibility(View.GONE);
                etSdrPrSa.setVisibility(View.GONE);
                tvSdrPrSa.setVisibility(View.GONE);

                tvNotifSdrSa.setVisibility(View.VISIBLE);
                tvNotifSdrSa.setText("Saudara laki-laki dan perempuan se-ayah dilewati karena sudah terhalang oleh Ashobah ma'aal Ghoir (Anak atau Cucu perempuan bersama Saudara perempuan kandung");
            }
        }

        if (p.getKakek()) {
            etSdrLkSi.setVisibility(View.GONE);
            etSdrPrSi.setVisibility(View.GONE);
            tvSdrLkSi.setVisibility(View.GONE);
            tvSdrPrSi.setVisibility(View.GONE);

            tvNotifSdrSi.setVisibility(View.VISIBLE);
        }
    }
}
