package com.baldev.eventify.Domain.Login

import com.baldev.eventify.Domain.User.User
import com.baldev.eventify.Domain.User.Users

class LoginService(private val users: Users, private val loginIdProvider: LoginIdProvider) {
    operator fun invoke() : User? {
        val loginId = loginIdProvider.find()
        if(loginId != null) {
            return users.find(loginId)
        } else {
            throw RuntimeException("User for login not found")
        }
    }
}