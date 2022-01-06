package com.erengulbahar.retrofitjava.service;

import com.erengulbahar.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI
{
    //GET, POST, UPDATE, DELETE
    //URL BASE -> www.website.com
    //GET -> price?key=xxx
    //https://api.nomics.com/v1/prices?key=ae600295546371b1a178b55d8b6b4fe9e9dcd902

    @GET("prices?key=ae600295546371b1a178b55d8b6b4fe9e9dcd902")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();
}