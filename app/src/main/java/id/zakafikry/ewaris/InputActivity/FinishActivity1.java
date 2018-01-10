package id.zakafikry.ewaris.InputActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import id.zakafikry.ewaris.R;

public class FinishActivity1 extends AppCompatActivity {

    TextView tvIrts;
    TextView tvAyah;
    TextView tvIbu;
    TextView tvIstri;
    TextView tvSuami;
    TextView tvAnakLk;
    TextView tvAnakPr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish1);

        tvAyah = (TextView) findViewById(R.id.tvAyahF1);
        tvIbu = (TextView) findViewById(R.id.tvIbuF1);
        tvSuami = (TextView)findViewById(R.id.tvSuamiF1);
        tvIstri = (TextView)findViewById(R.id.tvIstriF1);
        tvAnakLk = (TextView) findViewById(R.id.tvAnakLkF1);
        tvAnakPr = (TextView) findViewById(R.id.tvAnakPrF1);

        getInt();
    }
    public void getInt() {
        Intent i = getIntent();
        Bundle b = i.getExtras();
        int irts = b.getInt("irtsI2");
        int ayah = b.getInt("ayah");
        int ibu = b.getInt("ibu");
        int suami = b.getInt("suami");
        int istri = b.getInt("istri");
        int anakLk = b.getInt("anakLk");
        int anakPr = b.getInt("anakPr");

    }
}
