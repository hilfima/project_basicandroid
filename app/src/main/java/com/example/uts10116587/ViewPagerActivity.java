package com.example.uts10116587;
//        Tanggal Pengerjaan : 22 Mei 2019
//        Nama : HIlfi Muhamad Aryawan
//        NIM		: 10116587
//        Kelas	: AKB13
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager nSlideViewPager;
    private LinearLayout nDotLayout;
    private SlideAdapter slideAdapter;
    private TextView[] mDots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        nSlideViewPager = (ViewPager) findViewById(R.id.dotviewPager);
        nDotLayout = (LinearLayout) findViewById(R.id.dotslayouts);

        slideAdapter = new SlideAdapter(this);

        nSlideViewPager.setAdapter(slideAdapter);
        addDotsIndicator(0);
        nSlideViewPager.addOnPageChangeListener(viewlistener);
    }
    public void addDotsIndicator(int position){
        mDots = new TextView[3];
        nDotLayout.removeAllViews();
        for(int i = 0;i<mDots.length;i++){
            mDots[i]= new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorAccent));
            nDotLayout.addView(mDots[i]);
        }
        if(mDots.length >0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }

    }
    ViewPager.OnPageChangeListener viewlistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
    public void bukamainpage(View view) {
        Intent intent = new Intent(ViewPagerActivity.this,MainPage.class);
        startActivity(intent);
    }
}
