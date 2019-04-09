package id.zakafikry.ewaris.Model;

/**
 * Created by Zaka on 4/5/2019.
 */

public class AhliWaris extends Pewaris {
    protected double
            //------------------ashabul Furudh
            kbAnakPr = 0, kbCucuPr = 0, kbAyah = 0, kbIbu = 0, kbSuami = 0, kbIstri = 0, kbKakek = 0, kbNenek = 0, kbSaudaraPrKd = 0, kbSaudaraPrSa = 0, kbSaudaraSi = 0

            //------------------ashobah
            , Ashobah = 0, ashAnakLk = 0, ashCucuLk = 0, ashAyah = 0, ashKakek = 0, ashSaudaraLkKd = 0, ashSaudaraLkSa = 0, ashKeponakanLkKd = 0, ashKeponakanLkSa = 0, ashPamanKd = 0, ashPamanSa = 0, ashSepupuLkPmnKd = 0, ashSepupuLkPmnSa = 0, ashAnakPr = 0, ashCucuPr = 0, ashSaudaraPrKd = 0, ashSaudaraPrSa = 0, ashIbu = 0

            //------------------jatah atau bagian masing-masing ahli waaris
            , bagAnakLk = 0, bagAnakPr = 0, bagAyah = 0, bagIbu = 0, bagSuami = 0, bagIstri = 0, bagCucuLk = 0, bagCucuPr = 0, bagKakek = 0, bagNenekA = 0, bagNenekI = 0, bagSaudaraLkKd = 0, bagSaudaraPrKd = 0, bagSaudaraLkSa = 0, bagSaudaraPrSa = 0, bagSaudaraLkSi = 0, bagSaudaraPrSi = 0, bagKeponakanLkKd = 0, bagKeponakanLkSa = 0, bagPamanKd = 0, bagPamanSa = 0, bagSepupuPamanKd = 0, bagSepupuPamanSa = 0

            //------------------Aul
            , kpk, jPembilang, jPembagi

            //Angka Pembagi
            , pbAnakPr = 0, pbAyah = 0, pbIbu = 0, pbSuami = 0, pbIstri = 0, pbCucuPr = 0, pbKakek = 0, pbNenek = 0, pbSaudaraPrKd = 0, pbSaudaraPrSa = 0, pbSaudaraSi = 0

            //Angka Pembilang
            , pmAnakPr = 0, pmAyah = 0, pmIbu = 0, pmSuami = 0, pmIstri = 0, pmCucuPr = 0, pmKakek = 0, pmNenek = 0, pmSaudaraPrKd = 0, pmSaudaraPrSa = 0, pmSaudaraSi = 0;

    protected double[] pembagi;

    protected String jthAnakLk = "-", jthAnakPr = "-", jthAyah = "-", jthIbu = "-", jthSuami = "-", jthIstri = "-", jthCucuLk = "-", jthCucuPr = "-", jthKakek = "-", jthNenekA = "-", jthNenekI = "-", jthSaudaraLkKd = "-", jthSaudaraPrKd = "-", jthSaudaraLkSa = "-", jthSaudaraPrSa = "-", jthSaudaraLkSi = "-", jthSaudaraPrSi = "-", jthKeponakanLkKd = "-", jthKeponakanLkSa = "-", jthPamanKd = "-", jthPamanSa = "-", jthSepupuLkKd = "-", jthSepupuLkSa = "-";

    protected String stringAsal;

    public AhliWaris() {

    }

    protected void reset() {
        pembagi = null;
        stringAsal = null;
        kpk = 0;
        jPembilang = 0;
        jPembagi = 0;
        pbAnakPr = 0;
        pbAyah = 0;
        pbIbu = 0;
        pbSuami = 0;
        pbIstri = 0;
        pbCucuPr = 0;
        pbKakek = 0;
        pbNenek = 0;
        pbSaudaraPrKd = 0;
        pbSaudaraPrSa = 0;
        pbSaudaraSi = 0;
        pmAnakPr = 0;
        pmAyah = 0;
        pmIbu = 0;
        pmSuami = 0;
        pmIstri = 0;
        pmCucuPr = 0;
        pmKakek = 0;
        pmNenek = 0;
        pmSaudaraPrKd = 0;
        pmSaudaraPrSa = 0;
        pmSaudaraSi = 0;

        //------------------ashabul Furudh
        kbAnakPr = 0;
        kbCucuPr = 0;
        kbAyah = 0;
        kbIbu = 0;
        kbSuami = 0;
        kbIstri = 0;
        kbKakek = 0;
        kbNenek = 0;
        kbSaudaraPrKd = 0;
        kbSaudaraPrSa = 0;
        kbSaudaraSi = 0;

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

        //jatah waris
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
}
