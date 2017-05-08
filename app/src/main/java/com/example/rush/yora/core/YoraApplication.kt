package com.example.rush.yora.core

import android.app.Application
import com.example.rush.yora.auth.Auth

class YoraApplication: Application() {
    lateinit var auth: Auth

    override fun onCreate() {
        super.onCreate()

        auth = Auth(this)
    }
}