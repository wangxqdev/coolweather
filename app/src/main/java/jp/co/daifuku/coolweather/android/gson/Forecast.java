package jp.co.daifuku.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("cond")
    public More more;

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More {

        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {

        public String max;

        public String min;
    }
}