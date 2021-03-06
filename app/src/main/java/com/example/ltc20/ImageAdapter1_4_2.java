package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter1_4_2 extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.q1 ,R.drawable.q2 ,R.drawable.q25,R.drawable.q26 ,R.drawable.q27
            ,R.drawable.q28,R.drawable.q29,R.drawable.q30,R.drawable.q43,R.drawable.q44,R.drawable.q45
            ,R.drawable.q60,R.drawable.q61,R.drawable.q62,R.drawable.q63,R.drawable.q65 ,R.drawable.q66
            ,R.drawable.q67,R.drawable.q68,R.drawable.q69 };
    ImageAdapter1_4_2(Context context) { mContext = context; }
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