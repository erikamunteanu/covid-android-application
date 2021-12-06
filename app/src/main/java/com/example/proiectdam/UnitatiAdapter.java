package com.example.proiectdam;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class UnitatiAdapter extends BaseAdapter {
    private Context mContext;
    public UnitatiAdapter(Context c) {
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
        imageView.setPadding(10, 2, 80, 35);
        imageView.setImageResource(ImagineMica[position]);
        return imageView;
    }

    public Integer[] ImagineMica = {
            R.drawable.unitate1, R.drawable.unitate2,
            R.drawable.unitate3, R.drawable.unitate4,
            R.drawable.unitate5, R.drawable.unitate6,
    };
}
