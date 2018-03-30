package com.example.erdeepak_kumar.imageslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Er.Deepak_kumar on 23-12-2017.
 */

public class ImageAdapter extends PagerAdapter {
    Context mContext;
    private int[] sliderImageId=new int[]{R.drawable.w0,R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4,R.drawable.w5,R.drawable.w6,R.drawable.w7,R.drawable.w8,R.drawable.w9,
            R.drawable.w10,R.drawable.w11,R.drawable.w12,R.drawable.w13,R.drawable.w14,R.drawable.w15,R.drawable.w16,R.drawable.w17,R.drawable.w18,R.drawable.w19,
            R.drawable.w20,R.drawable.w21,R.drawable.w22,R.drawable.w23,R.drawable.w24,R.drawable.w25,R.drawable.w26,R.drawable.w27,R.drawable.w28,R.drawable.w29,
            R.drawable.w30,R.drawable.w31,R.drawable.w32,R.drawable.w33,R.drawable.w34,R.drawable.w35,R.drawable.w36,R.drawable.w37,R.drawable.w38,R.drawable.w39,
            R.drawable.w0,R.drawable.w41,R.drawable.w42,R.drawable.w43,R.drawable.w44,R.drawable.w45,R.drawable.w46,R.drawable.w47,R.drawable.w48,R.drawable.w49};
    ImageAdapter(Context context)
    {
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==(ImageView)object;
    }

    public Object instantiateItem(ViewGroup container,int position)
    {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        //imageView.setRotation(90);
        ((ViewPager)container).addView(imageView,0);


        return imageView;
    }

    public void destroyItem(ViewGroup container,int position, Object object)
    {
        ((ViewPager)container).removeView((ImageView)object);
    }







}
