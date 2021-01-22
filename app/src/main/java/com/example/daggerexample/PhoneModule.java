package com.example.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PhoneModule {

    @Provides
    public Color providesColor(){
        return new Color();
    }

    @Provides
    @Singleton
    public Dimension providesDimension(){
        return new Dimension();
    }

}
