package com.baldev.eventify.Infrastructure

import com.baldev.eventify.Domain.Login.LoginIdProvider

class FakeLoginIdProvider(private val initialId: String? = null) : LoginIdProvider{
    override fun find(): String? = initialId
}