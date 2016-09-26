package com.abelsu7.coolweather.util;

/**
 * Created by AbelSu on 2016/9/26.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
