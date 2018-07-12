package com.example.manjil.e_prabhu.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.manjil.e_prabhu.Activity.MobileTopActivity;
import com.example.manjil.e_prabhu.Activity.Transfer;
import com.example.manjil.e_prabhu.R;

/**
 * Created by Paru on 3/13/2018.
 */

public class MobileTop extends Fragment {

    public MobileTop() {
    }
    LinearLayout mntc,mncell,mutl,mntc1;
    ImageView img1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.acitiviyt_layoutdesign, container, false);

       img1=(ImageView)view.findViewById(R.id.imgmobile1);
       img1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mintent = new Intent(v.getContext(), Transfer.class);
               v.getContext().startActivity(mintent);
           }
       });

        return view;

    }
}
