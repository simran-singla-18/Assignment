package com.example.assignment.Endpoints;

import com.example.assignment.Model.GitHubUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubUserEndPoints {
    @GET("/users/{user}")
    Call<GitHubUser>getUser(@Path("user") String user);

}
