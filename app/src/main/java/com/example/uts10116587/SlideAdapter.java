package com.example.uts10116587;
//        Tanggal Pengerjaan : 22 Mei 2019
//        Nama : HIlfi Muhamad Aryawan
//        NIM		: 10116587
//        Kelas	: AKB13s
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import javax.security.auth.DestroyFailedException;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public SlideAdapter(Context context){
        this.context = context;

    }
    public int[] slides_images ={
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3
    };
    public String[] slide_heading_array={
            "Selamat Datang",
            "Tunggu Maintenance kami",
            "Pembuat"
    };
    public String[] slide_desc={
            "Selamat Menikmati",
            "maaf masih berantakan",
            "10116587"
    };


@Override
    public int getCount() {
        return slide_heading_array.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view==(RelativeLayout)o;
    }


    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);
        ImageView slideImageView = (ImageView) view.findViewById(R.id.slideimage);
        TextView slideheading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slidedesc = (TextView) view.findViewById(R.id.slidedesc);
        slideImageView.setImageResource(slides_images[position]);
        slideheading.setText(slide_heading_array[position]);
        slidedesc.setText(slide_desc[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
