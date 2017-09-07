package com.coolweather.android.gson;

/**
 * Created by shengjie.shi on 2017-09-07.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
