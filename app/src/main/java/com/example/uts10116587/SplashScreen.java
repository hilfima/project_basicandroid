package com.example.uts10116587;
//        Tanggal Pengerjaan : 22 Mei 2019
//        Nama : HIlfi Muhamad Aryawan
//        NIM		: 10116587
//        Kelas	: AKB13
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {
private int sleeptime=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        LogoLauncher logolauncer = new LogoLauncher();
        logolauncer.start();
    }
    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(1000*sleeptime);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Intent intent = new Intent(SplashScreen.this,ViewPagerActivity.class);
            startActivity(intent);
            SplashScreen.this.finish();
        }
    }
}
