package com.example.rush.yora.home

import android.os.Bundle
import com.example.rush.yora.base.BaseAuthenticatedActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseAuthenticatedActivity() {

    override fun onYoraCreated(savedInstanceState: Bundle?) {
        tv_title.text = "Hello"
    }


}
