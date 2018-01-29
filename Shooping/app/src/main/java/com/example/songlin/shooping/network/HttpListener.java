package com.example.songlin.shooping.network;

import com.yolanda.nohttp.rest.Response;

/**
 * Created by songlin on 26/01/2018.
 */

public interface HttpListener<T> {
    public void onSucceed(int what,Response<T> response);
    public void onFailed(int what,Response<T>response);
}
