package id.zakafikry.ewaris.Model;

public class Pewaris {
    private static FaraidEngine grandChildInstance = null;
    protected boolean isMale = false, isAyah = false, isIbu = false, isSuami = false, isKakek = false;
    protected long tirkah = 0, tajhiz = 0, wasiat = 0, hutang = 0, irts = 0;
    protected int jAnakPr = 0, jAnakLk = 0, jIstri = 0, jCucuLk = 0, jCucuPr = 0, jNenekA = 0, jNenekI = 0, jSaudaraLkKd = 0, jSaudaraPrKd = 0, jSaudaraLkSa = 0, jSaudaraPrSa = 0, jSaudaraLkSi = 0, jSaudaraPrSi = 0, jKeponakanLkKd = 0, jKeponakanLkSa = 0, jPamanKd = 0, jPamanSa = 0, jSepupuLkPmnKd = 0, jSepupuLkPmnSa = 0;

    public Pewaris() {

    }

    public static FaraidEngine getInstance() {
        if (grandChildInstance == null) grandChildInstance = new FaraidEngine();

        return grandChildInstance;
    }

    //useful method
    public int convertToInt(String s) {

        return (s.equals("") ? 0 : Integer.valueOf(s));
    }

    public long convertToLong(String s) {

        return (s.equals("") ? 0 : Long.valueOf(s));
    }

    public void resetValueIA1() {
        tirkah = 0;
        tajhiz = 0;
        wasiat = 0;
        hutang = 0;
        irts = 0;
    }

    public void resetValueIA2() {
        jAnakPr = 0;
        jAnakLk = 0;
        isAyah = false;
        isIbu = false;
        isSuami = false;
        jIstri = 0;
    }

    public void resetValueIA3() {
        jCucuLk = 0;
        jCucuPr = 0;
    }

    public void resetValueIA4() {
        isKakek = false;
        jNenekA = 0;
        jNenekI = 0;
    }

    public void resetValueIA5() {
        jSaudaraLkKd = 0;
        jSaudaraPrKd = 0;
    }

    public void resetValueIA6() {
        jSaudaraLkSa = 0;
        jSaudaraPrSa = 0;
        jSaudaraLkSi = 0;
        jSaudaraPrSi = 0;
    }

    public void resetValueIA7() {
        jKeponakanLkKd = 0;
        jKeponakanLkSa = 0;
    }

    public void resetValueIA8() {
        jPamanKd = 0;
        jPamanSa = 0;
    }

    public void resetValueIA9() {
        jSepupuLkPmnKd = 0;
        jSepupuLkPmnSa = 0;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        this.isMale = male;
    }

    public long getTirkah() {
        return tirkah;
    }

    public void setTirkah(long tirkah) {
        this.tirkah = tirkah;
    }

    public long getTajhiz() {
        return tajhiz;
    }

    public void setTajhiz(long tajhiz) {
        this.tajhiz = tajhiz;
    }

    public long getWasiat() {
        return wasiat;
    }

    public void setWasiat(long wasiat) {
        this.wasiat = wasiat;
    }

    public long getHutang() {
        return hutang;
    }

    public void setHutang(long hutang) {
        this.hutang = hutang;
    }

    public long getIrts() {
        return irts;
    }

    public void setIrts(long irts) {
        this.irts = irts;
    }

    public int getjAnakPr() {
        return jAnakPr;
    }

    public void setjAnakPr(int jAnakPr) {
        this.jAnakPr = jAnakPr;
    }

    public int getjAnakLk() {
        return jAnakLk;
    }

    public void setjAnakLk(int jAnakLk) {
        this.jAnakLk = jAnakLk;
    }

    public boolean getAyah() {
        return isAyah;
    }

    public void setAyah(boolean ayah) {
        this.isAyah = ayah;
    }

    public boolean getIbu() {
        return isIbu;
    }

    public void setIbu(boolean ibu) {
        this.isIbu = ibu;
    }

    public boolean getSuami() {
        return isSuami;
    }

    public void setSuami(boolean suami) {
        this.isSuami = suami;
    }

    public int getjIstri() {
        return jIstri;
    }

    public void setjIstri(int jIstri) {
        this.jIstri = jIstri;
    }

    public int getjCucuLk() {
        return jCucuLk;
    }

    public void setjCucuLk(int jCucuLk) {
        this.jCucuLk = jCucuLk;
    }

    public int getjCucuPr() {
        return jCucuPr;
    }

    public void setjCucuPr(int jCucuPr) {
        this.jCucuPr = jCucuPr;
    }

    public boolean getKakek() {
        return isKakek;
    }

    public void setKakek(boolean kakek) {
        this.isKakek = kakek;
    }

    public int getjNenekA() {
        return jNenekA;
    }

    public void setjNenekA(int jNenekA) {
        this.jNenekA = jNenekA;
    }

    public int getjNenekI() {
        return jNenekI;
    }

    public void setjNenekI(int jNenekI) {
        this.jNenekI = jNenekI;
    }

    public int getjSaudaraLkKd() {
        return jSaudaraLkKd;
    }

    public void setjSaudaraLkKd(int jSaudaraLkKd) {
        this.jSaudaraLkKd = jSaudaraLkKd;
    }

    public int getjSaudaraPrKd() {
        return jSaudaraPrKd;
    }

    public void setjSaudaraPrKd(int jSaudaraPrKd) {
        this.jSaudaraPrKd = jSaudaraPrKd;
    }

    public int getjSaudaraLkSa() {
        return jSaudaraLkSa;
    }

    public void setjSaudaraLkSa(int jSaudaraLkSa) {
        this.jSaudaraLkSa = jSaudaraLkSa;
    }

    public int getjSaudaraPrSa() {
        return jSaudaraPrSa;
    }

    public void setjSaudaraPrSa(int jSaudaraPrSa) {
        this.jSaudaraPrSa = jSaudaraPrSa;
    }

    public int getjSaudaraLkSi() {
        return jSaudaraLkSi;
    }

    public void setjSaudaraLkSi(int jSaudaraLkSi) {
        this.jSaudaraLkSi = jSaudaraLkSi;
    }

    public int getjSaudaraPrSi() {
        return jSaudaraPrSi;
    }

    public void setjSaudaraPrSi(int jSaudaraPrSi) {
        this.jSaudaraPrSi = jSaudaraPrSi;
    }

    public int getjKeponakanLkKd() {
        return jKeponakanLkKd;
    }

    public void setjKeponakanLkKd(int jKeponakanLkKd) {
        this.jKeponakanLkKd = jKeponakanLkKd;
    }

    public int getjKeponakanLkSa() {
        return jKeponakanLkSa;
    }

    public void setjKeponakanLkSa(int jKeponakanLkSa) {
        this.jKeponakanLkSa = jKeponakanLkSa;
    }

    public int getjPamanKd() {
        return jPamanKd;
    }

    public void setjPamanKd(int jPamanKd) {
        this.jPamanKd = jPamanKd;
    }

    public int getjPamanSa() {
        return jPamanSa;
    }

    public void setjPamanSa(int jPamanSa) {
        this.jPamanSa = jPamanSa;
    }

    public int getjSepupuLkPmnKd() {
        return jSepupuLkPmnKd;
    }

    public void setjSepupuLkPmnKd(int jSepupuLkPmnKd) {
        this.jSepupuLkPmnKd = jSepupuLkPmnKd;
    }

    public int getjSepupuLkPmnSa() {
        return jSepupuLkPmnSa;
    }

    public void setjSepupuLkPmnSa(int jSepupuLkPmnSa) {
        this.jSepupuLkPmnSa = jSepupuLkPmnSa;
    }
}
