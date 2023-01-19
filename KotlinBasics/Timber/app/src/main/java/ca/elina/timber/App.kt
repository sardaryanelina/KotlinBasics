package ca.elina.timber

import android.app.Application
import timber.log.Timber

// Created by Elina Sardaryan on April 28, 2022

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // do utility setup -> add name in manifest
        // setup Timber
        Timber.plant(Timber.DebugTree())
    }
}