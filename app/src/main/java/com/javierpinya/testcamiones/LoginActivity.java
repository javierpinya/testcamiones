package com.javierpinya.testcamiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        prefs = getSharedPreferences("preferences", Context.MODE_PRIVATE);
    }

    private void saveOnPreferences(String user, String password){
        SharedPreferences.Editor editor  = prefs.edit();
        editor.putString("user", user);
        editor.putString("pass", password);
        editor.commit();
        editor.apply();
    }



}
