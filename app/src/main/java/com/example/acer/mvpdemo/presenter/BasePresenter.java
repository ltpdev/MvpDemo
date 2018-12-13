package com.example.acer.mvpdemo.presenter;

import java.lang.ref.WeakReference;

public class BasePresenter<T> {
    protected WeakReference<T> viewReference;
    //绑定view
    public void attachView(T view){
        this.viewReference=new WeakReference<T>(view);
    }
    //解绑view
    public void detachView(){
        viewReference.clear();
    }
}
