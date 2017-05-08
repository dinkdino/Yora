package com.example.rush.yora.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.rush.yora.core.YoraApplication

open class BaseActivity : AppCompatActivity() {
    lateinit var application: YoraApplication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        application = getApplication() as YoraApplication
    }
}
