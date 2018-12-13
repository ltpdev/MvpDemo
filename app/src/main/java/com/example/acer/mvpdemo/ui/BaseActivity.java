package com.example.acer.mvpdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.acer.mvpdemo.presenter.BasePresenter;
import com.example.acer.mvpdemo.presenter.GirlPresenter;
import com.example.acer.mvpdemo.view.IGirlView;

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity{
    protected T presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=createPresenter();
        presenter.attachView((V)this);
    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
