package id.zakafikry.ewaris.Model;

import android.view.View;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import id.zakafikry.ewaris.Input.ResultActivity;

/**
 * Created by Zaka on 4/8/2019.
 */

public class FaraidEngine extends AhliWaris {

    public FaraidEngine() {

    }

    public void resetAll() {
        reset();

        resetValueIA1();
        resetValueIA2();
        resetValueIA3();
        resetValueIA4();
        resetValueIA5();
        resetValueIA6();
        resetValueIA7();
        resetValueIA8();
        resetValueIA9();
    }

    public void setTextAll(ResultActivity activity) {
        Locale localeId = new Locale("in", "ID");
        NumberFormat rp = NumberFormat.getCurrencyInstance(localeId);

        activity.tvTirkah.setText(rp.format(tirkah));
        activity.tvHutang.setText(rp.format(hutang));
        activity.tvTajhiz.setText(rp.format(tajhiz));
        activity.tvWasiat.setText(rp.format(wasiat));
        activity.tvIrts.setText(rp.format(irts));
        activity.tvBagAnakLk.setText(rp.format(bagAnakLk));
        activity.tvBagAnakPr.setText(rp.format(bagAnakPr));
        activity.tvBagAyah.setText(rp.format(bagAyah));
        activity.tvBagIbu.setText(rp.format(bagIbu));
        activity.tvBagSuami.setText(rp.format(bagSuami));
        activity.tvBagIstri.setText(rp.format(bagIstri));
        activity.tvBagCucuLk.setText(rp.format(bagCucuLk));
        activity.tvBagCucuPr.setText(rp.format(bagCucuPr));
        activity.tvBagKakek.setText(rp.format(bagKakek));
        activity.tvBagNenekA.setText(rp.format(bagNenekA));
        activity.tvBagNenekI.setText(rp.format(bagNenekI));
        activity.tvBagSaudaraLkKd.setText(rp.format(bagSaudaraLkKd));
        activity.tvBagSaudaraPrKd.setText(rp.format(bagSaudaraPrKd));
        activity.tvBagSaudaraLkSa.setText(rp.format(bagSaudaraLkSa));
        activity.tvBagSaudaraPrSa.setText(rp.format(bagSaudaraPrSa));
        activity.tvBagSaudaraLkSi.setText(rp.format(bagSaudaraLkSi));
        activity.tvBagSaudaraPrSi.setText(rp.format(bagSaudaraPrSi));
        activity.tvBagKeponakanLkKd.setText(rp.format(bagKeponakanLkKd));
        activity.tvBagKeponakanLkSa.setText(rp.format(bagKeponakanLkSa));
        activity.tvBagPamanKd.setText(rp.format(bagPamanKd));
        activity.tvBagPamanSa.setText(rp.format(bagPamanSa));
        activity.tvBagSepupuKd.setText(rp.format(bagSepupuPamanKd));
        activity.tvBagSepupuSa.setText(rp.format(bagSepupuPamanSa));

        activity.tvJthAnakLk.setText(jthAnakLk);
        activity.tvJthAnakPr.setText(jthAnakPr);
        activity.tvJthAyah.setText(jthAyah);
        activity.tvJthIbu.setText(jthIbu);
        activity.tvJthSuami.setText(jthSuami);
        activity.tvJthIstri.setText(jthIstri);
        activity.tvJthCucuLk.setText(jthCucuLk);
        activity.tvJthCucuPr.setText(jthCucuPr);
        activity.tvJthKakek.setText(jthKakek);
        activity.tvJthNenekA.setText(jthNenekA);
        activity.tvJthNenekI.setText(jthNenekI);
        activity.tvJthSaudaraLkKd.setText(jthSaudaraLkKd);
        activity.tvJthSaudaraPrKd.setText(jthSaudaraPrKd);
        activity.tvJthSaudaraLkSa.setText(jthSaudaraLkSa);
        activity.tvJthSaudaraPrSa.setText(jthSaudaraPrSa);
        activity.tvJthSaudaraLkSi.setText(jthSaudaraLkSi);
        activity.tvJthSaudaraPrSi.setText(jthSaudaraPrSi);
        activity.tvJthPamanKd.setText(jthPamanKd);
        activity.tvJthPamanSa.setText(jthPamanSa);
        activity.tvJthKeponakanLkKd.setText(jthKeponakanLkKd);
        activity.tvJthKeponakanLkSa.setText(jthKeponakanLkSa);
        activity.tvJthSepupuKd.setText(jthSepupuLkKd);
        activity.tvJthSepupuSa.setText(jthSepupuLkSa);

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

        activity.tvAnakLk.setText(String.valueOf(jAnakLk + descAnakLk));
        activity.tvAnakPr.setText(String.valueOf(jAnakPr + descAnakPr));
        activity.tvAyah.setText(String.valueOf((isAyah ? 1 : 0) + descAyah));
        activity.tvIbu.setText(String.valueOf((isIbu ? 1 : 0) + descIbu));
        activity.tvSuami.setText(String.valueOf((isSuami ? 1 : 0) + descSuami));
        activity.tvIstri.setText(String.valueOf(jIstri + descIstri));
        activity.tvCucuLk.setText(String.valueOf(jCucuLk + descCucuLk));
        activity.tvCucuPr.setText(String.valueOf(jCucuPr + descCucuPr));
        activity.tvKakek.setText(String.valueOf((isKakek ? 1 : 0) + descKakek));
        activity.tvNenekA.setText(String.valueOf(jNenekA + descNenekA));
        activity.tvNenekI.setText(String.valueOf(jNenekI + descNenekI));
        activity.tvSaudaraLkKd.setText(String.valueOf(jSaudaraLkKd + descSaudaraLkKd));
        activity.tvSaudaraPrKd.setText(String.valueOf(jSaudaraPrKd + descSaudaraPrKd));
        activity.tvSaudaraLkSa.setText(String.valueOf(jSaudaraLkSa + descSaudaraLkSa));
        activity.tvSaudaraPrSa.setText(String.valueOf(jSaudaraPrSa + descSaudaraPrSa));
        activity.tvSaudaraLkSi.setText(String.valueOf(jSaudaraLkSi + descSaudaraLkSi));
        activity.tvSaudaraPrSi.setText(String.valueOf(jSaudaraPrSi + descSaudaraPrSi));
        activity.tvKeponakanLkKd.setText(String.valueOf(jKeponakanLkKd + descKeponakanLkKd));
        activity.tvKeponakanLkSa.setText(String.valueOf(jKeponakanLkSa + descKeponakanLkSa));
        activity.tvPamanKd.setText(String.valueOf(jPamanKd + descPamanKd));
        activity.tvPamanSa.setText(String.valueOf(jPamanSa + descPamanSa));
        activity.tvSepupuKd.setText(String.valueOf(jSepupuLkPmnKd + descSepupuLkKd));
        activity.tvSepupuSa.setText(String.valueOf(jSepupuLkPmnSa + descSepupuLkSa));
    }

    public void setVisibility(ResultActivity activity) {
        if (bagAnakLk == 0 || Double.isNaN(bagAnakLk) || Double.isInfinite(bagAnakLk)) {
            activity.rowAnakLk.setVisibility(View.GONE);
        }
        if (bagAnakPr == 0 || Double.isNaN(bagAnakPr) || Double.isInfinite(bagAnakPr)) {
            activity.rowAnakPr.setVisibility(View.GONE);
        }
        if (bagAyah == 0 || Double.isNaN(bagAyah) || Double.isInfinite(bagAyah)) {
            activity.rowAyah.setVisibility(View.GONE);
        }
        if (bagIbu == 0 || Double.isNaN(bagIbu) || Double.isInfinite(bagIbu)) {
            activity.rowIbu.setVisibility(View.GONE);
        }
        if (bagSuami == 0 || Double.isNaN(bagSuami) || Double.isInfinite(bagSuami)) {
            activity.rowSuami.setVisibility(View.GONE);
        }
        if (bagIstri == 0 || Double.isNaN(bagIstri) || Double.isInfinite(bagIstri)) {
            activity.rowIstri.setVisibility(View.GONE);
        }
        if (bagCucuLk == 0 || Double.isNaN(bagCucuLk) || Double.isInfinite(bagCucuLk)) {
            activity.rowCucuLk.setVisibility(View.GONE);
        }
        if (bagCucuPr == 0 || Double.isNaN(bagCucuPr) || Double.isInfinite(bagCucuPr)) {
            activity.rowCucuPr.setVisibility(View.GONE);
        }
        if (bagKakek == 0 || Double.isNaN(bagKakek) || Double.isInfinite(bagKakek)) {
            activity.rowKakek.setVisibility(View.GONE);
        }
        if (bagNenekA == 0 || Double.isNaN(bagNenekA) || Double.isInfinite(bagNenekA)) {
            activity.rowNenekA.setVisibility(View.GONE);
        }
        if (bagNenekI == 0 || Double.isNaN(bagNenekI) || Double.isInfinite(bagNenekI)) {
            activity.rowNenekI.setVisibility(View.GONE);
        }
        if (bagSaudaraLkKd == 0 || Double.isNaN(bagSaudaraLkKd) || Double.isInfinite(bagSaudaraLkKd)) {
            activity.rowSaudaraLkKd.setVisibility(View.GONE);
        }
        if (bagSaudaraPrKd == 0 || Double.isNaN(bagSaudaraPrKd) || Double.isInfinite(bagSaudaraPrKd)) {
            activity.rowSaudaraPrKd.setVisibility(View.GONE);
        }
        if (bagSaudaraLkSa == 0 || Double.isNaN(bagSaudaraLkSa) || Double.isInfinite(bagSaudaraLkSa)) {
            activity.rowSaudaraLkSa.setVisibility(View.GONE);
        }
        if (bagSaudaraPrSa == 0 || Double.isNaN(bagSaudaraPrSa) || Double.isInfinite(bagSaudaraPrSa)) {
            activity.rowSaudaraPrSa.setVisibility(View.GONE);
        }
        if (bagSaudaraLkSi == 0 || Double.isNaN(bagSaudaraLkSi) || Double.isInfinite(bagSaudaraLkSi)) {
            activity.rowSaudaraLkSi.setVisibility(View.GONE);
        }
        if (bagSaudaraPrSi == 0 || Double.isNaN(bagSaudaraPrSi) || Double.isInfinite(bagSaudaraPrSi)) {
            activity.rowSaudaraPrSi.setVisibility(View.GONE);
        }
        if (bagKeponakanLkKd == 0 || Double.isNaN(bagKeponakanLkKd) || Double.isInfinite(bagKeponakanLkKd)) {
            activity.rowKeponakanLkKd.setVisibility(View.GONE);
        }
        if (bagKeponakanLkSa == 0 || Double.isNaN(bagKeponakanLkSa) || Double.isInfinite(bagKeponakanLkSa)) {
            activity.rowKeponakanLkSa.setVisibility(View.GONE);
        }
        if (bagPamanKd == 0 || Double.isNaN(bagPamanKd) || Double.isInfinite(bagPamanKd)) {
            activity.rowPamanKd.setVisibility(View.GONE);
        }
        if (bagPamanSa == 0 || Double.isNaN(bagPamanSa) || Double.isInfinite(bagPamanSa)) {
            activity.rowPamanSa.setVisibility(View.GONE);
        }
        if (bagSepupuPamanKd == 0 || Double.isNaN(bagSepupuPamanKd) || Double.isInfinite(bagSepupuPamanKd)) {
            activity.rowSepupuKd.setVisibility(View.GONE);
        }
        if (bagSepupuPamanSa == 0 || Double.isNaN(bagSepupuPamanSa) || Double.isInfinite(bagSepupuPamanSa)) {
            activity.rowSepupuSa.setVisibility(View.GONE);
        }

        if (jAnakLk == 0 && jAnakPr == 0 && !isAyah && !isIbu && !isSuami && jIstri == 0 && jCucuLk == 0 && jCucuPr == 0 && !isKakek && jNenekA == 0 && jNenekI == 0
                && jSaudaraLkKd == 0 && jSaudaraPrKd == 0 && jSaudaraLkSa == 0 && jSaudaraPrSa == 0 && jKeponakanLkKd == 0 && jKeponakanLkSa == 0
                && jPamanKd == 0 && jPamanSa == 0 && jSepupuLkPmnKd == 0 && jSepupuLkPmnSa == 0) {
            activity.tvnoaw.setVisibility(View.VISIBLE);
            activity.tvjatah.setVisibility(View.INVISIBLE);
        }
    }

    public void calculateFaraid(ResultActivity activity) {
        setKbAnakPr();
        setKbAyah();
        setKbIbu();
        setKbSuami();
        setKbIstri();

        setKbCucuPr();
        setKbKakek();
        setKbNenek(activity);

        setKbSaudaraPrKd();
        setKbSaudaraPrSa();
        setKbSaudaraSi(activity);

        Ashobah = irts - (kbAnakPr + kbAyah + kbIbu + kbSuami + kbIstri + kbCucuPr + kbKakek + kbNenek
                + kbSaudaraPrKd + kbSaudaraPrSa + kbSaudaraSi);

        setAshAnak(activity);
        setAshAyah(activity);
        umariyatani(activity);

        setAshCucuLk(activity);
        setAshCucuPr(activity);
        setAshKakek(activity);

        setAshSaudaraKd(activity);
        setAshSaudaraSa(activity);

        setAshKeponakanLkKd(activity);
        setAshKeponakanLkSa(activity);
        setAshPamanKd(activity);
        setAshPamanSa(activity);
        setAshSepupuLkKd(activity);
        setAshSepupuLkSa(activity);

        setAshMaalGhoir(activity);

        Double sisaHarta = irts - (kbAnakPr + kbAyah + kbIbu + kbSuami + kbIstri + kbCucuPr + kbKakek + kbNenek
                + kbSaudaraPrKd + kbSaudaraPrSa + kbSaudaraSi
                + ashAnakLk + ashAnakPr + ashAyah + ashIbu + ashCucuLk + ashCucuPr + ashKakek
                + ashSaudaraLkKd + ashSaudaraPrKd + ashSaudaraLkSa + ashSaudaraPrSa + ashKeponakanLkKd + ashKeponakanLkSa
                + ashPamanKd + ashPamanSa + ashSepupuLkPmnKd + ashSepupuLkPmnSa);

        if (sisaHarta > 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek
                && jSaudaraLkKd == 0 && jSaudaraLkSa == 0 && jKeponakanLkKd == 0 && jKeponakanLkSa == 0
                && jPamanKd == 0 && jPamanSa == 0 && jSepupuLkPmnKd == 0 && jSepupuLkPmnSa == 0) {
            if ((kbAnakPr > 0) || (kbIbu > 0) || (kbCucuPr > 0) || (kbSaudaraPrKd > 0) || (kbSaudaraPrSa > 0) || (kbSaudaraSi > 0) || (kbNenek > 0)) {
                Radd(activity);
            }
        } else {
            Aul(activity);
        }
    }

    public void finalizeCalculation() {
        if (kbSuami > 0) {
            bagSuami = kbSuami;
        }

        if (kbIstri > 0) {
            bagIstri = kbIstri / jIstri;
        }

        if (kbNenek > 0 && jNenekA > 0 && jNenekI > 0) {
            bagNenekA = (kbNenek / 2) / jNenekA;
            bagNenekI = (kbNenek / 2) / jNenekI;
        } else if (kbNenek > 0 && jNenekA > 0 && jNenekI == 0) {
            bagNenekA = kbNenek / jNenekA;
        } else if (kbNenek > 0 && jNenekA == 0 && jNenekI > 0) {
            bagNenekI = kbNenek / jNenekI;
        }

        if (ashAnakLk > 0) {
            bagAnakLk = ashAnakLk / jAnakLk;
        }

        if (kbAnakPr > 0) {
            bagAnakPr = kbAnakPr / jAnakPr;
        } else if (ashAnakPr > 0) {
            bagAnakPr = ashAnakPr / jAnakPr;
        } else if (ashAnakPr > 0 && kbAnakPr > 0) {
            bagAnakPr = (ashAnakPr + kbAnakPr) / jAnakPr;
        }

        if (kbAyah > 0 && ashAyah > 0) {
            bagAyah = kbAyah + ashAyah;
        } else if (kbAyah > 0) {
            bagAyah = kbAyah;
        } else if (ashAyah > 0) {
            bagAyah = ashAyah;
        }

        if (kbIbu > 0) {
            bagIbu = kbIbu;
        } else if (ashIbu > 0) {
            bagIbu = ashIbu;
        }

        if (ashCucuLk > 0) {
            bagCucuLk = ashCucuLk / jCucuLk;
        }

        if (kbCucuPr > 0) {
            bagCucuPr = kbCucuPr / jCucuPr;
        } else if (ashCucuPr > 0) {
            bagCucuPr = ashCucuPr / jCucuPr;
        }

        if (ashKakek > 0 && kbKakek > 0) {
            bagKakek = ashKakek + kbKakek;
        } else if (kbKakek > 0) {
            bagKakek = kbKakek;
        } else if (ashKakek > 0) {
            bagKakek = ashKakek;
        }

        if (ashSaudaraLkKd > 0) {
            bagSaudaraLkKd = ashSaudaraLkKd / jSaudaraLkKd;
        }

        if (kbSaudaraPrKd > 0) {
            bagSaudaraPrKd = kbSaudaraPrKd / jSaudaraPrKd;
        } else if (ashSaudaraPrKd > 0) {
            bagSaudaraPrKd = ashSaudaraPrKd / jSaudaraPrKd;
        }

        if (ashSaudaraLkSa > 0) {
            bagSaudaraLkSa = ashSaudaraLkSa / jSaudaraLkSa;
        }

        if (kbSaudaraPrSa > 0) {
            bagSaudaraPrSa = kbSaudaraPrSa / jSaudaraPrSa;
        } else if (ashSaudaraPrSa > 0) {
            bagSaudaraPrSa = ashSaudaraPrSa / jSaudaraPrSa;
        }

        if (kbSaudaraSi > 0 && jSaudaraLkSi > 0 && jSaudaraPrSi > 0) {
            bagSaudaraLkSi = (kbSaudaraSi / 2) / jSaudaraLkSi;
            bagSaudaraPrSi = (kbSaudaraSi / 2) / jSaudaraPrSi;
        } else if (kbSaudaraSi > 0 && jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
            bagSaudaraLkSi = kbSaudaraSi / jSaudaraLkSi;
        } else if (kbSaudaraSi > 0 && jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
            bagSaudaraPrSi = kbSaudaraSi / jSaudaraPrSi;
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

    private void Aul(ResultActivity activity) {
        // cek Pembagi/Penyebut
        if (pbAnakPr == 0) {
            pbAnakPr = 1;
        }

        if (pbAyah == 0) {
            pbAyah = 1;
        }

        if (pbIbu == 0) {
            pbIbu = 1;
        }

        if (pbSuami == 0) {
            pbSuami = 1;
        }

        if (pbIstri == 0) {
            pbIstri = 1;
        }

        if (pbCucuPr == 0) {
            pbCucuPr = 1;
        }

        if (pbKakek == 0) {
            pbKakek = 1;
        }

        if (pbNenek == 0) {
            pbNenek = 1;
        }

        if (pbSaudaraPrKd == 0) {
            pbSaudaraPrKd = 1;
        }

        if (pbSaudaraPrSa == 0) {
            pbSaudaraPrSa = 1;
        }

        if (pbSaudaraSi == 0) {
            pbSaudaraSi = 1;
        }

        pembagi = new double[]{pbAnakPr, pbAyah, pbIbu, pbSuami, pbIstri, pbCucuPr, pbKakek, pbNenek, pbSaudaraPrKd, pbSaudaraPrSa, pbSaudaraSi};
        kpk = lcm(pembagi);

        pmAnakPr = kpk / pbAnakPr * pmAnakPr;
        pmAyah = kpk / pbAyah * pmAyah;
        pmIbu = kpk / pbIbu * pmIbu;
        pmSuami = kpk / pbSuami * pmSuami;
        pmIstri = kpk / pbIstri * pmIstri;
        pmCucuPr = kpk / pbCucuPr * pmCucuPr;
        pmKakek = kpk / pbKakek * pmKakek;
        pmNenek = kpk / pbNenek * pmNenek;
        pmSaudaraPrKd = kpk / pbSaudaraPrKd * pmSaudaraPrKd;
        pmSaudaraPrSa = kpk / pbSaudaraPrSa * pmSaudaraPrSa;
        pmSaudaraSi = kpk / pbSaudaraSi * pmSaudaraSi;

        jPembilang = pmAnakPr + pmAyah + pmIbu + pmSuami + pmIstri + pmCucuPr + pmKakek + pmNenek + pmSaudaraPrKd + pmSaudaraPrSa + pmSaudaraSi;

        DecimalFormat df = new DecimalFormat("##.#");
        String sKpk = String.valueOf(df.format(kpk));
        String sp = String.valueOf(df.format(jPembilang));
        stringAsal = sKpk + " -> " + sp;

        //kaidah a'ul
        if (jPembilang > kpk) {
            activity.tvket1.setText("Masalah a'ul terjadi ketika jumlah penyebut lebih kecil dari jumlah pembilang, harta waris yang dibagikan menjadi lebih sedikit dibanding bagian seluruh ahli waris. Untuk mengatasi hal tersebut, maka bilangan penyebut disamakan dengan bilangan pembilang.");
            activity.tvket2.setText("Asal masalah yang dapat di a'ul-kan ialah 6 menjadi 7, 6 menjadi 8, 6 menjadi 9, 6 menjadi 10, 12 menjadi 13, 12 menjadi 15, 12 menjadi 17, dan 24 menjadi 27");
            activity.tvket1.setVisibility(View.VISIBLE);
            activity.tvket2.setVisibility(View.VISIBLE);

            activity.tvKPK.setText("Asal Masalah A'ul :");
            activity.tvKPK.setVisibility(View.VISIBLE);
            activity.tvJkpk.setVisibility(View.VISIBLE);
            activity.tvJkpk.setText(stringAsal);

            jPembagi = jPembilang;

            if (kpk == 6 && jPembilang == 7) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbAyah > 0) {
                    kbAyah = (pmAyah / jPembagi) * irts;
                    jthAyah = String.valueOf(df.format(pmAyah) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbSuami > 0) {
                    kbSuami = (pmSuami / jPembagi * irts);
                    jthSuami = String.valueOf(df.format(pmSuami) + "/" + df.format(jPembagi));
                }

                if (kbIstri > 0) {
                    kbIstri = (pmIstri / jPembagi) * irts;
                    jthIstri = String.valueOf(df.format(pmIstri) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbKakek > 0) {
                    kbKakek = (pmKakek / jPembagi) * irts;
                    jthKakek = String.valueOf(df.format(pmKakek) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                    }
                }
            } else if (kpk == 6 && jPembilang == 8) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbAyah > 0) {
                    kbAyah = (pmAyah / jPembagi) * irts;
                    jthAyah = String.valueOf(df.format(pmAyah) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbSuami > 0) {
                    kbSuami = (pmSuami / jPembagi * irts);
                    jthSuami = String.valueOf(df.format(pmSuami) + "/" + df.format(jPembagi));
                }

                if (kbIstri > 0) {
                    kbIstri = (pmIstri / jPembagi) * irts;
                    jthIstri = String.valueOf(df.format(pmIstri) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbKakek > 0) {
                    kbKakek = (pmKakek / jPembagi) * irts;
                    jthKakek = String.valueOf(df.format(pmKakek) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                    }
                }
            } else if (kpk == 6 && jPembilang == 9) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbAyah > 0) {
                    kbAyah = (pmAyah / jPembagi) * irts;
                    jthAyah = String.valueOf(df.format(pmAyah) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbSuami > 0) {
                    kbSuami = (pmSuami / jPembagi * irts);
                    jthSuami = String.valueOf(df.format(pmSuami) + "/" + df.format(jPembagi));
                }

                if (kbIstri > 0) {
                    kbIstri = (pmIstri / jPembagi) * irts;
                    jthIstri = String.valueOf(df.format(pmIstri) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbKakek > 0) {
                    kbKakek = (pmKakek / jPembagi) * irts;
                    jthKakek = String.valueOf(df.format(pmKakek) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                    }
                }
            } else if (kpk == 6 && jPembilang == 10) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbAyah > 0) {
                    kbAyah = (pmAyah / jPembagi) * irts;
                    jthAyah = String.valueOf(df.format(pmAyah) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbSuami > 0) {
                    kbSuami = (pmSuami / jPembagi * irts);
                    jthSuami = String.valueOf(df.format(pmSuami) + "/" + df.format(jPembagi));
                }

                if (kbIstri > 0) {
                    kbIstri = (pmIstri / jPembagi) * irts;
                    jthIstri = String.valueOf(df.format(pmIstri) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbKakek > 0) {
                    kbKakek = (pmKakek / jPembagi) * irts;
                    jthKakek = String.valueOf(df.format(pmKakek) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                    }
                }
            } else if (kpk == 12 && jPembilang == 13) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbAyah > 0) {
                    kbAyah = (pmAyah / jPembagi) * irts;
                    jthAyah = String.valueOf(df.format(pmAyah) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbSuami > 0) {
                    kbSuami = (pmSuami / jPembagi * irts);
                    jthSuami = String.valueOf(df.format(pmSuami) + "/" + df.format(jPembagi));
                }

                if (kbIstri > 0) {
                    kbIstri = (pmIstri / jPembagi) * irts;
                    jthIstri = String.valueOf(df.format(pmIstri) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbKakek > 0) {
                    kbKakek = (pmKakek / jPembagi) * irts;
                    jthKakek = String.valueOf(df.format(pmKakek) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                    }
                }
            } else if (kpk == 12 && jPembilang == 15) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbAyah > 0) {
                    kbAyah = (pmAyah / jPembagi) * irts;
                    jthAyah = String.valueOf(df.format(pmAyah) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbSuami > 0) {
                    kbSuami = (pmSuami / jPembagi * irts);
                    jthSuami = String.valueOf(df.format(pmSuami) + "/" + df.format(jPembagi));
                }

                if (kbIstri > 0) {
                    kbIstri = (pmIstri / jPembagi) * irts;
                    jthIstri = String.valueOf(df.format(pmIstri) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbKakek > 0) {
                    kbKakek = (pmKakek / jPembagi) * irts;
                    jthKakek = String.valueOf(df.format(pmKakek) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                    }
                }
            } else if (kpk == 12 && jPembilang == 17) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbAyah > 0) {
                    kbAyah = (pmAyah / jPembagi) * irts;
                    jthAyah = String.valueOf(df.format(pmAyah) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbSuami > 0) {
                    kbSuami = (pmSuami / jPembagi * irts);
                    jthSuami = String.valueOf(df.format(pmSuami) + "/" + df.format(jPembagi));
                }

                if (kbIstri > 0) {
                    kbIstri = (pmIstri / jPembagi) * irts;
                    jthIstri = String.valueOf(df.format(pmIstri) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbKakek > 0) {
                    kbKakek = (pmKakek / jPembagi) * irts;
                    jthKakek = String.valueOf(df.format(pmKakek) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                    }
                }
            } else if (kpk == 24 && jPembilang == 27) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbAyah > 0) {
                    kbAyah = (pmAyah / jPembagi) * irts;
                    jthAyah = String.valueOf(df.format(pmAyah) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbSuami > 0) {
                    kbSuami = (pmSuami / jPembagi * irts);
                    jthSuami = String.valueOf(df.format(pmSuami) + "/" + df.format(jPembagi));
                }

                if (kbIstri > 0) {
                    kbIstri = (pmIstri / jPembagi) * irts;
                    jthIstri = String.valueOf(df.format(pmIstri) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbKakek > 0) {
                    kbKakek = (pmKakek / jPembagi) * irts;
                    jthKakek = String.valueOf(df.format(pmKakek) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                    }
                }
            }
        }
    }

    private void Radd(ResultActivity activity) {
        // cek Pembagi/Penyebut
        if (pbAnakPr == 0) {
            pbAnakPr = 1;
        }

        if (pbIbu == 0) {
            pbIbu = 1;
        }

        if (pbCucuPr == 0) {
            pbCucuPr = 1;
        }

        if (pbNenek == 0) {
            pbNenek = 1;
        }

        if (pbSaudaraPrKd == 0) {
            pbSaudaraPrKd = 1;
        }

        if (pbSaudaraPrSa == 0) {
            pbSaudaraPrSa = 1;
        }

        if (pbSaudaraSi == 0) {
            pbSaudaraSi = 1;
        }

        pembagi = new double[]{pbAnakPr, pbIbu, pbCucuPr, pbNenek, pbSaudaraPrKd, pbSaudaraPrSa, pbSaudaraSi};
        kpk = lcm(pembagi);

        pmAnakPr = kpk / pbAnakPr * pmAnakPr;
        pmIbu = kpk / pbIbu * pmIbu;
        pmCucuPr = kpk / pbCucuPr * pmCucuPr;
        pmNenek = kpk / pbNenek * pmNenek;
        pmSaudaraPrKd = kpk / pbSaudaraPrKd * pmSaudaraPrKd;
        pmSaudaraPrSa = kpk / pbSaudaraPrSa * pmSaudaraPrSa;
        pmSaudaraSi = kpk / pbSaudaraSi * pmSaudaraSi;

        jPembilang = pmAnakPr + pmIbu + pmCucuPr + pmNenek + pmSaudaraPrKd + pmSaudaraPrSa + pmSaudaraSi;

        DecimalFormat df = new DecimalFormat("##.#");
        String sKpk = String.valueOf(df.format(kpk));
        String sp = String.valueOf(df.format(jPembilang));
        stringAsal = sKpk + " -> " + sp;

        if (kpk > jPembilang) {
            jPembagi = jPembilang;

            activity.tvKPK.setText("Asal Masalah Radd :");
            activity.tvKPK.setVisibility(View.VISIBLE);
            activity.tvJkpk.setText(stringAsal);
            activity.tvJkpk.setVisibility(View.VISIBLE);

            activity.tvket1.setText("Masalah radd terjadi ketika tidak adanya penerima ashobah dan jumlah penyebut lebih kecil dari jumlah pembilang, maka terdapat sisa dalam pembagian harta waris. Untuk mengatasi hal tersebut, maka bilangan penyebut disamakan dengan bilangan pembilang.");
            activity.tvket1.setVisibility(View.VISIBLE);
            activity.tvket2.setText("Ahli waris yang berhak mendapat bagian radd ada delapan orang, yaitu Anak perempuan, Ibu, Cucu perempuan, Nenek, Saudara perempuan kandung, Saudara perempuan se-ayah, Saudara laki-laki se-ibu dan Saudara perempuan se-ibu.");
            activity.tvket2.setVisibility(View.VISIBLE);
            String anot = "";

            if ((kbSuami == 0) && (kbIstri == 0)) {
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * irts;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi));
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * irts;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi));
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * irts;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi));
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * irts;
                    if (jNenekA > 0 && jNenekI == 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi));
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B");

                        anot = anot + "Anotasi 'B' yang dimaksud disini ialah, nenek baik dari pihak ayah maupun ibu mendapat bagian radd bersama-sama.";
                        activity.tvket3.setText(anot);
                        activity.tvket3.setVisibility(View.VISIBLE);
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * irts);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * irts;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi));
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * irts;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi));
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B");
                        anot = anot + "Anotasi 'B' yang dimaksud disini ialah, Saudara se-ibu baik laki-laki maupun perempuan mendapat bagian sepertiga bersama-sama.";
                        activity.tvket3.setText(anot);
                        activity.tvket3.setVisibility(View.VISIBLE);
                    }
                }
            } else if (kbSuami > 0 ^ kbIstri > 0) { //kaidah radd jika terdapat suami atau istri
                Double harta;
                harta = irts - (kbSuami + kbIstri);
                if (kbAnakPr > 0) {
                    kbAnakPr = (pmAnakPr / jPembagi) * harta;
                    jthAnakPr = String.valueOf(df.format(pmAnakPr) + "/" + df.format(jPembagi) + " A");
                    anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                }

                if (kbIbu > 0) {
                    kbIbu = (pmIbu / jPembagi) * harta;
                    jthIbu = String.valueOf(df.format(pmIbu) + "/" + df.format(jPembagi) + " A");
                    anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                }

                if (kbCucuPr > 0) {
                    kbCucuPr = (pmCucuPr / jPembagi) * harta;
                    jthCucuPr = String.valueOf(df.format(pmCucuPr) + "/" + df.format(jPembagi) + " A");
                    anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                }

                if (kbNenek > 0) {
                    kbNenek = (pmNenek / jPembagi) * harta;
                    if (jNenekA > 0 && jNenekI == 0) {
                        anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " A");
                    } else if (jNenekI > 0 && jNenekA == 0) {
                        anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " A");
                    } else if (jNenekA > 0 && jNenekI > 0) {
                        jthNenekA = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B1");
                        jthNenekI = String.valueOf(df.format(pmNenek) + "/" + df.format(jPembagi) + " B1");
                        anot = anot + " Anotasi 'B1' yang dimaksud disini ialah, nenek baik dari pihak ayah maupun ibu mendapat bagian radd bersama-sama.";
                    }
                }

                if (kbSaudaraPrKd > 0) {
                    kbSaudaraPrKd = (pmSaudaraPrKd / jPembagi * harta);
                    jthSaudaraPrKd = String.valueOf(df.format(pmSaudaraPrKd) + "/" + df.format(jPembagi) + " A");
                    anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                }

                if (kbSaudaraPrSa > 0) {
                    kbSaudaraPrSa = (pmSaudaraPrSa / jPembagi) * harta;
                    jthSaudaraPrSa = String.valueOf(df.format(pmSaudaraPrSa) + "/" + df.format(jPembagi) + " A");
                    anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                }

                if (kbSaudaraSi > 0) {
                    kbSaudaraSi = (pmSaudaraSi / jPembagi) * harta;
                    if (jSaudaraLkSi > 0 && jSaudaraPrSi == 0) {
                        anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " A");
                    } else if (jSaudaraLkSi == 0 && jSaudaraPrSi > 0) {
                        anot = "Anotasi 'A' yang dimaksud disini ialah, sisa harta(Ashobah) setelah dikurangi oleh bagian untuk suami/istri.";
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + "A");
                    } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1) {
                        jthSaudaraLkSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B2");
                        jthSaudaraPrSi = String.valueOf(df.format(pmSaudaraSi) + "/" + df.format(jPembagi) + " B2");
                        anot = anot + "Anotasi 'B2' yang dimaksud disini ialah, Saudara se-ibu baik laki-laki maupun perempuan mendapat bagian sepertiga bersama-sama.";
                    }
                }

                activity.tvket3.setText(anot);
                activity.tvket3.setVisibility(View.VISIBLE);
            }
        }
    }

    //----------------------------- ayah dan ibu
    private void setKbAyah() {
        if (isAyah)
            if (jAnakLk >= 1 || jCucuLk >= 1 || jAnakPr >= 1 || jCucuPr >= 1) {
                // ada ayah, ada salah satu furu'
                kbAyah = Math.round(irts / 6);
                //checkKbAyah = true;
                pmAyah = 1;
                pbAyah = 6;
            }
    }

    private void setAshAyah(ResultActivity activity) {
        if (isAyah && jAnakLk == 0 && jCucuLk == 0) {
            // ada ayah, tidak ada furu' laki-laki
            ashAyah = Ashobah;
            //checkAshAyah = true;
        }

        if (kbAyah > 0 && ashAyah > 0) {
            jthAyah = "1/6 + A";
            activity.tvket1.setText("1/6 + A, maksudnya ialah ayah mendapat bagian pasti seperenam harta ditambah dengan bagian sisa (Ashobah).");
            activity.tvket1.setVisibility(View.VISIBLE);
        } else if (kbAyah > 0) {
            jthAyah = "1/6";
        } else if (ashAyah > 0) {
            jthAyah = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    private void umariyatani(ResultActivity activity) {
        if (isAyah && isIbu && jAnakLk == 0 && jCucuLk == 0 && jAnakPr == 0 && jCucuPr == 0)
            if (isSuami || jIstri >= 1) {
                // ada ayah, ada ibu, ada suami/istri  tidak ada furu' (masalah umariyatani)
                Ashobah = Ashobah + kbAyah + kbIbu;
                ashAyah = Math.round(2 * Ashobah / 3);
                ashIbu = Math.round(Ashobah / 3);
                kbAyah = 0;
                kbIbu = 0;
                jthAyah = "A";
                jthIbu = "1/3 A";

                activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
                activity.tvket2.setText(" 1/3 A, maksudnya ialah Ibu mendapat bagian sepertiga harta sisa (ashobah) pada masalah umariyatani, dimana ahli waris terdiri dari Ayah, Ibu, dan Suami atau Istri");
                activity.tvket1.setVisibility(View.VISIBLE);
                activity.tvket2.setVisibility(View.VISIBLE);
            }
    }

    private void setKbIbu() {
        int jSdrKd = jSaudaraLkKd + jSaudaraPrKd;
        int jSdrSa = jSaudaraLkSa + jSaudaraPrSa;
        int jSdrSi = jSaudaraLkSi + jSaudaraPrSi;

        if (isIbu)
            if (jAnakLk >= 1 || jAnakPr >= 1 || jCucuLk >= 1 || jCucuPr >= 1 || jSdrKd >= 2 || jSdrSa >= 2 || jSdrSi >= 2) {
                // ada ibu, ada furu' atau berkumpulnya saudara kandung atau saudara seayah atau saudara seibu
                kbIbu = Math.round(irts / 6);
                jthIbu = "1/6";
                //checkKbIbu = true;
                pmIbu = 1;
                pbIbu = 6;
            } else if (jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && jSdrKd <= 1 && jSdrSa <= 1 && jSdrSi <= 1) {
                // ada ibu, tidak ada furu' dan  tidak berkumpul saudara kandung atau saudara seayah
                kbIbu = Math.round(irts / 3);
                jthIbu = "1/3";
                //checkKbIbu = true;
                pmIbu = 1;
                pbIbu = 3;
            }
    }

    //------------------------------ suami dan istri
    private void setKbSuami() {
        if (isSuami)
            if (jAnakLk >= 1 || jAnakPr >= 1 || jCucuLk >= 1 || jCucuPr >= 1) { // ada furu'
                kbSuami = Math.round(irts / 4);
                jthSuami = "1/4";
                //checkKbSuami = true;
                pmSuami = 1;
                pbSuami = 4;
            } else if (jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0) { // tidak ada furu'
                kbSuami = Math.round(irts / 2);
                jthSuami = "1/2";
                //checkKbSuami = true;
                pmSuami = 1;
                pbSuami = 2;
            }
    }

    private void setKbIstri() {
        if (jIstri >= 1)
            if (jAnakLk >= 1 || jAnakPr >= 1 || jCucuLk >= 1 || jCucuPr >= 1) { // ada furu'
                kbIstri = Math.round(irts / 8);
                jthIstri = "1/8";
                //checkKbIstri = true;
                pmIstri = 1;
                pbIstri = 8;
            } else if (jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0) { // tidak ada furu'
                kbIstri = Math.round(irts / 4);
                jthIstri = "1/4";
                //checkKbIstri = true;
                pmIstri = 1;
                pbIstri = 4;
            }
    }

    //------------------------------ anak
    private void setAshAnak(ResultActivity activity) {
        if (jAnakLk >= 1 && jAnakPr >= 1) { //ashobah bil ghoir
            ashAnakLk = Math.round(2 * Ashobah / 3);
            ashAnakPr = Math.round(Ashobah / 3);
            jthAnakLk = "2:1A";
            jthAnakPr = "1:1A";

            activity.tvket1.setText("2:1 A adalah bagian ashobah dengan skala dua kali bagian perempuan.");
            activity.tvket1.setVisibility(View.VISIBLE);
            activity.tvket2.setText("1:1 A adalah bagian ashobah dengan skala separuh bagian laki-laki.");
            activity.tvket2.setVisibility(View.VISIBLE);
        } else if (jAnakLk >= 1 && jAnakPr == 0) {
            ashAnakLk = Ashobah;
            jthAnakLk = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    private void setKbAnakPr() {
        if (jAnakPr == 1 && jAnakLk == 0) { //anak perempuan tungal
            kbAnakPr = Math.round(irts / 2);
            jthAnakPr = "1/2";
            //checkKbAnakPr = true;
            pmAnakPr = 1;
            pbAnakPr = 2;
        } else if (jAnakPr >= 2 && jAnakLk == 0) { //anak perempuan banyak
            kbAnakPr = Math.round(2 * irts / 3);
            jthAnakPr = "2/3";
            //checkKbAnakPr = true;
            pmAnakPr = 2;
            pbAnakPr = 3;
        }
    }

    //-------------------------------- cucu
    private void setAshCucuLk(ResultActivity activity) {
        if (jAnakLk == 0 && jCucuLk >= 1 && jCucuPr >= 1) { // bersama cucu perempuan
            ashCucuLk = Math.round(2 * Ashobah / 3);
            jthCucuLk = "2:1A";
            activity.tvket1.setText("2:1 A adalah bagian ashobah dengan skala dua kali bagian perempuan.");
            activity.tvket1.setVisibility(View.VISIBLE);
        } else if (jAnakLk == 0 && jCucuLk >= 1 && jCucuPr == 0) { // tidak ada cucu perempuan
            ashCucuLk = Ashobah;
            jthCucuLk = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    private void setAshCucuPr(ResultActivity activity) {
        if (jCucuPr >= 1 && jCucuLk >= 1 && jAnakPr < 2 && jAnakLk == 0) { // bersama cucu laki-laki
            ashCucuPr = Math.round(Ashobah / 3);
            jthCucuPr = "1:1A";
            activity.tvket2.setText("1:1 A adalah bagian ashobah dengan skala separuh bagian laki-laki.");
            activity.tvket2.setVisibility(View.VISIBLE);
        }
    }

    private void setKbCucuPr() {
        if (jCucuPr == 1 && jCucuLk == 0 && jAnakLk == 0 && jAnakPr == 0) { // seorang diri
            kbCucuPr = Math.round(irts / 2);
            jthCucuPr = "1/2";
            //checkKbCucuPr = true;
            pmCucuPr = 1;
            pbCucuPr = 2;
        } else if (jCucuPr >= 1 && jCucuLk == 0 && jAnakLk == 0 && jAnakPr == 1) { // bersama seorang anak perempuan
            kbCucuPr = Math.round(irts / 6);
            jthCucuPr = "1/6";
            //checkKbCucuPr = true;
            pmCucuPr = 1;
            pbCucuPr = 6;
        } else if (jCucuPr >= 2 && jCucuLk == 0 && jAnakLk == 0 && jAnakPr == 0) { // dua orang atau lebih
            kbCucuPr = Math.round(2 * irts / 3);
            jthCucuPr = "2/3";
            //checkKbCucuPr = true;
            pmCucuPr = 2;
            pbCucuPr = 3;
        }
    }

    //---------------------------- kakek dan nenek
    private void setKbKakek() {
        if (isKakek && !isAyah) {
            if (jAnakLk >= 1 || jCucuLk >= 1 || jAnakPr >= 1 || jCucuPr >= 1) {
                kbKakek = Math.round(irts / 6);
                //checkKbKakek = true;
                pmKakek = 1;
                pbKakek = 6;
            }
        }
    }

    private void setAshKakek(ResultActivity activity) {
        if (isKakek && !isAyah && jAnakLk == 0 && jCucuLk == 0) {
            ashKakek = Ashobah;
            //checkAshKakek = true;
        }

        if (kbKakek > 0 && ashKakek > 0) {
            jthKakek = "1/6 + A";
            activity.tvket1.setText("1/6 + A, maksudnya ialah kakek mendapat bagian pasti seperenam harta ditambah dengan bagian sisa (Ashobah).");
            activity.tvket1.setVisibility(View.VISIBLE);
        } else if (kbKakek > 0) {
            jthKakek = "1/6";
        } else if (ashKakek > 0) {
            jthKakek = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    private void setKbNenek(ResultActivity activity) {
        if (!isIbu && jNenekA >= 1 && jNenekI == 0) {
            kbNenek = Math.round(irts / 6);
            jthNenekA = "1/6";
            //checkKbNenek = true;
            pmNenek = 1;
            pbNenek = 6;
        } else if (!isIbu && jNenekA == 0 && jNenekI >= 1) {
            kbNenek = Math.round(irts / 6);
            jthNenekI = "1/6";
            //checkKbNenek = true;
            pmNenek = 1;
            pbNenek = 6;
        } else if (!isIbu && jNenekA >= 1 && jNenekI >= 1) {
            kbNenek = Math.round(irts / 6);
            jthNenekA = "1/6B";
            jthNenekI = "1/6B";
            activity.tvket3.setText("1/6B, maksudnya ialah nenek baik dari pihak ayah maupun ibu mendapat bagian seperenam bersama-sama.");
            activity.tvket3.setVisibility(View.VISIBLE);
            //checkKbNenek = true;
            pmNenek = 1;
            pbNenek = 6;
        }
    }

    //------------------------------ suadara kandung
    private void setAshSaudaraKd(ResultActivity activity) {
        if (jSaudaraLkKd >= 1 && jSaudaraPrKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek) {
            ashSaudaraLkKd = Ashobah;
            jthSaudaraLkKd = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        } else if (jSaudaraLkKd >= 1 && jSaudaraPrKd >= 1 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek) {
            ashSaudaraLkKd = Math.round(2 * Ashobah / 3); // ashobah bil ghoir
            ashSaudaraPrKd = Math.round(Ashobah / 3);
            jthSaudaraLkKd = "2:1A";
            jthSaudaraPrKd = "1:1A";
            activity.tvket1.setText("2:1 A adalah bagian ashobah dengan skala dua kali bagian perempuan.");
            activity.tvket1.setVisibility(View.VISIBLE);
            activity.tvket2.setText("1:1 A adalah bagian ashobah dengan skala separuh bagian laki-laki.");
            activity.tvket2.setVisibility(View.VISIBLE);
        }
    }

    private void setKbSaudaraPrKd() {
        if (jSaudaraPrKd == 1 && jSaudaraLkKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrKd = Math.round(irts / 2);
            jthSaudaraPrKd = "1/2";
            //checkKbSaudaraPrKd = true;
            pmSaudaraPrKd = 1;
            pbSaudaraPrKd = 2;
        } else if (jSaudaraPrKd >= 2 && jSaudaraLkKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrKd = Math.round(2 * irts / 3);
            jthSaudaraPrKd = "2/3";
            //checkKbSaudaraPrKd = true;
            pmSaudaraPrKd = 2;
            pbSaudaraPrKd = 3;
        }
    }

    //------------------------------------------------------
    private void setAshMaalGhoir(ResultActivity activity) {
        if (jAnakPr >= 1 || jCucuPr >= 1) {
            if (jSaudaraPrKd >= 1 && jSaudaraLkKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek) {
                ashSaudaraPrKd = Ashobah; //Ashobah maal ghoir, bersama anak perempuan atau cucu perempuan
                kbSaudaraPrKd = 0;
                jthSaudaraPrKd = "A";
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

                activity.tvket1.setText("Saudara perempuan kandung mendapat bagian sisa bersama-sama dengan Anak perempuan dan atau Cucu perempuan. Bagian ini dinamakan Ashobah ma'al Ghoir");
                activity.tvket1.setVisibility(View.VISIBLE);
            } else if (jSaudaraPrSa >= 1 && jSaudaraLkSa == 0 && jSaudaraPrKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek) {
                ashSaudaraPrSa = Ashobah; //Ashobah maal ghoir, bersama anak perempuan atau cucu perempuan
                kbSaudaraPrSa = 0;
                jthSaudaraPrSa = "A";
                // ketika saudara perempuan mendapat ashobah maal ghoir, maka dihukumi seperti saudara laki-laki seayah
                ashKeponakanLkKd = 0;
                ashKeponakanLkSa = 0;
                ashPamanKd = 0;
                ashPamanSa = 0;
                ashSaudaraLkKd = 0;
                ashSepupuLkPmnSa = 0;

                activity.tvket1.setText("Saudara perempuan se-ayah mendapat bagian sisa bersama-sama dengan Anak perempuan dan atau Cucu perempuan. Bagian ini dinamakan Ashobah ma'al Ghoir");
                activity.tvket1.setVisibility(View.VISIBLE);
            }
        }
    }

    //------------------------------ saudara tiri
    private void setAshSaudaraSa(ResultActivity activity) {
        if (jSaudaraLkSa >= 1 && jSaudaraPrSa == 0 && jSaudaraLkKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek) {
            ashSaudaraLkSa = Ashobah;
            jthSaudaraLkSa = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        } else if (jSaudaraLkSa >= 1 && jSaudaraPrSa >= 1 && jSaudaraLkKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek) {
            ashSaudaraLkSa = Math.round(2 * Ashobah / 3);
            ashSaudaraPrSa = Math.round(Ashobah / 3);
            jthSaudaraLkSa = "2:1A";
            jthSaudaraPrSa = "1:1A";
            activity.tvket1.setText("2:1 A adalah bagian ashobah dengan skala dua kali bagian perempuan.");
            activity.tvket1.setVisibility(View.VISIBLE);
            activity.tvket2.setText("1:1 A adalah bagian ashobah dengan skala separuh bagian laki-laki.");
            activity.tvket2.setVisibility(View.VISIBLE);
        }
    }

    private void setKbSaudaraPrSa() {
        if (jSaudaraPrSa == 1 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0 && jSaudaraPrKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek
                && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrSa = Math.round(irts / 2);
            jthSaudaraPrSa = "1/2";
            //checkKbSaudaraPrSa = true;
            pmSaudaraPrSa = 1;
            pbSaudaraPrSa = 2;
        } else if (jSaudaraPrSa >= 2 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0 && jSaudaraPrKd == 0 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek
                && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrSa = Math.round(2 * irts / 3);
            jthSaudaraPrSa = "2/3";
            //checkKbSaudaraPrSa = true;
            pmSaudaraPrSa = 2;
            pbSaudaraPrSa = 3;
        } else if (jSaudaraPrSa >= 1 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0 && jSaudaraPrKd >= 1 && jAnakLk == 0 && !isAyah && jCucuLk == 0 && !isKakek
                && jAnakPr == 0 && jCucuPr == 0) {
            kbSaudaraPrSa = Math.round(irts / 6);
            jthSaudaraPrSa = "1/6";
            //checkKbSaudaraPrSa = true;
            pmSaudaraPrSa = 1;
            pbSaudaraPrSa = 6;
        }
    }

    private void setKbSaudaraSi(ResultActivity activity) {
        if (jSaudaraLkSi == 1 && jSaudaraPrSi == 0 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && !isAyah && !isKakek) {
            kbSaudaraSi = Math.round(irts / 6);
            jthSaudaraLkSi = "1/6";
            //checkKbSaudaraSi = true;
            pmSaudaraSi = 1;
            pbSaudaraSi = 6;
        } else if (jSaudaraLkSi >= 2 && jSaudaraPrSi == 0 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && !isAyah && !isKakek) {
            kbSaudaraSi = Math.round(irts / 3);
            jthSaudaraLkSi = "1/3";
            //checkKbSaudaraSi = true;
            pmSaudaraSi = 1;
            pbSaudaraSi = 3;
        } else if (jSaudaraLkSi == 0 && jSaudaraPrSi == 1 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && !isAyah && !isKakek) {
            kbSaudaraSi = Math.round(irts / 6);
            jthSaudaraPrSi = "1/6";
            //checkKbSaudaraSi = true;
            pmSaudaraSi = 1;
            pbSaudaraSi = 6;
        } else if (jSaudaraLkSi == 0 && jSaudaraPrSi >= 2 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && !isAyah && !isKakek) {
            kbSaudaraSi = Math.round(irts / 3);
            jthSaudaraPrSi = "1/3";
            //checkKbSaudaraSi = true;
            pmSaudaraSi = 1;
            pbSaudaraSi = 3;
        } else if (jSaudaraLkSi >= 1 && jSaudaraPrSi >= 1 && jAnakLk == 0 && jAnakPr == 0 && jCucuLk == 0 && jCucuPr == 0 && !isAyah && !isKakek) {
            kbSaudaraSi = Math.round(irts / 3);
            //kbSaudaraSi = Math.round(irts / 6);
            jthSaudaraLkSi = "1/3B";
            jthSaudaraPrSi = "1/3B";
            activity.tvnoaw.setText("1/3B, maksudnya ialah Saudara se-ibu baik laki-laki maupun perempuan mendapat bagian sepertiga bersama-sama.");
            //checkKbSaudaraSi = true;
            pmSaudaraSi = 1;
            pbSaudaraSi = 3;
            //checkKbSaudaraPrSi = true;
        }

    }

    //------------------------------ keponakan
    private void setAshKeponakanLkKd(ResultActivity activity) {
        if (jKeponakanLkKd >= 1 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && !isAyah && !isKakek) {
            ashKeponakanLkKd = Ashobah;
            jthKeponakanLkKd = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    private void setAshKeponakanLkSa(ResultActivity activity) {
        if (jKeponakanLkSa >= 1 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && !isAyah && !isKakek) {
            ashKeponakanLkSa = Ashobah;
            jthKeponakanLkSa = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    //------------------------------ paman
    private void setAshPamanKd(ResultActivity activity) {
        if (jPamanKd >= 1 && jKeponakanLkSa == 0 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && !isAyah && !isKakek) {
            ashPamanKd = Ashobah;
            jthPamanKd = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    private void setAshPamanSa(ResultActivity activity) {
        if (jPamanSa >= 1 && jPamanKd == 0 && jKeponakanLkSa == 0 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && !isAyah && !isKakek) {
            ashPamanSa = Ashobah;
            jthPamanSa = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    //------------------------------ sepupu
    private void setAshSepupuLkKd(ResultActivity activity) {
        if (jSepupuLkPmnKd >= 1 && jPamanSa == 0 && jPamanKd == 0 && jKeponakanLkSa == 0 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && !isAyah && !isKakek) {
            ashSepupuLkPmnKd = Ashobah;
            jthSepupuLkKd = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    private void setAshSepupuLkSa(ResultActivity activity) {
        if (jSepupuLkPmnSa >= 1 && jSepupuLkPmnKd == 0 && jPamanSa == 0 && jPamanKd == 0
                && jKeponakanLkSa == 0 && jKeponakanLkKd == 0 && jSaudaraLkSa == 0 && jSaudaraLkKd == 0
                && jAnakLk == 0 && jCucuLk == 0 && !isAyah && !isKakek) {
            ashSepupuLkPmnSa = Ashobah;
            jthSepupuLkSa = "A";
            activity.tvket1.setText("A merupakan anotasi dari Ashobah atau bagian yang diambil dari sisa pembagian harta, ahli waris yang menerima bagian 'A' berarti menerima seluruh bagian Ashobah.");
            activity.tvket1.setVisibility(View.VISIBLE);
        }
    }

    //------------------------------ kpk dan fpb function
    private double gcd(double a, double b) {
        while (b > 0) {
            double temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private double gcd(double[] input) {
        double result = input[0];
        for (int i = 1; i < input.length; i++) result = gcd(result, input[i]);
        return result;
    }

    private double lcm(double a, double b) {
        return a * (b / gcd(a, b));
    }

    private double lcm(double[] input) {
        double result = input[0];
        for (int i = 1; i < input.length; i++)
            result = lcm(result, input[i]);
        return result;
    }
}
