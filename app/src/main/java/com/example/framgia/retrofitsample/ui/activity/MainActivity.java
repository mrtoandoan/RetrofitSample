package com.example.framgia.retrofitsample.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.framgia.retrofitsample.R;
import com.example.framgia.retrofitsample.net.API;
import com.example.framgia.retrofitsample.net.data_model.WeatherRespone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWeather(null);
    }

    private void getWeather(String latlng){
        API.getWeather(latlng, new Callback<WeatherRespone>() {
            @Override
            public void onResponse(Call<WeatherRespone> call, Response<WeatherRespone> response) {
                //TODO: update weather to UI
            }

            @Override
            public void onFailure(Call<WeatherRespone> call, Throwable t) {
                //TODO: show message. No internet connection
            }
        });
    }
}
