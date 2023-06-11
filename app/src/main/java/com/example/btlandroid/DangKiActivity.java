package com.example.btlandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class DangKiActivity extends AppCompatActivity {

    EditText edt_taiKhoanDangKi_text, edt_matKhauDangKi_text, edt_sdt_text, edt_matKhauDangKi_lai;

    MaterialButton mtb_dangKiTaiKhoan, mtb_dangNhapNgay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Đăng kí tài khoản");
        }
        this.loadView();

        mtb_dangNhapNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        this.mtb_dangKiTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCorrectForm();
            }
        });
    }

    public void loadView(){
        this.edt_taiKhoanDangKi_text = findViewById(R.id.edt_taiKhoanDangKi_text);
        this.edt_matKhauDangKi_text  = findViewById(R.id.edt_matKhauDangKi_text);
        this.edt_sdt_text = findViewById(R.id.edt_sdt_text);
        this.edt_matKhauDangKi_lai = findViewById(R.id.edt_matKhauDangKiLai_text);

        this.mtb_dangKiTaiKhoan = findViewById(R.id.mtb_dangKiTaiKhoan);
        this.mtb_dangNhapNgay = findViewById(R.id.mtb_dangNhapNgay);
    }

    public boolean checkMatKhau() {
        return this.edt_matKhauDangKi_lai.getText().toString().equals(this.edt_matKhauDangKi_text.getText().toString());
    }

    public void checkCorrectForm() {
        if(!checkMatKhau()) {
            Toast.makeText(getApplicationContext(), "Mật khẩu không hợp lệ", Toast.LENGTH_SHORT).show();
            edt_matKhauDangKi_lai.setText("");
        }
        else if(edt_taiKhoanDangKi_text.getText().toString().trim().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Tài khoản không hợp lệ", Toast.LENGTH_SHORT).show();
            this.restartActivity();
        }
        else if(edt_sdt_text.length() < 11) {
            Toast.makeText(getApplicationContext(), "Sdt không hợp lệ", Toast.LENGTH_SHORT).show();
            edt_sdt_text.setText("");
        }else{
            finish();
        }

    }

    private void restartActivity() {
        Intent intent = new Intent(DangKiActivity.this, DangKiActivity.class);
        startActivity(intent);
    }
}