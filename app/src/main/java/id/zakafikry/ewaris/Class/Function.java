package id.zakafikry.ewaris.Class;

import id.zakafikry.ewaris.InputActivity.ResultActivity;

public class Function {

    // Function or Method
    public String checkNull(String i) {
        if (i == null) {
            i = "0";
        }
        return i;
    }

    public int convertStr(String s) {
        int i;
        if (s.equals("")) {
            i = 0;
        } else {
            i = Integer.valueOf(s);
        }
        return i;
    }

    public void resetValueIA1() {
        ResultActivity.tirkah = 0;
        ResultActivity.tajhiz = 0;
        ResultActivity.wasiat = 0;
        ResultActivity.hutang = 0;
        ResultActivity.irts = 0;
    }

    public void resetValueIA2() {
        ResultActivity.jAnakPr = 0;
        ResultActivity.jAnakLk = 0;
        ResultActivity.jAyah = 0;
        ResultActivity.jIbu = 0;
        ResultActivity.jSuami = 0;
        ResultActivity.jIstri = 0;
    }

    public void resetValueIA3() {
        ResultActivity.jCucuLk = 0;
        ResultActivity.jCucuPr = 0;
    }

    public void resetValueIA4() {
        ResultActivity.jKakek = 0;
        ResultActivity.jNenekA = 0;
        ResultActivity.jNenekI = 0;
    }

    public void resetValueIA5() {
        ResultActivity.jSaudaraLkKd = 0;
        ResultActivity.jSaudaraPrKd = 0;
    }

    public void resetValueIA6() {
        ResultActivity.jSaudaraLkSa = 0;
        ResultActivity.jSaudaraPrSa = 0;
        ResultActivity.jSaudaraLkSi = 0;
        ResultActivity.jSaudaraPrSi = 0;
    }

    public void resetValueIA7() {
        ResultActivity.jKeponakanLkKd = 0;
        ResultActivity.jKeponakanLkSa = 0;
    }

    public void resetValueIA8() {
        ResultActivity.jPamanKd = 0;
        ResultActivity.jPamanSa = 0;
    }

    public void resetValueIA9() {
        ResultActivity.jSepupuLkPmnKd = 0;
        ResultActivity.jSepupuLkPmnSa = 0;
    }

}
