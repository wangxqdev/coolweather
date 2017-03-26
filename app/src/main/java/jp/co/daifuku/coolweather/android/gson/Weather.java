package jp.co.daifuku.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public AQI aqi;

    public Basic basic;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public Now now;

    public String status;

    public Suggestion suggestion;
}