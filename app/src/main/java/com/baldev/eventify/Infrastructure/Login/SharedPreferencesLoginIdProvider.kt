package com.baldev.eventify.Infrastructure.Login

import android.content.Context
import android.content.Context.MODE_PRIVATE
import com.baldev.eventify.Domain.Login.LoginIdProvider

class SharedPreferencesLoginIdProvider(private val context: Context) : LoginIdProvider {
    override fun find(): String? {
        val prefs = context.getSharedPreferences("LOGIN", MODE_PRIVATE)
        return prefs.getString("ID", null)
    }
}