package com.example.findyourlecturer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MenuUtamaAdminActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama_admin);

    }

    public void btinputnimnik(View view) {
        Intent intent = new Intent(MenuUtamaAdminActivity.this, InputNimNikActivity.class);
        startActivity(intent);
    }
    public void btlistuser(View view) {
        Intent intent = new Intent(MenuUtamaAdminActivity.this, ListUserFragmentActivity.class);
        startActivity(intent);
    }

    public void btlogout(View view) {
        FirebaseAuth.getInstance().signOut();
/*
        Toast.makeText(MenuUtamaAdminActivity.this, "Hasilnyaaa" , Toast.LENGTH_SHORT).show(); //mengecek
*/
        Intent intent = new Intent(MenuUtamaAdminActivity.this, LoginAdminActivity.class);
        startActivity(intent);
        session.setLoggedInStatusAdmin(getBaseContext(),false);
        finish();
    }

    public void bthubungi(View view) {
        Intent intent = new Intent(MenuUtamaAdminActivity.this, HubungiDevActivity.class);
        startActivity(intent);
    }
}
