package com.example.manjil.e_prabhu.Activity;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.manjil.e_prabhu.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import devlight.io.library.ntb.NavigationTabBar;
import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;

public class NewNavigation_appbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_navigation_appbar);
        init();
//        BannerSlider bannerSlider = (BannerSlider) findViewById(R.id.banner_slider1);
//        List<Banner> banners=new ArrayList<>();
//////        //add banner using image url
//////        //banners.add(new RemoteBanner("Put banner image url here ..."));
//////        //add banner using resource drawable
//        banners.add(new DrawableBanner(R.drawable.utl1));
//        banners.add(new DrawableBanner(R.drawable.ncell1));
//        banners.add(new DrawableBanner(R.drawable.ntcimages));
//        bannerSlider.setBanners(banners);

    }
    public void init(){
        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb_horizontal);
        //navigationTabBar.setBackgroundColor(Color.parseColor("#FFCC503D"));
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.icon_home),
                        Color.parseColor("#FFEC6E68"))
                        .title("Home")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.icon_settings),
                        Color.parseColor("#FFEC6E68"))
                        .title("Setting")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_contactus_white),
                        Color.parseColor("#FFEC6E68"))
                        .title("Contact Us")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_termsandcondition_white),
                        Color.parseColor("#FFEC6E68"))
                        .title("Privacy")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.icon_home),
                        Color.parseColor("#FFEC6E68"))
                        .title("Profile")
                        .build()
        );

        navigationTabBar.setModels(models);
        //IMPORTANT: ENABLE SCROLL BEHAVIOUR IN COORDINATOR LAYOUT
        navigationTabBar.setBehaviorEnabled(true);
        navigationTabBar.setOnTabBarSelectedIndexListener(new NavigationTabBar.OnTabBarSelectedIndexListener() {
            @Override
            public void onStartTabSelected(final NavigationTabBar.Model model, final int index) {
                model.getBadgeTitle();
            }

            @Override
            public void onEndTabSelected(final NavigationTabBar.Model model, final int index) {
                model.hideBadge();
            }
        });
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.parent);
//        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View v) {
//                for (int i = 0; i < navigationTabBar.getModels().size(); i++) {
//                    final NavigationTabBar.Model model = navigationTabBar.getModels().get(i);
//                    navigationTabBar.postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            final String title = String.valueOf(new Random().nextInt(15));
//                            if (!model.isBadgeShowed()) {
//                                model.setBadgeTitle(title);
//                                model.showBadge();
//                            } else model.updateBadgeTitle(title);
//                        }
//                    }, i * 100);
//                }
//
//                coordinatorLayout.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        final Snackbar snackbar = Snackbar.make(navigationTabBar, "Coordinator NTB", Snackbar.LENGTH_SHORT);
//                        snackbar.getView().setBackgroundColor(Color.parseColor("#9b92b3"));
//                        ((TextView) snackbar.getView().findViewById(R.id.snackbar_text))
//                                .setTextColor(Color.parseColor("#423752"));
//                        snackbar.show();
//                    }
//                }, 1000);
//            }
//        });

        final CollapsingToolbarLayout collapsingToolbarLayout =
                (CollapsingToolbarLayout) findViewById(R.id.toolbar);
        //collapsingToolbarLayout.setExpandedTitleColor(Color.parseColor("#FFCC503D"));
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.parseColor("#f0f2ea"));

    }
}
