package id.zakafikry.ewaris.Class;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Faraidh {

//------------------ashabul Furudh
    int kbAnakPr;
    int kbCucuPr;

    int kbAyah;
    int kbIbu;

    int kbSuami;
    int kbIstri;

    int kbKakek;
    int kbNenekA;
    int kbNenekI;

    int kbSaudaraPrKd;
    int kbSaudaraPrSa;

    int kbSaudaraLkSi;
    int kbSaudaraPrSi;

//--------------------------------ashobah
    int ashAnakLk;
    int ashCucuLk;

    int ashAyah;
    int ashKakek;

    int ashSaudaraLkKd;
    int ashSaudaraLkSa;
    int ashKeponakanLkKd;
    int ashKeponakanLkSa;

    int ashPamanKd;
    int ashPamanSa;
    int ashSepupuLkKd;
    int ashSepupuLkSa;

    int ashAnakPr;
    int ashCucuPr;

    int ashSaudaraPrKd;
    int ashSaudaraPrSa;

    int ashIbu;

    // Function or Method

    // Keluarga terdekat
    public int getKbAyah (int ay, int al, int ap, int cl, int cp) {
        if (ay  == 1 && (al >= 1 || cl >= 1 || ap >= 1 || cp >=1) ) { // ada ayah, ada salah satu furu'
            kbAyah = 1/6;
        } else {
            kbAyah = 0;
        }

        return kbAyah;
    }

    public int getAshAyah (int ay, int al, int ap, int cl, int cp) {
        if (ay == 1 && ((al == 0 && cl == 0) && (ap >= 1 || cp >=1)) ) { // ada ayah, tidak ada furu' laki-laki
            ashAyah = 1;
        } else if (ay == 1 &&((al == 0 && ap == 0) && (cl == 0 && cp == 0)) ) { // ada ayah, tidak ada anak dan tidak ada cucu
            ashAyah = 1;
        } else {
            ashAyah = 0;
        }

        return kbAyah;
    }

    public int kbIbu (int ib, int al, int ap, int cl, int cp, int sdrLkKd, int sdrPrKd,  int sdrLkSa, int sdrPrSa) {
        if (ib == 1 && (al >= 1 || ap >= 1 || cl >= 1 || cp >= 1 || sdrLkKd >= 1 || sdrPrKd >= 1 ||sdrLkSa >=1 || sdrPrSa >= 1)) {
            // ada ibu, ada furu' atau  saudara kandung atau saudara seayah
            kbIbu = 1/6;
        } else if (ib == 1 && (al == 0 && ap == 0 && cl == 0 && cp == 0 && sdrLkKd >= 1 && sdrPrKd >= 1 && sdrLkSa >=1 && sdrPrSa >= 1)) {
            // ada ibu, tidak ada furu' dan  saudara kandung atau saudara seayah
            kbIbu = 1/3;
        } else {
            kbIbu = 0;
        }

        return kbIbu;
    }
    public int getAshIbu (int ib, int al, int ap, int cl, int cp, int skdLk, int skdPr, int saLk, int saPr) {
        if (ib == 0) { // tidak ada ibu
            ashIbu = 0;
        } else if (ib == 1 && (al >= 1 || ap >= 1 || cl >= 1 || cp >= 1 || (skdLk >= 1 && skdPr >=1))) { // ada ibu, ada furu'
            ashIbu = 0;
        } else if (ib == 1 && (al == 0 && ap == 0 && cl == 0 && cp == 0)) {
            ashIbu = 1;
        }

        return kbIbu;
    }

    public int getKbSuami (int su, int al, int ap, int cl, int cp) {
        if (su == 1 && (al >=1 || ap >= 1 || cl >= 1 || cp >= 1) ) { // ada suami, ada furu'
            kbSuami = 1/4;
        } else if (su == 1 && (al == 0 && ap == 0 && cl == 0 && cp == 0)) { // ada suami, tidak ada furu'
            kbSuami = 1/2;
        } else {
            kbSuami = 0;
        }
        return kbSuami;
    }

    public int getKbIstri (int is, int al, int ap, int cl, int cp) {
        if (is >=1 && (al >=1 || ap >= 1 || cl >= 1 || cp >= 1) ){ // ada istri, ada furu'
            kbIstri = 1/8;
        } else if (is >=1 && (al == 0 && ap == 0 && cl == 0 && cp == 0) ) { // ada istri, tidak ada furu'
            kbIstri = 1/4;
        } else {
            kbIstri = 0;
        }

        return kbIstri;
    }

    public int getAshAnakLk (int al, int ap) {
        if (al == 0) {
            ashAnakLk = 0;
        } else if (al >= 1 && ap >=1) {
            ashAnakLk = 2/3;
        } else if (al >= 1 && ap == 0) {
        ashAnakLk = 1;
    }

        return ashAnakLk;
    }

    public int getKbAnakPr (int ap, int al) {
        if (ap == 1 && al == 0) { //anak perempuan tungal
            kbAnakPr = 1/2;
        } else if (ap >=2 && al == 0) { //anak perempuan banyak
            kbAnakPr = 2/3;
        } else {
            kbAnakPr = 0;
        }

        return kbAnakPr;
    }

    public int getAshAnakPr (int ap, int al) {
        if (ap >=1 && al >=1) { // anak perempuan bersama anak laki-laki
            ashAnakPr = 1/3;
        } else {
            ashAnakPr = 0;
        }

        return ashAnakPr;
    }

    //-------------------------------- cucu
    public int getAshCucuLk (int cl, int cp, int al) {
        if (cl == 0 || al >= 1){
            ashCucuLk = 0;
        }else if (cl >= 1 && al == 0 && cp >= 1) { // bersama cucu perempuan
            ashCucuLk = 2/3;
        }else if (cl >= 1 && al == 0 && cp == 0) { // tidak ada cucu perempuan
            ashCucuLk = 1;
        }

        return ashCucuLk;
    }

    public int getAshCucuPr (int cp, int cl, int ap) {
        if (cp == 0 ||  ap >= 2) {
            ashCucuPr = 0;
        }else if (cp >= 1 && cl >= 1){ // bersama cucu laki-laki
            ashCucuPr = 2/3;
        }

        return ashCucuPr;
    }

    public int getKbCucuPr (int cp, int cl, int al, int ap) {
        if (cp == 0 || al >= 1 || ap >= 2) {
            kbCucuPr = 0;
        }else if (cp == 1 && cl == 0 && al == 0 &&  ap == 0){ // seorang diri
            kbCucuPr = 1/2;
        }else if (cp >= 1 && cl == 0 && al == 0 &&  ap >= 1) { // bersama anak perempuan
            kbCucuPr = 1/6;
        }else if (cp >= 2 && cl == 0 && al == 0 &&  ap == 0) { // bersama anak perempuan
            kbCucuPr = 2/3;
        }

        return kbCucuPr;
    }

    //---------------------------- kakek dan nenek
    public int getKbKakek (int ka, int al, int cl, int ay) {
        if (ka == 0){
            kbKakek = 0;
        }else if (ka == 1 && (ay == 0 && (al >= 1 || cl >= 1))){
            kbKakek = 1/6;
        }
        return kbKakek;
    }

    public int getAshKakek (int ka, int al, int cl, int ay) {
        if (ka == 0){
            ashKakek = 0;
        }else if (ka == 1 && ay == 0 && al == 0 && cl == 0){
            ashKakek = 1;
        }

        return kbKakek;
    }

    public int getKbNenekAyah (int na, int ay, int ib) {
        if (na == 0 || ay == 1 || ib == 1){
            kbNenekA = 0;
        } else {
            kbNenekA = 1/6;
        }

        return kbNenekA;
    }

    public int getKbNenekIbu (int ni, int ib) {
        if (ni == 0 || ib == 1){
            kbNenekA = 0;
        } else {
            kbNenekA = 1/6;
        }

        return kbNenekI;
    }

    //------------------------------ suadara kandung
    public int getAshSdrLkKd(int slk, int spk){
        if (slk == 0) {
            ashSaudaraLkKd = 0;
        } else if (slk >= 1 && spk >= 1) {
            ashSaudaraLkKd = 2/3;
        } else if (slk >= 1 && spk >= 1) {
            ashSaudaraLkKd = 1;
        }

        return ashSaudaraLkKd;
    }

    public int getAshSdrPrKd(int slk, int spk){
        if (spk == 0 || slk == 0) {
            ashSaudaraPrKd = 0;
        } else {
            ashSaudaraPrKd = 1/3;
        }

        return ashSaudaraPrKd;
    }

    public int getKbSdrPrKd(int spk, int slk){
        if (spk == 0) {
            kbSaudaraPrKd = 0;
        } else if (spk == 1 && slk == 0){
            kbSaudaraPrKd = 1/2;
        } else if (spk >= 2 && slk == 0) {
            kbSaudaraPrKd = 2/3;
        }

        return kbSaudaraPrKd;
    }

    //------------------------------ saudara tiri
    public int getAshSaudaraLkSa () {

        return ashSaudaraLkSa;
    }

    public int getAshSaudaraPrSa () {

        return ashSaudaraPrSa;
    }

    public int getKbSaudaraPrSa () {

        return kbSaudaraPrSa;
    }

    public int getKbSaudaraLkSi () {

        return kbSaudaraLkSi;
    }

    public int getKbSaudaraPrSi () {

        return kbSaudaraPrSi;
    }

    //------------------------------ keponakan

    //------------------------------ paman

    //------------------------------ sepupu

}
