package com.example.framgia.retrofitsample.net;

import com.example.framgia.retrofitsample.net.data_model.WeatherRespone;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by framgia on 8/5/16.
 */
public abstract class API {

    private static final APIServices client = new Retrofit.Builder()
            .baseUrl(APIConst.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIServices.class);


    public static void getWeather(String latlng,
                                  Callback<WeatherRespone> callback) {
        client.getWeather(latlng)
                .enqueue(callback);
    }
}
