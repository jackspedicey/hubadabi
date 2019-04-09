package id.zakafikry.ewaris.Introduction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import id.zakafikry.ewaris.R;
import id.zakafikry.ewaris.Util.ExpandListView;

public class AWarisActivity extends AppCompatActivity {

    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awaris);
        setTitle("Daftar Ahli AhliWaris");

        ExpandableListView listView = findViewById(R.id.lvExp);
        initData();
        ExpandListView listAdapter = new ExpandListView(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Anak Laki-laki");
        listDataHeader.add("Anak Perempuan");
        listDataHeader.add("Ayah");
        listDataHeader.add("Ibu");
        listDataHeader.add("Suami");
        listDataHeader.add("Istri");
        listDataHeader.add("Cucu Laki-laki");
        listDataHeader.add("Cucu Perempuan");
        listDataHeader.add("Kakek");
        listDataHeader.add("Nenek dari pihak Ayah");
        listDataHeader.add("Nenek dari pihak Ibu");
        listDataHeader.add("Saudara Laki-laki Kandung");
        listDataHeader.add("Saudara Perempuan Kandung");
        listDataHeader.add("Saudara Laki-laki Se-Ayah");
        listDataHeader.add("Saudara Perempuan Se-Ayah");
        listDataHeader.add("Saudara Se-Ibu");
        listDataHeader.add("Keponakan Laki-laki dari Saudara Kandung");
        listDataHeader.add("Keponakan Laki-laki dari Saudara Se-Ayah");
        listDataHeader.add("Paman Kandung");
        listDataHeader.add("Paman Se-Kakek");
        listDataHeader.add("Sepupu Laki-laki dari Paman Kandung");
        listDataHeader.add("Sepupu Laki-laki dari Paman Se-Kakek");

        List<String> anakLk = new ArrayList<>();
        anakLk.add("Seluruh sisa harta (Ashobah), Syarat: Tidak ada Anak Perempuan");
        anakLk.add("Ashobah 2x Bagian Perempuan (2:1A), Syarat: Bersama dengan Anak Perempuan");

        List<String> anakPr = new ArrayList<>();
        anakPr.add("Ashobah separuh bagian Laki-laki (1:1A), Syarat: Bersama dengan Anak Laki-laki");
        anakPr.add("1/2 Bagian harta (Al-Irts), Syarat: Seorang diri dan tidak ada Anak Laki-laki");
        anakPr.add("2/3 Bagian Harta (Al-Irts), Syarat: Dua orang atau lebih dan tidak ada Anak Laki-laki ");

        List<String> ayah = new ArrayList<>();
        ayah.add("1/6 Al-Irts, Syarat: Ada salah satu Anak atau Cucu");
        ayah.add("Seluruh Ashobah, Syarat: Tidak ada Anak dan Cucu");
        ayah.add("1/6 + Ashobah, Syarat: Bersama dengan Anak atau Cucu Perempuan");
        ayah.add("Ashobah 1:1A, Syarat: Kasus Umariyatani (Ayah, Ibu, Suami/Istri)");

        List<String> ibu = new ArrayList<>();
        ibu.add("1/6 Al-Irts, Syarat: Ada salah satu dari Anak, Cucu, atau berkumpulnya dua Saudara");
        ibu.add("1/3 Al-Irts, Syarat: Tidak ada Anak, Cucu, dan berkumpulnya dua Saudara");
        ibu.add("Ashobah 1:3A, Syarat: Kasus Umariyatani (Ayah, Ibu, Suami/Istri)");

        List<String> suami = new ArrayList<>();
        suami.add("1/4 Al-Irts, Syarat: Ada Anak atau Cucu");
        suami.add("1/2 Al-Irts, Syarat: Tidak Ada Anak dan Cucu");

        List<String> istri = new ArrayList<>();
        istri.add("1/8 Al-Irts, Syarat: Ada Anak atau Cucu");
        istri.add("1/4 Al-Irts, Syarat: Tidak ada Anak dan Cucu");

        List<String> cucuLk = new ArrayList<>();
        cucuLk.add("Seluruh Ashobah, Syarat: Tidak bersama Cucu Perempuan dan tidak ada Anak Laki-laki");
        cucuLk.add("Ashobah 2:1A, Syarat: Bersama Cucu Perempuan dan tidak ada Anak Laki-laki");

        List<String> cucuPr = new ArrayList<>();
        cucuPr.add("Ashobah 1:1A, Syarat: Bersama Cucu Laki-laki, tidak ada Anak Laki-laki, dan tidak ada dua atau lebih Anak Perempuan");
        cucuPr.add("1/2 Al-Irts, Syarat: Seorang diri, tidak bersama Cucu Laki-laki, tidak ada Anak Laki-laki, dan tidak ada dua atau lebih Anak Perempuan");
        cucuPr.add("2/3 Al-Irts, Syarat: Dua orang atau lebih, tidak bersama Cucu Laki-laki, tidak ada Anak Laki-laki, dan tidak ada dua atau lebih Anak Perempuan");
        cucuPr.add("1/6 Al-Irts, Syarat: Bersama seorang Anak Perempuan, tidak ada Cucu Laki-laki, dan tidak ada Anak Laki-laki");

        List<String> kakek = new ArrayList<>();
        kakek.add("1/6 Al-Irts, Syarat: Ada Anak atau Cucu dan tidak ada Ayah");
        kakek.add("Seluruh Ashobah, Syarat: Tidak ada Anak dan Cucu dan tidak ada Ayah");
        kakek.add("1/6 + Ashobah, Syarat: Bersama Anak atau Cucu Perempuan dan tidak ada Ayah");

        List<String> nenekA = new ArrayList<>();
        nenekA.add("1/6 Al-Irts, Syarat: Tidak ada Ibu dan tidak ada Nenek dari pihak Ibu");
        nenekA.add("1/6B Al-Irts, Syarat: Tidak ada Ibu dan bersama Nenek dari pihak Ibu");

        List<String> nenekI = new ArrayList<>();
        nenekI.add("1/6 Al-Irts, Syarat: Tidak ada Ibu dan tidak ada Nenek dari pihak Ayah");
        nenekI.add("1/6B Al-Irts, Syarat: Tidak ada Ibu dan bersama Nenek dari pihak Ayah");

        List<String> saudaraLkKd = new ArrayList<>();
        saudaraLkKd.add("Seluruh Ashobah, Syarat: Tidak bersama Saudara Perempuan Kandung, tidak ada Anak Laki-laki, Cucu Laki-laki, Ayah dan Kakek");
        saudaraLkKd.add("Ashobah 2:1A, Syarat: Bersama Saudara Perempuan Kandung, tidak ada Anak Laki-laki, Cucu Laki-laki, Ayah dan Kakek");

        List<String> saudaraPrKd = new ArrayList<>();
        saudaraPrKd.add("Ashobah 1:1A, Syarat: Bersama Saudara Laki-laki Kandung, tidak ada Anak Laki-laki, Cucu Laki-laki, Ayah dan Kakek");
        saudaraPrKd.add("1/2 Al-Irts, Syarat: Seorang diri, tidak ada Saudara Laki-laki Kandung, Anak, Cucu, Ayah dan Kakek");
        saudaraPrKd.add("2/3 Al-Irts, Syarat: Dua orang atau lebih, tidak ada Saudara Laki-laki Kandung, Anak, Cucu, Ayah dan Kakek");
        saudaraPrKd.add("Ashobah ma'al Ghoir, Syarat: Bersama Anak atau Cucu Perempuan, tidak ada Saudara Laki-laki Kandung, Anak Laki-laki, Cucu Laki-laki, Ayah dan Kakek");

        List<String> saudaraLkSa = new ArrayList<>();
        saudaraLkSa.add("Seluruh Ashobah, Syarat: Tidak bersama Saudara Perempuan Se-Ayah, tidak ada Saudara Laki-laki Kandung, dan yang menghalangi Saudara Laki-laki Kandung");
        saudaraLkSa.add("Ashobah 2:1A : Bersama Saudara Perempuan Se-Ayah, tidak ada Saudara Laki-laki Kandung, dan yang menghalangi Saudara Laki-laki Kandung");

        List<String> saudaraPrSa = new ArrayList<>();
        saudaraPrSa.add("Ashobah 1:1A, Syarat: Bersama Saudara Laki-laki Se-Ayah, tidak ada Saudara Laki-laki Kandung, Anak Laki-laki, Cucu Laki-laki, Ayah dan Kakek");
        saudaraPrSa.add("1/2 Al-Irts, Syarat: Seorang diri, tidak ada Saudara Laki-laki Se-Ayah, Saudara Laki-laki Kandung, Anak, Cucu, Ayah dan Kakek");
        saudaraPrSa.add("2/3 Al-Irts, Syarat: Dua orang atau lebih, tidak ada Saudara Laki-laki Se-Ayah, Saudara Laki-laki Kandung, Anak, Cucu, Ayah dan Kakek");
        saudaraPrSa.add("Ashobah ma'al Ghoir, Syarat: Bersama Anak atau Cucu Perempuan, tidak ada Saudara Laki-laki Se-Ayah, Saudara Perempuan Kandung, Anak Laki-laki, Cucu Laki-laki, Ayah dan Kakek");

        List<String> saudaraSi = new ArrayList<>();
        saudaraSi.add("1/6 Al-Irts, Syarat: Seorang diri dan tidak ada Anak, Cucu, Ayah dan Kakek");
        saudaraSi.add("1/3 Al-Irts, Syarat: Dua orang atau lebih dan tidak ada Anak, Cucu, Ayah dan Kakek");

        List<String> keponakanLkKd = new ArrayList<>();
        keponakanLkKd.add("Ashobah, Syarat: Tidak ada Saudara Laki-laki Se-Ayah, dan yang menghalangi Saudara Laki-laki Seayah");

        List<String> keponakanLkSa = new ArrayList<>();
        keponakanLkSa.add("Ashobah, Syarat: Tidak ada Keponakan Laki-laki Kandung dan yang menghalangi Keponakan Laki-laki Kandung");

        List<String> pamanKd = new ArrayList<>();
        pamanKd.add("Ashobah, Syarat: Tidak ada Keponakan Laki-laki Se-Ayah dan yang menghalangi Keponakan Laki-laki Se-Ayah");

        List<String> pamanSa = new ArrayList<>();
        pamanSa.add("Ashobah, Syarat: Tidak ada Paman Kandung dan yang menghalangi Paman Kandung");

        List<String> sepupuLkKd = new ArrayList<>();
        sepupuLkKd.add("Ashobah, Syarat: Tidak ada Paman se-Kakek dan yang menghalangi Paman se-Kakek");

        List<String> sepupuLkSa = new ArrayList<>();
        sepupuLkSa.add("Ashobah, Syarat: Tidak ada Sepupu Laki-laki dari Paman Kandung dan yang menghalang-nya.");

        listHash.put(listDataHeader.get(0), anakLk);
        listHash.put(listDataHeader.get(1), anakPr);
        listHash.put(listDataHeader.get(2), ayah);
        listHash.put(listDataHeader.get(3), ibu);
        listHash.put(listDataHeader.get(4), suami);
        listHash.put(listDataHeader.get(5), istri);
        listHash.put(listDataHeader.get(6), cucuLk);
        listHash.put(listDataHeader.get(7), cucuPr);
        listHash.put(listDataHeader.get(8), kakek);
        listHash.put(listDataHeader.get(9), nenekA);
        listHash.put(listDataHeader.get(10), nenekI);
        listHash.put(listDataHeader.get(11), saudaraLkKd);
        listHash.put(listDataHeader.get(12), saudaraPrKd);
        listHash.put(listDataHeader.get(13), saudaraLkSa);
        listHash.put(listDataHeader.get(14), saudaraPrSa);
        listHash.put(listDataHeader.get(15), saudaraSi);
        listHash.put(listDataHeader.get(16), keponakanLkKd);
        listHash.put(listDataHeader.get(17), keponakanLkSa);
        listHash.put(listDataHeader.get(18), pamanKd);
        listHash.put(listDataHeader.get(19), pamanSa);
        listHash.put(listDataHeader.get(20), sepupuLkKd);
        listHash.put(listDataHeader.get(21), sepupuLkSa);

    }
}
