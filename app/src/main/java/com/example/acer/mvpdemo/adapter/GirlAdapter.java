package com.example.acer.mvpdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.acer.mvpdemo.R;
import com.example.acer.mvpdemo.bean.Girl;

import java.util.List;

public class GirlAdapter extends BaseAdapter{
    private Context context;
    private List<Girl> girlList;

    public GirlAdapter(Context context, List<Girl> girlList) {
        this.context = context;
        this.girlList = girlList;
    }

    @Override
    public int getCount() {
        return girlList.size();
    }

    @Override
    public Object getItem(int position) {
        return girlList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_girl,null);
        Girl girl=girlList.get(position);
         ImageView  ivIcon = (ImageView) view.findViewById(R.id.iv_icon);
         TextView tvName = (TextView) view.findViewById(R.id.tv_name);
         TextView  tvAge = (TextView) view.findViewById(R.id.tv_age);
         tvName.setText(girl.getName());
         tvAge.setText(girl.getAge()+"");
        return view;
    }
}
