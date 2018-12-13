package com.example.acer.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.acer.mvpdemo.adapter.GirlAdapter;
import com.example.acer.mvpdemo.bean.Girl;
import com.example.acer.mvpdemo.presenter.GirlPresenter;
import com.example.acer.mvpdemo.ui.BaseActivity;
import com.example.acer.mvpdemo.view.IGirlView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView{
        private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        presenter.fetch();
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showGirls(List<Girl> girls) {
           listView.setAdapter(new GirlAdapter(this,girls));
    }


}
