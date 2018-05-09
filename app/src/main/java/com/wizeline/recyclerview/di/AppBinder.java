package com.wizeline.recyclerview.di;

import com.wizeline.recyclerview.ui.main.MainActivity;
import com.wizeline.recyclerview.ui.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AppBinder {
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity bindMainActivity();
}
