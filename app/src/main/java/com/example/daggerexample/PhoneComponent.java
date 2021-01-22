package com.example.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = PhoneModule.class)
@Singleton
public interface PhoneComponent {
    Phone buildPhone();

}
