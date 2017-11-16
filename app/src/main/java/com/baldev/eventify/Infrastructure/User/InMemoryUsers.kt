package com.baldev.eventify.Infrastructure.User

import com.baldev.eventify.Domain.User.User
import com.baldev.eventify.Domain.User.Users

class InMemoryUsers : Users {
    override fun put(username: String): User {
        return User(username)
    }
}