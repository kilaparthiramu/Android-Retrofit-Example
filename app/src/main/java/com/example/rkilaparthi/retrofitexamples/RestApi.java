package com.example.rkilaparthi.retrofitexamples;

import com.example.rkilaparthi.retrofitexamples.Pojo.MyPojo;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by rkilaparthi on 9/22/2016.
 */
public interface RestApi  {
    @GET("/contacts")
    Call<MyPojo> getReportData();

}
