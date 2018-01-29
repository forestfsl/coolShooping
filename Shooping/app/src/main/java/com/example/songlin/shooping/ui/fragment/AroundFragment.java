package com.example.songlin.shooping.ui.fragment;

import android.view.View;

import com.example.songlin.shooping.base.BaseFragment;
import com.example.songlin.shooping.network.HttpListener;
import com.yolanda.nohttp.rest.Response;

/**
 * Created by songlin on 29/01/2018.
 */

public class AroundFragment extends BaseFragment implements HttpListener<String> {
    @Override
    public void onSucceed(int what, Response<String> response) {

    }

    @Override
    public void onFailed(int what, Response<String> response) {

    }
}
