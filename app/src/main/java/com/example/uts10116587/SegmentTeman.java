package com.example.uts10116587;
//        Tanggal Pengerjaan : 22 Mei 2019
//        Nama : HIlfi Muhamad Aryawan
//        NIM		: 10116587
//        Kelas	: AKB13
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SegmentTeman extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"M Iyyad Al Muayyad", "Yusuf Ibrahim", "Aris Fauzi", "Hamdan Hamdani"};
    //int flags[] = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle, R.drawable.america, R.drawable.new_zealand};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teman_segment);


        simpleList = (ListView)findViewById(R.id.listtemen);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listingview, countryList);
        simpleList.setAdapter(arrayAdapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegmentTeman.this,MainPage.class);
                startActivity(intent);
            }
        });
    }
    public void bukamainpage(View view) {
        Intent intent = new Intent(SegmentTeman.this,MainPage.class);
        startActivity(intent);
    }
}
