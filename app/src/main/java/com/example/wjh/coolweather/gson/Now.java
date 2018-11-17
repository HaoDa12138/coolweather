package com.example.wjh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WJH on 2018/11/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
