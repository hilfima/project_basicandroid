package com.example.uts10116587;
//        Tanggal Pengerjaan : 22 Mei 2019
//        Nama : HIlfi Muhamad Aryawan
//        NIM		: 10116587
//        Kelas	: AKB13
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegmentProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment_profile);
    }
    public void bukamainpage(View view) {
        Intent intent = new Intent(SegmentProfile.this,MainPage.class);
        startActivity(intent);
    }
}
