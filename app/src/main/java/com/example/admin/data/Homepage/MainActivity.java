package com.example.admin.data.Homepage;


import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.mxn.soul.flowingdrawer_core.*;
import com.example.admin.data.R;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    CardView c1, c2, c3, c4, c5, c6, c7, c8, c9;
    String us="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MobileAds.initialize(this,"ca-app-pub-1002768150287472~3177562999");

        AdView adview=findViewById(R.id.adViewEamcet);

        AdRequest adRequest=new AdRequest.Builder().build();

        adview.loadAd(adRequest);

       try {
           c1 = (CardView) findViewById(R.id.card1);
           c2 = (CardView) findViewById(R.id.card2);
           // c3 = (CardView) findViewById(R.id.card3);
           c4 = (CardView) findViewById(R.id.card4);
           c5 = (CardView) findViewById(R.id.card5);
           c6 = (CardView) findViewById(R.id.card6);
           c7 = (CardView) findViewById(R.id.card7);
           c8 = (CardView) findViewById(R.id.card8);
           c9 = (CardView) findViewById(R.id.card9);


           c1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent q = new Intent(MainActivity.this, Eamcet.class);
                   startActivity(q);
               }
           });

           c2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent w = new Intent(MainActivity.this, Polycet.class);
                   startActivity(w);
               }
           });
      /*  c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MainActivity.this, Icet.class);
                startActivity(e);
            }
        });*/
           c4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent r = new Intent(MainActivity.this, Ecet.class);
                   startActivity(r);
               }
           });
           c5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent t = new Intent(MainActivity.this, Pgcet.class);
                   startActivity(t);
               }
           });
           c6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent y = new Intent(MainActivity.this, Developers.class);
                   startActivity(y);
               }
           });
           c7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i = new Intent();
                   i.setAction(Intent.ACTION_SEND);
                   i.setType("text/plain");

                   i.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=com.redants.rankquest");
                   startActivity(i);
               }
           });
           c8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent u = new Intent(MainActivity.this, Websites.class);
                   startActivity(u);
               }
           });
           c9.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent o = new Intent(MainActivity.this, Feedback.class);
                   startActivity(o);
               }
           });
       }
       catch (Exception e){

       }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//
//        switch (item.getItemId()) {
//            case R.id.login:
//                SharedPreferences d=getSharedPreferences("login",MODE_PRIVATE);
//                String r=d.getString("username","");
//                if(r!=""){
//                    Toast.makeText(getApplicationContext(), r+" Logged In", Toast.LENGTH_LONG).show();
//                }
//                else{
//                    Intent i=new Intent(getApplicationContext(),Login.class);
//                    startActivityForResult(i,1);
//                }
//                return true;
//            case R.id.register:
//                Intent j=new Intent(getApplicationContext(),Register.class);
//                startActivity(j);
//                return true;
//            case R.id.survey:
//                SharedPreferences detail=getSharedPreferences("login",MODE_PRIVATE);
//                String p=detail.getString("profession","");
//                String name=detail.getString("username","");
//                if(p.equals("Teacher")){
//                    Intent s=new Intent(getApplicationContext(),Survey.class);
//                    startActivity(s);
//                }
//                else if(name==""){
//                    //Toast.makeText(getApplicationContext(), "Login First", Toast.LENGTH_LONG).show();
//                    AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
//                    AlertDialog alert = alertDialog.create();
//                    alert.setMessage("Login First");
//                    alert.show();
//                }
//                else{
//                    //Toast.makeText(getApplicationContext(), "Your not a Teacher To Survey", Toast.LENGTH_SHORT).show();
//                    AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
//                    AlertDialog alert = alertDialog.create();
//                    alert.setMessage("Your not a Teacher To Survey");
//                    alert.show();
//                }
//
//                return true;
//            case R.id.logout:
//                SharedPreferences details = getSharedPreferences("login", MODE_PRIVATE);
//                if(details.getString("username","")==""){
//                    AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
//                    AlertDialog alert = alertDialog.create();
//                    alert.setMessage("Login First");
//                    alert.show();//Toast.makeText(getApplicationContext(), "Login First", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    SharedPreferences.Editor editor = details.edit();
//                    editor.putString("username", "");
//                    editor.putString("password", "");
//                    editor.putString("profession", "");
//                    editor.putString("logined", "false");
//                    editor.commit();
//                    Toast.makeText(getApplicationContext(), "Logout Done", Toast.LENGTH_SHORT).show();
//                }
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==1)
        {
            SharedPreferences details = getSharedPreferences("login", MODE_PRIVATE);
            String pe=details.getString("profession","");
            String ty=details.getString("username","");
            if(ty!="") {
                Toast.makeText(getApplicationContext(), ty + " --- " + pe, Toast.LENGTH_SHORT).show();
            }
        }
    }
}

