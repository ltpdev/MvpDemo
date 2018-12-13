package com.example.acer.mvpdemo.view;

import com.example.acer.mvpdemo.bean.Girl;

import java.util.List;

/*定义所有ui的逻辑*/
public interface IGirlView {
    void showLoading();
    //显示listview的数据(回调)
     void showGirls(List<Girl>girls);
}
