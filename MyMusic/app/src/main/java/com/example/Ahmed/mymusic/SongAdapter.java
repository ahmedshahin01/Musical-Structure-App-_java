package com.example.Ahmed.mymusic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<song> {
    public SongAdapter(Activity context, ArrayList<song> songs){
        super(context,0,songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,
                    false);
        }
        song currentword=getItem(position);
        TextView miwokTexetView=listItemView.findViewById(R.id.songName_text_view);

        miwokTexetView.setText(currentword.getSongName());

        TextView defultTexetView=listItemView.findViewById(R.id.Artest_text_view);

        defultTexetView.setText(currentword.getArtest());

        return listItemView;
    }
}
