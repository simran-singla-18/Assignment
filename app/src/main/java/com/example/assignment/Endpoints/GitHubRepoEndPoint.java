package com.example.assignment.Endpoints;

import com.example.assignment.Model.GitHubRepo;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubRepoEndPoint {
    @GET("/users/{user}/repos")
    Call<ArrayList<GitHubRepo>> getRepo(@Path("user") String name);
}
