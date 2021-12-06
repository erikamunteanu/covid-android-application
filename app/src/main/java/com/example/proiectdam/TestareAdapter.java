package com.example.proiectdam;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class TestareAdapter extends BaseAdapter {
    private Context mContext;
    public TestareAdapter(Context c) {
        mContext = c;
    }
    public int getCount() {
        return ImagineMica.length;
    }
    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(550, 420));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setPadding(0, 2, 80, 35);
        imageView.setImageResource(ImagineMica[position]);
        return imageView;
    }

    public Integer[] ImagineMica = {
            R.drawable.testare1, R.drawable.text1,
            R.drawable.testare2, R.drawable.text2,
            R.drawable.testare3, R.drawable.text3,
    };
}
