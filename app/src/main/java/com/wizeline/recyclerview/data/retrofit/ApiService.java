package com.wizeline.recyclerview.data.retrofit;

import com.wizeline.recyclerview.data.entities.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiService {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
