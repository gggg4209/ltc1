package com.example.ltc20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterltc2_2_1 extends PagerAdapter {

        private Context mContext;
        private int[] mImageIds = new int[]{R.drawable.x01 ,R.drawable.x02, R.drawable.x04 , R.drawable.x05 ,R.drawable.x06, R.drawable.x07,R.drawable.x08, R.drawable.x09 , R.drawable.x10 ,R.drawable.x11, R.drawable.x12
                , R.drawable.x13 };
        ImageAdapterltc2_2_1(Context context) { mContext = context; }
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
