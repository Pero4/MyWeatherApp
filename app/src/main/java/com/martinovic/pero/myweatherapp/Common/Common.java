package com.martinovic.pero.myweatherapp.Common;

import android.support.annotation.NonNull;
import android.support.annotation.StringDef;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Pero on 31.7.2017..
 */

public class Common {
    public static String API_KEY = "5a46a41a60f3a6d24193e0632edbbed2";
    public static String API_URL = "http://api.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String apiReq (String lat, String lng) {
        StringBuilder sb = new StringBuilder(API_URL);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat,lng,API_KEY));
        return sb.toString();
    }

    public static String unixToDate (double unixTimeStamp){
        DateFormat dF = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dF.format(date);
    }

    public static String getImage (String icon) {
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    public static String getDate () {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy. HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
