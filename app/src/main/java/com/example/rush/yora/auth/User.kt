package com.example.rush.yora.auth

data class User(val id: Int = 0,
                val userName: String = "",
                val displayName: String = "",
                val avatarUrl: String = "",
                val email: String = "",
                val hasPassword: Boolean = false,
                val isLoggedIn: Boolean = false)

