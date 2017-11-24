package com.baldev.eventify.Infrastructure.User

import com.baldev.eventify.Domain.User.User
import com.baldev.eventify.Domain.User.Users

class InMemoryUsers(private val users: MutableList<User>) : Users {

    override fun put(user: User): User {
        users.add(user)
        return user
    }
}