package com.tongtong.pulltozoomscrollviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_pic)
    SimpleDraweeView ivPic;
    @BindView(R.id.zoom_scrollView)
    PullToZoomScrollView zoomScrollView;
    private String imageUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1510982042401&di=b8340a3c632c2a34d4ede7f70711b5e7&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Fb3fb43166d224f4a222268d200f790529922d1b3.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        FrescoUtil.setCommonPic(imageUrl, ivPic);
        zoomScrollView.setZoomView(ivPic);
    }
}
