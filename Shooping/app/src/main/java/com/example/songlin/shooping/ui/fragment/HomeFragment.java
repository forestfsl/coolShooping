package com.example.songlin.shooping.ui.fragment;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.songlin.shooping.R;
import com.example.songlin.shooping.base.BaseFragment;
import com.example.songlin.shooping.entity.HomeGridInfo;
import com.example.songlin.shooping.network.HttpListener;
import com.example.songlin.shooping.ui.widget.Indicator;
import com.yolanda.nohttp.rest.Response;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by songlin on 26/01/2018.
 */

public class HomeFragment extends BaseFragment implements HttpListener<String> {

    private static final int GOOD_REQUEST = 0x01;
    private static final int FILE_REQUEST = 0x02;
    private static final int SCAN_OR_REQUEST = 103;
    public static final String GOODS_SEVEN_REFUND = "sevenRefund";
    public static final String GOODS_TIME_REFUND =  "timeRefund";
    public static final String GOODS_BOUGHT = "bought";
    private static final int CITY_REQUEST_CODE = 4000;

    private int[] imgRes = new int[]{R.drawable.banner01,R.drawable.banner02,R.drawable.banner03};
    private Handler mHandler = new Handler();
    //广告轮播
    private ViewPager bannerPager;
    private Indicator bannerIndicator;
    private View mView;

    private List<HomeGridInfo> pageOneData = new ArrayList<>();
    private List<HomeGridInfo> pageTwoData = new ArrayList<>();


    @Override
    public void onSucceed(int what, Response<String> response) {

    }

    @Override
    public void onFailed(int what, Response<String> response) {

    }
}
