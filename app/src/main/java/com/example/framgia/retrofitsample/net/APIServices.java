package com.example.framgia.retrofitsample.net;


import com.example.framgia.retrofitsample.net.data_model.WeatherRespone;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;


/**
 * Created by framgia on 8/5/16.
 */
public interface APIServices {

    @POST(APIConst.Path.WEATHER)
    Call<WeatherRespone> getWeather(@Path(APIConst.Param.PARAM_LAT_LNG) String latlng);

}
