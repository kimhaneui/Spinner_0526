package com.example.spinner_0526.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.spinner_0526.R;
import com.example.spinner_0526.datas.Occupation;

import java.util.List;

public class occapationAdapter extends ArrayAdapter<Occupation> {

    Context mContext;
    List<Occupation> mList;
    LayoutInflater inf;

    public occapationAdapter(@NonNull Context context, int resource, @NonNull List<Occupation> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if(row==null){
            row = inf.inflate(R.layout.occupation_spinner_list_item,null);
        }
        return row;
    }
}
