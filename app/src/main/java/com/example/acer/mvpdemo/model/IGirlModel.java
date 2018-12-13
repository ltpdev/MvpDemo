package com.example.acer.mvpdemo.model;

import com.example.acer.mvpdemo.bean.Girl;

import java.util.List;

/*用来加载数据*/
public interface IGirlModel{
    //如果数据来源非常耗时，应该单独设计一个回调调用接口
    void loadGirl(GirlOnloadListener girlOnloadListener);
    interface GirlOnloadListener{
        void onComplete(List<Girl>girls);
    }
}
