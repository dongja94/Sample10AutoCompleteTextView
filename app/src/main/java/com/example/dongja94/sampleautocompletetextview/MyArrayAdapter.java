package com.example.dongja94.sampleautocompletetextview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by dongja94 on 2016-01-18.
 */
public class MyArrayAdapter extends ArrayAdapter<MyData> {
    public MyArrayAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView view;
        if (convertView == null) {
            view = new ItemView(getContext());
        } else {
            view = (ItemView)convertView;
        }
        view.setData(getItem(position));
        return view;
    }
}
