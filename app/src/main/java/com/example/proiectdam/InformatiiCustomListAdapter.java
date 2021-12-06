package com.example.proiectdam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InformatiiCustomListAdapter extends BaseAdapter {
    private ArrayList<com.example.proiectdam.InformatiiListItem> listData;
    private LayoutInflater layoutInflater;
    public InformatiiCustomListAdapter(Context aContext,
                                    ArrayList<com.example.proiectdam.InformatiiListItem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listData.size();
    }
    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View v, ViewGroup vg) {
        InformatiiCustomListAdapter.ViewHolder holder;
        if (v == null) {
            v = layoutInflater.inflate(R.layout.informatiilist_row, null);
            holder = new InformatiiCustomListAdapter.ViewHolder();
            holder.Time = (TextView) v.findViewById(R.id.text);
            v.setTag(holder);
        } else {
            holder = (InformatiiCustomListAdapter.ViewHolder) v.getTag();
        }
        holder.Time.setText(listData.get(position).getText());

        return v;
    }
    static class ViewHolder {
        TextView Time;
        TextView Course;
    }
}