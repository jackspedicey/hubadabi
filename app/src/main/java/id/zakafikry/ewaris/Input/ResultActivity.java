package id.zakafikry.ewaris.Input;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import id.zakafikry.ewaris.MainActivity;
import id.zakafikry.ewaris.Model.FaraidEngine;
import id.zakafikry.ewaris.R;

public class
ResultActivity extends AppCompatActivity {
    public ScrollView svtabel;

    public TextView tvTirkah, tvHutang, tvTajhiz, tvWasiat, tvIrts, tvBagAnakLk, tvBagAnakPr, tvBagAyah, tvBagIbu, tvBagSuami, tvBagIstri, tvBagCucuLk, tvBagCucuPr, tvBagKakek, tvBagNenekA, tvBagNenekI, tvBagSaudaraLkKd, tvBagSaudaraPrKd, tvBagSaudaraLkSa, tvBagSaudaraPrSa, tvBagSaudaraLkSi, tvBagSaudaraPrSi, tvBagKeponakanLkKd, tvBagKeponakanLkSa, tvBagPamanKd, tvBagPamanSa, tvBagSepupuKd, tvBagSepupuSa, tvJthAnakLk, tvJthAnakPr, tvJthAyah, tvJthIbu, tvJthSuami, tvJthIstri, tvJthCucuLk, tvJthCucuPr, tvJthKakek, tvJthNenekA, tvJthNenekI, tvJthSaudaraLkKd, tvJthSaudaraPrKd, tvJthSaudaraLkSa, tvJthSaudaraPrSa, tvJthSaudaraLkSi, tvJthSaudaraPrSi, tvJthKeponakanLkKd, tvJthKeponakanLkSa, tvJthPamanKd, tvJthPamanSa, tvJthSepupuKd, tvJthSepupuSa, tvAnakLk, tvAnakPr, tvAyah, tvIbu, tvSuami, tvIstri, tvCucuLk, tvCucuPr, tvKakek, tvNenekA, tvNenekI, tvSaudaraLkKd, tvSaudaraPrKd, tvSaudaraLkSa, tvSaudaraPrSa, tvSaudaraLkSi, tvSaudaraPrSi, tvKeponakanLkKd, tvKeponakanLkSa, tvPamanKd, tvPamanSa, tvSepupuKd, tvSepupuSa, tvKPK, tvJkpk;

    public TableLayout tabelHasil;

    public TableRow rowAnakLk, rowAnakPr, rowAyah, rowIbu, rowSuami, rowIstri, rowCucuLk, rowCucuPr, rowKakek, rowNenekA, rowNenekI, rowSaudaraLkKd, rowSaudaraPrKd, rowSaudaraLkSa, rowSaudaraPrSa, rowSaudaraLkSi, rowSaudaraPrSi, rowKeponakanLkKd, rowKeponakanLkSa, rowPamanKd, rowPamanSa, rowSepupuKd, rowSepupuSa;

    public Button btnHome, btnRepeat;

    public TextView tvnoaw, tvket1, tvket2, tvket3, tvjatah;

    FaraidEngine faraidEngine = FaraidEngine.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        setTitle("Hasil");

        tvnoaw = findViewById(R.id.tvNoAW);
        tvket1 = findViewById(R.id.tvKet1);
        tvket2 = findViewById(R.id.tvKet2);
        tvket3 = findViewById(R.id.tvKet3);
        tvjatah = findViewById(R.id.tvJatah);
        svtabel = findViewById(R.id.svtabel);
        tvKPK = findViewById(R.id.tvKpk);
        tvJkpk = findViewById(R.id.tvJkpk);

        btnHome = findViewById(R.id.btnHomeR);
        btnRepeat = findViewById(R.id.btnRepeat);

        tvTirkah = findViewById(R.id.tvJmlTirkahR);
        tvHutang = findViewById(R.id.tvJmlHutangR);
        tvTajhiz = findViewById(R.id.tvJmlTajhizR);
        tvWasiat = findViewById(R.id.tvJmlWasiatR);
        tvIrts = findViewById(R.id.tvJmlIrtsR);

        tabelHasil = findViewById(R.id.tableHasil);
        rowAnakLk = findViewById(R.id.rowAnakLk);
        rowAnakPr = findViewById(R.id.rowAnakPr);
        rowAyah = findViewById(R.id.rowAyah);
        rowIbu = findViewById(R.id.rowIbu);
        rowSuami = findViewById(R.id.rowSuami);
        rowIstri = findViewById(R.id.rowIstri);
        rowCucuLk = findViewById(R.id.rowCucuLk);
        rowCucuPr = findViewById(R.id.rowCucuPr);
        rowKakek = findViewById(R.id.rowKakek);
        rowNenekA = findViewById(R.id.rowNenekA);
        rowNenekI = findViewById(R.id.rowNenekI);
        rowSaudaraLkKd = findViewById(R.id.rowSaudaraLkKd);
        rowSaudaraPrKd = findViewById(R.id.rowSaudaraPrKd);
        rowSaudaraLkSa = findViewById(R.id.rowSaudaraLkSa);
        rowSaudaraPrSa = findViewById(R.id.rowSaudaraPrSa);
        rowSaudaraLkSi = findViewById(R.id.rowSaudaraLkSi);
        rowSaudaraPrSi = findViewById(R.id.rowSaudaraPrSi);
        rowKeponakanLkKd = findViewById(R.id.rowKeponakanLkKd);
        rowKeponakanLkSa = findViewById(R.id.rowKeponakanLkSa);
        rowPamanKd = findViewById(R.id.rowPamanKd);
        rowPamanSa = findViewById(R.id.rowPamanSa);
        rowSepupuKd = findViewById(R.id.rowSepupuKd);
        rowSepupuSa = findViewById(R.id.rowSepupuSa);

        tvAnakLk = findViewById(R.id.tvAwAnakLk);
        tvAnakPr = findViewById(R.id.tvAwAnakPr);
        tvAyah = findViewById(R.id.tvAwAyah);
        tvIbu = findViewById(R.id.tvAwIbu);
        tvSuami = findViewById(R.id.tvAwSuami);
        tvIstri = findViewById(R.id.tvAwIstri);
        tvCucuLk = findViewById(R.id.tvAwcucuLk);
        tvCucuPr = findViewById(R.id.tvAwCucuPr);
        tvKakek = findViewById(R.id.tvAwKakek);
        tvNenekA = findViewById(R.id.tvAwNenekA);
        tvNenekI = findViewById(R.id.tvAwNenekI);
        tvSaudaraLkKd = findViewById(R.id.tvAwSaudaraLkKd);
        tvSaudaraPrKd = findViewById(R.id.tvAwSaudaraPrKd);
        tvSaudaraLkSa = findViewById(R.id.tvAwSaudaraLkSa);
        tvSaudaraPrSa = findViewById(R.id.tvAwSaudaraPrSa);
        tvSaudaraLkSi = findViewById(R.id.tvAwSaudaraLkSi);
        tvSaudaraPrSi = findViewById(R.id.tvAwSaudaraPrSi);
        tvKeponakanLkKd = findViewById(R.id.tvAwKeponakanLkKd);
        tvKeponakanLkSa = findViewById(R.id.tvAwKeponakanLkSa);
        tvPamanKd = findViewById(R.id.tvAwPamanKd);
        tvPamanSa = findViewById(R.id.tvAwPamanSa);
        tvSepupuKd = findViewById(R.id.tvAwSepupuKd);
        tvSepupuSa = findViewById(R.id.tvAwSepupuSa);

        tvBagAnakLk = findViewById(R.id.tvBagAnakLk);
        tvBagAnakPr = findViewById(R.id.tvBagAnakPr);
        tvBagAyah = findViewById(R.id.tvBagAyah);
        tvBagIbu = findViewById(R.id.tvBagIbu);
        tvBagSuami = findViewById(R.id.tvBagSuami);
        tvBagIstri = findViewById(R.id.tvBagIstri);
        tvBagCucuLk = findViewById(R.id.tvBagCucuLk);
        tvBagCucuPr = findViewById(R.id.tvBagCucuPr);
        tvBagKakek = findViewById(R.id.tvBagKakek);
        tvBagNenekA = findViewById(R.id.tvBagNenekA);
        tvBagNenekI = findViewById(R.id.tvBagNenekI);
        tvBagSaudaraLkKd = findViewById(R.id.tvBagSaudaraLkKd);
        tvBagSaudaraPrKd = findViewById(R.id.tvBagSaudaraPrKd);
        tvBagSaudaraLkSa = findViewById(R.id.tvBagSaudaraLkSa);
        tvBagSaudaraPrSa = findViewById(R.id.tvBagSaudaraPrSa);
        tvBagSaudaraLkSi = findViewById(R.id.tvBagSaudaraLkSi);
        tvBagSaudaraPrSi = findViewById(R.id.tvBagSaudaraPrSi);
        tvBagKeponakanLkKd = findViewById(R.id.tvBagKeponakanLkKd);
        tvBagKeponakanLkSa = findViewById(R.id.tvBagKeponakanLkSa);
        tvBagPamanKd = findViewById(R.id.tvBagPamanKd);
        tvBagPamanSa = findViewById(R.id.tvBagPamanSa);
        tvBagSepupuKd = findViewById(R.id.tvBagSepupuKd);
        tvBagSepupuSa = findViewById(R.id.tvBagSepupuSa);

        tvJthAnakLk = findViewById(R.id.tvKdAnakLk);
        tvJthAnakPr = findViewById(R.id.tvKdAnakPr);
        tvJthAyah = findViewById(R.id.tvKdAyah);
        tvJthIbu = findViewById(R.id.tvKdIbu);
        tvJthSuami = findViewById(R.id.tvKdSuami);
        tvJthIstri = findViewById(R.id.tvKdIstri);
        tvJthCucuLk = findViewById(R.id.tvKdCucuLk);
        tvJthCucuPr = findViewById(R.id.tvKdCucuPr);
        tvJthKakek = findViewById(R.id.tvKdKakek);
        tvJthNenekA = findViewById(R.id.tvKdNenekA);
        tvJthNenekI = findViewById(R.id.tvKdNenekI);
        tvJthSaudaraLkKd = findViewById(R.id.tvKdSaudaraLkKd);
        tvJthSaudaraPrKd = findViewById(R.id.tvKdSaudaraPrKd);
        tvJthSaudaraLkSa = findViewById(R.id.tvKdSaudaraLkSa);
        tvJthSaudaraPrSa = findViewById(R.id.tvKdSaudaraPrSa);
        tvJthSaudaraLkSi = findViewById(R.id.tvKdSaudaraLkSi);
        tvJthSaudaraPrSi = findViewById(R.id.tvKdSaudaraPrSi);
        tvJthKeponakanLkKd = findViewById(R.id.tvKdKeponakanLkKd);
        tvJthKeponakanLkSa = findViewById(R.id.tvKdKeponakanLkSa);
        tvJthPamanKd = findViewById(R.id.tvKdPamanKd);
        tvJthPamanSa = findViewById(R.id.tvKdPamanSa);
        tvJthSepupuKd = findViewById(R.id.tvKdSepupuKd);
        tvJthSepupuSa = findViewById(R.id.tvKdSepupuSa);

        faraidEngine.calculateFaraid(this);

        faraidEngine.finalizeCalculation();

        faraidEngine.setTextAll(this);

        faraidEngine.setVisibility(this);

        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                faraidEngine.resetAll();

                Intent i = new Intent(ResultActivity.this, MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK); // clears all previous activities task
                finish();
                startActivity(i);

            }
        });

        btnRepeat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                faraidEngine.resetAll();

                Intent i = new Intent(ResultActivity.this, InputActivity1.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK); // clears all previous activities task
                finish();
                startActivity(i);
            }
        });
    }
}