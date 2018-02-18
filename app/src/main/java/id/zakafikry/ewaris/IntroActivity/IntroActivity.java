package id.zakafikry.ewaris.IntroActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.zakafikry.ewaris.R;

public class IntroActivity extends AppCompatActivity {
    Button btnFaraidh, btnAwaris, btnFamTree, btnDalil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        setTitle("Pengenalan Faraidh");

        btnAwaris = findViewById(R.id.btnAhliWaris);
        btnFaraidh = findViewById(R.id.btnFaraid);
        btnDalil = findViewById(R.id.btnDalil);
        btnFamTree = findViewById(R.id.btnFamilyTree);

        btnFaraidh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroActivity.this, FaraidhActivity.class);
                startActivity(i);
            }
        });

        btnDalil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroActivity.this, DalilActivity.class);
                startActivity(i);
            }
        });

        btnAwaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroActivity.this, AWarisActivity.class);
                startActivity(i);
            }
        });

        btnFamTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroActivity.this, FTreeActivity.class);
                startActivity(i);
            }
        });
    }
}
