package com.example.btlandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Button btn_datOnline, btn_datTaiQuan;
    ImageButton imgbtn_cart, imgbtn_oder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        loadView();

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("App đặt đồ ăn");
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setLogo(R.drawable.icons8_pizza_96);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }

        
        imgbtn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "Comming son", Toast.LENGTH_SHORT).show();
            }
        });
        
        imgbtn_oder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "Comming son", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void loadView(){
        btn_datOnline = findViewById(R.id.btn_datOnline);
        btn_datTaiQuan = findViewById(R.id.btn_datTaiQuan);
        imgbtn_cart = findViewById(R.id.imgbtn_cart);
        imgbtn_oder = findViewById(R.id.imgbtn_oder);
    }

    
}