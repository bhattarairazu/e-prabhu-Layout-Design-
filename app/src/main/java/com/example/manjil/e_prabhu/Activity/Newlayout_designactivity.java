package com.example.manjil.e_prabhu.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
//import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.manjil.e_prabhu.R;

import java.util.ArrayList;
import java.util.List;

import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;

/**
 * Created by Dell on 3/19/2018.
 */

public class Newlayout_designactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favouritelayout_design);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        BannerSlider bannerSlider = (BannerSlider) findViewById(R.id.banner_slider1);
//        List<Banner> banners=new ArrayList<>();
//        //add banner using image url
//        //banners.add(new RemoteBanner("Put banner image url here ..."));
//        //add banner using resource drawable
//        banners.add(new DrawableBanner(R.drawable.utl1));
//        banners.add(new DrawableBanner(R.drawable.ncell1));
//        banners.add(new DrawableBanner(R.drawable.ntcimages));
//        bannerSlider.setBanners(banners);
        //initCollapsingToolbar();
    }
//    private void initCollapsingToolbar() {
//        final CollapsingToolbarLayout collapsingToolbar =
//                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        collapsingToolbar.setTitle(" ");
//        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
//        appBarLayout.setExpanded(true);
//
//        // hiding & showing the title when toolbar expanded & collapsed
//        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//            boolean isShow = false;
//            int scrollRange = -1;
//
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//                if (scrollRange == -1) {
//                    scrollRange = appBarLayout.getTotalScrollRange();
//                }
//                if (scrollRange + verticalOffset == 0) {
//                    collapsingToolbar.setTitle("e-Prabhu(A Payment Gateway)");
//                    isShow = true;
//                } else if (isShow) {
//                    collapsingToolbar.setTitle("e-Prabhu(A Payment Gateway)");
//                    isShow = false;
//                }
//            }
//        });
//    }
}
