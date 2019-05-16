package com.example.admin.data.Homepage.rest;

import com.example.admin.data.Homepage.LoginData;
import com.example.admin.data.Homepage.SurveyData;
import com.example.admin.data.examEamcet.model.CollegeBranchDetails;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterfacePut {
    //feedback
    @POST("collections/posts/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
    @Headers({"Content-Type: application/json"})
    Call<ResponseBody> feedback(@Body String str);
  //register
    @POST("collections/users/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
    @Headers({"Content-Type: application/json"})
    Call<ResponseBody> Registration(@Body String str);
  @GET("collections/users/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
  Call<List<LoginData>> check(@Query("q") String q);

    //login
    @GET("collections/users/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
    Call<List<LoginData>> Login(@Query("q") String q);


    //forget Password
    @GET("sms.php")
    Call<String> getOTP_Login(@Query("username") String un,@Query("password") String pass,@Query("from") String from,@Query("to")String to,@Query("msg") String msg,@Query("type") String type);

    @GET("collections/users/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
    Call<List<LoginData>> getUser(@Query("q") String q);

    //survey
    @POST("collections/survey/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
    @Headers({"Content-Type: application/json"})
    Call<ResponseBody> Survey(@Body String str);
    @GET("collections/survey/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
    Call<List<SurveyData>> getSurveyDetails(@Query("q") String q);


    //delete from database
    @DELETE("collections/survey/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
    Call<List<Void>> getDeleteItems(@Query("q") String q);
}
