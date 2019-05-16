package com.example.admin.data.Homepage;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

import com.example.admin.data.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Websites extends AppCompatActivity {
CardView c1,c2,c3,c4,c5,c6,c7;
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websites);

        MobileAds.initialize(this,"ca-app-pub-1002768150287472~3177562999");

        AdView adview=findViewById(R.id.adViewEamcet);

        AdRequest adRequest=new AdRequest.Builder().build();

        adview.loadAd(adRequest);

        c1=(CardView)findViewById(R.id.c1);
        c2=(CardView)findViewById(R.id.c2);
        c3=(CardView)findViewById(R.id.c3);
        c4=(CardView)findViewById(R.id.c4);
        c5=(CardView)findViewById(R.id.c5);
        c6=(CardView)findViewById(R.id.c6);
        c7=(CardView)findViewById(R.id.c7);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sche.ap.gov.in/EAMCET/EamcetHomePages/Home.aspx"));
                startActivity(web);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w=new Intent(Intent.ACTION_VIEW, Uri.parse("https://appolycet.nic.in"));
                startActivity(w);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sche.ap.gov.in/ICET/ICET/ICET_HomePage.aspx"));
                startActivity(e);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sche.ap.gov.in/PGECET/GATE/GPGECET/PGECET_HomePage.aspx"));
                startActivity(b);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sche.ap.gov.in/ECET/ECET/ECET_HomePage.aspx"));
                startActivity(r);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sasi.ac.in"));
                startActivity(t);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redants.info"));
                startActivity(y);
            }
        });
    }
}