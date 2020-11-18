package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter8_3_3 extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.t81110 ,R.drawable.t81111 ,R.drawable.t81123 ,R.drawable.t81124  ,R.drawable.t81125  ,R.drawable.t81126
            ,R.drawable.t81127  ,R.drawable.t81128  ,R.drawable.t81129  ,R.drawable.t81130  ,R.drawable.t81131  ,R.drawable.t81136  };
    ImageAdapter8_3_3(Context context) { mContext = context; }
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

