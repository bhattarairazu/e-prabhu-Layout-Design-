package com.example.manjil.e_prabhu.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.manjil.e_prabhu.Activity.MobileTopActivity;
import com.example.manjil.e_prabhu.R;
import com.skyfishjy.library.RippleBackground;

import org.w3c.dom.Text;

/**
 * Created by Paru on 3/13/2018.
 */

public class HomeActivity extends Fragment {

    public HomeActivity() {
    }

    ImageView imgmobile;
    TextView txtmobile;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_activity, container, false);
//        final RippleBackground rippleBackground=(RippleBackground) view.findViewById(R.id.content);
//        rippleView = (RippleView) view.findViewById(R.id.rippleView);
//
//        rippleView.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
//
//            @Override
//            public void onComplete(RippleView rippleView) {
//                Log.d("Sample", "Ripple completed");
//            }
//
//        });
//                 rippleView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //TODO: onRippleViewClick
//                Intent mintent = new Intent(v.getContext(), MobileTopActivity.class);
//                v.getContext().startActivity(mintent);
//            }
//        });
        //Mobile Topup
        imgmobile=(ImageView) view.findViewById(R.id.imgmobile);

        imgmobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                rippleBackground.startRippleAnimation();
                Intent mintent = new Intent(v.getContext(), MobileTopActivity.class);
                v.getContext().startActivity(mintent);
            }
        });
//
//        txtmobile=(TextView) view.findViewById(R.id.txtxmobile);
//        txtmobile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mintent = new Intent(v.getContext(), MobileTopActivity.class);
//                v.getContext().startActivity(mintent);
//            }
//        });


        return view;

    }
}

