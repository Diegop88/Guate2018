package com.wizeline.recyclerview.ui.main;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.wizeline.recyclerview.data.Gateway;
import com.wizeline.recyclerview.data.entities.Post;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class MainViewModel extends ViewModel {

    private Gateway gateway;

    public MainViewModel(Gateway gateway) {
        this.gateway = gateway;
    }

    public Observable<List<Post>> getPosts() {
        return gateway.getPosts().observeOn(AndroidSchedulers.mainThread());
    }

    public static class Factory implements ViewModelProvider.Factory {

        private Gateway gateway;

        public Factory(Gateway gateway) {
            this.gateway = gateway;
        }

        @NonNull
        @Override
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
            return (T) new MainViewModel(gateway);
        }
    }
}
