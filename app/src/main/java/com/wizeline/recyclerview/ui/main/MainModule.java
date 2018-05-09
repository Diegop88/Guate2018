package com.wizeline.recyclerview.ui.main;

import com.wizeline.recyclerview.data.Gateway;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    MainViewModel.Factory providesViewModelFactory(Gateway gateway) {
        return new MainViewModel.Factory(gateway);
    }
}
