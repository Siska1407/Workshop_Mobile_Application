package com.example.mylaundry.API;

import com.example.mylaundry.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {

    @GET("retrieve.php")
    Call<ResponseModel> ardRetrieveData();

}
