package com.dlc.singaltool;

/**
 * Created by Administrator on 2018\8\7 0007.
 */

public interface NetStateListener {
    /**
     *
     * @param signalType 0没有网络，1wifi连接，22G，33G，44G，5手机流量
     * @param wifiIntensity wifi信号强度，1-100
     * @param gprsIntensity gprs信号强度，单位dbm，负数越大，信号强度越强
     */
    void onNetState(int signalType, int wifiIntensity, int gprsIntensity);
}
