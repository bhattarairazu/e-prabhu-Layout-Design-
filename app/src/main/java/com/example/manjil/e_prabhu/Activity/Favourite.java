package com.example.manjil.e_prabhu.Activity;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.manjil.e_prabhu.R;

import java.util.ArrayList;
import java.util.List;

import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;

public class Favourite extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayout_design);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);
        initCollapsingToolbar();
        bottonavigationbar();

//        BannerSlider bannerSlider = (BannerSlider) findViewById(R.id.banner_slider1);
//        List<Banner> banners=new ArrayList<>();
////        //add banner using image url
////        //banners.add(new RemoteBanner("Put banner image url here ..."));
////        //add banner using resource drawable
//        banners.add(new DrawableBanner(R.drawable.utl1));
//        banners.add(new DrawableBanner(R.drawable.ncell1));
//        banners.add(new DrawableBanner(R.drawable.ntcimages));
//        bannerSlider.setBanners(banners);
    }
    public void bottonavigationbar(){
        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);

        // Create items
        AHBottomNavigationItem item1 = new AHBottomNavigationItem("Home", R.drawable.icon_home, R.color.colorBackroundWhite);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("Profile", R.drawable.ic_privacy_white, R.color.colorBackroundWhite);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("Setting", R.drawable.icon_settings, R.color.colorBackroundWhite);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem("Menu", R.drawable.icon_home, R.color.colorBackroundWhite);

        AHBottomNavigationItem item5 = new AHBottomNavigationItem("Contact", R.drawable.icon_settings, R.color.colorBackroundWhite);

// Add items
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);
        bottomNavigation.addItem(item4);
        bottomNavigation.addItem(item5);
        bottomNavigation.setBehaviorTranslationEnabled(false);
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
// Set background color
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));
// Set listeners
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                // Do something cool here...
                Toast.makeText(Favourite.this, "you clicked at"+position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle("e-Prabhu(A Payment Gateway)");
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle("e-Prabhu(A Payment Gateway)");
                    isShow = false;
                }
            }
        });
    }
}
