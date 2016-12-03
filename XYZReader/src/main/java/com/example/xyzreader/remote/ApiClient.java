package com.example.xyzreader.remote;

import com.example.xyzreader.entities.Article;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Javier Godino on 27/11/2016.
 * Email: jgodort.software@gmail.com
 */

public interface ApiClient {

    @GET("u/231329/xyzreader_data/data.json")
    Call<List<Article>> getArticles();
}
