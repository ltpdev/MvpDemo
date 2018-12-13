package com.example.acer.mvpdemo.model;

import com.example.acer.mvpdemo.bean.Girl;

import java.util.ArrayList;
import java.util.List;

public class IGirlModelmpl implements IGirlModel{


    @Override
    public void loadGirl(GirlOnloadListener girlOnloadListener) {
        List<Girl> girls=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            girls.add(new Girl(10+i,"张三"+i));
        }
        girlOnloadListener.onComplete(girls);
    }
}
