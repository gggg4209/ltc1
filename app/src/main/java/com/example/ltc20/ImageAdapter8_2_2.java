package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter8_2_2 extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.t81110 ,R.drawable.t81111 ,R.drawable.t81112 ,R.drawable.t81113 ,R.drawable.t81114 ,R.drawable.t81115
            ,R.drawable.t81116 ,R.drawable.t81117 ,R.drawable.t81120,R.drawable.t81121 };
    ImageAdapter8_2_2(Context context) { mContext = context; }
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
