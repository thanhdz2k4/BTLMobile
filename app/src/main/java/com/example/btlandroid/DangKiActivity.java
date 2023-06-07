package com.example.btlandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DangKiActivity extends AppCompatActivity {

    EditText edt_taiKhoanDangKi_text, edt_matKhauDangKi_text, edt_sdt_text, edt_matKhauDangKi_lai;
    Button btn_dangKiTaiKhoan, btn_dangNhapNgay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Đăng kí tài khoản");
        }
        this.loadView();

        btn_dangNhapNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangKiActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        this.btn_dangKiTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkMatKhau()) {
                    Toast.makeText(getApplicationContext(), "Mật khẩu không hợp lệ", Toast.LENGTH_SHORT).show();
                    edt_matKhauDangKi_lai.setText("");
                }
                if(edt_taiKhoanDangKi_text.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Tài khoản không hợp lệ", Toast.LENGTH_SHORT).show();
                    this.restartActivity();
                }
                if(edt_sdt_text.length() < 12) {
                    Toast.makeText(getApplicationContext(), "sdt không hợp lệ", Toast.LENGTH_SHORT).show();
                    edt_sdt_text.setText("");
                }


            }

            private void restartActivity() {
                Intent intent = new Intent(DangKiActivity.this, DangKiActivity.class);
                startActivity(intent);
            }

        });
    }

    public void loadView(){
        this.edt_taiKhoanDangKi_text = findViewById(R.id.edt_taiKhoanDangKi_text);
        this.edt_matKhauDangKi_text  = findViewById(R.id.edt_matKhauDangKi_text);
        this.edt_sdt_text = findViewById(R.id.edt_sdt_text);
        this.edt_matKhauDangKi_lai = findViewById(R.id.edt_matKhauDangKiLai_text);

        this.btn_dangKiTaiKhoan = findViewById(R.id.btn_dangkiTaiKhoan);
        this.btn_dangNhapNgay = findViewById(R.id.btn_dangNhapNgay);
    }

    public boolean checkMatKhau() {
        return this.edt_matKhauDangKi_lai.getText().toString().equals(this.edt_matKhauDangKi_text.getText().toString());
    }
}