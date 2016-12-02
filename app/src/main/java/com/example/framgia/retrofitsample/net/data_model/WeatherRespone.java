package com.example.framgia.retrofitsample.net.data_model;

import com.example.framgia.retrofitsample.model.Weather;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by framgia on 02/12/2016.
 */

public class WeatherRespone {
    @SerializedName("weathers")
    private List<Weather> mWeathers;

    public void setWeathers(List<Weather> weathers) {
        mWeathers = weathers;
    }
}
