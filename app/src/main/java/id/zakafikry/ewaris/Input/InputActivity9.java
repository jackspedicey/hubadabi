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

public class InputActivity9 extends AppCompatActivity {

    Button btnNext, btnPrev;
    TextView tvSepupuLkPmnKd, tvSepupuLkPmnSa;
    EditText etSepupuLkPmnKd, etSepupuLkPmnSa;
    String sepupuLkPmnKd, sepupuLkPmnSa;
    TextView tvNotifSepupu;
    Pewaris p = Pewaris.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input9);
        setTitle("Hitung");

        btnNext = findViewById(R.id.btnNext9);
        btnPrev = findViewById(R.id.btnPrev9);
        tvSepupuLkPmnKd = findViewById(R.id.tvAnakLkPmnKd);
        tvSepupuLkPmnSa = findViewById(R.id.tvAnakLkPmnSa);
        etSepupuLkPmnKd = findViewById(R.id.etAnakLkPmnKd);
        etSepupuLkPmnSa = findViewById(R.id.etAnakLkPmnSa);
        tvNotifSepupu = findViewById(R.id.tvNotifSepupu);
        setVisibility();

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                p.resetValueIA8();
                finish();
                //startActivity(new Intent(InputActivity9.this, InputActivity8.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                try {
                    Pewaris f = new Pewaris();
                    sepupuLkPmnKd = String.valueOf(etSepupuLkPmnKd.getText().toString());
                    sepupuLkPmnSa = String.valueOf(etSepupuLkPmnSa.getText().toString());

                    p.setjSepupuLkPmnKd(p.convertToInt(sepupuLkPmnKd));
                    p.setjSepupuLkPmnSa(p.convertToInt(sepupuLkPmnSa));

                    Log.d("number", "error");

                    startActivity(new Intent(InputActivity9.this, ConfirmActivity1.class));
                } catch (NumberFormatException e) {
                    AlertDialog.Builder a1 = new AlertDialog.Builder(InputActivity9.this);
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
        if (p.getjPamanKd() >= 1 || p.getjPamanSa() >= 1) {
            tvSepupuLkPmnKd.setVisibility(View.GONE);
            etSepupuLkPmnKd.setVisibility(View.GONE);
            tvSepupuLkPmnSa.setVisibility(View.GONE);
            etSepupuLkPmnSa.setVisibility(View.GONE);

            tvNotifSepupu.setVisibility(View.VISIBLE);
        }
    }
}
