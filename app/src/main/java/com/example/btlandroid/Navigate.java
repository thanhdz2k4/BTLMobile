package com.example.btlandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Navigate extends AppCompatActivity {
    Button btn_datOnline, btn_datTaiQuan;

    FloatingActionButton fl_add, fl_oder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naviagate);
        loadView();

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("App đặt đồ ăn");
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setLogo(R.drawable.icons8_pizza_96);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }

        
        fl_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Navigate.this, "Comming son", Toast.LENGTH_SHORT).show();
            }
        });
        
        fl_oder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Navigate.this, "Comming son", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void loadView(){
        btn_datOnline = findViewById(R.id.btn_datOnline);
        btn_datTaiQuan = findViewById(R.id.btn_datTaiQuan);
        fl_add = findViewById(R.id.fl_add);
        fl_oder = findViewById(R.id.fl_oder);
    }

    
}