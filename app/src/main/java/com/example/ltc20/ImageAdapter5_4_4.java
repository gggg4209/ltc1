package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter5_4_4 extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.a00 ,R.drawable.a01 ,R.drawable.a11,R.drawable.a12 ,
            R.drawable.a30,R.drawable.a31 ,  R.drawable.a45,R.drawable.a46 ,  R.drawable.a47,R.drawable.a49 ,R.drawable.a51 ,R.drawable.a53,R.drawable.a54 };
    ImageAdapter5_4_4(Context context) { mContext = context; }
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

