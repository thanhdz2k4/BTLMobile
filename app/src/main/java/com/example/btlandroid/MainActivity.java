package com.example.btlandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText edt_taiKhoan_text, edt_matKhau_text;

    MaterialButton mtb_dangNhap, mtb_dangKi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("App đặt đồ ăn");
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setLogo(R.drawable.icons8_pizza_96);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }
        this.loadView();
        mtb_dangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DangKiActivity.class);
                startActivity(intent);
            }
        });

        mtb_dangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edt_taiKhoan_text.getText().toString();
                String password = edt_matKhau_text.getText().toString();

                if(username.equals("admin") && password.equals("admin")){
                        Intent intent = new Intent(MainActivity.this, Navigate.class);
                        startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Tài khoản hoặc mật khẩu không chính xác", Toast.LENGTH_SHORT).show();
                    edt_taiKhoan_text.setText("");
                    edt_matKhau_text.setText("");
                }
            }
        });
    }

    public void loadView(){
        this.edt_taiKhoan_text = findViewById(R.id.edt_taiKhoan_text);
        this.edt_matKhau_text = findViewById(R.id.edt_matKhau_text);

        this.mtb_dangNhap = findViewById(R.id.mtb_dangNhap);
        this.mtb_dangKi = findViewById(R.id.mtb_dangKi);
    }
}