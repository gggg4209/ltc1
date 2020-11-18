package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter8_4_2 extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.t81143 ,R.drawable.t81144,R.drawable.t81145 ,R.drawable.t81146 ,R.drawable.t81147 ,R.drawable.t81148 ,R.drawable.t81149
            ,R.drawable.t81150 ,R.drawable.t81151 ,R.drawable.t81152  ,R.drawable.t81159,R.drawable.t81160,R.drawable.t81161};
    ImageAdapter8_4_2(Context context) { mContext = context; }
    @Override
    public int getCount() { return mImageIds.length; }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}

