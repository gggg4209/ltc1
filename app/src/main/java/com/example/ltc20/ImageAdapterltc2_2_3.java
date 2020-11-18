package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterltc2_2_3 extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.c01 ,R.drawable.c02, R.drawable.c03 , R.drawable.c04,R.drawable.c05, R.drawable.c06,R.drawable.c07, R.drawable.c08 , R.drawable.c09  , R.drawable.x10, R.drawable.c11
            , R.drawable.c12 , R.drawable.c13 , R.drawable.c14 , R.drawable.c15 ,R.drawable.v01 ,R.drawable.v02 ,R.drawable.v03};
    ImageAdapterltc2_2_3(Context context) { mContext = context; }
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
