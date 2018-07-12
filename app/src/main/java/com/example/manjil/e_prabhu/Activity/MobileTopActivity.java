package com.example.manjil.e_prabhu.Activity;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.manjil.e_prabhu.Fragment.MobileTop;
import com.example.manjil.e_prabhu.R;
import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paru on 3/13/2018.
 */

public class MobileTopActivity extends AppCompatActivity{


    public MobileTopActivity() {
    }

    private ResideMenu resideMenu;
    private Context mcontext;
    private ResideMenuItem itemhome;
    TextView mview;
    private ResideMenuItem itemsetting;
    private ResideMenuItem itemcustomer;
    private ResideMenuItem itemabout, itemprivacy,itemcontact,itemimage;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Button mbtn1, mbtn2,tolbar_button;
    View v1, v2, v3, v5, v4, v6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobiletop);


        mcontext = this;
        setupmenu();
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        mbtn1 = (Button) findViewById(R.id.btn_right);
        mbtn2 = (Button) findViewById(R.id.btn_left);
        tolbar_button =(Button) findViewById(R.id.title_bar_left_menu);


        v1 = (View) findViewById(R.id.view1);
        v2 = (View) findViewById(R.id.view2);
        v3 = (View) findViewById(R.id.view3);
        v4 = (View) findViewById(R.id.view4);
        v5 = (View) findViewById(R.id.view5);
        v6 = (View) findViewById(R.id.view6);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        //tabLayout.setScaleY(-1);
//        tabLayout.setRotationX(180);
//
//        tabListed = ((LinearLayout)tabLayout.getChildAt(0));
//        for(int position = 0;position<tabListed.getChildCount();position++) {
//            LinearLayout item=((LinearLayout) tabListed.getChildAt(position));
//            item.setBackground(getDrawable(R.drawable.square_tab));
//            item.setRotationX(180);
//        }
        //tabLayout.setRotationX(180);
        View root = tabLayout.getChildAt(0);
        if (root instanceof LinearLayout) {
            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
            GradientDrawable drawable = new GradientDrawable();
            drawable.setColor(getResources().getColor(R.color.backgrounds));
            drawable.setSize(2, 2);
            ((LinearLayout) root).setDividerPadding(10);
            ((LinearLayout) root).setDividerDrawable(drawable);
        }
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        mview.setText("Mobile Topup");
                        v1.setBackgroundResource(R.drawable.selector_tab_red);
                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
                    case 1:
                        mview.setText("Recharge Pin");
                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
                        v2.setBackgroundResource(R.drawable.selector_tab_red);
                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
                    case 2:
                        mview.setText("Bill Payment");
                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
                        v3.setBackgroundResource(R.drawable.selector_tab_red);
                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
                    case 3:
                        mview.setText("Money Transfer");
                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
                        v4.setBackgroundResource(R.drawable.selector_tab_red);
                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
                    case 4:
                        mview.setText("Travel Ticket");
                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
                        v5.setBackgroundResource(R.drawable.selector_tab_red);
                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
                    case 5:
                        mview.setText("Insurance Premium");
                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
                        v6.setBackgroundResource(R.drawable.selector_tab_red);

                        break;
                    default:


                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupTabIcons();
//        if( savedInstanceState == null )
//            changefragment(new Home());
        mview = (TextView) findViewById(R.id.recharge);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mview.getText().toString().equals("Mobile Topup")) {
                    mview.setText("Recharge Pin");
                    viewPager.setCurrentItem(1);
                } else if (mview.getText().toString().equals("Recharge Pin")) {
                    mview.setText("Bill Payment");
                    viewPager.setCurrentItem(2);
                } else if (mview.getText().toString().equals("Bill Payment")) {
                    mview.setText("Money Transfer");
                    viewPager.setCurrentItem(3);

                } else if (mview.getText().toString().equals("Money Transfer")) {
                    mview.setText("Travel Ticket");
                    viewPager.setCurrentItem(4);
                } else if (mview.getText().toString().equals("Travel Ticket")) {
                    mview.setText("Insurance Premium");
                    viewPager.setCurrentItem(5);

                }
            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mview.getText().toString().equals("Insurance Premium")) {
                    mview.setText("Travel Ticket");
                    viewPager.setCurrentItem(4);
                } else if (mview.getText().toString().equals("Travel Ticket")) {
                    mview.setText("Money Transfer");
                    viewPager.setCurrentItem(3);
                } else if (mview.getText().toString().equals("Money Transfer")) {
                    mview.setText("Bill Payment");
                    viewPager.setCurrentItem(2);
                } else if (mview.getText().toString().equals("Bill Payment")) {
                    mview.setText("Recharge Pin");
                    viewPager.setCurrentItem(1);

                } else if (mview.getText().toString().equals("Recharge Pin")) {
                    mview.setText("Mobile Topup");
                    viewPager.setCurrentItem(0);

                }
            }

        });
    }

    //all the items are of tab fragment
    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Mobile Topup");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.bill_payment, 0, 0);
        tabLayout.getTabAt(0).setIcon(R.drawable.bill_payment);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Recharge Pin");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.travel_tickets, 0, 0);
        tabLayout.getTabAt(1).setIcon(R.drawable.travel_tickets);
        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("Bill Payment");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.mobile_recharge, 0, 0);
        tabLayout.getTabAt(2).setIcon(R.drawable.mobile_recharge);
        TextView tabfour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabfour.setText("Money Transfer");
        tabfour.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.recharge_card, 0, 0);
        tabLayout.getTabAt(3).setIcon(R.drawable.recharge_card);

        TextView tabfive = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabfive.setText("Travel Ticket");
        tabfive.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.insurance, 0, 0);
        tabLayout.getTabAt(4).setIcon(R.drawable.insurance);

        TextView tabsix = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabsix.setText("Insurance Premium");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.money_transfer, 0, 0);
        tabLayout.getTabAt(5).setIcon(R.drawable.money_transfer);
        //tabLayout.setScrollIndicators(View.SCROLL_INDICATOR_TOP);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new MobileTop(), "Mobile Topup");
        adapter.addFrag(new MobileTop(), "Recharge Pin");
        adapter.addFrag(new MobileTop(), "Bill Payment");
        adapter.addFrag(new MobileTop(), "Recharge");
        adapter.addFrag(new MobileTop(), "Insurance");
        adapter.addFrag(new MobileTop(), "Money Transfer");
        viewPager.setAdapter(adapter);

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {//return mFragmentTitleList.get(position);
            return null;
//        }
        }


    }

    // all the below items are of reside menu
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }
//    //setting the reside menu
    public void setupmenu() {
        resideMenu = new ResideMenu(this);
        resideMenu.setBackground(R.drawable.one);
        resideMenu.attachToActivity(this);
        // resideMenu.setMenuListener(menulisteenr);
        //valid scale factor is between 0.0f and 1.0f. leftmenu'width is 150dip.
        resideMenu.setScaleValue(0.6f);
        resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_LEFT);
        resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);
        //assing residemenu
        itemimage = new ResideMenuItem(this, R.drawable.four, "");
        itemhome = new ResideMenuItem(this, R.drawable.ic_home_white_24dp, "Home");
        itemsetting = new ResideMenuItem(this, R.drawable.ic_privacy_white, "Privacy Policy");
        itemcustomer = new ResideMenuItem(this, R.drawable.ic_termsandcondition_white, "Terms & Condition");
        itemabout = new ResideMenuItem(this, R.drawable.ic_contactus_white, "Contact us");
//        itemprivacy = new ResideMenuItem(this, R.drawable.icon_home, "Privacy Policy");
//        itemcontact = new ResideMenuItem(this, R.drawable.icon_home, "Contact Us");
//

        // You can disable a direction by setting ->
        // resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);
//        itemhome.setOnClickListener(this);
//        itemsetting.setOnClickListener(this);
//        itemcustomer.setOnClickListener(this);
//        itemabout.setOnClickListener(this);
//        itemprivacy.setOnClickListener(this);
//        itemcontact.setOnClickListener(this);
        //
        resideMenu.addMenuItem(itemhome, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemsetting, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemcustomer, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemabout, ResideMenu.DIRECTION_LEFT);
//        resideMenu.addMenuItem(itemprivacy, ResideMenu.DIRECTION_LEFT);
//        resideMenu.addMenuItem(itemcontact, ResideMenu.DIRECTION_LEFT);
//        //clicking toolbar titlebar
        findViewById(R.id.title_bar_left_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
            }
        });
//        findViewById(R.id.title_bar_left_menu).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
//            }
//        });

    }

//    //changing the fragment
////    public void changefragment(Fragment mfragment){
////        resideMenu.clearIgnoredViewList();
////        getSupportFragmentManager()
////                .beginTransaction()
////                .replace(R.id.main_fragment,mfragment,"fragment")
////                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
////                .commit();
////
////    }
//    //getting residemeny as it is private data
//    public ResideMenu getResideMenu() {
//        return resideMenu;
//    }
//
//    //    private ResideMenu.OnMenuListener menulisteenr = new ResideMenu.OnMenuListener() {
////        @Override
////        public void openMenu() {
////            Toast.makeText(mcontext, "Opened", Toast.LENGTH_SHORT).show();
////        }
////
////        @Override
////        public void closeMenu() {
////            Toast.makeText(mcontext, "Closed Menu", Toast.LENGTH_SHORT).show();
////
////        }
////    };
//    @Override
//    public void onClick(View view) {
//        if (view == itemhome) {
//            //changefragment(new Home());
//        } else if (view == itemsetting) {
//            //changefragment( new Setting());
//
//        } else if (view == itemcustomer) {
//            //changefragment( new Profile());
//
//        }
//        else if (view == itemabout) {
//            //changefragment( new Profile());
//
//        }
//        else if (view == itemprivacy) {
//            //changefragment( new Profile());
//
//        }
//        else if (view == itemcontact) {
//            //changefragment( new Profile());
//
//        }
//        else {
//            // changefragment(new Calendar());
//
//        }
//    }



}



