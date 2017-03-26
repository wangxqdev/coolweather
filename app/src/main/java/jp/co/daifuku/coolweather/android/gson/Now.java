package jp.co.daifuku.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public String temperature;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}