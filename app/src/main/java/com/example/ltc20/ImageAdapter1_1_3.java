package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter1_1_3 extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.q1 ,R.drawable.q2 ,R.drawable.q3 ,R.drawable.q4 ,R.drawable.q6,R.drawable.q7 ,R.drawable.q9 ,R.drawable.q10 ,R.drawable.q11 };
    ImageAdapter1_1_3(Context context) { mContext = context; }
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

