package com.example.textread;


import android.app.Application;

import android.content.Intent;
import android.net.Uri;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Home extends Application{

    public void onCreate() {
        super.onCreate();

        FirebaseAuth mAuth =FirebaseAuth.getInstance();
        FirebaseUser user=mAuth.getCurrentUser();

            //startActivity(new Intent(Home.this,ScannerActivity.class));
        if (user != null) {


            Intent intent=new Intent(Home.this, ScannerActivity.class);
        }



    }

}



