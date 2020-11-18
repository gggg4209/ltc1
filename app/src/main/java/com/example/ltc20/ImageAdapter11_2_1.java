package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter11_2_1 extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.l1 ,R.drawable.l2 ,R.drawable.l3 ,R.drawable.l4 ,R.drawable.l14 ,R.drawable.l15 ,R.drawable.l16 ,R.drawable.l17,R.drawable.l18 ,R.drawable.l19};
    ImageAdapter11_2_1(Context context) { mContext = context; }
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

