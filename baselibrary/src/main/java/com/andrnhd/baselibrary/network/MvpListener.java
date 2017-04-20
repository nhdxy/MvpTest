package com.andrnhd.baselibrary.network;

/**
 * Created by nhd on 2017/4/20.
 */

public interface MvpListener<T> {
    void onSuccess(T data);

    void onFailure(String error);
}
