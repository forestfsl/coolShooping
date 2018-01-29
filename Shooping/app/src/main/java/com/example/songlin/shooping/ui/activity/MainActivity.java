package com.example.songlin.shooping.ui.activity;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.songlin.shooping.R;
import com.example.songlin.shooping.base.BaseActivity;
import com.example.songlin.shooping.ui.fragment.AroundFragment;
import com.example.songlin.shooping.ui.fragment.HomeFragment;
import com.example.songlin.shooping.ui.fragment.MeFragment;
import com.example.songlin.shooping.ui.fragment.MoreFragment;

public class MainActivity extends BaseActivity {
    private FragmentTabHost tabHost;
    private  Class [] fragments = new  Class[]{
            HomeFragment.class, AroundFragment.class, MeFragment.class, MoreFragment.class};
    private String[] resTitles = new String[]{
            "首页","周边",
            "我的","更多"};
    private int [] icons = new int[] {
            R.drawable.tab_home_selector,R.drawable.tab_around_selector,R.drawable.tab_me_selector,R.drawable.tab_more_selector
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void initViews() {
        tabHost = (FragmentTabHost)findViewById(R.id.main_tabHost);
        tabHost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);
        for (int i = 0; i < fragments.length;i++) {
            View view = getLayoutInflater().inflate(R.layout.item_tab,null);
            ImageView tabIcon = (ImageView) view.findViewById(R.id.item_tab_iv);
            TextView tabTitle = (TextView) view.findViewById(R.id.item_tab_tv);
            tabIcon.setImageResource(icons[i]);
            tabTitle.setText(resTitles[i]);
            tabHost.addTab(tabHost.newTabSpec("" + i).setIndicator(view),fragments[i],null);
        }
    }
}

