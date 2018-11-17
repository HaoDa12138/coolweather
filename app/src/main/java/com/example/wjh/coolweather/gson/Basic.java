package com.example.wjh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WJH on 2018/11/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
