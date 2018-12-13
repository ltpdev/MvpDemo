package com.example.acer.mvpdemo.presenter;

import com.example.acer.mvpdemo.bean.Girl;
import com.example.acer.mvpdemo.model.IGirlModel;
import com.example.acer.mvpdemo.model.IGirlModelmpl;
import com.example.acer.mvpdemo.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {

    //需要model层的引用
    IGirlModel girlModel = new IGirlModelmpl();

    //初始化
    public GirlPresenter() {

    }


    //执行ui逻辑

    public void fetch() {
        if (viewReference.get() != null) {
            viewReference.get().showLoading();
            if (girlModel != null) {
                girlModel.loadGirl(new IGirlModel.GirlOnloadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if (viewReference.get() != null) {
                            viewReference.get().showGirls(girls);
                        }
                    }
                });
            }
        }
    }


}
