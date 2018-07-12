package com.example.manjil.e_prabhu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;


import com.example.manjil.e_prabhu.Fragment.AboutActivity;
import com.example.manjil.e_prabhu.Fragment.ContactActviity;
import com.example.manjil.e_prabhu.Fragment.CustomerCareActivity;
import com.example.manjil.e_prabhu.Fragment.HomeActivity;
import com.example.manjil.e_prabhu.Fragment.PrivaxyPolicyActivity;
import com.example.manjil.e_prabhu.Fragment.SettingActivity;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity{

//    private ResideMenu resideMenu;
//    private Context mcontext;
//    private ResideMenuItem itemhome;
    TextView mview;
//    private ResideMenuItem itemsetting;
//    private ResideMenuItem itemprofile;
//    private ResideMenuItem itemcalendar, itemimage;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Button mbtn1, mbtn2;
    View v1, v2, v3, v5, v4, v6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mbtn1 = (Button) findViewById(R.id.btn_right);
//        mbtn2 = (Button) findViewById(R.id.btn_left);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
//        mbtn1 = (Button) findViewById(R.id.btn_right);
//        mbtn2 = (Button) findViewById(R.id.btn_left);
        v1 = (View) findViewById(R.id.view1);
        v2 = (View) findViewById(R.id.view2);
        v3 = (View) findViewById(R.id.view3);
        v4 = (View) findViewById(R.id.view4);
//        v5 = (View) findViewById(R.id.view5);
//        v6 = (View) findViewById(R.id.view6);

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
                       // mview.setText("Home");
                        v1.setBackgroundResource(R.drawable.selector_tab_red);
                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
                    case 1:
                      //  mview.setText("Setting");
                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
                        v2.setBackgroundResource(R.drawable.selector_tab_red);
                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
                    case 2:
                       // mview.setText("Customer Care");
                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
                        v3.setBackgroundResource(R.drawable.selector_tab_red);
                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
                    case 3:
                       // mview.setText("About");

                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
                        v4.setBackgroundResource(R.drawable.selector_tab_red);
//                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v6.setBackgroundResource(R.drawable.selectortab_red_original);

                        break;
//                    case 4:
//                        mview.setText("Privacy Policy");
//                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v5.setBackgroundResource(R.drawable.selector_tab_red);
//                        v6.setBackgroundResource(R.drawable.selectortab_red_original);
//
//                        break;
//                    case 5:
//                        mview.setText("Contact Us");
//                        v1.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v2.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v3.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v4.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v5.setBackgroundResource(R.drawable.selectortab_red_original);
//                        v6.setBackgroundResource(R.drawable.selector_tab_red);
//
//                        break;
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
//        mview = (TextView) findViewById(R.id.recharge);
//        mbtn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mview.getText().toString().equals("Home")) {
//                    mview.setText("Setting");
//                    viewPager.setCurrentItem(1);
//                } else if (mview.getText().toString().equals("Setting")) {
//                    mview.setText("Customer Care");
//                    viewPager.setCurrentItem(2);
//                } else if (mview.getText().toString().equals("Customer Care")) {
//                    mview.setText("About");
//                    viewPager.setCurrentItem(3);
//
//                } else if (mview.getText().toString().equals("About")) {
//                    mview.setText("Privacy Policy");
//                    viewPager.setCurrentItem(4);
//                } else if (mview.getText().toString().equals("Privacy Policy")) {
//                    mview.setText("Contact Us");
//                    viewPager.setCurrentItem(5);
//
//                }
//            }
//        });
//        mbtn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mview.getText().toString().equals("Contact Us")) {
//                    mview.setText("Privacy Policy");
//                    viewPager.setCurrentItem(4);
//                } else if (mview.getText().toString().equals("Privacy Policy")) {
//                    mview.setText("About");
//                    viewPager.setCurrentItem(3);
//                } else if (mview.getText().toString().equals("About")) {
//                    mview.setText("Customer Care");
//                    viewPager.setCurrentItem(2);
//                } else if (mview.getText().toString().equals("Customer Care")) {
//                    mview.setText("Setting");
//                    viewPager.setCurrentItem(1);
//
//                } else if (mview.getText().toString().equals("Setting")) {
//                    mview.setText("Home");
//                    viewPager.setCurrentItem(0);
//
//                }
//            }
//
//        });
    }

    //all the items are of tab fragment
    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Home");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home_black_24dp, 0, 0);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_black_24dp);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Privacy Policy");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_privacy, 0, 0);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_privacy);
        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("Terms & Conditions");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_termsandcondition, 0, 0);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_termsandcondition);
        TextView tabfour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabfour.setText("Contact Us");
        tabfour.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_contacts_black_24dp, 0, 0);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_contacts_black_24dp);

//        TextView tabfive = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
//        tabfive.setText("Privacy Policy");
//        tabfive.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home_black_24dp, 0, 0);
//        tabLayout.getTabAt(4).setIcon(R.drawable.ic_home_black_24dp);
//
//        TextView tabsix = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
//        tabsix.setText("Contact Us");
//        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home_black_24dp, 0, 0);
//        tabLayout.getTabAt(5).setIcon(R.drawable.ic_home_black_24dp);
        //tabLayout.setScrollIndicators(View.SCROLL_INDICATOR_TOP);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new HomeActivity(), "Home");
        adapter.addFrag(new SettingActivity(), "Privacy Policy");
        adapter.addFrag(new CustomerCareActivity(), "Terms & Conditons");
        adapter.addFrag(new AboutActivity(), "Contact Us");
//        adapter.addFrag(new PrivaxyPolicyActivity(), "Privacy Policy");
//        adapter.addFrag(new ContactActviity(), "Contact Us");
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



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_dashboard,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_hamrobarema:
                Intent minten = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(minten);
                break;
            case R.id.menudashbaord_rate:
                try {
                    Uri marketUri = Uri.parse("https://play.google.com/store/apps/details?id=com.creationsoftnepal.apps.eprabhu&hl=en");
                    Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
                    startActivity(marketIntent);
                }catch(ActivityNotFoundException e) {
                    Uri marketUri = Uri.parse("https://play.google.com/store/apps/details?id=com.creationsoftnepal.apps.eprabhu&hl=en");
                    Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
                    startActivity(marketIntent);
                }
                break;
            case R.id.menu_share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBodyText = "Check it out. This is the awesome app https://play.google.com/store/apps/details?id="+getPackageName();
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"About Duhabi Gaupalika app");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
                startActivity(Intent.createChooser(sharingIntent, "Sharing Option"));
                break;
            case R.id.menu_exit:
                finish();
                //Intent minten = new Intent(MainActivity.this, Main2Activity.class);
                // startActivity(minten);
                break;
            case R.id.menudashbaord_update:
                try {
                    Uri marketUri = Uri.parse("https://play.google.com/store/apps/details?id=com.creationsoftnepal.apps.eprabhu&hl=en");
                    Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
                    startActivity(marketIntent);
                }catch(ActivityNotFoundException e) {
                    Uri marketUri = Uri.parse("https://play.google.com/store/apps/details?id=com.creationsoftnepal.apps.eprabhu&hl=en");
                    Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
                    startActivity(marketIntent);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
//        builder.setNeutralButton("Rate Us?", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                try {
//                    Uri marketUri = Uri.parse("market://details?id="+getPackageName());
//                    Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
//                    startActivity(marketIntent);
//                }catch(ActivityNotFoundException e) {
//                    Uri marketUri = Uri.parse("https://play.google.com/store/apps/details?id="+getPackageName());
//                    Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
//                    startActivity(marketIntent);
//                }
//            }
//        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                dialog.cancel();

            }
        });
      /*  builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });*/
        AlertDialog alert = builder.create();
        alert.show();
    }

}

