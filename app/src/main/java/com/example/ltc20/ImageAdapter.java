package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds01 = new int[]{R.drawable.z1 ,R.drawable.z2, R.drawable.z3,  };
    ImageAdapter(Context context) {
        mContext = context;
    }
    @Override
    public int getCount() {
        return mImageIds01.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds01[position]);
        container.addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}
