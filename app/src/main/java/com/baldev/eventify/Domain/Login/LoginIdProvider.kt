package com.baldev.eventify.Domain.Login

interface LoginIdProvider {
    fun find(): String?
}