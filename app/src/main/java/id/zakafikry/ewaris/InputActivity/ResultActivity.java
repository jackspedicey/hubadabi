package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

import id.zakafikry.ewaris.Class.Function;
import id.zakafikry.ewaris.MainActivity;
import id.zakafikry.ewaris.R;

public class
ResultActivity extends AppCompatActivity {
    public static boolean gender = false;

    public static int tirkah = 0, tajhiz = 0, wasiat = 0, hutang = 0, irts = 0, jAnakPr = 0, jAnakLk = 0, jAyah = 0, jIbu = 0, jSuami = 0, jIstri = 0, jCucuLk = 0, jCucuPr = 0, jKakek = 0, jNenekA = 0, jNenekI = 0, jSaudaraLkKd = 0, jSaudaraPrKd = 0, jSaudaraLkSa = 0, jSaudaraPrSa = 0, jSaudaraLkSi = 0, jSaudaraPrSi = 0, jKeponakanLkKd = 0, jKeponakanLkSa = 0, jPamanKd = 0, jPamanSa = 0, jSepupuLkPmnKd = 0, jSepupuLkPmnSa = 0
            //Angka Pembagi
            , pbAnakPr, pbAyah, pbIbu, pbSuami, pbIstri, pbCucuPr, pbKakek, pbNenekA, pbNenekI, pbSaudaraPrKd, pbSaudaraPrSa, pbSaudaraLkSi, pbSaudaraPrSi
            //Angka
            ;


    public static double
            //------------------ashabul Furudh
            kbAnakPr = 0, kbCucuPr = 0, kbAyah = 0, kbIbu = 0, kbSuami = 0, kbIstri = 0, kbKakek = 0, kbNenekA = 0, kbNenekI = 0, kbSaudaraPrKd = 0, kbSaudaraPrSa = 0, kbSaudaraLkSi = 0, kbSaudaraPrSi = 0
            //------------------ashobah
            , Ashobah = 0, ashAnakLk = 0, ashCucuLk = 0, ashAyah = 0, ashKakek = 0, ashSaudaraLkKd = 0, ashSaudaraLkSa = 0, ashKeponakanLkKd = 0, ashKeponakanLkSa = 0, ashPamanKd = 0, ashPamanSa = 0, ashSepupuLkPmnKd = 0, ashSepupuLkPmnSa = 0, ashAnakPr = 0, ashCucuPr = 0, ashSaudaraPrKd = 0, ashSaudaraPrSa = 0, ashIbu = 0
            //------------------jatah atau bagian masing-masing ahli waaris
            , bagAnakLk = 0, bagAnakPr = 0, bagAyah = 0, bagIbu = 0, bagSuami = 0, bagIstri = 0, bagCucuLk = 0, bagCucuPr = 0, bagKakek = 0, bagNenekA = 0, bagNenekI = 0, bagSaudaraLkKd = 0, bagSaudaraPrKd = 0, bagSaudaraLkSa = 0, bagSaudaraPrSa = 0, bagSaudaraLkSi = 0, bagSaudaraPrSi = 0, bagKeponakanLkKd = 0, bagKeponakanLkSa = 0, bagPamanKd = 0, bagPamanSa = 0, bagSepupuPamanKd = 0, bagSepupuPamanSa = 0;
    public static Boolean checkKbAyah = false, checkAshAyah = false, checkKbKakek = false, checkAshKakek = false;
    public String jthAnakLk = "-", jthAnakPr = "-", jthAyah = "-", jthIbu = "-", jthSuami = "-", jthIstri = "-", jthCucuLk = "-", jthCucuPr = "-", jthKakek = "-", jthNenekA = "-", jthNenekI = "-", jthSaudaraLkKd = "-", jthSaudaraPrKd = "-", jthSaudaraLkSa = "-", jthSaudaraPrSa = "-", jthSaudaraLkSi = "-", jthSaudaraPrSi = "-", jthKeponakanLkKd = "-", jthKeponakanLkSa = "-", jthPamanKd = "-", jthPamanSa = "-", jthSepupuLkKd = "-", jthSepupuLkSa = "-";
    TextView tvTirkah, tvHutang, tvTajhiz, tvWasiat, tvIrts, tvBagAnakLk, tvBagAnakPr, tvBagAyah, tvBagIbu, tvBagSuami, tvBagIstri, tvBagCucuLk, tvBagCucuPr, tvBagKakek, tvBagNenekA, tvBagNenekI, tvBagSaudaraLkKd, tvBagSaudaraPrKd, tvBagSaudaraLkSa, tvBagSaudaraPrSa, tvBagSaudaraLkSi, tvBagSaudaraPrSi, tvBagKeponakanLkKd, tvBagKeponakanLkSa, tvBagPamanKd, tvBagPamanSa, tvBagSepupuKd, tvBagSepupuSa, tvJthAnakLk, tvJthAnakPr, tvJthAyah, tvJthIbu, tvJthSuami, tvJthIstri, tvJthCucuLk, tvJthCucuPr, tvJthKakek, tvJthNenekA, tvJthNenekI, tvJthSaudaraLkKd, tvJthSaudaraPrKd, tvJthSaudaraLkSa, tvJthSaudaraPrSa, tvJthSaudaraLkSi, tvJthSaudaraPrSi, tvJthKeponakanLkKd, tvJthKeponakanLkSa, tvJthPamanKd, tvJthPamanSa, tvJthSepupuKd, tvJthSepupuSa, tvAnakLk, tvAnakPr, tvAyah, tvIbu, tvSuami, tvIstri, tvCucuLk, tvCucuPr, tvKakek, tvNenekA, tvNenekI, tvSaudaraLkKd, tvSaudaraPrKd, tvSaudaraLkSa, tvSaudaraPrSa, tvSaudaraLkSi, tvSaudaraPrSi, tvKeponakanLkKd, tvKeponakanLkSa, tvPamanKd, tvPamanSa, tvSepupuKd, tvSepupuSa;
    TableLayout tabelHasil;
    TableRow rowAnakLk, rowAnakPr, rowAyah, rowIbu, rowSuami, rowIstri, rowCucuLk, rowCucuPr, rowKakek, rowNenekA, rowNenekI, rowSaudaraLkKd, rowSaudaraPrKd, rowSaudaraLkSa, rowSaudaraPrSa, rowSaudaraLkSi, rowSaudaraPrSi, rowKeponakanLkKd, rowKeponakanLkSa, rowPamanKd, rowPamanSa, rowSepupuKd, rowSepupuSa;
    Button btnHome, btnRepeat;
    Function f = new Function();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        setTitle("Hasil");

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

        setKadarBagi();
        hitungWaris();

        Locale localeId = new Locale("in", "ID");
        NumberFormat rp = NumberFormat.getCurrencyInstance();

        tvTirkah.setText(rp.format(tirkah));
        tvHutang.setText(rp.format(hutang));
        tvTajhiz.setText(rp.format(tajhiz));
        tvWasiat.setText(rp.format(wasiat));
        tvIrts.setText(rp.format(irts));

        tvBagAnakLk.setText(rp.format(bagAnakLk));
        tvBagAnakPr.setText(rp.format(bagAnakPr));
        tvBagAyah.setText(rp.format(bagAyah));
        tvBagIbu.setText(rp.format(bagIbu));
        tvBagSuami.setText(rp.format(bagSuami));
        tvBagIstri.setText(rp.format(bagIstri));
        tvBagCucuLk.setText(rp.format(bagCucuLk));
        tvBagCucuPr.setText(rp.format(bagCucuPr));
        tvBagKakek.setText(rp.format(bagKakek));
        tvBagNenekA.setText(rp.format(bagNenekA));
        tvBagNenekI.setText(rp.format(bagNenekI));
        tvBagSaudaraLkKd.setText(rp.format(bagSaudaraLkKd));
        tvBagSaudaraPrKd.setText(rp.format(bagSaudaraPrKd));
        tvBagSaudaraLkSa.setText(rp.format(bagSaudaraLkSa));
        tvBagSaudaraPrSa.setText(rp.format(bagSaudaraPrSa));
        tvBagSaudaraLkSi.setText(rp.format(bagSaudaraLkSi));
        tvBagSaudaraPrSi.setText(rp.format(bagSaudaraPrSi));
        tvBagKeponakanLkKd.setText(rp.format(bagKeponakanLkKd));
        tvBagKeponakanLkSa.setText(rp.format(bagKeponakanLkSa));
        tvBagPamanKd.setText(rp.format(bagPamanKd));
        tvBagPamanSa.setText(rp.format(bagPamanSa));
        tvBagSepupuKd.setText(rp.format(bagSepupuPamanKd));
        tvBagSepupuSa.setText(rp.format(bagSepupuPamanSa));

        tvJthAnakLk.setText(jthAnakLk);
        tvJthAnakPr.setText(jthAnakPr);
        tvJthAyah.setText(jthAyah);
        tvJthIbu.setText(jthIbu);
        tvJthSuami.setText(jthSuami);
        tvJthIstri.setText(jthIstri);
        tvJthCucuLk.setText(jthCucuLk);
        tvJthCucuPr.setText(jthCucuPr);
        tvJthKakek.setText(jthKakek);
        tvJthNenekA.setText(jthNenekA);
        tvJthNenekI.setText(jthNenekI);
        tvJthSaudaraLkKd.setText(jthSaudaraLkKd);
        tvJthSaudaraPrKd.setText(jthSaudaraPrKd);
        tvJthSaudaraLkSa.setText(jthSaudaraLkSa);
        tvJthSaudaraPrSa.setText(jthSaudaraPrSa);
        tvJthSaudaraLkSi.setText(jthSaudaraLkSi);
        tvJthSaudaraPrSi.setText(jthSaudaraPrSi);
        tvJthPamanKd.setText(jthPamanKd);
        tvJthPamanSa.setText(jthPamanSa);
        tvJthKeponakanLkKd.setText(jthKeponakanLkKd);
        tvJthKeponakanLkSa.setText(jthKeponakanLkSa);
        tvJthSepupuKd.setText(jthSepupuLkKd);
        tvJthSepupuSa.setText(jthSepupuLkSa);

        String descAnakLk = " Anak Laki-laki";
        String descAnakPr = " Anak Perempuan";
        String descAyah = " Ayah";
        String descIbu = " Ibu";
        String descSuami = " Suami";
        String descIstri = " Istri";
        String descCucuLk = " Cucu Laki-laki";
        String descCucuPr = " Cucu Perempuan";
        String descKakek = " Kakek";
        String descNenekA = " Nenek dari Pihak Ayah";
        String descNenekI = " Nenek dari Pihak Ibu";
        String descSaudaraLkKd = " Saudara Laki-laki Kandung";
        String descSaudaraPrKd = " Saudara Perempuan Kandung";
        String descSaudaraLkSa = " Saudara Laki-laki Se-Ayah";
        String descSaudaraPrSa = " Saudara Perempuan Se-Ayah";
        String descSaudaraLkSi = " Saudara Laki-laki Se-Ibu";
        String descSaudaraPrSi = " Saudara Perempuan Se-Ibu";
        String descKeponakanLkKd = " Keponakan Laki-laki dari Saudara Kandung";
        String descKeponakanLkSa = " Keponakan Laki-laki dari Saudara Se-Ayah";
        String descPamanKd = " Paman Kandung";
        String descPamanSa = " Paman Se-Kakek";
        String descSepupuLkKd = " Sepupu Laki-laki dari Paman Kandung";
        String descSepupuLkSa = " Sepupu Laki-laki dari Paman Se-Kakek";
        tvAnakLk.setText(String.valueOf(jAnakLk + descAnakLk));
        tvAnakPr.setText(String.valueOf(jAnakPr + descAnakPr));
        tvAyah.setText(String.valueOf(jAyah + descAyah));
        tvIbu.setText(String.valueOf(jIbu + descIbu));
        tvSuami.setText(String.valueOf(jSuami + descSuami));
        tvIstri.setText(String.valueOf(jIstri + descIstri));
        tvCucuLk.setText(String.valueOf(jCucuLk + descCucuLk));
        tvCucuPr.setText(String.valueOf(jCucuPr + descCucuPr));
        tvKakek.setText(String.valueOf(jKakek + descKakek));
        tvNenekA.setText(String.valueOf(jNenekA + descNenekA));
        tvNenekI.setText(String.valueOf(jNenekI + descNenekI));
        tvSaudaraLkKd.setText(String.valueOf(jSaudaraLkKd + descSaudaraLkKd));
        tvSaudaraPrKd.setText(String.valueOf(jSaudaraPrKd + descSaudaraPrKd));
        tvSaudaraLkSa.setText(String.valueOf(jSaudaraLkSa + descSaudaraLkSa));
        tvSaudaraPrSa.setText(String.valueOf(jSaudaraPrSa + descSaudaraPrSa));
        tvSaudaraLkSi.setText(String.valueOf(jSaudaraLkSi + descSaudaraLkSi));
        tvSaudaraPrSi.setText(String.valueOf(jSaudaraPrSi + descSaudaraPrSi));
        tvKeponakanLkKd.setText(String.valueOf(jKeponakanLkKd + descKeponakanLkKd));
        tvKeponakanLkSa.setText(String.valueOf(jKeponakanLkSa + descKeponakanLkSa));
        tvPamanKd.setText(String.valueOf(jPamanKd + descPamanKd));
        tvPamanSa.setText(String.valueOf(jPamanSa + descPamanSa));
        tvSepupuKd.setText(String.valueOf(jSepupuLkPmnKd + descSepupuLkKd));
        tvSepupuSa.setText(String.valueOf(jSepupuLkPmnSa + descSepupuLkSa));

        setRowGone();

        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetValue();
                startActivity(new Intent(ResultActivity.this, MainActivity.class));
            }
        });

        btnRepeat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetValue();
                startActivity(new Intent(ResultActivity.this, InputActivity1.class));
            }
        });
    }

    public void setRowGone() {
        if (bagAnakLk == 0) {
            rowAnakLk.setVisibility(View.GONE);
        }
        if (bagAnakPr == 0) {
            rowAnakPr.setVisibility(View.GONE);
        }
        if (bagAyah == 0) {
            rowAyah.setVisibility(View.GONE);
        }
        if (bagIbu == 0) {
            rowIbu.setVisibility(View.GONE);
        }
        if (bagSuami == 0) {
            rowSuami.setVisibility(View.GONE);
        }
        if (bagIstri == 0) {
            rowIstri.setVisibility(View.GONE);
        }
        if (bagCucuLk == 0) {
            rowCucuLk.setVisibility(View.GONE);
        }
        if (bagCucuPr == 0) {
            rowCucuPr.setVisibility(View.GONE);
        }
        if (bagKakek == 0) {
            rowKakek.setVisibility(View.GONE);
        }
        if (bagNenekA == 0) {
            rowNenekA.setVisibility(View.GONE);
        }
        if (bagNenekI == 0) {
            rowNenekI.setVisibility(View.GONE);
        }
        if (bagSaudaraLkKd == 0) {
            rowSaudaraLkKd.setVisibility(View.GONE);
        }
        if (bagSaudaraPrKd == 0) {
            rowSaudaraPrKd.setVisibility(View.GONE);
        }
        if (bagSaudaraLkSa == 0) {
            rowSaudaraLkSa.setVisibility(View.GONE);
        }
        if (bagSaudaraPrSa == 0) {
            rowSaudaraPrSa.setVisibility(View.GONE);
        }
        if (bagSaudaraLkSi == 0) {
            rowSaudaraLkSi.setVisibility(View.GONE);
        }
        if (bagSaudaraPrSi == 0) {
            rowSaudaraPrSi.setVisibility(View.GONE);
        }
        if (bagKeponakanLkKd == 0) {
            rowKeponakanLkKd.setVisibility(View.GONE);
        }
        if (bagKeponakanLkSa == 0) {
            rowKeponakanLkSa.setVisibility(View.GONE);
        }
        if (bagPamanKd == 0) {
            rowPamanKd.setVisibility(View.GONE);
        }
        if (bagPamanSa == 0) {
            rowPamanSa.setVisibility(View.GONE);
        }
        if (bagSepupuPamanKd == 0) {
            rowSepupuKd.setVisibility(View.GONE);
        }
        if (bagSepupuPamanSa == 0) {
            rowSepupuSa.setVisibility(View.GONE);
        }
    }

    public void setKadarBagi() {
        setKbAnakPr();
        setKbAyah();
        setKbIbu();
        setKbSuami();
        setKbIstri();

        setKbCucuPr();
        setKbKakek();
        setKbNenek();

        setKbSaudaraPrKd();
        setKbSaudaraPrSa();
        setKbSaudaraSi();

        Ashobah = irts - (kbAnakPr + kbAyah + kbIbu + kbSuami + kbIstri + kbCucuPr + kbKakek + kbNenekA + kbNenekI
                + kbSaudaraPrKd + kbSaudaraPrSa + kbSaudaraLkSi + kbSaudaraPrSi);

        setAshAnak();
        setAshAyah();
        umariyatani();

        setAshCucuLk();
        setAshCucuPr();
        setAshKakek();

        setAshSaudaraKd();
        setAshSaudaraSa();

        setAshKeponakanLkKd();
        setAshKeponakanLkSa();
        setAshPamanKd();
        setAshPamanSa();
        setAshSepupuLkKd();
        setAshSepupuLkSa();

        setAshMaalGhoir();
        //setAshMaalGhoir2();

    }

    public void hitungWaris() {
        if (kbSuami > 0) {
            bagSuami = kbSuami;
        }

        if (kbIstri > 0) {
            bagIstri = kbIstri / jIstri;
        }

        if (kbNenekA > 0) {
            bagNenekA = kbNenekA;
        }

        if (kbNenekI > 0) {
            bagNenekI = kbNenekI;
        }

        if (ashAnakLk > 0) {
            bagAnakLk = ashAnakLk / jAnakLk;
        }

        if (ashAnakPr > 0 || kbAnakPr > 0) {
            bagAnakPr = (ashAnakPr + kbAnakPr) / jAnakPr;
        }

        if (ashAyah > 0 || kbAyah > 0) {
            bagAyah = ashAyah + kbAyah;
        }

        if (ashIbu > 0 || kbIbu > 0) {
            bagIbu = ashIbu + kbIbu;
        }

        if (ashCucuLk > 0) {
            bagCucuLk = ashCucuLk / jCucuLk;
        }

        if (ashCucuPr > 0 || kbCucuPr > 0) {
            bagCucuPr = (ashCucuPr + kbCucuPr) / jCucuPr;
        }

        if (ashKakek > 0 || kbKakek > 0) {
            bagKakek = ashKakek + kbKakek;
        }

        if (ashSaudaraLkKd > 0) {
            bagSaudaraLkKd = ashSaudaraLkKd / jSaudaraLkKd;
        }

        if (ashSaudaraPrKd > 0 || kbSaudaraPrKd > 0) {
            bagSaudaraPrKd = (kbSaudaraPrKd + ashSaudaraPrKd) / jSaudaraPrKd;
        }

        if (ashSaudaraLkSa > 0) {
            bagSaudaraLkSa = ashSaudaraLkSa / jSaudaraLkSa;
        }

        if (kbSaudaraPrSa > 0 || ashSaudaraPrSa > 0) {
            bagSaudaraPrSa = (kbSaudaraPrSa + ashSaudaraPrSa) / jSaudaraPrSa;
        }

        if (kbSaudaraLkSi > 0) {
            bagSaudaraLkSi = kbSaudaraLkSi / jSaudaraLkSi;
        }

        if (kbSaudaraPrSi > 0) {
            bagSaudaraPrSi = kbSaudaraPrSi / jSaudaraPrSi;
        }

        if (ashKeponakanLkKd > 0) {
            bagKeponakanLkKd = ashKeponakanLkKd / jKeponakanLkKd;
        }

        if (ashKeponakanLkSa > 0) {
            bagKeponakanLkSa = ashKeponakanLkSa / jKeponakanLkSa;
        }

        if (ashPamanKd > 0) {
            bagPamanKd = ashPamanKd / jPamanKd;
        }

        if (ashPamanSa > 0) {
            bagPamanSa = ashPamanSa / jPamanSa;
        }

        if (ashSepupuLkPmnKd > 0) {
            bagSepupuPamanKd = ashSepupuLkPmnKd / jSepupuLkPmnKd;
        }

        if (ashSepupuLkPmnSa > 0) {
            bagSepupuPamanSa = ashSepupuLkPmnSa / jSepupuLkPmnSa;
        }

    }

    public void resetValue() {
        checkAshKakek = false;
        checkKbKakek = false;
        checkAshAyah = false;
        checkKbAyah = false;

        tirkah = 0;
        tajhiz = 0;
        wasiat = 0;
        hutang = 0;
        irts = 0;
        jAnakPr = 0;
        jAnakLk = 0;
        jAyah = 0;
        jIbu = 0;
        jSuami = 0;
        jIstri = 0;
        jCucuLk = 0;
        jCucuPr = 0;
        jKakek = 0;
        jNenekA = 0;
        jNenekI = 0;
        jSaudaraLkKd = 0;
        jSaudaraPrKd = 0;
        jSaudaraLkSa = 0;
        jSaudaraPrSa = 0;
        jSaudaraLkSi = 0;
        jSaudaraPrSi = 0;
        jKeponakanLkKd = 0;
        jKeponakanLkSa = 0;
        jPamanKd = 0;
        jPamanSa = 0;
        jSepupuLkPmnKd = 0;
        jSepupuLkPmnSa = 0;

        //------------------ashabul Furudh
        kbAnakPr = 0;
        kbCucuPr = 0;
        kbAyah = 0;
        kbIbu = 0;
        kbSuami = 0;
        kbIstri = 0;
        kbKakek = 0;
        kbNenekA = 0;
        kbNenekI = 0;
        kbSaudaraPrKd = 0;
        kbSaudaraPrSa = 0;
        kbSaudaraLkSi = 0;
        kbSaudaraPrSi = 0;

        //------------------ashobah
        ashAnakLk = 0;
        ashCucuLk = 0;
        ashAyah = 0;
        ashKakek = 0;
        ashSaudaraLkKd = 0;
        ashSaudaraLkSa = 0;
        ashKeponakanLkKd = 0;
        ashKeponakanLkSa = 0;

        ashPamanKd = 0;
        ashPamanSa = 0;
        ashSepupuLkPmnKd = 0;
        ashSepupuLkPmnSa = 0;

        ashAnakPr = 0;
        ashCucuPr = 0;
        ashSaudaraPrKd = 0;
        ashSaudaraPrSa = 0;
        ashIbu = 0;

        bagAnakLk = 0;
        bagAnakPr = 0;
        bagAyah = 0;
        bagIbu = 0;
        bagSuami = 0;
        bagIstri = 0;
        bagCucuLk = 0;
        bagCucuPr = 0;
        bagKakek = 0;
        bagNenekA = 0;
        bagNenekI = 0;
        bagSaudaraLkKd = 0;
        bagSaudaraPrKd = 0;
        bagSaudaraLkSa = 0;
        bagSaudaraPrSa = 0;
        bagSaudaraLkSi = 0;
        bagSaudaraPrSi = 0;
        bagKeponakanLkKd = 0;
        bagKeponakanLkSa = 0;
        bagPamanKd = 0;
        bagPamanSa = 0;
        bagSepupuPamanKd = 0;
        bagSepupuPamanSa = 0;
    }

    // Keluarga terdekat
    public void setKbAyah() {
        if (jAyah == 1)
            if (jAnakLk >= 1 || jCucuLk >= 1 || jAnakPr >= 1 || jCucuPr >= 1) {
                // ada ayah, ada salah satu furu'
                kbAyah = Math.round(irts / 6);
                checkKbAyah = true;
            }
    }

    public void setAshAyah() {
        if (jAyah == 1 && jAnakLk == 0 && jCucuLk == 0) {
            // ada ayah, tidak ada furu' laki-laki
            ashAyah = Ashobah;
            checkAshAyah = true;
        }

        if (checkKbAyah && checkAshAyah) {
            jthAyah = "1/6 + Ashobah";
        } else if (checkKbAyah) {
            jthAyah = "1/6";
        } else if (checkAshAyah) {
            jthAyah = "1:1A";
        }
    }

    public void umariyatani() {
        if (jAyah == 1 && jIbu == 1 && jAnakLk == 0 && jCucuLk == 0 && jAnakPr == 0 && jCucuPr == 0)
            if (jSuami == 1 || jIstri >= 1) {
                // ada ayah, ada ibu, ada suami/istri  tidak ada furu' (masalah umariyatani)
                Ashobah = Ashobah + kbAyah + kbIbu;
                ashAyah = Math.round(2 * Ashobah / 3);
                ashIbu = Math.round(Ashobah / 3);
                kbAyah = 0;
                kbIbu = 0;
                jthAyah = "1:1A";
                jthIbu = "1:3A";
            }
    }

    public void setKbIbu() {
        int jSdrKd = jSaudaraLkKd + jSaudaraPrKd;
        int jSdrSa = jSaudaraLkSa + jSaudaraPrSa;
        int jSdrSi = jSaudaraLkSi + jSaudaraPrSi;

        if (jIbu == 1)
            if (jAnakLk >= 1 || jAnakPr >= 1 || jCucuLk >= 1 || jCucuPr >= 1 || jSdrKd >= 2 || jSdrSa >= 2 || jSdrSi >= 2) {
                // ada ibu, ada furu' atau berkumpulnya saudara kandung atau saudara seayah atau saudara seibu
                kbIbu = Math.round(irts / 6);
                jthIbu = "1/6";
            } else if (jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && jSdrKd <= 1 && jSdrSa <= 1 && jSdrSi <= 1) {
                // ada ibu, tidak ada furu' dan  tidak berkumpul saudara kandung atau saudara seayah
                kbIbu = Math.round(irts / 3);
                jthIbu = "1/3";
            }
    }

    public void setKbSuami() {
        if (jSuami == 1)
            if (jAnakLk >= 1 || jAnakPr >= 1 || jCucuLk >= 1 || jCucuPr >= 1) { // ada furu'
                kbSuami = Math.round(irts / 4);
                jthSuami = "1/4";
            } else if (jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0) { // tidak ada furu'
                kbSuami = Math.round(irts / 2);
                jthSuami = "1/2";
            }
    }

    public void setKbIstri() {
        if (jIstri >= 1)
            if (jAnakLk >= 1 || jAnakPr >= 1 || jCucuLk >= 1 || jCucuPr >= 1) { // ada furu'
                kbIstri = Math.round(irts / 8);
                jthIstri = "1/8";
            } else if (jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0) { // tidak ada furu'
                kbIstri = Math.round(irts / 4);
                jthIstri = "1/4";
            }
    }

    public void setAshAnak() {
        if (jAnakLk >= 1 && jAnakPr >= 1) { //ashobah bil ghoir
            ashAnakLk = Math.round(2 * Ashobah / 3);
            ashAnakPr = Math.round(Ashobah / 3);
            jthAnakLk = "2:1A";
            jthAnakPr = "1:1A";
        } else if (jAnakLk >= 1 && jAnakPr == 0) {
            ashAnakLk = Ashobah;
            jthAnakLk = "Ashobah";

        }
    }

    public void setKbAnakPr() {
        if (jAnakPr == 1 && jAnakLk == 0) { //anak perempuan tungal
            kbAnakPr = Math.round(irts / 2);
            jthAnakPr = "1/2";
        } else if (jAnakPr >= 2 && jAnakLk == 0) { //anak perempuan banyak
            kbAnakPr = Math.round(2 * irts / 3);
            jthAnakPr = "2/3";
        }
    }

    //-------------------------------- cucu
    public void setAshCucuLk() {
        if (jAnakLk == 0 && jCucuLk >= 1 && jCucuPr >= 1) { // bersama cucu perempuan
            ashCucuLk = Math.round(2 * Ashobah / 3);
            jthCucuLk = "2:1A";
        } else if (jAnakLk == 0 && jCucuLk >= 1 && jCucuPr == 0) { // tidak ada cucu perempuan
            ashCucuLk = Ashobah;
            jthCucuLk = "Ashobah";
        }
    }

    public void setAshCucuPr() {
        if (jCucuPr >= 1 && jCucuLk >= 1 && jAnakPr < 2 && jAnakLk == 0) { // bersama cucu laki-laki
            ashCucuPr = Math.round(Ashobah / 3);
            jthCucuPr = "1:1A";
        }
    }

    public void setKbCucuPr() {
        if (jCucuPr == 1 && jCucuLk == 0 && jAnakLk == 0 && jAnakPr == 0) { // seorang diri
            kbCucuPr = Math.round(irts / 2);
            jthCucuPr = "1/2";
        } else if (jCucuPr >= 1 && jCucuLk == 0 && jAnakLk == 0 && jAnakPr == 1) { // bersama seorang anak perempuan
            kbCucuPr = Math.round(irts / 6);
            jthCucuPr = "1/6";
        } else if (jCucuPr >= 2 && jCucuLk == 0 && jAnakLk == 0 && jAnakPr == 0) { // dua orang atau lebih
            kbCucuPr = Math.round(2 * irts / 3);
            jthCucuPr = "2/3";
        }
    }


    //---------------------------- kakek dan nenek
    public void setKbKakek() {
        if (jKakek == 1 && jAyah == 0) {
            kbKakek = Math.round(irts / 6);
            checkKbKakek = true;
        }
    }

    public void setAshKakek() {
        if (jKakek == 1 && jAyah == 0 && jAnakLk == 0 && jCucuLk == 0) {
            ashKakek = Ashobah;
            checkAshKakek = true;
        }

        if (jAyah == 0 && jAnakLk == 0 && jCucuLk == 0 && jAnakPr == 0 && jCucuPr == 0) {
            kbKakek = 0;
            checkKbKakek = false;
        }

        if (checkKbKakek && checkAshKakek) {
            jthKakek = "1/6 + Ashobah";
        } else if (checkKbKakek) {
            jthKakek = "1/6";
        } else if (checkAshKakek) {
            jthKakek = "Ashobah";
        }
    }

    public void setKbNenek() {
        if (jIbu == 0 && jNenekA >= 1 && jNenekI == 0) {
            kbNenekA = Math.round(irts / 6);
            jthNenekA = "1/6";
        } else if (jIbu == 0 && jNenekA == 0 && jNenekI >= 1) {
            kbNenekA = Math.round(irts / 6);
            jthNenekI = "1/6";
        } else if (jIbu == 0 && jNenekA >= 1 && jNenekI >= 1) {
            kbNenekA = Math.round(irts / 12);
            kbNenekI = Math.round(irts / 12);
            jthNenekA = "1/6B";
            jthNenekI = "1/6B";
        }
    }

    //------------------------------ suadara kandung
    public void setAshSaudaraKd() {
        if (jSaudaraLkKd >= 1 && jSaudaraPrKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0) {
            ashSaudaraLkKd = Ashobah;
            jthSaudaraLkKd = "Ashobah";
        } else if (jSaudaraLkKd >= 1 && jSaudaraPrKd >= 1 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0) {
            ashSaudaraLkKd = Math.round(2 * Ashobah / 3); // ashobah bil ghoir
            ashSaudaraPrKd = Math.round(Ashobah / 3);
            jthSaudaraLkKd = "2:1A";
            jthSaudaraPrKd = "1:1A";
        }
    }

    public void setKbSaudaraPrKd() {
        if (jSaudaraPrKd == 1 && jSaudaraLkKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0 && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrKd = Math.round(irts / 2);
            jthSaudaraPrKd = "1/2";
        } else if (jSaudaraPrKd >= 2 && jSaudaraLkKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0 && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrKd = Math.round(2 * irts / 3);
            jthSaudaraPrKd = "2/3";
        }
    }

    //------------------------------------------------------
    public void setAshMaalGhoir() {
        if (jAnakPr >= 1 || jCucuPr >= 1) {
            if (jSaudaraPrKd >= 1 && jSaudaraLkKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0) {
                ashSaudaraPrKd = Ashobah; //Ashobah maal ghoir, bersama anak perempuan atau cucu perempuan
                kbSaudaraPrKd = 0;
                jthSaudaraPrKd = "Ashobah";
                // ketika saudara perempuan mendapat ashobah maal ghoir, maka dihukumi seperti saudara laki-laki kandung
                ashSaudaraLkSa = 0;
                ashSaudaraPrSa = 0;
                kbSaudaraPrSa = 0;
                ashKeponakanLkKd = 0;
                ashKeponakanLkSa = 0;
                ashPamanKd = 0;
                ashPamanSa = 0;
                ashSaudaraLkKd = 0;
                ashSepupuLkPmnSa = 0;
            } else if (jSaudaraPrSa >= 1 && jSaudaraLkSa == 0 && jSaudaraPrKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0) {
                ashSaudaraPrSa = Ashobah; //Ashobah maal ghoir, bersama anak perempuan atau cucu perempuan
                kbSaudaraPrSa = 0;
                jthSaudaraPrSa = "Ashobah";
                // ketika saudara perempuan mendapat ashobah maal ghoir, maka dihukumi seperti saudara laki-laki seayah
                ashKeponakanLkKd = 0;
                ashKeponakanLkSa = 0;
                ashPamanKd = 0;
                ashPamanSa = 0;
                ashSaudaraLkKd = 0;
                ashSepupuLkPmnSa = 0;
            }
        }
    }

/*
    public void setAshMaalGhoir2() {
        if (jAnakPr >= 1 || jCucuPr >= 1)
            if (jSaudaraPrSa >= 1 && jSaudaraLkSa == 0 && jSaudaraPrKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0) {
                Ashobah = Ashobah + kbSaudaraPrSa;
                ashSaudaraPrSa = Ashobah; //Ashobah maal ghoir, bersama anak perempuan atau cucu perempuan
                kbSaudaraPrSa = 0;
                jthSaudaraPrSa = "Ashobah";
            }
    }*/

    //------------------------------ saudara tiri
    public void setAshSaudaraSa() {
        if (jSaudaraLkSa >= 1 && jSaudaraPrSa == 0 && jSaudaraLkKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0) {
            ashSaudaraLkSa = Ashobah;
            jthSaudaraLkSa = "Ashobah";
        } else if (jSaudaraLkSa >= 1 && jSaudaraPrSa >= 1 && jSaudaraLkKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0) {
            ashSaudaraLkSa = Math.round(2 * Ashobah / 3);
            ashSaudaraPrSa = Math.round(Ashobah / 3);
            jthSaudaraLkSa = "2:1A";
            jthSaudaraPrSa = "1:1A";
        } else if (jAnakPr >= 1 || jCucuPr >= 1)
            if (jSaudaraPrKd >= 1) {
                ashSaudaraLkSa = 0;
                ashSaudaraPrSa = 0;
                kbSaudaraPrSa = 0;
                jthSaudaraLkSa = "Terhalang";
                jthSaudaraPrSa = "Terhalang";
            }
    }

    public void setKbSaudaraPrSa() {
        if (jSaudaraPrSa == 1 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0 && jSaudaraPrKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0
                && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrSa = Math.round(irts / 2);
            jthSaudaraPrSa = "1/2";
        } else if (jSaudaraPrSa >= 2 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0 && jSaudaraPrKd == 0 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0
                && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrSa = Math.round(2 * irts / 3);
            jthSaudaraPrSa = "2/3";
        } else if (jSaudaraPrSa >= 1 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0 && jSaudaraPrKd >= 1 && jAnakLk == 0 && jAyah == 0 && jCucuLk == 0 && jKakek == 0
                && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrSa = Math.round(irts / 3);
            jthSaudaraPrSa = "1/6";
        }
    }

    public void setKbSaudaraSi() {
        if (jSaudaraLkSi == 1 && jSaudaraPrSi == 0 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && jAyah == 0 && jKakek == 0) {
            kbSaudaraLkSi = Math.round(irts / 6);
            jthSaudaraLkSi = "1/6";
        } else if (jSaudaraLkSi >= 2 && jSaudaraPrSi == 0 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && jAyah == 0 && jKakek == 0) {
            kbSaudaraLkSi = Math.round(irts / 3);
            jthSaudaraLkSi = "1/3";
        } else if (jSaudaraLkSi == 0 && jSaudaraPrSi == 1 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && jAyah == 0 && jKakek == 0) {
            kbSaudaraPrSi = Math.round(irts / 6);
            jthSaudaraPrSi = "1/6";
        } else if (jSaudaraLkSi == 0 && jSaudaraPrSi >= 2 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && jAyah == 0 && jKakek == 0) {
            kbSaudaraPrSi = Math.round(irts / 3);
            jthSaudaraPrSi = "1/3";
        } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && jAyah == 0 && jKakek == 0) {
            kbSaudaraLkSi = Math.round(irts / 6);
            kbSaudaraPrSi = Math.round(irts / 6);
            jthSaudaraLkSi = "1/3B";
            jthSaudaraPrSi = "1/3B";
        }

    }

    //------------------------------ keponakan
    public void setAshKeponakanLkKd() {
        if (jKeponakanLkKd >= 1 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && jAyah == 0 && jKakek == 0) {
            ashKeponakanLkKd = Ashobah;
        }
    }

    public void setAshKeponakanLkSa() {
        if (jKeponakanLkSa >= 1 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && jAyah == 0 && jKakek == 0) {
            ashKeponakanLkSa = Ashobah;
        }
    }

    //------------------------------ paman
    public void setAshPamanKd() {
        if (jPamanKd >= 1 && jKeponakanLkSa == 0 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && jAyah == 0 && jKakek == 0) {
            ashPamanKd = Ashobah;
        }
    }

    public void setAshPamanSa() {
        if (jPamanSa >= 1 && jPamanKd == 0 && jKeponakanLkSa == 0 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && jAyah == 0 && jKakek == 0) {
            ashPamanSa = Ashobah;
        }
    }

    //------------------------------ sepupu
    public void setAshSepupuLkKd() {
        if (jSepupuLkPmnKd >= 1 && jPamanSa == 0 && jPamanKd == 0 && jKeponakanLkSa == 0 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && jAyah == 0 && jKakek == 0) {
            ashSepupuLkPmnKd = Ashobah;
        }
    }

    public void setAshSepupuLkSa() {
        if (jSepupuLkPmnSa >= 1 && jSepupuLkPmnKd == 0 && jPamanSa == 0 && jPamanKd == 0
                && jKeponakanLkSa == 0 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && jAyah == 0 && jKakek == 0) {
            ashSepupuLkPmnSa = Ashobah;
        }
    }

}