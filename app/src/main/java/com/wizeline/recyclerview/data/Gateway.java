package com.wizeline.recyclerview.data;

import com.wizeline.recyclerview.data.entities.Post;
import com.wizeline.recyclerview.data.retrofit.ApiService;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Gateway {

    private ApiService apiService;

    public Gateway(ApiService apiService) {
        this.apiService = apiService;
    }

    public Observable<List<Post>> getPosts() {
        return apiService.getPosts().subscribeOn(Schedulers.single());
    }
}
