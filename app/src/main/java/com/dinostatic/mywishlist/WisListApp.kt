package com.dinostatic.mywishlist

import android.app.Application

class WisListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}