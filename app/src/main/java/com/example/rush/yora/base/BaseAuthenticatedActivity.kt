package com.example.rush.yora.base

import android.content.Intent
import android.os.Bundle
import com.example.rush.yora.auth.login.LoginActivity

abstract class BaseAuthenticatedActivity : BaseActivity() {

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!application.auth.user.isLoggedIn) {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        onYoraCreated(savedInstanceState)
    }

    protected abstract fun onYoraCreated(savedInstanceState: Bundle?)
}
