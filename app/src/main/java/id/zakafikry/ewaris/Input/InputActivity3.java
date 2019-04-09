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

public class InputActivity3 extends AppCompatActivity {

    Button btnNext, btnPrev;
    EditText etCucuLk, etCucuPr;
    TextView tvCucuLk, tvCucuPr, tvNotifCucu, tvNotifCucuPr;
    String cucuLk, cucuPr;

    Pewaris p = Pewaris.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input3);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext3);
        btnPrev = findViewById(R.id.btnPrev3);
        tvCucuLk = findViewById(R.id.tvCucuLk);
        tvCucuPr = findViewById(R.id.tvCucuPr);
        etCucuLk = findViewById(R.id.etCucuLk);
        etCucuPr = findViewById(R.id.etCucuPr);

        tvNotifCucu = findViewById(R.id.tvNotifCucuLk);
        tvNotifCucuPr = findViewById(R.id.tvNotifCucuPr);
        setVisibility();



        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                p.resetValueIA2();
                finish();
                //startActivity(new Intent(InputActivity3.this, InputActivity2.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                try {
                    Pewaris f = new Pewaris();
                    cucuLk = String.valueOf(etCucuLk.getText().toString());
                    cucuPr = String.valueOf(etCucuPr.getText().toString());

                    p.setjCucuLk(p.convertToInt(cucuLk));
                    p.setjCucuPr(p.convertToInt(cucuPr));

                    Log.d("number", "error");

                    startActivity(new Intent(InputActivity3.this, InputActivity4.class));
                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity3.this);
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
        if (p.getjAnakLk() >= 1) {
            tvCucuLk.setVisibility(View.GONE);
            etCucuLk.setVisibility(View.GONE);
            tvCucuPr.setVisibility(View.GONE);
            etCucuPr.setVisibility(View.GONE);

            tvNotifCucu.setVisibility(View.VISIBLE);
        } else if (p.getjAnakPr() >= 2) {
            tvCucuPr.setVisibility(View.GONE);
            etCucuPr.setVisibility(View.GONE);

            tvNotifCucuPr.setVisibility(View.VISIBLE);
        }
    }
}
