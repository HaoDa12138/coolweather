package com.example.wjh.coolweather.gson;

/**
 * Created by WJH on 2018/11/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
